package com.google.android.gms.internal;

class ez implements Runnable {
    final /* synthetic */ er f6519a;

    ez(er erVar) {
        this.f6519a = erVar;
    }

    public void run() {
        try {
            r1.f6509a.m5382c();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdLeftApplication.", e);
        }
    }
}
