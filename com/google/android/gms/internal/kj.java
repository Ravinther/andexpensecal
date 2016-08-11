package com.google.android.gms.internal;

import java.util.concurrent.Future;

@id
public final class kj {
    ma f6917a;
    public final cz f6918b;
    public final cz f6919c;
    private final Object f6920d;
    private String f6921e;
    private ll<kn> f6922f;

    public kj(String str) {
        this.f6920d = new Object();
        this.f6922f = new ll();
        this.f6918b = new kk(this);
        this.f6919c = new kl(this);
        this.f6921e = str;
    }

    public Future<kn> m5888a() {
        return this.f6922f;
    }

    public void m5889a(ma maVar) {
        ob.m6318a("setAdWebView must be called on the main thread.");
        this.f6917a = maVar;
    }

    public void m5890b() {
        ob.m6318a("destroyAdWebView must be called on the main thread.");
        if (this.f6917a != null) {
            this.f6917a.destroy();
            this.f6917a = null;
        }
    }
}
