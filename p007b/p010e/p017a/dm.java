package p007b.p010e.p017a;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p007b.C0155l;
import p007b.C0240m;
import p007b.C0287p;
import p007b.p008a.C0125l;
import p007b.p008a.C0190i;
import p007b.p008a.C0199s;
import p007b.p008a.aj;
import p007b.p008a.an;
import p007b.p008a.aq;
import p007b.p008a.ar;
import p007b.p008a.bb;
import p007b.p008a.be;
import p007b.p008a.p009a.C0134t;
import p007b.p008a.p009a.C0146s;
import p007b.p008a.p009a.ah;
import p007b.p008a.p012b.C0175t;
import p007b.p010e.C0241q;
import p007b.p010e.C0242r;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;
import p007b.p015d.p016a.C0227a;

/* renamed from: b.e.a.dm */
public class dm extends C0242r implements C0175t, bb {
    private static C0208c f1841f;
    private static Object f1842y;
    private be[] f1843A;
    private an f1844g;
    private al f1845h;
    private ArrayList f1846i;
    private aj f1847j;
    private aj f1848k;
    private ArrayList f1849l;
    private ArrayList f1850m;
    private HashMap f1851n;
    private co f1852o;
    private boolean f1853p;
    private boolean f1854q;
    private C0287p f1855r;
    private ArrayList f1856s;
    private C0146s f1857t;
    private cs f1858u;
    private boolean f1859v;
    private C0248j f1860w;
    private C0258u f1861x;
    private String[] f1862z;

    static {
        f1841f = C0208c.m1493a(dm.class);
        f1842y = new Object();
    }

    public dm(OutputStream outputStream, boolean z, C0287p c0287p) {
        this.f1845h = new al(outputStream, c0287p, null);
        this.f1846i = new ArrayList();
        this.f1852o = new co();
        this.f1851n = new HashMap();
        this.f1853p = z;
        this.f1854q = false;
        this.f1859v = false;
        this.f1855r = c0287p;
        this.f1856s = new ArrayList();
        this.f1858u = new cs();
        synchronized (f1842y) {
            C0242r.f1836a.m1115d();
            C0242r.f1837b.m1115d();
            C0242r.f1838c.m1415i();
            C0242r.f1839d.m1415i();
            C0242r.f1840e.m1415i();
            C0262y.f1924b.m1415i();
        }
        this.f1847j = new dh(this);
        this.f1844g = new di(this.f1847j, this.f1858u);
    }

    private C0241q m1767a(String str, int i, boolean z) {
        C0241q djVar = new dj(str, this.f1845h, this.f1844g, this.f1852o, this.f1855r, this);
        if (i <= 0) {
            this.f1846i.add(0, djVar);
            i = 0;
        } else if (i > this.f1846i.size()) {
            i = this.f1846i.size();
            this.f1846i.add(djVar);
        } else {
            this.f1846i.add(i, djVar);
        }
        if (z && this.f1848k != null) {
            this.f1848k.m1564c(i);
        }
        if (this.f1849l != null && this.f1849l.size() > 0) {
            ct ctVar = (ct) this.f1849l.get(0);
            if (ctVar.m1716c() == ct.f1780a) {
                ctVar.m1713a(this.f1846i.size());
            }
        }
        return djVar;
    }

    private int m1768c(String str) {
        String[] d = m1782d();
        for (int i = 0; i < d.length; i++) {
            if (str.equals(d[i])) {
                return i;
            }
        }
        return -1;
    }

    private void m1769h() {
        aq b = this.f1844g.m1140b();
        aq c = this.f1844g.m1141c();
        aq a = this.f1844g.m1136a(b, c);
        for (int i = 0; i < this.f1846i.size(); i++) {
            ((dj) this.f1846i.get(i)).m1745a(a, b, c);
        }
    }

    public int m1770a(String str) {
        bm bmVar = (bm) this.f1851n.get(str);
        return bmVar != null ? bmVar.m1634d() : -1;
    }

    public C0227a m1771a() {
        return null;
    }

    public C0241q m1772a(String str, int i) {
        return m1767a(str, i, true);
    }

    public String m1773a(int i) {
        boolean z = i >= 0 && i < this.f1850m.size();
        C0210a.m1505a(z);
        return ((bm) this.f1850m.get(i)).m1633c();
    }

    void m1774a(C0134t c0134t) {
        if (this.f1857t == null) {
            this.f1857t = new C0146s(ah.f508b);
        }
        this.f1857t.m1054a(c0134t);
    }

    void m1775a(C0190i c0190i, C0241q c0241q, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (this.f1850m == null) {
            this.f1850m = new ArrayList();
        }
        bm bmVar = new bm(c0190i, m1768c(c0241q.m1732c()), m1777b(c0241q.m1732c()), i6, i8, i5, i7, i2, i4, i, i3, z);
        this.f1850m.add(bmVar);
        this.f1851n.put(c0190i, bmVar);
    }

