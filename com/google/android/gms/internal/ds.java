package com.google.android.gms.internal;

class ds implements Runnable {
    final /* synthetic */ dz f6451a;
    final /* synthetic */ dq f6452b;

    ds(dq dqVar, dz dzVar) {
        this.f6452b = dqVar;
        this.f6451a = dzVar;
    }

    public void run() {
        try {
            this.f6451a.f6487c.m5432c();
        } catch (Throwable e) {
            ly.m6073d("Could not destroy mediation adapter.", e);
        }
    }
}
