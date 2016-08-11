package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.df */
class df extends bd {
    private boolean f1801a;
    private byte[] f1802b;

    public df(boolean z) {
        super(ay.am);
        this.f1801a = z;
        this.f1802b = new byte[2];
        if (this.f1801a) {
            ar.m1150a(1, this.f1802b, 0);
        }
    }

    public byte[] m1727a() {
        return this.f1802b;
    }
}
