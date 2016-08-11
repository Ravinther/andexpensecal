package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.aq */
class aq extends bd {
    private byte[] f1576a;
    private int f1577b;
    private int f1578c;
    private int f1579d;
    private int f1580e;

    public aq() {
        super(ay.al);
    }

    public void m1579a(int i) {
        this.f1579d = i;
        this.f1577b = (i * 14) + 1;
    }

    public byte[] m1580a() {
        this.f1576a = new byte[8];
        ar.m1150a(this.f1577b, this.f1576a, 0);
        ar.m1150a(this.f1578c, this.f1576a, 2);
        ar.m1150a(this.f1579d, this.f1576a, 4);
        ar.m1150a(this.f1580e, this.f1576a, 6);
        return this.f1576a;
    }

    public void m1581b(int i) {
        this.f1580e = i;
        this.f1578c = (i * 14) + 1;
    }
}
