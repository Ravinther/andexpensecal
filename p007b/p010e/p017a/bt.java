package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bt */
class bt extends bd {
    private int f1671a;
    private int f1672b;

    public bt(int i, int i2) {
        super(ay.aZ);
        this.f1671a = i2;
        this.f1672b = i;
    }

    public byte[] m1644a() {
        int i = 2;
        byte[] bArr = new byte[10];
        ar.m1150a(this.f1672b, bArr, 0);
        ar.m1150a(this.f1671a, bArr, 2);
        if (this.f1671a > 0) {
            ar.m1150a(this.f1671a, bArr, 4);
        }
        if (this.f1672b > 0) {
            ar.m1150a(this.f1672b, bArr, 6);
        }
        if (this.f1671a <= 0 || this.f1672b != 0) {
            i = (this.f1671a != 0 || this.f1672b <= 0) ? (this.f1671a <= 0 || this.f1672b <= 0) ? 3 : 0 : 1;
        }
        ar.m1150a(i, bArr, 8);
        return bArr;
    }
}
