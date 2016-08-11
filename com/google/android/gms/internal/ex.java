package com.google.android.gms.internal;

class ex implements Runnable {
    final /* synthetic */ er f6516a;

    ex(er erVar) {
        this.f6516a = erVar;
    }

    public void run() {
        try {
            this.f6516a.f6509a.m5381b();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdClosed.", e);
        }
    }
}
