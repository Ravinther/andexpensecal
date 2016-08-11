package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.cc */
class cc extends bd {
    private boolean f1686a;
    private byte[] f1687b;

    public cc(boolean z) {
        super(ay.aq);
        this.f1686a = z;
        this.f1687b = new byte[2];
        if (this.f1686a) {
            ar.m1150a(1, this.f1687b, 0);
        }
    }

    public byte[] m1654a() {
        return this.f1687b;
    }
}
