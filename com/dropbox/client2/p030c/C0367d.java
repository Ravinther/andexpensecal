package com.dropbox.client2.p030c;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.dropbox.client2.c.d */
class C0367d implements HttpRequestInterceptor {
    final /* synthetic */ C0358a f2360a;

    C0367d(C0358a c0358a) {
        this.f2360a = c0358a;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        if (!httpRequest.containsHeader("Accept-Encoding")) {
            httpRequest.addHeader("Accept-Encoding", "gzip");
        }
    }
}
