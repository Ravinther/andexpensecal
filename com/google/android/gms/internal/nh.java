package com.google.android.gms.internal;

import android.util.Log;

public abstract class nh<TListener> {
    final /* synthetic */ nf f7221a;
    private TListener f7222b;
    private boolean f7223c;

    public nh(nf nfVar, TListener tListener) {
        this.f7221a = nfVar;
        this.f7222b = tListener;
        this.f7223c = false;
    }

    protected abstract void m6179a();

    protected abstract void m6180a(TListener tListener);

    public void m6181b() {
        synchronized (this) {
            Object obj = this.f7222b;
            if (this.f7223c) {
                Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                m6180a(obj);
            } catch (RuntimeException e) {
                m6179a();
                throw e;
            }
        }
        m6179a();
        synchronized (this) {
            this.f7223c = true;
        }
        m6182c();
    }

    public void m6182c() {
        m6183d();
        synchronized (this.f7221a.f6412h) {
            this.f7221a.f6412h.remove(this);
        }
    }

    public void m6183d() {
        synchronized (this) {
            this.f7222b = null;
        }
    }
}
