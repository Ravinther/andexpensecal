package p018c.p019a.p023d;

import p018c.p019a.p020a.C0288a;
import p018c.p019a.p020a.C0289n;
import p018c.p019a.p020a.C0295k;
import p018c.p019a.p021b.C0307e;
import p018c.p019a.p022c.C0310b;

/* renamed from: c.a.d.b */
public class C0319b extends C0318a {
    public C0319b(C0288a c0288a) {
        super(c0288a);
    }

    public void m2209a() {
        if (!(this.a instanceof C0289n)) {
            C0310b a = ((C0295k) this.a).m1984a();
            a.m2079c(a.m2106w());
        } else if (((C0289n) this.a).m1963d() != null) {
            int am = this.b.am();
            int i;
            if (this.b.ad()) {
                for (i = 0; i < am; i++) {
                    if (this.b.m2187s(i)) {
                        this.b.m2158a(this.b.m2188t(i), i);
                    }
                }
                return;
            }
            C0307e[] b = ((C0289n) this.a).m1963d().m2029b();
            int length = b.length;
            if (length > 0) {
                for (i = 0; i < am; i++) {
                    double[] dArr = new double[]{Double.MAX_VALUE, -1.7976931348623157E308d, Double.MAX_VALUE, -1.7976931348623157E308d};
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i == b[i2].m2033a()) {
                            dArr[0] = Math.min(dArr[0], b[i2].m2045f());
                            dArr[1] = Math.max(dArr[1], b[i2].m2047h());
                            dArr[2] = Math.min(dArr[2], b[i2].m2046g());
                            dArr[3] = Math.max(dArr[3], b[i2].m2048i());
                        }
                    }
                    double abs = Math.abs(dArr[1] - dArr[0]) / 40.0d;
                    double abs2 = Math.abs(dArr[3] - dArr[2]) / 40.0d;
                    this.b.m2158a(new double[]{dArr[0] - abs, abs + dArr[1], dArr[2] - abs2, abs2 + dArr[3]}, i);
                }
            }
        }
    }
}
