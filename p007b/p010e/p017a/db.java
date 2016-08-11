package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.db */
class db extends bd {
    private int[] f1797a;

    public db(int[] iArr) {
        super(ay.aK);
        this.f1797a = iArr;
    }

    public byte[] m1723a() {
        int i = 0;
        byte[] bArr = new byte[((this.f1797a.length * 6) + 2)];
        ar.m1150a(this.f1797a.length, bArr, 0);
        int i2 = 2;
        while (i < this.f1797a.length) {
            ar.m1150a(this.f1797a[i], bArr, i2);
            ar.m1150a(255, bArr, i2 + 4);
            i2 += 6;
            i++;
        }
        return bArr;
    }
}
