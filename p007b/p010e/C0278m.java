package p007b.p010e;

import p007b.p010e.p017a.dg;
import p007b.p011c.C0152f;
import p007b.p011c.C0216e;
import p007b.p011c.C0223n;
import p007b.p011c.C0224o;

/* renamed from: b.e.m */
public class C0278m extends dg {
    public static final C0280o f1979b;
    public static final C0280o f1980c;
    public static final C0280o f1981d;
    public static final C0280o f1982e;
    public static final C0279n f1983f;
    public static final C0279n f1984g;

    static {
        f1979b = new C0280o("Arial");
        f1980c = new C0280o("Times New Roman");
        f1981d = new C0280o("Courier New");
        f1982e = new C0280o("Tahoma");
        f1983f = new C0279n(400);
        f1984g = new C0279n(700);
    }

    public C0278m(C0152f c0152f) {
        super(c0152f);
    }

    public C0278m(C0280o c0280o) {
        this(c0280o, 10, f1983f, false, C0224o.f1485a, C0216e.f1363b, C0223n.f1479a);
    }

    public C0278m(C0280o c0280o, int i) {
        this(c0280o, i, f1983f, false, C0224o.f1485a, C0216e.f1363b, C0223n.f1479a);
    }

    public C0278m(C0280o c0280o, int i, C0279n c0279n, boolean z, C0224o c0224o) {
        this(c0280o, i, c0279n, z, c0224o, C0216e.f1363b, C0223n.f1479a);
    }

    public C0278m(C0280o c0280o, int i, C0279n c0279n, boolean z, C0224o c0224o, C0216e c0216e) {
        this(c0280o, i, c0279n, z, c0224o, c0216e, C0223n.f1479a);
    }

    public C0278m(C0280o c0280o, int i, C0279n c0279n, boolean z, C0224o c0224o, C0216e c0216e, C0223n c0223n) {
        super(c0280o.f1986a, i, c0279n.f1985a, z, c0224o.m1526a(), c0216e.m1514a(), c0223n.m1524a());
    }

    public boolean m1842n() {
        return super.m1124n();
    }
}
