package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import p007b.C0150a;
import p007b.C0226c;
import p007b.C0233d;
import p007b.C0282e;
import p007b.C0285n;
import p007b.C0287p;
import p007b.p008a.C0149a;
import p007b.p008a.C0200t;
import p007b.p008a.C0205y;
import p007b.p008a.ad;
import p007b.p008a.an;
import p007b.p008a.aq;
import p007b.p008a.at;
import p007b.p008a.bf;
import p007b.p008a.p009a.C0130d;
import p007b.p008a.p009a.C0134t;
import p007b.p008a.p009a.C0135h;
import p007b.p008a.p009a.C0142o;
import p007b.p010e.C0151j;
import p007b.p010e.C0241q;
import p007b.p010e.C0242r;
import p007b.p010e.C0276k;
import p007b.p011c.C0152f;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.e.a.dj */
class dj implements C0241q {
    private static final char[] f1803F;
    private static final String[] f1804G;
    private static C0208c f1805a;
    private int f1806A;
    private C0285n f1807B;
    private cp f1808C;
    private C0287p f1809D;
    private dm f1810E;
    private String f1811b;
    private al f1812c;
    private ce[] f1813d;
    private an f1814e;
    private co f1815f;
    private TreeSet f1816g;
    private TreeSet f1817h;
    private ArrayList f1818i;
    private bj f1819j;
    private int f1820k;
    private int f1821l;
    private bs f1822m;
    private C0248j f1823n;
    private boolean f1824o;
    private C0205y f1825p;
    private ArrayList f1826q;
    private ArrayList f1827r;
    private ArrayList f1828s;
    private ArrayList f1829t;
    private ArrayList f1830u;
    private C0149a f1831v;
    private ArrayList f1832w;
    private C0135h f1833x;
    private boolean f1834y;
    private int f1835z;

    static {
        f1805a = C0208c.m1493a(dj.class);
        f1803F = new char[]{'*', ':', '?', '\\'};
        f1804G = new String[]{"png"};
    }

    public dj(String str, al alVar, an anVar, co coVar, C0287p c0287p, dm dmVar) {
        this.f1811b = m1736a(str);
        this.f1812c = alVar;
        this.f1813d = new ce[0];
        this.f1820k = 0;
        this.f1821l = 0;
        this.f1824o = false;
        this.f1810E = dmVar;
        this.f1814e = anVar;
        this.f1815f = coVar;
        this.f1809D = c0287p;
        this.f1834y = false;
        this.f1816g = new TreeSet(new dl());
        this.f1817h = new TreeSet();
        this.f1818i = new ArrayList();
        this.f1819j = new bj(this);
        this.f1826q = new ArrayList();
        this.f1827r = new ArrayList();
        this.f1828s = new ArrayList();
        this.f1829t = new ArrayList();
        this.f1830u = new ArrayList();
        this.f1832w = new ArrayList();
        this.f1807B = new C0285n(this);
        this.f1808C = new cp(this.f1812c, this, this.f1809D);
    }

    private String m1736a(String str) {
        int i = 0;
        if (str.length() > 31) {
            f1805a.m1499b("Sheet name " + str + " too long - truncating");
            str = str.substring(0, 31);
        }
        if (str.charAt(0) == '\'') {
            f1805a.m1499b((Object) "Sheet naming cannot start with ' - removing");
            str = str.substring(1);
        }
        while (i < f1803F.length) {
            String replace = str.replace(f1803F[i], '@');
            if (str != replace) {
                f1805a.m1499b(f1803F[i] + " is not a valid character within a sheet name - replacing");
            }
            i++;
            str = replace;
        }
        return str;
    }

    private void m1737d(int i) {
        int i2 = 0;
        C0254q c = m1753c(i);
        C0152f m = c.m1806e().m1419m();
        C0152f m2 = C0242r.f1838c.m1419m();
        int i3 = 0;
        while (i2 < this.f1820k) {
            C0150a c0150a = null;
            if (this.f1813d[i2] != null) {
                c0150a = this.f1813d[i2].m1656a(i);
            }
            if (c0150a != null) {
                String d = c0150a.m1088d();
                C0152f m3 = c0150a.m1089e().m1395m();
                if (m3.equals(m2)) {
                    m3 = m;
                }
                int f = m3.m1104f();
                int length = d.length();
                int i4 = (m3.m1106i() || m3.m1105h() > 400) ? length + 2 : length;
                i3 = Math.max(i3, (i4 * f) * 256);
            }
            i2++;
        }
        c.m1800a(i3 / m2.m1104f());
    }

