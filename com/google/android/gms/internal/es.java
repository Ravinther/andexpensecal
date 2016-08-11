package com.google.android.gms.internal;

class es implements Runnable {
    final /* synthetic */ er f6510a;

    es(er erVar) {
        this.f6510a = erVar;
    }

    public void run() {
        try {
            this.f6510a.f6509a.m5379a();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdClicked.", e);
        }
    }
}
