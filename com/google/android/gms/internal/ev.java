package com.google.android.gms.internal;

class ev implements Runnable {
    final /* synthetic */ er f6514a;

    ev(er erVar) {
        this.f6514a = erVar;
    }

    public void run() {
        try {
            this.f6514a.f6509a.m5383d();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdOpened.", e);
        }
    }
}