    private void m1738l() {
        Iterator it = this.f1817h.iterator();
        while (it.hasNext()) {
            m1737d(((Integer) it.next()).intValue());
        }
    }

    public int m1739a() {
        return this.f1820k;
    }

    public C0150a m1740a(int i, int i2) {
        return m1750b(i, i2);
    }

    public C0282e m1741a(int i) {
        C0254q c = m1753c(i);
        C0282e c0282e = new C0282e();
        if (c != null) {
            c0282e.m1843a(c.m1805d() / 256);
            c0282e.m1848b(c.m1805d());
            c0282e.m1845a(c.m1807f());
            c0282e.m1844a(c.m1806e());
        } else {
            c0282e.m1843a(this.f1807B.m1899x() / 256);
            c0282e.m1848b(this.f1807B.m1899x() * 256);
        }
        return c0282e;
    }

    public void m1742a(int i, C0282e c0282e) {
        bf bfVar = (bf) c0282e.m1851d();
        bf a = bfVar == null ? m1760i().m1785g().m1703a() : bfVar;
        try {
            if (!a.m1417k()) {
                this.f1814e.m1138a(a);
            }
            int b = c0282e.m1852e() ? c0282e.m1847b() * 256 : c0282e.m1850c();
            if (c0282e.m1853f()) {
                this.f1817h.add(new Integer(i));
            }
            C0254q c0254q = new C0254q(i, b, a);
            if (c0282e.m1846a()) {
                c0254q.m1802a(true);
            }
            if (this.f1816g.contains(c0254q)) {
                this.f1816g.remove(c0254q);
                this.f1816g.add(c0254q);
                return;
            }
            this.f1816g.add(c0254q);
        } catch (at e) {
            f1805a.m1499b((Object) "Maximum number of format records exceeded.  Using default format.");
            C0254q c0254q2 = new C0254q(i, c0282e.m1847b() * 256, C0242r.f1838c);
            if (!this.f1816g.contains(c0254q2)) {
                this.f1816g.add(c0254q2);
            }
        }
    }

    void m1743a(C0135h c0135h) {
        this.f1833x = c0135h;
    }

    void m1744a(C0134t c0134t) {
        this.f1828s.add(c0134t);
        C0210a.m1505a(!(c0134t instanceof C0142o));
    }

    void m1745a(aq aqVar, aq aqVar2, aq aqVar3) {
        int i = 0;
        Iterator it = this.f1816g.iterator();
        while (it.hasNext()) {
            ((C0254q) it.next()).m1801a(aqVar);
        }
        for (int i2 = 0; i2 < this.f1813d.length; i2++) {
            if (this.f1813d[i2] != null) {
                this.f1813d[i2].m1657a(aqVar);
            }
        }
        C0130d[] g = m1758g();
        while (i < g.length) {
            g[i].m971a(aqVar, aqVar2, aqVar3);
            i++;
        }
    }

    void m1746a(C0237n c0237n) {
        if (this.f1825p != null) {
            this.f1825p.m1486a(c0237n.m1608b(), c0237n.e_());
        }
        if (this.f1832w != null && !this.f1832w.remove(c0237n)) {
            f1805a.m1499b("Could not remove validated cell " + C0226c.m1530a(c0237n));
        }
    }

