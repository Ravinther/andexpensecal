package com.google.android.gms.internal;

class lc implements Runnable {
    final /* synthetic */ lb f7058a;

    lc(lb lbVar) {
        this.f7058a = lbVar;
    }

    public final void run() {
        this.f7058a.f6658b = Thread.currentThread();
        this.f7058a.m5622a();
    }
}
