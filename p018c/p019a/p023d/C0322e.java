package p018c.p019a.p023d;

import java.util.ArrayList;
import java.util.List;
import p018c.p019a.p020a.C0288a;
import p018c.p019a.p020a.C0289n;
import p018c.p019a.p020a.C0295k;
import p018c.p019a.p022c.C0310b;

/* renamed from: c.a.d.e */
public class C0322e extends C0318a {
    private boolean f2267c;
    private float f2268d;
    private List<C0324g> f2269e;
    private boolean f2270f;
    private boolean f2271g;

    public C0322e(C0288a c0288a, boolean z, float f) {
        super(c0288a);
        this.f2269e = new ArrayList();
        this.f2270f = false;
        this.f2271g = false;
        this.f2267c = z;
        m2216a(f);
    }

    private synchronized void m2214a(C0323f c0323f) {
        for (C0324g a : this.f2269e) {
            a.m2219a(c0323f);
        }
    }

    public synchronized void m2215a() {
        for (C0324g a : this.f2269e) {
            a.m2218a();
        }
    }

    public void m2216a(float f) {
        this.f2268d = f;
    }

    public void m2217b(int i) {
        if (this.a instanceof C0289n) {
            int am = this.b.am();
            for (int i2 = 0; i2 < am; i2++) {
                double[] a = m2207a(i2);
                m2206a(a, i2);
                double[] Z = this.b.m2147Z();
                double d = (a[0] + a[1]) / 2.0d;
                double d2 = (a[2] + a[3]) / 2.0d;
                double d3 = a[1] - a[0];
                double d4 = a[3] - a[2];
                double d5 = d - (d3 / 2.0d);
                double d6 = (d3 / 2.0d) + d;
                double d7 = d2 - (d4 / 2.0d);
                double d8 = (d4 / 2.0d) + d2;
                if (i2 == 0) {
                    boolean z = Z != null && (d5 <= Z[0] || d6 >= Z[1]);
                    this.f2270f = z;
                    z = Z != null && (d7 <= Z[2] || d8 >= Z[3]);
                    this.f2271g = z;
                }
                if (this.f2267c) {
                    d5 = (this.b.m2141T() && (i == 1 || i == 0)) ? (!this.f2270f || this.f2268d >= 1.0f) ? d3 / ((double) this.f2268d) : d3 : d3;
                    if (!this.b.m2142U() || (i != 2 && i != 0)) {
                        d6 = d5;
                    } else if (!this.f2271g || this.f2268d >= 1.0f) {
                        d4 /= (double) this.f2268d;
                        d6 = d5;
                    } else {
                        d6 = d5;
                    }
                } else {
                    if (this.b.m2141T() && !this.f2270f && (i == 1 || i == 0)) {
                        d3 *= (double) this.f2268d;
                    }
                    if (this.b.m2142U() && !this.f2271g && (i == 2 || i == 0)) {
                        d4 = ((double) this.f2268d) * d4;
                        d6 = d3;
                    } else {
                        d6 = d3;
                    }
                }
                if (Z != null) {
                    d3 = Math.min(this.b.ak(), Z[1] - Z[0]);
                    d5 = Math.min(this.b.al(), Z[3] - Z[2]);
                } else {
                    d3 = this.b.ak();
                    d5 = this.b.al();
                }
                d6 = Math.max(d6, d3);
                double max = Math.max(d4, d5);
                if (this.b.m2141T() && (i == 1 || i == 0)) {
                    m2205a(d - (d6 / 2.0d), d + (d6 / 2.0d), i2);
                }
                if (this.b.m2142U() && (i == 2 || i == 0)) {
                    m2208b(d2 - (max / 2.0d), d2 + (max / 2.0d), i2);
                }
            }
        } else {
            C0310b a2 = ((C0295k) this.a).m1984a();
            if (this.f2267c) {
                a2.m2079c(a2.m2105v() * this.f2268d);
            } else {
                a2.m2079c(a2.m2105v() / this.f2268d);
            }
        }
        m2214a(new C0323f(this.f2267c, this.f2268d));
    }
}
