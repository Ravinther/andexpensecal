package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bz */
class bz extends bd {
    private boolean f1682a;
    private byte[] f1683b;

    public bz(boolean z) {
        super(ay.an);
        this.f1682a = z;
        this.f1683b = new byte[2];
        if (this.f1682a) {
            ar.m1150a(1, this.f1683b, 0);
        }
    }

    public byte[] m1651a() {
        return this.f1683b;
    }
}
