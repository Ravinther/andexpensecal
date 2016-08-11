package com.google.api.client.googleapis.p074d;

import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.aa;

/* renamed from: com.google.api.client.googleapis.d.d */
class C0767d implements aa {
    final /* synthetic */ aa f7722a;
    final /* synthetic */ C0692t f7723b;
    final /* synthetic */ C0762c f7724c;

    C0767d(C0762c c0762c, aa aaVar, C0692t c0692t) {
        this.f7724c = c0762c;
        this.f7722a = aaVar;
        this.f7723b = c0692t;
    }

    public void m7042a(C0695x c0695x) {
        if (this.f7722a != null) {
            this.f7722a.m6601a(c0695x);
        }
        if (!c0695x.m6810c() && this.f7723b.m6792m()) {
            throw this.f7724c.newExceptionOnError(c0695x);
        }
    }
}
