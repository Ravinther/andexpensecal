package p018c.p019a.p020a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p018c.p019a.p021b.C0304b;
import p018c.p019a.p021b.C0305c;

/* renamed from: c.a.a.h */
public class C0297h implements Serializable {
    private List<C0298i> f2089a;
    private int f2090b;
    private int f2091c;
    private int f2092d;

    public C0297h() {
        this.f2089a = new ArrayList();
    }

    public double m1993a(C0304b c0304b) {
        double atan2 = Math.atan2((double) (-(c0304b.m2025b() - ((float) this.f2092d))), (double) (c0304b.m2024a() - ((float) this.f2091c)));
        return Math.toDegrees(atan2 < 0.0d ? Math.abs(atan2) : 6.283185307179586d - atan2);
    }

    public void m1994a() {
        this.f2089a.clear();
    }

    public void m1995a(int i, float f, float f2, float f3) {
        this.f2089a.add(new C0298i(i, f, f2, f3));
    }

    public void m1996a(int i, int i2, int i3) {
        this.f2090b = i;
        this.f2091c = i2;
        this.f2092d = i3;
    }

    public boolean m1997a(int i) {
        return this.f2089a.size() == i;
    }

    public boolean m1998b(C0304b c0304b) {
        return Math.pow((double) (((float) this.f2091c) - c0304b.m2024a()), 2.0d) + Math.pow((double) (((float) this.f2092d) - c0304b.m2025b()), 2.0d) <= ((double) (this.f2090b * this.f2090b));
    }

    public C0305c m1999c(C0304b c0304b) {
        if (m1998b(c0304b)) {
            double a = m1993a(c0304b);
            for (C0298i c0298i : this.f2089a) {
                if (c0298i.m2001a(a)) {
                    return new C0305c(0, c0298i.m2000a(), (double) c0298i.m2002b(), (double) c0298i.m2002b());
                }
            }
        }
        return null;
    }
}
