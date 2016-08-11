package com.google.android.gms.internal;

class dy implements Runnable {
    final /* synthetic */ dw f6483a;
    final /* synthetic */ dx f6484b;

    dy(dx dxVar, dw dwVar) {
        this.f6484b = dxVar;
        this.f6483a = dwVar;
    }

    public void run() {
        synchronized (this.f6484b.f6479h) {
            if (this.f6484b.f6482k != -2) {
                return;
            }
            this.f6484b.f6481j = this.f6484b.m5403c();
            if (this.f6484b.f6481j == null) {
                this.f6484b.m5408a(4);
                return;
            }
            this.f6483a.m5389a(this.f6484b);
            this.f6484b.m5398a(this.f6483a);
        }
    }
}
