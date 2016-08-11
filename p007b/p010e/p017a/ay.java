package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.bd;

/* renamed from: b.e.a.ay */
class ay extends bd {
    private byte[] f1605a;
    private int f1606b;
    private int f1607c;
    private int f1608d;
    private int f1609e;

    public ay(int i, int i2, int i3) {
        super(p007b.p008a.ay.f810p);
        this.f1607c = i;
        this.f1606b = i2;
        this.f1608d = i3;
        this.f1605a = new byte[((this.f1608d * 4) + 16)];
        this.f1609e = 16;
    }

    void m1596a(int i) {
        ar.m1153b(i - this.f1607c, this.f1605a, this.f1609e);
        this.f1609e += 4;
    }

    protected byte[] m1597a() {
        ar.m1153b(this.f1606b, this.f1605a, 8);
        return this.f1605a;
    }

    void m1598b(int i) {
        ar.m1153b(i - this.f1607c, this.f1605a, 12);
    }
}
