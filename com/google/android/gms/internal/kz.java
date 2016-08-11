package com.google.android.gms.internal;

import android.os.Bundle;

@id
public class kz {
    private final Object f7050a;
    private int f7051b;
    private int f7052c;
    private final kw f7053d;
    private final String f7054e;

    kz(kw kwVar, String str) {
        this.f7050a = new Object();
        this.f7053d = kwVar;
        this.f7054e = str;
    }

    public kz(String str) {
        this(kw.m5947a(), str);
    }

    public Bundle m5986a() {
        Bundle bundle;
        synchronized (this.f7050a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f7051b);
            bundle.putInt("pmnll", this.f7052c);
        }
        return bundle;
    }

    public void m5987a(int i, int i2) {
        synchronized (this.f7050a) {
            this.f7051b = i;
            this.f7052c = i2;
            this.f7053d.m5962a(this.f7054e, this);
        }
    }
}
