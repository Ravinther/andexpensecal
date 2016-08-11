package com.google.api.client.p051b.p053b;

import com.google.api.client.p051b.ab;
import com.google.api.client.p051b.ag;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.b.b.b */
final class C0674b extends ag {
    private final HttpURLConnection f7417a;
    private final int f7418b;
    private final String f7419c;
    private final ArrayList<String> f7420d;
    private final ArrayList<String> f7421e;

    C0674b(HttpURLConnection httpURLConnection) {
        this.f7420d = new ArrayList();
        this.f7421e = new ArrayList();
        this.f7417a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -1) {
            responseCode = 0;
        }
        this.f7418b = responseCode;
        this.f7419c = httpURLConnection.getResponseMessage();
        List list = this.f7420d;
        List list2 = this.f7421e;
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        list.add(str);
                        list2.add(str2);
                    }
                }
            }
        }
    }

    public InputStream m6652a() {
        HttpURLConnection httpURLConnection = this.f7417a;
        return ab.m6602a(this.f7418b) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
    }

    public String m6653a(int i) {
        return (String) this.f7420d.get(i);
    }

    public String m6654b() {
        return this.f7417a.getContentEncoding();
    }

    public String m6655b(int i) {
        return (String) this.f7421e.get(i);
    }

    public String m6656c() {
        return this.f7417a.getHeaderField("Content-Type");
    }

    public String m6657d() {
        String headerField = this.f7417a.getHeaderField(0);
        return (headerField == null || !headerField.startsWith("HTTP/1.")) ? null : headerField;
    }

    public int m6658e() {
        return this.f7418b;
    }

    public String m6659f() {
        return this.f7419c;
    }

    public int m6660g() {
        return this.f7420d.size();
    }

    public void m6661h() {
        this.f7417a.disconnect();
    }
}
