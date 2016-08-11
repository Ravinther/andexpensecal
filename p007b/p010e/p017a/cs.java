package p007b.p010e.p017a;

import p007b.p008a.bf;
import p007b.p010e.C0242r;
import p007b.p010e.C0265b;
import p007b.p010e.C0266c;
import p007b.p010e.C0274h;
import p007b.p010e.C0277l;
import p007b.p010e.C0278m;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.cs */
class cs {
    private static C0208c f1773a;
    private C0278m f1774b;
    private C0278m f1775c;
    private C0277l f1776d;
    private C0277l f1777e;
    private C0277l f1778f;
    private C0277l f1779g;

    static {
        f1773a = C0208c.m1493a(cs.class);
    }

    public cs() {
        this.f1774b = null;
        this.f1775c = null;
        this.f1776d = null;
        this.f1777e = null;
        this.f1778f = null;
    }

    private synchronized void m1696g() {
        this.f1776d = new C0277l(m1706d(), C0274h.f1944a);
        this.f1776d.m1400a(m1706d());
    }

    private synchronized void m1697h() {
        this.f1778f = new C0277l(m1706d(), new C0265b(";;;"));
    }

    private synchronized void m1698i() {
        this.f1777e = new C0277l(m1707e(), C0274h.f1944a);
    }

    private synchronized void m1699j() {
        this.f1774b = new C0278m(C0242r.f1836a);
    }

    private synchronized void m1700k() {
        this.f1775c = new C0278m(C0242r.f1837b);
    }

    private synchronized void m1701l() {
        this.f1779g = new C0277l(C0266c.f1929b);
    }

    public bf m1702a(bf bfVar) {
        if (bfVar == C0242r.f1838c) {
            bfVar = m1703a();
        } else if (bfVar == C0242r.f1839d) {
            bfVar = m1705c();
        } else if (bfVar == C0242r.f1840e) {
            bfVar = m1704b();
        } else if (bfVar == C0262y.f1924b) {
            bfVar = m1708f();
        }
        if (bfVar.m1419m() == C0242r.f1836a) {
            bfVar.m1400a(m1706d());
        } else if (bfVar.m1419m() == C0242r.f1837b) {
            bfVar.m1400a(m1707e());
        }
        return bfVar;
    }

    public C0277l m1703a() {
        if (this.f1776d == null) {
            m1696g();
        }
        return this.f1776d;
    }

    public C0277l m1704b() {
        if (this.f1778f == null) {
            m1697h();
        }
        return this.f1778f;
    }

    public C0277l m1705c() {
        if (this.f1777e == null) {
            m1698i();
        }
        return this.f1777e;
    }

    public C0278m m1706d() {
        if (this.f1774b == null) {
            m1699j();
        }
        return this.f1774b;
    }

    public C0278m m1707e() {
        if (this.f1775c == null) {
            m1700k();
        }
        return this.f1775c;
    }

    public C0277l m1708f() {
        if (this.f1779g == null) {
            m1701l();
        }
        return this.f1779g;
    }
}
