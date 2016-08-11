package p007b.p010e.p017a;

import p007b.p008a.ar;

/* renamed from: b.e.a.bn */
class bn {
    private int f1657a;
    private int f1658b;
    private int f1659c;
    private int f1660d;
    private int f1661e;

    bn(int i, int i2, int i3, int i4, int i5) {
        this.f1657a = i4;
        this.f1658b = i2;
        this.f1659c = i5;
        this.f1660d = i3;
        this.f1661e = i;
    }

    byte[] m1635a() {
        byte[] bArr = new byte[10];
        ar.m1150a(this.f1661e, bArr, 0);
        ar.m1150a(this.f1658b, bArr, 2);
        ar.m1150a(this.f1660d, bArr, 4);
        ar.m1150a(this.f1657a & 255, bArr, 6);
        ar.m1150a(this.f1659c & 255, bArr, 8);
        return bArr;
    }
}
