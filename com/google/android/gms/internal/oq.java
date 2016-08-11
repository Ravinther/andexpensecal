package com.google.android.gms.internal;

public class oq {
    private final byte[] f7270a;
    private int f7271b;
    private int f7272c;

    public oq(byte[] bArr) {
        int i;
        this.f7270a = new byte[256];
        for (i = 0; i < 256; i++) {
            this.f7270a[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            i = ((i + this.f7270a[i2]) + bArr[i2 % bArr.length]) & 255;
            byte b = this.f7270a[i2];
            this.f7270a[i2] = this.f7270a[i];
            this.f7270a[i] = b;
        }
        this.f7271b = 0;
        this.f7272c = 0;
    }

    public void m6381a(byte[] bArr) {
        int i = this.f7271b;
        int i2 = this.f7272c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f7270a[i]) & 255;
            byte b = this.f7270a[i];
            this.f7270a[i] = this.f7270a[i2];
            this.f7270a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f7270a[(this.f7270a[i] + this.f7270a[i2]) & 255]);
        }
        this.f7271b = i;
        this.f7272c = i2;
    }
}
