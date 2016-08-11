package com.google.api.client.p051b.p053b;

import com.google.api.client.p050d.am;
import com.google.api.client.p051b.af;
import com.google.api.client.p051b.ag;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.api.client.b.b.a */
final class C0673a extends af {
    private final HttpURLConnection f7416a;

    C0673a(HttpURLConnection httpURLConnection) {
        this.f7416a = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    public ag m6649a() {
        HttpURLConnection httpURLConnection = this.f7416a;
        if (m6553e() != null) {
            String d = m6552d();
            if (d != null) {
                m6651a("Content-Type", d);
            }
            d = m6551c();
            if (d != null) {
                m6651a("Content-Encoding", d);
            }
            long b = m6549b();
            if (b >= 0) {
                m6651a("Content-Length", Long.toString(b));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (b < 0 || b > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) b);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    m6553e().m6588a(outputStream);
                } finally {
                    outputStream.close();
                }
            } else {
                am.m6916a(b == 0, "%s with non-zero content length is not supported", requestMethod);
            }
        }
        try {
            httpURLConnection.connect();
            return new C0674b(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }

    public void m6650a(int i, int i2) {
        this.f7416a.setReadTimeout(i2);
        this.f7416a.setConnectTimeout(i);
    }

    public void m6651a(String str, String str2) {
        this.f7416a.addRequestProperty(str, str2);
    }
}
