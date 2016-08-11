package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.cg */
class cg extends bd {
    private int f1702a;

    public cg(int i) {
        super(ay.aY);
        this.f1702a = i;
    }

    public byte[] m1663a() {
        byte[] bArr = new byte[4];
        ar.m1150a(this.f1702a, bArr, 0);
        ar.m1150a(100, bArr, 2);
        return bArr;
    }
}
