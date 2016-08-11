package p018c.p019a.p023d;

import p018c.p019a.p020a.C0288a;
import p018c.p019a.p020a.C0289n;
import p018c.p019a.p022c.C0312d;

/* renamed from: c.a.d.a */
public abstract class C0318a {
    protected C0288a f2262a;
    protected C0312d f2263b;

    public C0318a(C0288a c0288a) {
        this.f2262a = c0288a;
        if (c0288a instanceof C0289n) {
            this.f2263b = ((C0289n) c0288a).m1962c();
        }
    }

    protected void m2205a(double d, double d2, int i) {
        this.f2263b.m2151a(d, i);
        this.f2263b.m2160b(d2, i);
    }

    public void m2206a(double[] dArr, int i) {
        if (this.f2262a instanceof C0289n) {
            double[] b = ((C0289n) this.f2262a).m1961b(i);
            if (b != null) {
                if (!this.f2263b.m2175h(i)) {
                    dArr[0] = b[0];
                    this.f2263b.m2151a(dArr[0], i);
                }
                if (!this.f2263b.m2178j(i)) {
                    dArr[1] = b[1];
                    this.f2263b.m2160b(dArr[1], i);
                }
                if (!this.f2263b.m2180l(i)) {
                    dArr[2] = b[2];
                    this.f2263b.m2163c(dArr[2], i);
                }
                if (!this.f2263b.m2182n(i)) {
                    dArr[3] = b[3];
                    this.f2263b.m2165d(dArr[3], i);
                }
            }
        }
    }

    public double[] m2207a(int i) {
        double g = this.f2263b.m2173g(i);
        double i2 = this.f2263b.m2176i(i);
        double k = this.f2263b.m2179k(i);
        double m = this.f2263b.m2181m(i);
        return new double[]{g, i2, k, m};
    }

    protected void m2208b(double d, double d2, int i) {
        this.f2263b.m2163c(d, i);
        this.f2263b.m2165d(d2, i);
    }
}
