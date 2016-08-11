package com.google.api.client.p051b.p052a;

import com.google.api.client.p050d.am;
import com.google.api.client.p051b.af;
import com.google.api.client.p051b.ag;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.google.api.client.b.a.a */
final class C0665a extends af {
    private final HttpClient f7376a;
    private final HttpRequestBase f7377b;

    C0665a(HttpClient httpClient, HttpRequestBase httpRequestBase) {
        this.f7376a = httpClient;
        this.f7377b = httpRequestBase;
    }

    public ag m6554a() {
        if (m6553e() != null) {
            am.m6916a(this.f7377b instanceof HttpEntityEnclosingRequest, "Apache HTTP client does not support %s requests with content.", this.f7377b.getRequestLine().getMethod());
            HttpEntity c0668d = new C0668d(m6549b(), m6553e());
            c0668d.setContentEncoding(m6551c());
            c0668d.setContentType(m6552d());
            ((HttpEntityEnclosingRequest) this.f7377b).setEntity(c0668d);
        }
        return new C0666b(this.f7377b, this.f7376a.execute(this.f7377b));
    }

    public void m6555a(int i, int i2) {
        HttpParams params = this.f7377b.getParams();
        ConnManagerParams.setTimeout(params, (long) i);
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, i2);
    }

    public void m6556a(String str, String str2) {
        this.f7377b.addHeader(str, str2);
    }
}
