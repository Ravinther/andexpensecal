package p007b.p010e.p017a;

import p007b.p008a.C0199s;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.u */
class C0258u extends bd {
    private int f1916a;
    private int f1917b;

    public C0258u(C0199s c0199s, C0199s c0199s2) {
        super(ay.f794Y);
        this.f1916a = c0199s.m1466a();
        this.f1917b = c0199s2.m1466a();
    }

    public byte[] m1824a() {
        byte[] bArr = new byte[4];
        ar.m1150a(this.f1916a, bArr, 0);
        ar.m1150a(this.f1917b, bArr, 2);
        return bArr;
    }
}
