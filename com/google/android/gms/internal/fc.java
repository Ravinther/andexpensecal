package com.google.android.gms.internal;

class fc implements Runnable {
    final /* synthetic */ er f6526a;

    fc(er erVar) {
        this.f6526a = erVar;
    }

    public void run() {
        try {
            this.f6526a.f6509a.m5381b();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdClosed.", e);
        }
    }
}
