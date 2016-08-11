package com.google.api.client.p051b.p052a;

import com.google.api.client.p051b.ag;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

/* renamed from: com.google.api.client.b.a.b */
final class C0666b extends ag {
    private final HttpRequestBase f7378a;
    private final HttpResponse f7379b;
    private final Header[] f7380c;

    C0666b(HttpRequestBase httpRequestBase, HttpResponse httpResponse) {
        this.f7378a = httpRequestBase;
        this.f7379b = httpResponse;
        this.f7380c = httpResponse.getAllHeaders();
    }

    public InputStream m6567a() {
        HttpEntity entity = this.f7379b.getEntity();
        return entity == null ? null : entity.getContent();
    }

    public String m6568a(int i) {
        return this.f7380c[i].getName();
    }

    public String m6569b() {
        HttpEntity entity = this.f7379b.getEntity();
        if (entity != null) {
            Header contentEncoding = entity.getContentEncoding();
            if (contentEncoding != null) {
                return contentEncoding.getValue();
            }
        }
        return null;
    }

    public String m6570b(int i) {
        return this.f7380c[i].getValue();
    }

    public String m6571c() {
        HttpEntity entity = this.f7379b.getEntity();
        if (entity != null) {
            Header contentType = entity.getContentType();
            if (contentType != null) {
                return contentType.getValue();
            }
        }
        return null;
    }

    public String m6572d() {
        StatusLine statusLine = this.f7379b.getStatusLine();
        return statusLine == null ? null : statusLine.toString();
    }

    public int m6573e() {
        StatusLine statusLine = this.f7379b.getStatusLine();
        return statusLine == null ? 0 : statusLine.getStatusCode();
    }

    public String m6574f() {
        StatusLine statusLine = this.f7379b.getStatusLine();
        return statusLine == null ? null : statusLine.getReasonPhrase();
    }

    public int m6575g() {
        return this.f7380c.length;
    }

    public void m6576h() {
        this.f7378a.abort();
    }
}
