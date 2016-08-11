package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ck */
class ck extends bd {
    private boolean f1720a;
    private byte[] f1721b;

    public ck(boolean z) {
        super(ay.aa);
        this.f1720a = z;
        this.f1721b = new byte[2];
        if (this.f1720a) {
            ar.m1150a(1, this.f1721b, 0);
        }
    }

    public byte[] m1672a() {
        return this.f1721b;
    }
}
