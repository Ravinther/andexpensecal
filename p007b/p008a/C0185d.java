package p007b.p008a;

import p007b.C0226c;
import p007b.p008a.p009a.C0135h;
import p007b.p008a.p009a.C0136i;
import p007b.p010e.p017a.C0237n;
import p007b.p013b.C0208c;

/* renamed from: b.a.d */
public class C0185d {
    public static C0208c f1131a;
    public static final C0186e f1132b;
    public static final C0186e f1133c;
    public static final C0186e f1134d;
    public static final C0186e f1135e;
    public static final C0186e f1136f;
    public static final C0186e f1137g;
    public static final C0186e f1138h;
    public static final C0186e f1139i;
    private String f1140j;
    private double f1141k;
    private double f1142l;
    private C0136i f1143m;
    private C0135h f1144n;
    private aa f1145o;
    private C0200t f1146p;
    private boolean f1147q;
    private boolean f1148r;
    private C0237n f1149s;

    static {
        f1131a = C0208c.m1493a(C0185d.class);
        f1132b = new C0186e(C0200t.f1240l);
        f1133c = new C0186e(C0200t.f1241m);
        f1134d = new C0186e(C0200t.f1242n);
        f1135e = new C0186e(C0200t.f1243o);
        f1136f = new C0186e(C0200t.f1244p);
        f1137g = new C0186e(C0200t.f1245q);
        f1138h = new C0186e(C0200t.f1246r);
        f1139i = new C0186e(C0200t.f1247s);
    }

    protected C0185d() {
    }

    private void m1422i() {
        this.f1145o = null;
        this.f1146p = null;
        this.f1147q = false;
        this.f1144n = null;
        this.f1148r = false;
    }

    protected String m1423a() {
        return this.f1140j;
    }

    public void m1424a(C0135h c0135h) {
        this.f1144n = c0135h;
    }

    public final void m1425a(C0136i c0136i) {
        this.f1143m = c0136i;
    }

    public void m1426a(C0185d c0185d) {
        if (this.f1148r) {
            f1131a.m1499b("Attempting to share a data validation on cell " + C0226c.m1530a(this.f1149s) + " which already has a data validation");
            return;
        }
        m1422i();
        this.f1146p = c0185d.m1434h();
        this.f1145o = null;
        this.f1148r = true;
        this.f1147q = c0185d.f1147q;
        this.f1144n = c0185d.f1144n;
    }

    public final void m1427a(C0237n c0237n) {
        this.f1149s = c0237n;
    }

    public double m1428b() {
        return this.f1141k;
    }

    public double m1429c() {
        return this.f1142l;
    }

    public void m1430d() {
        this.f1140j = null;
        if (this.f1143m != null) {
            this.f1149s.m1603a(this.f1143m);
            this.f1143m = null;
        }
    }

    public void m1431e() {
        if (this.f1148r) {
            C0200t h = m1434h();
            if (h.m1474f()) {
                f1131a.m1499b("Cannot remove data validation from " + C0226c.m1530a(this.f1149s) + " as it is part of the shared reference " + C0226c.m1529a(h.m1470b(), h.m1472d()) + "-" + C0226c.m1529a(h.m1471c(), h.m1473e()));
                return;
            }
            this.f1149s.m1614k();
            m1422i();
        }
    }

    public boolean m1432f() {
        return this.f1148r;
    }

    public boolean m1433g() {
        return this.f1147q;
    }

    public C0200t m1434h() {
        if (this.f1146p != null) {
            return this.f1146p;
        }
        if (this.f1145o == null) {
            return null;
        }
        this.f1146p = new C0200t(this.f1145o.m1081h());
        return this.f1146p;
    }
}
