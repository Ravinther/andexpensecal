package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.l */
class C0250l extends bd {
    static C0251m f1875a;
    static C0251m f1876b;
    static C0251m f1877c;
    private C0251m f1878d;

    static {
        f1875a = new C0251m(0);
        f1876b = new C0251m(1);
        f1877c = new C0251m(-1);
    }

    public C0250l(C0251m c0251m) {
        super(ay.aA);
        this.f1878d = c0251m;
    }

    public byte[] m1796a() {
        byte[] bArr = new byte[2];
        ar.m1150a(this.f1878d.f1879a, bArr, 0);
        return bArr;
    }
}
