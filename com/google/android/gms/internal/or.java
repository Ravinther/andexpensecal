package com.google.android.gms.internal;

public final class or {
    private final byte[] f7273a;
    private final int f7274b;
    private int f7275c;

    private or(byte[] bArr, int i, int i2) {
        this.f7273a = bArr;
        this.f7275c = i;
        this.f7274b = i + i2;
    }

    public static or m6382a(byte[] bArr) {
        return m6383a(bArr, 0, bArr.length);
    }

    public static or m6383a(byte[] bArr, int i, int i2) {
        return new or(bArr, i, i2);
    }

    public int m6384a() {
        return this.f7274b - this.f7275c;
    }

    public void m6385a(byte b) {
        if (this.f7275c == this.f7274b) {
            throw new os(this.f7275c, this.f7274b);
        }
        byte[] bArr = this.f7273a;
        int i = this.f7275c;
        this.f7275c = i + 1;
        bArr[i] = b;
    }

    public void m6386a(int i) {
        m6385a((byte) i);
    }

    public void m6387a(int i, int i2) {
        m6392b(ot.m6396a(i, i2));
    }

    public void m6388a(int i, long j) {
        m6387a(i, 0);
        m6390a(j);
    }

    public void m6389a(int i, String str) {
        m6387a(i, 2);
        m6391a(str);
    }

    public void m6390a(long j) {
        m6393b(j);
    }

    public void m6391a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m6392b(bytes.length);
        m6394b(bytes);
    }

    public void m6392b(int i) {
        while ((i & -128) != 0) {
            m6386a((i & 127) | 128);
            i >>>= 7;
        }
        m6386a(i);
    }

    public void m6393b(long j) {
        while ((-128 & j) != 0) {
            m6386a((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m6386a((int) j);
    }

    public void m6394b(byte[] bArr) {
        m6395b(bArr, 0, bArr.length);
    }

    public void m6395b(byte[] bArr, int i, int i2) {
        if (this.f7274b - this.f7275c >= i2) {
            System.arraycopy(bArr, i, this.f7273a, this.f7275c, i2);
            this.f7275c += i2;
            return;
        }
        throw new os(this.f7275c, this.f7274b);
    }
}
