package com.dropbox.client2;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: com.dropbox.client2.l */
class C0388l extends FilterOutputStream {
    final /* synthetic */ C0387k f2402a;
    private long f2403b;
    private long f2404c;
    private long f2405d;

    public C0388l(C0387k c0387k, OutputStream outputStream) {
        this.f2402a = c0387k;
        super(outputStream);
        this.f2403b = 0;
        this.f2404c = 0;
        this.f2405d = 0;
        this.f2404c = c0387k.f2400a.m2345a();
    }

    public void write(int i) {
        super.write(i);
        this.f2405d++;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f2403b > this.f2404c) {
            this.f2403b = currentTimeMillis;
            this.f2402a.f2400a.m2346a(this.f2405d, this.f2402a.f2401b);
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f2405d += (long) i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f2403b > this.f2404c) {
            this.f2403b = currentTimeMillis;
            this.f2402a.f2400a.m2346a(this.f2405d, this.f2402a.f2401b);
        }
    }
}
