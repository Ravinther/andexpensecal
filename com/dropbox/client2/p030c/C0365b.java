package com.dropbox.client2.p030c;

import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;

/* renamed from: com.dropbox.client2.c.b */
class C0365b implements ConnPerRoute {
    final /* synthetic */ C0358a f2358a;

    C0365b(C0358a c0358a) {
        this.f2358a = c0358a;
    }

    public int getMaxForRoute(HttpRoute httpRoute) {
        return 10;
    }
}