    void m1776a(C0190i c0190i, C0241q c0241q, int i, int i2, int i3, int i4, boolean z) {
        if (this.f1850m == null) {
            this.f1850m = new ArrayList();
        }
        bm bmVar = new bm(c0190i, m1768c(c0241q.m1732c()), m1777b(c0241q.m1732c()), i2, i4, i, i3, z);
        this.f1850m.add(bmVar);
        this.f1851n.put(c0190i, bmVar);
    }

    public int m1777b(String str) {
        int i = 0;
        if (this.f1848k == null) {
            this.f1848k = new aj();
            this.f1849l = new ArrayList();
            this.f1849l.add(new ct(m1783e(), this.f1855r));
        }
        Iterator it = this.f1846i.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext() && i3 == 0) {
            if (((dj) it.next()).m1754c().equals(str)) {
                i3 = 1;
            } else {
                i2++;
            }
        }
        ct ctVar;
        if (i3 != 0) {
            ctVar = (ct) this.f1849l.get(0);
            if (!(ctVar.m1716c() == ct.f1780a && ctVar.m1717d() == m1783e())) {
                f1841f.m1499b("Cannot find sheet " + str + " in supbook record");
            }
            return this.f1848k.m1561a(0, i2);
        }
        int lastIndexOf = str.lastIndexOf(93);
        i2 = str.lastIndexOf(91);
        if (lastIndexOf == -1 || i2 == -1) {
            f1841f.m1499b((Object) "Square brackets");
            return -1;
        }
        String substring = str.substring(lastIndexOf + 1);
        String str2 = str.substring(0, i2) + str.substring(i2 + 1, lastIndexOf);
        ctVar = null;
        i2 = -1;
        i3 = 0;
        while (i < this.f1849l.size() && i3 == 0) {
            ctVar = (ct) this.f1849l.get(i);
            if (ctVar.m1716c() == ct.f1781b && ctVar.m1718e().equals(str2)) {
                i2 = i;
                i3 = 1;
            }
            i++;
        }
        if (i3 == 0) {
            ctVar = new ct(str2, this.f1855r);
            i2 = this.f1849l.size();
            this.f1849l.add(ctVar);
        }
        return this.f1848k.m1561a(i2, ctVar.m1712a(substring));
    }

    public String m1778b(int i) {
        ct ctVar = (ct) this.f1849l.get(this.f1848k.m1560a(i));
        int b = this.f1848k.m1563b(i);
        if (ctVar.m1716c() == ct.f1780a) {
            return m1780c(b).m1732c();
        }
        if (ctVar.m1716c() == ct.f1781b) {
            return ctVar.m1718e() + ctVar.m1715b(b);
        }
        f1841f.m1499b((Object) "Unknown Supbook 1");
        return "[UNKNOWN]";
    }

    public void m1779b() {
        this.f1845h.m1569a(this.f1853p);
    }

    public C0241q m1780c(int i) {
        return (C0241q) this.f1846i.get(i);
    }

    public void m1781c() {
        for (int i = 0; i < m1783e(); i++) {
            dj djVar = (dj) m1780c(i);
            djVar.m1759h();
            C0155l Q = djVar.m1755d().m1872Q();
            if (Q != null) {
                m1776a(C0190i.f1174g, djVar, Q.m1155a().m1086b(), Q.m1155a().e_(), Q.m1156b().m1086b(), Q.m1156b().e_(), false);
            }
            Q = djVar.m1755d().m1873R();
            C0155l S = djVar.m1755d().m1874S();
            if (Q != null && S != null) {
                m1775a(C0190i.f1175h, djVar, Q.m1155a().m1086b(), Q.m1155a().e_(), Q.m1156b().m1086b(), Q.m1156b().e_(), S.m1155a().m1086b(), S.m1155a().e_(), S.m1156b().m1086b(), S.m1156b().e_(), false);
            } else if (Q != null) {
                m1776a(C0190i.f1175h, djVar, Q.m1155a().m1086b(), Q.m1155a().e_(), Q.m1156b().m1086b(), Q.m1156b().e_(), false);
            } else if (S != null) {
                m1776a(C0190i.f1175h, djVar, S.m1155a().m1086b(), S.m1155a().e_(), S.m1156b().m1086b(), S.m1156b().e_(), false);
            }
        }
        if (!this.f1855r.m1910e()) {
            m1769h();
        }
        this.f1845h.m1568a(new C0234a(C0234a.f1537a));
        if (this.f1855r.m1919n()) {
            this.f1845h.m1568a(new cx());
        }
        this.f1845h.m1568a(new ba());
        this.f1845h.m1568a(new bg(0, 0));
        this.f1845h.m1568a(new az());
        this.f1845h.m1568a(new dn(this.f1855r.m1923r()));
        this.f1845h.m1568a(new C0253p());
        this.f1845h.m1568a(new C0260w());
        if (this.f1855r.m1920o()) {
            this.f1845h.m1568a(new af());
        }
        this.f1845h.m1568a(new cw(m1783e()));
        if (this.f1859v) {
            this.f1845h.m1568a(new bq());
        }
        if (this.f1860w != null) {
            this.f1845h.m1568a(this.f1860w);
        }
        this.f1845h.m1568a(new ao());
        this.f1845h.m1568a(new df(this.f1855r.m1921p()));
        this.f1845h.m1568a(new ca(this.f1854q));
        this.f1845h.m1568a(new bu(null));
        this.f1845h.m1568a(new bz(false));
        this.f1845h.m1568a(new by());
        Object obj = null;
        int i2 = 0;
        int i3 = 0;
        while (i3 < m1783e() && obj == null) {
            Object obj2;
            int i4;
            if (((dj) m1780c(i3)).m1755d().m1883h()) {
                obj2 = 1;
                i4 = i3;
            } else {
                i4 = i2;
                obj2 = obj;
            }
            i3++;
            obj = obj2;
            i2 = i4;
        }
        if (obj == null) {
            ((dj) m1780c(0)).m1755d().m1876a(true);
            i2 = 0;
        }
        this.f1845h.m1568a(new dd(i2));
        this.f1845h.m1568a(new C0243e(false));
        this.f1845h.m1568a(new as(this.f1855r.m1922q()));
        this.f1845h.m1568a(new bo(false));
        this.f1845h.m1568a(new bv(false));
        this.f1845h.m1568a(new cc(this.f1855r.m1918m()));
        this.f1845h.m1568a(new C0245g(true));
        this.f1847j.m1128a(this.f1845h);
        this.f1844g.m1139a(this.f1845h);
        if (this.f1844g.m1142d() != null) {
            this.f1845h.m1568a(this.f1844g.m1142d());
        }
        this.f1845h.m1568a(new cz());
        int[] iArr = new int[m1783e()];
        for (i3 = 0; i3 < m1783e(); i3++) {
            iArr[i3] = this.f1845h.m1567a();
            C0240m c = m1780c(i3);
            C0125l c0247i = new C0247i(c.m1732c());
            if (c.m1733d().m1882g()) {
                c0247i.m1792c();
            }
            if (((dj) this.f1846i.get(i3)).m1761j()) {
                c0247i.m1793d();
            }
            this.f1845h.m1568a(c0247i);
        }
        if (this.f1861x == null) {
            C0199s a = C0199s.m1465a(this.f1855r.m1914i());
            if (a == C0199s.f1223r) {
                f1841f.m1499b("Unknown country code " + this.f1855r.m1914i() + " using " + C0199s.f1206a.m1467b());
                a = C0199s.f1206a;
            }
            C0199s a2 = C0199s.m1465a(this.f1855r.m1915j());
            this.f1861x = new C0258u(a, a2);
            if (a2 == C0199s.f1223r) {
                f1841f.m1499b("Unknown country code " + this.f1855r.m1914i() + " using " + C0199s.f1215j.m1467b());
                a = C0199s.f1215j;
            }
        }
        this.f1845h.m1568a(this.f1861x);
        if (this.f1862z != null && this.f1862z.length > 0) {
            for (String aiVar : this.f1862z) {
                this.f1845h.m1568a(new ai(aiVar));
            }
        }
        if (this.f1843A != null) {
            for (C0125l c0247i2 : this.f1843A) {
                this.f1845h.m1568a(c0247i2);
            }
        }
        if (this.f1848k != null) {
            for (i3 = 0; i3 < this.f1849l.size(); i3++) {
                this.f1845h.m1568a((ct) this.f1849l.get(i3));
            }
            this.f1845h.m1568a(this.f1848k);
        }
        if (this.f1850m != null) {
            for (i3 = 0; i3 < this.f1850m.size(); i3++) {
                this.f1845h.m1568a((bm) this.f1850m.get(i3));
            }
        }
        if (this.f1857t != null) {
            this.f1857t.m1055a(this.f1845h);
        }
        this.f1852o.m1678a(this.f1845h);
        this.f1845h.m1568a(new ae());
        for (i3 = 0; i3 < m1783e(); i3++) {
            this.f1845h.m1570a(ar.m1151a(this.f1845h.m1567a()), iArr[i3] + 4);
            ((dj) m1780c(i3)).m1756e();
        }
    }

    public String[] m1782d() {
        String[] strArr = new String[m1783e()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = m1780c(i).m1732c();
        }
        return strArr;
    }

    public int m1783e() {
        return this.f1846i.size();
    }

    C0146s m1784f() {
        return this.f1857t;
    }

    cs m1785g() {
        return this.f1858u;
    }
}
