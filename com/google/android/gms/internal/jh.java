package com.google.android.gms.internal;

class jh implements Runnable {
    final /* synthetic */ iz f6848a;
    final /* synthetic */ jd f6849b;

    jh(jd jdVar, iz izVar) {
        this.f6849b = jdVar;
        this.f6848a = izVar;
    }

    public void run() {
        synchronized (this.f6849b.f6837f) {
            if (this.f6849b.f6839h.f6559e != -2) {
                return;
            }
            this.f6849b.f6834c.m6097f().m6110a(this.f6849b);
            this.f6848a.m5791a(this.f6849b.f6839h);
        }
    }
}
