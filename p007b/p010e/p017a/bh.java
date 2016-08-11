package p007b.p010e.p017a;

import p007b.p008a.ac;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bh */
abstract class bh extends bd {
    private double f1631a;

    public bh(ay ayVar, double d) {
        super(ayVar);
        this.f1631a = d;
    }

    public byte[] m1619a() {
        byte[] bArr = new byte[8];
        ac.m1085a(this.f1631a, bArr, 0);
        return bArr;
    }
}
