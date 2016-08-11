package com.google.android.gms.internal;

class jf implements Runnable {
    final /* synthetic */ kr f6845a;
    final /* synthetic */ jd f6846b;

    jf(jd jdVar, kr krVar) {
        this.f6846b = jdVar;
        this.f6845a = krVar;
    }

    public void run() {
        synchronized (this.f6846b.f6837f) {
            this.f6846b.f6833b.m5799a(this.f6845a);
        }
    }
}
