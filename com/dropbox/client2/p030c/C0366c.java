package com.dropbox.client2.p030c;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

/* renamed from: com.dropbox.client2.c.c */
class C0366c extends DefaultHttpClient {
    final /* synthetic */ C0358a f2359a;

    C0366c(C0358a c0358a, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f2359a = c0358a;
        super(clientConnectionManager, httpParams);
    }

    protected ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new C0371h();
    }

    protected ConnectionReuseStrategy createConnectionReuseStrategy() {
        return new C0370g();
    }
}
