package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.cw */
class cw extends bd {
    private byte[] f1792a;

    public cw(int i) {
        super(ay.f770A);
        this.f1792a = new byte[(i * 2)];
        for (int i2 = 0; i2 < i; i2++) {
            ar.m1150a(i2 + 1, this.f1792a, i2 * 2);
        }
    }

    public byte[] m1719a() {
        return this.f1792a;
    }
}
