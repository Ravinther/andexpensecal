package com.google.api.client.p050d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.api.client.d.j */
final class C0722j extends FilterInputStream {
    private long f7599a;
    private long f7600b;

    C0722j(InputStream inputStream, long j) {
        super(inputStream);
        this.f7600b = -1;
        am.m6911a((Object) inputStream);
        am.m6915a(j >= 0, (Object) "limit must be non-negative");
        this.f7599a = j;
    }

    public int available() {
        return (int) Math.min((long) this.in.available(), this.f7599a);
    }

    public synchronized void mark(int i) {
        this.in.mark(i);
        this.f7600b = this.f7599a;
    }

    public int read() {
        if (this.f7599a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f7599a--;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f7599a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, this.f7599a));
        if (read != -1) {
            this.f7599a -= (long) read;
        }
        return read;
    }

    public synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f7600b == -1) {
            throw new IOException("Mark not set");
        } else {
            this.in.reset();
            this.f7599a = this.f7600b;
        }
    }

    public long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f7599a));
        this.f7599a -= skip;
        return skip;
    }
}
