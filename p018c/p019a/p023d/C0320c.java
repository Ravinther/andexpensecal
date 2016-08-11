package p018c.p019a.p023d;

import java.util.ArrayList;
import java.util.List;
import p018c.p019a.p020a.C0288a;
import p018c.p019a.p020a.C0289n;
import p018c.p019a.p020a.C0295k;

/* renamed from: c.a.d.c */
public class C0320c extends C0318a {
    private List<C0321d> f2264c;
    private boolean f2265d;
    private boolean f2266e;

    public C0320c(C0288a c0288a) {
        super(c0288a);
        this.f2264c = new ArrayList();
        this.f2265d = false;
        this.f2266e = false;
    }

    private double m2210a(double[] dArr) {
        return Math.abs(dArr[1] - dArr[0]) / Math.abs(dArr[3] - dArr[2]);
    }

    private synchronized void m2211a() {
        for (C0321d a : this.f2264c) {
            a.m2213a();
        }
    }

    public void m2212a(float f, float f2, float f3, float f4) {
        Object obj = 1;
        Object obj2 = 1;
        Object obj3 = 1;
        Object obj4 = 1;
        if (this.a instanceof C0289n) {
            int am = this.b.am();
            double[] Y = this.b.m2146Y();
            Object obj5 = (Y == null || Y.length != 4) ? null : 1;
            C0289n c0289n = (C0289n) this.a;
            int i = 0;
            while (i < am) {
                double d;
                Object obj6;
                Object obj7;
                double[] a = m2207a(i);
                double[] b = c0289n.m1961b(i);
                if (this.f2265d && this.f2266e) {
                    if (a[0] != a[1] || b[0] != b[1]) {
                        if (a[2] == a[3] && b[2] == b[3]) {
                            return;
                        }
                    }
                    return;
                }
                m2206a(a, i);
                b = c0289n.m1957a(f, f2, i);
                double[] a2 = c0289n.m1957a(f3, f4, i);
                double d2 = b[0] - a2[0];
                double d3 = b[1] - a2[1];
                double a3 = m2210a(a);
                if (c0289n.m1940a(this.b)) {
                    d = (-d3) * a3;
                    d2 /= a3;
                } else {
                    d = d2;
                    d2 = d3;
                }
                if (this.b.m2139R()) {
                    if (Y != null) {
                        if (obj3 != null) {
                            obj6 = Y[0] <= a[0] + d ? 1 : null;
                        } else {
                            obj6 = obj3;
                        }
                        if (obj4 != null) {
                            obj4 = Y[1] >= a[1] + d ? 1 : null;
                        }
                    } else {
                        obj6 = obj3;
                    }
                    if (obj5 == null || !(r13 == null || r12 == null)) {
                        m2205a(a[0] + d, d + a[1], i);
                        this.f2265d = false;
                    } else {
                        this.f2265d = true;
                    }
                } else {
                    obj6 = obj3;
                }
                if (this.b.m2140S()) {
                    if (Y != null) {
                        if (obj2 != null) {
                            obj2 = Y[2] <= a[2] + d2 ? 1 : null;
                        }
                        if (obj != null) {
                            obj = Y[3] >= a[3] + d2 ? 1 : null;
                        }
                    }
                    if (obj5 == null || !(obj2 == null || obj == null)) {
                        m2208b(a[2] + d2, a[3] + d2, i);
                        this.f2266e = false;
                        obj3 = obj2;
                        obj7 = obj;
                        i++;
                        obj2 = obj3;
                        obj = obj7;
                        obj3 = obj6;
                    } else {
                        this.f2266e = true;
                    }
                }
                obj3 = obj2;
                obj7 = obj;
                i++;
                obj2 = obj3;
                obj = obj7;
                obj3 = obj6;
            }
        } else {
            C0295k c0295k = (C0295k) this.a;
            c0295k.m1988b(c0295k.m1987b() + ((int) (f3 - f)));
            c0295k.m1990c(c0295k.m1989c() + ((int) (f4 - f2)));
        }
        m2211a();
    }
}
