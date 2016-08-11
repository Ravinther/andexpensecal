package com.dropbox.client2.p030c;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.dropbox.client2.c.e */
class C0368e implements HttpResponseInterceptor {
    final /* synthetic */ C0358a f2361a;

    C0368e(C0358a c0358a) {
        this.f2361a = c0358a;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            Header contentEncoding = entity.getContentEncoding();
            if (contentEncoding != null) {
                for (HeaderElement name : contentEncoding.getElements()) {
                    if (name.getName().equalsIgnoreCase("gzip")) {
                        httpResponse.setEntity(new C0372i(httpResponse.getEntity()));
                        return;
                    }
                }
            }
        }
    }
}
