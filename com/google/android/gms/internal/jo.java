package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.C0614b;
import com.google.android.gms.common.api.C0610b;
import com.google.android.gms.common.api.C0612c;

@id
public final class jo extends jm implements C0610b, C0612c {
    private final jl f6861a;
    private final jp f6862b;
    private final Object f6863c;

    public jo(Context context, fh fhVar, jl jlVar) {
        super(fhVar, jlVar);
        this.f6863c = new Object();
        this.f6861a = jlVar;
        this.f6862b = new jp(context, this, this, fhVar.f6548k.f6670d);
        this.f6862b.m5341d();
    }

    public void m5823a(int i) {
        ly.m6065a("Disconnected from remote ad request service.");
    }

    public void m5824a(Bundle bundle) {
        m5624e();
    }

    public void m5825a(C0614b c0614b) {
        this.f6861a.m5771a(new fj(0));
    }

    public void m5826c() {
        synchronized (this.f6863c) {
            if (this.f6862b.m5342e() || this.f6862b.m5343f()) {
                this.f6862b.m5344g();
            }
        }
    }

    public jt m5827d() {
        jt c;
        synchronized (this.f6863c) {
            try {
                c = this.f6862b.m5833c();
            } catch (IllegalStateException e) {
                c = null;
                return c;
            } catch (DeadObjectException e2) {
                c = null;
                return c;
            }
        }
        return c;
    }
}
