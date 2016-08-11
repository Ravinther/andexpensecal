package com.google.api.client.p050d;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.d.ae */
public class ae extends FilterOutputStream {
    private final ac f7575a;

    public ae(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.f7575a = new ac(logger, level, i);
    }

    public final ac m6904a() {
        return this.f7575a;
    }

    public void close() {
        this.f7575a.close();
        super.close();
    }

    public void write(int i) {
        this.out.write(i);
        this.f7575a.write(i);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f7575a.write(bArr, i, i2);
    }
}
