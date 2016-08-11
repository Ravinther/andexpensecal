package com.dropbox.client2.p030c;

import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

/* renamed from: com.dropbox.client2.c.f */
class C0369f extends ThreadSafeClientConnManager {
    public C0369f(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }

    public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        C0373j.m2332a(this, 20, 5);
        return super.requestConnection(httpRoute, obj);
    }
}
