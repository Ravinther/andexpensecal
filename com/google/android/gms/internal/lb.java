package com.google.android.gms.internal;

@id
public abstract class lb {
    private final Runnable f6657a;
    private volatile Thread f6658b;

    public lb() {
        this.f6657a = new lc(this);
    }

    public abstract void m5622a();

    public abstract void m5623b();

    public final void m5624e() {
        le.m5994a(this.f6657a);
    }

    public final void m5625f() {
        m5623b();
        if (this.f6658b != null) {
            this.f6658b.interrupt();
        }
    }
}
