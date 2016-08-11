package com.google.android.gms.internal;

class eu implements Runnable {
    final /* synthetic */ er f6513a;

    eu(er erVar) {
        this.f6513a = erVar;
    }

    public void run() {
        try {
            this.f6513a.f6509a.m5382c();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdLeftApplication.", e);
        }
    }
}