    public void m1747a(C0151j c0151j) {
        if (c0151j.m1087c() != C0233d.f1525a || c0151j == null || c0151j.m1089e() != null) {
            C0237n c0237n = (C0237n) c0151j;
            if (c0237n.m1611h()) {
                throw new bc(bc.f1613b);
            }
            int e_ = c0151j.e_();
            ce b = m1749b(e_);
            C0237n a = b.m1656a(c0237n.m1608b());
            Object obj = (a == null || a.m1610f() == null || a.m1610f().m1434h() == null || !a.m1610f().m1434h().m1474f()) ? null : 1;
            if (c0151j.m1090f() == null || !c0151j.m1090f().m1432f() || obj == null) {
                if (obj != null) {
                    C0276k f_ = c0151j.f_();
                    if (f_ == null) {
                        f_ = new C0276k();
                        c0151j.m1092a(f_);
                    }
                    f_.m1426a(a.m1610f());
                }
                b.m1659a(c0237n);
                this.f1820k = Math.max(e_ + 1, this.f1820k);
                this.f1821l = Math.max(this.f1821l, b.m1662c());
                c0237n.m1604a(this.f1814e, this.f1815f, this);
                return;
            }
            C0200t h = a.m1610f().m1434h();
            f1805a.m1499b("Cannot add cell at " + C0226c.m1530a(c0237n) + " because it is part of the shared cell validation group " + C0226c.m1529a(h.m1470b(), h.m1472d()) + "-" + C0226c.m1529a(h.m1471c(), h.m1473e()));
        }
    }

    public int m1748b() {
        return this.f1821l;
    }

    ce m1749b(int i) {
        if (i >= 65536) {
            throw new cf();
        }
        if (i >= this.f1813d.length) {
            Object obj = this.f1813d;
            this.f1813d = new ce[Math.max(obj.length + 10, i + 1)];
            System.arraycopy(obj, 0, this.f1813d, 0, obj.length);
        }
        ce ceVar = this.f1813d[i];
        if (ceVar != null) {
            return ceVar;
        }
        ceVar = new ce(i, this);
        this.f1813d[i] = ceVar;
        return ceVar;
    }

    public C0151j m1750b(int i, int i2) {
        C0151j c0151j = null;
        if (i2 < this.f1813d.length && this.f1813d[i2] != null) {
            c0151j = this.f1813d[i2].m1656a(i);
        }
        return c0151j == null ? new ad(i, i2) : c0151j;
    }

    void m1751b(C0134t c0134t) {
        boolean z = true;
        int size = this.f1828s.size();
        this.f1828s.remove(c0134t);
        int size2 = this.f1828s.size();
        this.f1834y = true;
        if (size2 != size - 1) {
            z = false;
        }
        C0210a.m1505a(z);
    }

    void m1752b(C0237n c0237n) {
        this.f1832w.add(c0237n);
    }

    C0254q m1753c(int i) {
        Iterator it = this.f1816g.iterator();
        Object obj = null;
        C0254q c0254q = null;
        while (it.hasNext() && obj == null) {
            c0254q = (C0254q) it.next();
            if (c0254q.m1804c() >= i) {
                obj = 1;
            }
        }
        if (obj == null) {
            return null;
        }
        if (c0254q.m1804c() != i) {
            c0254q = null;
        }
        return c0254q;
    }

    public String m1754c() {
        return this.f1811b;
    }

    public C0285n m1755d() {
        return this.f1807B;
    }

    public void m1756e() {
        boolean z = this.f1834y;
        boolean b = this.f1810E.m1784f() != null ? z | this.f1810E.m1784f().m1058b() : z;
        if (this.f1817h.size() > 0) {
            m1738l();
        }
        this.f1808C.m1690a(this.f1813d, this.f1826q, this.f1827r, this.f1818i, this.f1819j, this.f1816g, this.f1835z, this.f1806A);
        this.f1808C.m1682a(m1739a(), m1748b());
        this.f1808C.m1687a(this.f1807B);
        this.f1808C.m1685a(this.f1822m);
        this.f1808C.m1689a(this.f1828s, b);
        this.f1808C.m1686a(this.f1823n);
        this.f1808C.m1684a(this.f1825p, this.f1832w);
        this.f1808C.m1688a(this.f1830u);
        this.f1808C.m1683a(this.f1831v);
        this.f1808C.m1681a();
    }

    C0287p m1757f() {
        return this.f1809D;
    }

    C0130d[] m1758g() {
        return this.f1808C.m1691b();
    }

    void m1759h() {
        this.f1808C.m1690a(this.f1813d, this.f1826q, this.f1827r, this.f1818i, this.f1819j, this.f1816g, this.f1835z, this.f1806A);
        this.f1808C.m1682a(m1739a(), m1748b());
        this.f1808C.m1692c();
    }

    dm m1760i() {
        return this.f1810E;
    }

    boolean m1761j() {
        return this.f1824o;
    }

    C0135h m1762k() {
        return this.f1833x;
    }
}
