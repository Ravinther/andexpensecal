package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ac */
class ac extends bd {
    private byte[] f1545a;
    private double f1546b;

    public ac(double d) {
        super(ay.aF);
        this.f1546b = d;
        this.f1545a = new byte[8];
    }

    public byte[] m1546a() {
        p007b.p008a.ac.m1085a(this.f1546b, this.f1545a, 0);
        return this.f1545a;
    }
}
