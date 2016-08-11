package com.dropbox.client2;

import com.dropbox.client2.p029a.C0349e;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import p018c.p025b.p026a.C0338d;

/* renamed from: com.dropbox.client2.d */
public final class C0381d {
    private String f2377a;
    private long f2378b;
    private String f2379c;
    private C0383f f2380d;

    private C0381d(HttpResponse httpResponse) {
        this.f2377a = null;
        this.f2378b = -1;
        this.f2379c = null;
        this.f2380d = null;
        this.f2380d = C0381d.m2339a(httpResponse);
        if (this.f2380d == null) {
            throw new C0349e("Error parsing metadata.");
        }
        this.f2378b = C0381d.m2338a(httpResponse, this.f2380d);
        if (this.f2378b == -1) {
            throw new C0349e("Error determining file size.");
        }
        Header firstHeader = httpResponse.getFirstHeader("Content-Type");
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (value != null) {
                String[] split = value.split(";");
                if (split.length > 0) {
                    this.f2377a = split[0].trim();
                }
                if (split.length > 1) {
                    split = split[1].split("=");
                    if (split.length > 1) {
                        this.f2379c = split[1].trim();
                    }
                }
            }
        }
    }

    private static long m2338a(HttpResponse httpResponse, C0383f c0383f) {
        long contentLength = httpResponse.getEntity().getContentLength();
        return contentLength >= 0 ? contentLength : c0383f != null ? c0383f.f2384a : -1;
    }

    private static C0383f m2339a(HttpResponse httpResponse) {
        if (httpResponse == null) {
            return null;
        }
        Header firstHeader = httpResponse.getFirstHeader("X-Dropbox-Metadata");
        if (firstHeader == null) {
            return null;
        }
        Object a = C0338d.m2264a(firstHeader.getValue());
        return a == null ? null : new C0383f((Map) a);
    }

    @Deprecated
    public final long m2340a() {
        return m2341b();
    }

    public final long m2341b() {
        return this.f2378b;
    }
}
