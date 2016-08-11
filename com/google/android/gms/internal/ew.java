package com.google.android.gms.internal;

class ew implements Runnable {
    final /* synthetic */ er f6515a;

    ew(er erVar) {
        this.f6515a = erVar;
    }

    public void run() {
        try {
            this.f6515a.f6509a.m5384e();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdLoaded.", e);
        }
    }
}
