package com.google.android.gms.internal;

final class gc {
    private final Runnable f6645a;
    private volatile boolean f6646b;

    public gc(gb gbVar) {
        this.f6646b = false;
        this.f6645a = new gd(this, gbVar);
    }

    public void m5588a() {
        this.f6646b = true;
        lx.f7093a.removeCallbacks(this.f6645a);
    }

    public void m5589b() {
        lx.f7093a.postDelayed(this.f6645a, 250);
    }
}
