package p007b.p010e.p017a;

import java.io.OutputStream;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.bi */
class bi implements ag {
    private static C0208c f1635a;
    private byte[] f1636b;
    private int f1637c;
    private int f1638d;

    static {
        f1635a = C0208c.m1493a(bi.class);
    }

    public bi(int i, int i2) {
        this.f1636b = new byte[i];
        this.f1637c = i2;
        this.f1638d = 0;
    }

    public int m1621a() {
        return this.f1638d;
    }

    public void m1622a(OutputStream outputStream) {
        outputStream.write(this.f1636b, 0, this.f1638d);
    }

    public void m1623a(byte[] bArr) {
        while (this.f1638d + bArr.length > this.f1636b.length) {
            Object obj = new byte[(this.f1636b.length + this.f1637c)];
            System.arraycopy(this.f1636b, 0, obj, 0, this.f1638d);
            this.f1636b = obj;
        }
        System.arraycopy(bArr, 0, this.f1636b, this.f1638d, bArr.length);
        this.f1638d += bArr.length;
    }

    public void m1624a(byte[] bArr, int i) {
        System.arraycopy(bArr, 0, this.f1636b, i, bArr.length);
    }

    public void m1625b() {
    }
}
