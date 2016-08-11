package android.support.v4.p004c;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.c.e */
public class C0059e extends Writer {
    private final String f332a;
    private StringBuilder f333b;

    public C0059e(String str) {
        this.f333b = new StringBuilder(128);
        this.f332a = str;
    }

    private void m485a() {
        if (this.f333b.length() > 0) {
            Log.d(this.f332a, this.f333b.toString());
            this.f333b.delete(0, this.f333b.length());
        }
    }

    public void close() {
        m485a();
    }

    public void flush() {
        m485a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m485a();
            } else {
                this.f333b.append(c);
            }
        }
    }
}
