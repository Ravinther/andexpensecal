package com.google.android.gms.internal;

class fa implements Runnable {
    final /* synthetic */ er f6524a;

    fa(er erVar) {
        this.f6524a = erVar;
    }

    public void run() {
        try {
            this.f6524a.f6509a.m5383d();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdOpened.", e);
        }
    }
}
