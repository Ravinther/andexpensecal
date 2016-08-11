package p007b.p010e.p017a;

import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ar */
class ar extends bd {
    private byte[] f1581a;
    private String f1582b;

    public ar(String str) {
        super(ay.ad);
        this.f1582b = str;
    }

    public byte[] m1582a() {
        if (this.f1582b == null || this.f1582b.length() == 0) {
            this.f1581a = new byte[0];
            return this.f1581a;
        }
        this.f1581a = new byte[((this.f1582b.length() * 2) + 3)];
        p007b.p008a.ar.m1150a(this.f1582b.length(), this.f1581a, 0);
        this.f1581a[2] = (byte) 1;
        ax.m1166b(this.f1582b, this.f1581a, 3);
        return this.f1581a;
    }
}
