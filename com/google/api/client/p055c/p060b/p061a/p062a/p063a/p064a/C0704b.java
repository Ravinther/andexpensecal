package com.google.api.client.p055c.p060b.p061a.p062a.p063a.p064a;

/* renamed from: com.google.api.client.c.b.a.a.a.a.b */
public abstract class C0704b {
    private final int f7538a;
    protected final byte f7539b;
    protected final int f7540c;
    protected byte[] f7541d;
    protected int f7542e;
    protected boolean f7543f;
    protected int f7544g;
    protected int f7545h;
    private final int f7546i;
    private final int f7547j;
    private int f7548k;

    protected C0704b(int i, int i2, int i3, int i4) {
        this.f7539b = (byte) 61;
        this.f7538a = i;
        this.f7546i = i2;
        int i5 = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.f7540c = i5;
        this.f7547j = i4;
    }

    private void m6843c() {
        if (this.f7541d == null) {
            this.f7541d = new byte[m6849b()];
            this.f7542e = 0;
            this.f7548k = 0;
            return;
        }
        Object obj = new byte[(this.f7541d.length * 2)];
        System.arraycopy(this.f7541d, 0, obj, 0, this.f7541d.length);
        this.f7541d = obj;
    }

    private void m6844d() {
        this.f7541d = null;
        this.f7542e = 0;
        this.f7548k = 0;
        this.f7544g = 0;
        this.f7545h = 0;
        this.f7543f = false;
    }

    int m6845a() {
        return this.f7541d != null ? this.f7542e - this.f7548k : 0;
    }

    protected void m6846a(int i) {
        if (this.f7541d == null || this.f7541d.length < this.f7542e + i) {
            m6843c();
        }
    }

    abstract void m6847a(byte[] bArr, int i, int i2);

    protected abstract boolean m6848a(byte b);

    protected int m6849b() {
        return 8192;
    }

    abstract void m6850b(byte[] bArr, int i, int i2);

    public byte[] m6851b(String str) {
        return m6852b(C0706c.m6867a(str));
    }

    public byte[] m6852b(byte[] bArr) {
        m6844d();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        m6850b(bArr, 0, bArr.length);
        m6850b(bArr, 0, -1);
        bArr = new byte[this.f7542e];
        m6853c(bArr, 0, bArr.length);
        return bArr;
    }

    int m6853c(byte[] bArr, int i, int i2) {
        if (this.f7541d == null) {
            return this.f7543f ? -1 : 0;
        } else {
            int min = Math.min(m6845a(), i2);
            System.arraycopy(this.f7541d, this.f7548k, bArr, i, min);
            this.f7548k += min;
            if (this.f7548k < this.f7542e) {
                return min;
            }
            this.f7541d = null;
            return min;
        }
    }

    public byte[] m6854c(byte[] bArr) {
        m6844d();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        m6847a(bArr, 0, bArr.length);
        m6847a(bArr, 0, -1);
        bArr = new byte[(this.f7542e - this.f7548k)];
        m6853c(bArr, 0, bArr.length);
        return bArr;
    }

    protected boolean m6855d(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || m6848a(b)) {
                return true;
            }
        }
        return false;
    }

    public long m6856e(byte[] bArr) {
        long length = ((long) (((bArr.length + this.f7538a) - 1) / this.f7538a)) * ((long) this.f7546i);
        return this.f7540c > 0 ? length + ((((((long) this.f7540c) + length) - 1) / ((long) this.f7540c)) * ((long) this.f7547j)) : length;
    }
}
