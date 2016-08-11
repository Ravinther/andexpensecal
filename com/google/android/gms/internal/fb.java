package com.google.android.gms.internal;

class fb implements Runnable {
    final /* synthetic */ er f6525a;

    fb(er erVar) {
        this.f6525a = erVar;
    }

    public void run() {
        try {
            this.f6525a.f6509a.m5384e();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdLoaded.", e);
        }
    }
}
