package com.google.android.gms.internal;

import java.io.IOException;

class oo implements ol {
    private or f7267a;
    private byte[] f7268b;
    private final int f7269c;

    public oo(int i) {
        this.f7269c = i;
        m6357a();
    }

    public void m6357a() {
        this.f7268b = new byte[this.f7269c];
        this.f7267a = or.m6382a(this.f7268b);
    }

    public void m6358a(int i, long j) {
        this.f7267a.m6388a(i, j);
    }

    public void m6359a(int i, String str) {
        this.f7267a.m6389a(i, str);
    }

    public byte[] m6360b() {
        int a = this.f7267a.m6384a();
        if (a < 0) {
            throw new IOException();
        } else if (a == 0) {
            return this.f7268b;
        } else {
            Object obj = new byte[(this.f7268b.length - a)];
            System.arraycopy(this.f7268b, 0, obj, 0, obj.length);
            return obj;
        }
    }
}
