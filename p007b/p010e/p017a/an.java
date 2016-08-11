package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.an */
class an extends bd {
    private byte[] f1570a;
    private String f1571b;

    public an(String str) {
        super(ay.ae);
        this.f1571b = str;
    }

    public byte[] m1576a() {
        if (this.f1571b == null || this.f1571b.length() == 0) {
            this.f1570a = new byte[0];
            return this.f1570a;
        }
        this.f1570a = new byte[((this.f1571b.length() * 2) + 3)];
        ar.m1150a(this.f1571b.length(), this.f1570a, 0);
        this.f1570a[2] = (byte) 1;
        ax.m1166b(this.f1571b, this.f1570a, 3);
        return this.f1570a;
    }
}
