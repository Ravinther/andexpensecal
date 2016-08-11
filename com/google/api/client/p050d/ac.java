package com.google.api.client.p050d;

import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.d.ac */
public class ac extends ByteArrayOutputStream {
    private int f7569a;
    private final int f7570b;
    private boolean f7571c;
    private final Level f7572d;
    private final Logger f7573e;

    public ac(Logger logger, Level level, int i) {
        this.f7573e = (Logger) am.m6911a((Object) logger);
        this.f7572d = (Level) am.m6911a((Object) level);
        am.m6914a(i >= 0);
        this.f7570b = i;
    }

    private static void m6903a(StringBuilder stringBuilder, int i) {
        if (i == 1) {
            stringBuilder.append("1 byte");
        } else {
            stringBuilder.append(NumberFormat.getInstance().format((long) i)).append(" bytes");
        }
    }

    public synchronized void close() {
        if (!this.f7571c) {
            if (this.f7569a != 0) {
                StringBuilder append = new StringBuilder().append("Total: ");
                ac.m6903a(append, this.f7569a);
                if (this.count != 0 && this.count < this.f7569a) {
                    append.append(" (logging first ");
                    ac.m6903a(append, this.count);
                    append.append(")");
                }
                this.f7573e.config(append.toString());
                if (this.count != 0) {
                    this.f7573e.log(this.f7572d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.f7571c = true;
        }
    }

    public synchronized void write(int i) {
        am.m6914a(!this.f7571c);
        this.f7569a++;
        if (this.count < this.f7570b) {
            super.write(i);
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        am.m6914a(!this.f7571c);
        this.f7569a += i2;
        if (this.count < this.f7570b) {
            int i3 = this.count + i2;
            if (i3 > this.f7570b) {
                i2 += this.f7570b - i3;
            }
            super.write(bArr, i, i2);
        }
    }
}
