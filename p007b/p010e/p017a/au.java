package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.au */
class au extends bd {
    private int[] f1587a;

    public au(int[] iArr) {
        super(ay.aL);
        this.f1587a = iArr;
    }

    public byte[] m1585a() {
        int i = 0;
        byte[] bArr = new byte[((this.f1587a.length * 6) + 2)];
        ar.m1150a(this.f1587a.length, bArr, 0);
        int i2 = 2;
        while (i < this.f1587a.length) {
            ar.m1150a(this.f1587a[i], bArr, i2);
            ar.m1150a(255, bArr, i2 + 4);
            i2 += 6;
            i++;
        }
        return bArr;
    }
}
