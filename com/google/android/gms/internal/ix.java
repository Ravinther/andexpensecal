package com.google.android.gms.internal;

class ix implements Runnable {
    final /* synthetic */ ks f6815a;
    final /* synthetic */ iv f6816b;

    ix(iv ivVar, ks ksVar) {
        this.f6816b = ivVar;
        this.f6815a = ksVar;
    }

    public void run() {
        synchronized (this.f6816b.f6808d) {
            this.f6816b.f6805a.m5756a(this.f6815a);
        }
    }
}
