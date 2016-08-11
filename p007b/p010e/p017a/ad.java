package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ad */
class ad extends bd {
    private int f1547a;
    private int f1548b;
    private byte[] f1549c;

    public ad(int i, int i2) {
        super(ay.f801g);
        this.f1547a = i;
        this.f1548b = i2;
        this.f1549c = new byte[14];
        ar.m1153b(this.f1547a, this.f1549c, 4);
        ar.m1150a(this.f1548b, this.f1549c, 10);
    }

    protected byte[] m1547a() {
        return this.f1549c;
    }
}
