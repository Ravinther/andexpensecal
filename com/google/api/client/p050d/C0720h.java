package com.google.api.client.p050d;

import java.io.OutputStream;

/* renamed from: com.google.api.client.d.h */
final class C0720h extends OutputStream {
    long f7598a;

    C0720h() {
    }

    public void write(int i) {
        this.f7598a++;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f7598a += (long) i2;
    }
}
