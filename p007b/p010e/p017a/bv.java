package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bv */
class bv extends bd {
    private boolean f1675a;
    private byte[] f1676b;

    public bv(boolean z) {
        super(ay.aw);
        this.f1675a = z;
        this.f1676b = new byte[2];
        if (!this.f1675a) {
            ar.m1150a(1, this.f1676b, 0);
        }
    }

    public byte[] m1647a() {
        return this.f1676b;
    }
}
