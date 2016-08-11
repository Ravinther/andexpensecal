package com.google.api.client.p050d;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.d.ad */
public class ad extends FilterInputStream {
    private final ac f7574a;

    public ad(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.f7574a = new ac(logger, level, i);
    }

    public void close() {
        this.f7574a.close();
        super.close();
    }

    public int read() {
        int read = super.read();
        this.f7574a.write(read);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f7574a.write(bArr, i, read);
        }
        return read;
    }
}
