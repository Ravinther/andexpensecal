package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import p007b.C0150a;
import p007b.C0155l;
import p007b.C0212b;
import p007b.C0285n;
import p007b.C0287p;
import p007b.p008a.C0125l;
import p007b.p008a.C0149a;
import p007b.p008a.C0194n;
import p007b.p008a.C0205y;
import p007b.p008a.aa;
import p007b.p008a.bc;
import p007b.p008a.bf;
import p007b.p008a.p009a.C0130d;
import p007b.p008a.p009a.aj;
import p007b.p010e.C0151j;
import p007b.p010e.C0236s;
import p007b.p010e.C0264a;
import p007b.p010e.C0281p;
import p007b.p011c.C0183d;
import p007b.p011c.C0214b;
import p007b.p011c.C0215c;
import p007b.p011c.C0216e;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.e.a.cp */
final class cp {
    private static C0208c f1748a;
    private al f1749b;
    private ce[] f1750c;
    private int f1751d;
    private int f1752e;
    private C0285n f1753f;
    private C0287p f1754g;
    private ArrayList f1755h;
    private ArrayList f1756i;
    private ArrayList f1757j;
    private ArrayList f1758k;
    private C0149a f1759l;
    private ArrayList f1760m;
    private C0205y f1761n;
    private bj f1762o;
    private bs f1763p;
    private C0248j f1764q;
    private bc f1765r;
    private TreeSet f1766s;
    private aj f1767t;
    private boolean f1768u;
    private int f1769v;
    private int f1770w;
    private dj f1771x;

    static {
        f1748a = C0208c.m1493a(cp.class);
    }

    public cp(al alVar, dj djVar, C0287p c0287p) {
        this.f1749b = alVar;
        this.f1771x = djVar;
        this.f1765r = new bc();
        this.f1754g = c0287p;
        this.f1768u = false;
        this.f1767t = new aj(c0287p);
    }

    private C0150a[] m1679a(int i) {
        int i2 = this.f1751d - 1;
        Object obj = null;
        while (i2 >= 0 && r3 == null) {
            if (this.f1750c[i2] == null || this.f1750c[i2].m1656a(i) == null) {
                i2--;
            } else {
                obj = 1;
            }
        }
        C0150a[] c0150aArr = new C0150a[(i2 + 1)];
        for (int i3 = 0; i3 <= i2; i3++) {
            c0150aArr[i3] = this.f1750c[i3] != null ? this.f1750c[i3].m1656a(i) : null;
        }
        return c0150aArr;
    }

    private void m1680d() {
        if (this.f1761n == null || this.f1760m.size() != 0) {
            if (this.f1761n == null && this.f1760m.size() > 0) {
                this.f1761n = new C0205y(this.f1771x.m1762k() != null ? this.f1771x.m1762k().m997a() : -1, this.f1771x.m1760i(), this.f1771x.m1760i(), this.f1754g);
            }
            Iterator it = this.f1760m.iterator();
            while (it.hasNext()) {
                C0237n c0237n = (C0237n) it.next();
                C0212b f = c0237n.m1610f();
                if (!f.m1434h().m1475g()) {
                    if (!f.m1434h().m1474f()) {
                        this.f1761n.m1487a(new aa(f.m1434h()));
                    } else if (c0237n.m1608b() == f.m1434h().m1470b() && c0237n.e_() == f.m1434h().m1472d()) {
                        this.f1761n.m1487a(new aa(f.m1434h()));
                    }
                }
            }
            this.f1761n.m1488a(this.f1749b);
            return;
        }
        this.f1761n.m1488a(this.f1749b);
    }

    public void m1681a() {
        C0210a.m1505a(this.f1750c != null);
        if (this.f1768u) {
            this.f1767t.m956a(this.f1749b);
            return;
        }
        int i;
        this.f1749b.m1568a(new C0234a(C0234a.f1538b));
        int i2 = this.f1751d / 32;
        int i3 = this.f1751d - (i2 * 32) != 0 ? i2 + 1 : i2;
        int a = this.f1749b.m1567a();
        C0125l ayVar = new ay(0, this.f1751d, i3);
        this.f1749b.m1568a(ayVar);
        if (this.f1753f.m1870O()) {
            this.f1749b.m1568a(new C0250l(C0250l.f1876b));
        } else {
            this.f1749b.m1568a(new C0250l(C0250l.f1875a));
        }
        this.f1749b.m1568a(new C0249k(100));
        this.f1749b.m1568a(new cb());
        this.f1749b.m1568a(new bb(false));
        this.f1749b.m1568a(new ac(0.001d));
        this.f1749b.m1568a(new cj(this.f1753f.m1871P()));
        this.f1749b.m1568a(new bx(this.f1753f.m1862G()));
        this.f1749b.m1568a(new bw(this.f1753f.m1861F()));
        this.f1749b.m1568a(new ap(true));
        C0125l aqVar = new aq();
        aqVar.m1581b(this.f1770w + 1);
        aqVar.m1579a(this.f1769v + 1);
        this.f1749b.m1568a(aqVar);
        this.f1749b.m1568a(new ab(this.f1753f.m1900y(), this.f1753f.m1900y() != 255));
        if (this.f1769v > 0) {
            this.f1765r.m1392b(true);
        }
        if (this.f1770w > 0) {
            this.f1765r.m1393c(true);
        }
        this.f1765r.m1390a(this.f1753f.m1896u());
        this.f1749b.m1568a(this.f1765r);
        if (this.f1755h.size() > 0) {
            int[] iArr;
            iArr = new int[this.f1755h.size()];
            for (i = 0; i < iArr.length; i++) {
                iArr[i] = ((Integer) this.f1755h.get(i)).intValue();
            }
            this.f1749b.m1568a(new au(iArr));
        }
        if (this.f1756i.size() > 0) {
            iArr = new int[this.f1756i.size()];
            for (i = 0; i < iArr.length; i++) {
                iArr[i] = ((Integer) this.f1756i.get(i)).intValue();
            }
            this.f1749b.m1568a(new db(iArr));
        }
        this.f1749b.m1568a(new ar(this.f1753f.m1866K().toString()));
        this.f1749b.m1568a(new an(this.f1753f.m1867L().toString()));
        this.f1749b.m1568a(new at(this.f1753f.m1868M()));
        this.f1749b.m1568a(new da(this.f1753f.m1869N()));
        if (this.f1753f.m1891p() != this.f1753f.m1894s()) {
            this.f1749b.m1568a(new bf(this.f1753f.m1891p()));
        }
        if (this.f1753f.m1890o() != this.f1753f.m1894s()) {
            this.f1749b.m1568a(new cd(this.f1753f.m1890o()));
        }
        if (this.f1753f.m1892q() != this.f1753f.m1895t()) {
            this.f1749b.m1568a(new cy(this.f1753f.m1892q()));
        }
        if (this.f1753f.m1893r() != this.f1753f.m1895t()) {
            this.f1749b.m1568a(new C0246h(this.f1753f.m1893r()));
        }
        if (this.f1763p != null) {
            this.f1749b.m1568a(this.f1763p);
        }
        this.f1749b.m1568a(new cn(this.f1753f));
        if (this.f1753f.m1879d()) {
            this.f1749b.m1568a(new ca(this.f1753f.m1879d()));
            this.f1749b.m1568a(new ck(this.f1753f.m1879d()));
            this.f1749b.m1568a(new br(this.f1753f.m1879d()));
            if (this.f1753f.m1897v() != null) {
                this.f1749b.m1568a(new bu(this.f1753f.m1897v()));
            } else if (this.f1753f.m1898w() != 0) {
                this.f1749b.m1568a(new bu(this.f1753f.m1898w()));
            }
        }
        ayVar.m1598b(this.f1749b.m1567a());
        this.f1749b.m1568a(new aa(this.f1753f.m1899x()));
        C0183d a2 = this.f1771x.m1760i().m1785g().m1703a();
        C0183d f = this.f1771x.m1760i().m1785g().m1708f();
        Iterator it = this.f1766s.iterator();
        while (it.hasNext()) {
            aqVar = (C0254q) it.next();
            if (aqVar.m1804c() < 256) {
                this.f1749b.m1568a(aqVar);
            }
            C0183d e = aqVar.m1806e();
            if (e != a2 && aqVar.m1804c() < 256) {
                C0150a[] a3 = m1679a(aqVar.m1804c());
                i = 0;
                while (i < a3.length) {
                    if (a3[i] != null && (a3[i].m1089e() == a2 || a3[i].m1089e() == f)) {
                        ((C0151j) a3[i]).m1091a(e);
                    }
                    i++;
                }
            }
        }
        if (this.f1759l != null) {
            this.f1759l.m1073a(this.f1749b);
        }
        this.f1749b.m1568a(new ad(this.f1751d, this.f1752e));
        for (int i4 = 0; i4 < i3; i4++) {
            C0125l c0259v = new C0259v(this.f1749b.m1567a());
            int min = Math.min(32, this.f1751d - (i4 * 32));
            boolean z = true;
            for (i = i4 * 32; i < (i4 * 32) + min; i++) {
                if (this.f1750c[i] != null) {
                    this.f1750c[i].m1658a(this.f1749b);
                    if (z) {
                        c0259v.m1825a(this.f1749b.m1567a());
                        z = false;
                    }
                }
            }
            for (i2 = i4 * 32; i2 < (i4 * 32) + min; i2++) {
                if (this.f1750c[i2] != null) {
                    c0259v.m1827b(this.f1749b.m1567a());
                    this.f1750c[i2].m1661b(this.f1749b);
                }
            }
            ayVar.m1596a(this.f1749b.m1567a());
            c0259v.m1828c(this.f1749b.m1567a());
            this.f1749b.m1568a(c0259v);
        }
        if (!this.f1754g.m1908c()) {
            this.f1767t.m956a(this.f1749b);
        }
        this.f1749b.m1568a(new de(this.f1753f));
        if (this.f1753f.m1863H() == 0 && this.f1753f.m1864I() == 0) {
            this.f1749b.m1568a(new cl(cl.f1725d, 0, 0));
        } else {
            this.f1749b.m1568a(new bt(this.f1753f.m1863H(), this.f1753f.m1864I()));
            this.f1749b.m1568a(new cl(cl.f1725d, 0, 0));
            if (this.f1753f.m1863H() != 0) {
                this.f1749b.m1568a(new cl(cl.f1723b, this.f1753f.m1863H(), 0));
            }
            if (this.f1753f.m1864I() != 0) {
                this.f1749b.m1568a(new cl(cl.f1724c, 0, this.f1753f.m1864I()));
            }
            if (!(this.f1753f.m1863H() == 0 || this.f1753f.m1864I() == 0)) {
                this.f1749b.m1568a(new cl(cl.f1722a, this.f1753f.m1863H(), this.f1753f.m1864I()));
            }
            this.f1749b.m1568a(new dc());
        }
        if (this.f1753f.m1901z() != 100) {
            this.f1749b.m1568a(new cg(this.f1753f.m1901z()));
        }
        this.f1762o.m1628a(this.f1749b);
        Iterator it2 = this.f1757j.iterator();
        while (it2.hasNext()) {
            this.f1749b.m1568a((C0281p) it2.next());
        }
        if (this.f1764q != null) {
            this.f1749b.m1568a(this.f1764q);
        }
        if (this.f1761n != null || this.f1760m.size() > 0) {
            m1680d();
        }
        if (this.f1758k != null && this.f1758k.size() > 0) {
            it2 = this.f1758k.iterator();
            while (it2.hasNext()) {
                ((C0194n) it2.next()).m1461a(this.f1749b);
            }
        }
        this.f1749b.m1568a(new ae());
        this.f1749b.m1570a(ayVar.m1597a(), a + 4);
    }

    void m1682a(int i, int i2) {
        this.f1751d = i;
        this.f1752e = i2;
    }

    void m1683a(C0149a c0149a) {
        this.f1759l = c0149a;
    }

    void m1684a(C0205y c0205y, ArrayList arrayList) {
        this.f1761n = c0205y;
        this.f1760m = arrayList;
    }

    void m1685a(bs bsVar) {
        this.f1763p = bsVar;
    }

    void m1686a(C0248j c0248j) {
        this.f1764q = c0248j;
    }

    void m1687a(C0285n c0285n) {
        this.f1753f = c0285n;
    }

    void m1688a(ArrayList arrayList) {
        this.f1758k = arrayList;
    }

    void m1689a(ArrayList arrayList, boolean z) {
        this.f1767t.m957a(arrayList, z);
    }

    void m1690a(ce[] ceVarArr, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, bj bjVar, TreeSet treeSet, int i, int i2) {
        this.f1750c = ceVarArr;
        this.f1755h = arrayList;
        this.f1756i = arrayList2;
        this.f1757j = arrayList3;
        this.f1762o = bjVar;
        this.f1766s = treeSet;
        this.f1769v = i;
        this.f1770w = i2;
    }

    C0130d[] m1691b() {
        return this.f1767t.m958a();
    }

    void m1692c() {
        C0155l[] a = this.f1762o.m1629a();
        ArrayList arrayList = new ArrayList();
        for (C0155l c0155l : a) {
            C0150a a2 = c0155l.m1155a();
            bf bfVar = (bf) a2.m1089e();
            if (!(bfVar == null || !bfVar.m1414h() || bfVar.m1418l())) {
                try {
                    C0183d c0183d;
                    C0183d c0252o;
                    int indexOf;
                    C0252o c0252o2 = new C0252o(bfVar);
                    C0150a b = c0155l.m1156b();
                    c0252o2.m1797b(C0214b.f1313b, C0215c.f1319a, C0216e.f1363b);
                    c0252o2.m1797b(C0214b.f1316e, bfVar.m1397a(C0214b.f1316e), bfVar.m1406b(C0214b.f1316e));
                    c0252o2.m1797b(C0214b.f1314c, bfVar.m1397a(C0214b.f1314c), bfVar.m1406b(C0214b.f1314c));
                    if (a2.e_() == b.e_()) {
                        c0252o2.m1797b(C0214b.f1315d, bfVar.m1397a(C0214b.f1315d), bfVar.m1406b(C0214b.f1315d));
                    }
                    if (a2.m1086b() == b.m1086b()) {
                        c0252o2.m1797b(C0214b.f1317f, bfVar.m1397a(C0214b.f1317f), bfVar.m1406b(C0214b.f1317f));
                    }
                    int indexOf2 = arrayList.indexOf(c0252o2);
                    if (indexOf2 != -1) {
                        c0183d = (C0252o) arrayList.get(indexOf2);
                    } else {
                        arrayList.add(c0252o2);
                        Object obj = c0252o2;
                    }
                    ((C0151j) a2).m1091a(c0183d);
                    if (b.e_() > a2.e_()) {
                        if (b.m1086b() != a2.m1086b()) {
                            c0252o = new C0252o(bfVar);
                            c0252o.m1797b(C0214b.f1313b, C0215c.f1319a, C0216e.f1363b);
                            c0252o.m1797b(C0214b.f1316e, bfVar.m1397a(C0214b.f1316e), bfVar.m1406b(C0214b.f1316e));
                            c0252o.m1797b(C0214b.f1315d, bfVar.m1397a(C0214b.f1315d), bfVar.m1406b(C0214b.f1315d));
                            indexOf2 = arrayList.indexOf(c0252o);
                            if (indexOf2 != -1) {
                                c0252o = (C0252o) arrayList.get(indexOf2);
                            } else {
                                arrayList.add(c0252o);
                            }
                            this.f1771x.m1747a(new C0264a(a2.m1086b(), b.e_(), c0252o));
                        }
                        for (indexOf2 = a2.e_() + 1; indexOf2 < b.e_(); indexOf2++) {
                            c0252o = new C0252o(bfVar);
                            c0252o.m1797b(C0214b.f1313b, C0215c.f1319a, C0216e.f1363b);
                            c0252o.m1797b(C0214b.f1316e, bfVar.m1397a(C0214b.f1316e), bfVar.m1406b(C0214b.f1316e));
                            if (a2.m1086b() == b.m1086b()) {
                                c0252o.m1797b(C0214b.f1317f, bfVar.m1397a(C0214b.f1317f), bfVar.m1406b(C0214b.f1317f));
                            }
                            indexOf = arrayList.indexOf(c0252o);
                            if (indexOf != -1) {
                                c0252o = (C0252o) arrayList.get(indexOf);
                            } else {
                                arrayList.add(c0252o);
                            }
                            this.f1771x.m1747a(new C0264a(a2.m1086b(), indexOf2, c0252o));
                        }
                    }
                    if (b.m1086b() > a2.m1086b()) {
                        if (b.e_() != a2.e_()) {
                            c0252o = new C0252o(bfVar);
                            c0252o.m1797b(C0214b.f1313b, C0215c.f1319a, C0216e.f1363b);
                            c0252o.m1797b(C0214b.f1317f, bfVar.m1397a(C0214b.f1317f), bfVar.m1406b(C0214b.f1317f));
                            c0252o.m1797b(C0214b.f1314c, bfVar.m1397a(C0214b.f1314c), bfVar.m1406b(C0214b.f1314c));
                            indexOf2 = arrayList.indexOf(c0252o);
                            if (indexOf2 != -1) {
                                c0252o = (C0252o) arrayList.get(indexOf2);
                            } else {
                                arrayList.add(c0252o);
                            }
                            this.f1771x.m1747a(new C0264a(b.m1086b(), a2.e_(), c0252o));
                        }
                        for (indexOf2 = a2.e_() + 1; indexOf2 < b.e_(); indexOf2++) {
                            c0252o = new C0252o(bfVar);
                            c0252o.m1797b(C0214b.f1313b, C0215c.f1319a, C0216e.f1363b);
                            c0252o.m1797b(C0214b.f1317f, bfVar.m1397a(C0214b.f1317f), bfVar.m1406b(C0214b.f1317f));
                            indexOf = arrayList.indexOf(c0252o);
                            if (indexOf != -1) {
                                c0252o = (C0252o) arrayList.get(indexOf);
                            } else {
                                arrayList.add(c0252o);
                            }
                            this.f1771x.m1747a(new C0264a(b.m1086b(), indexOf2, c0252o));
                        }
                        for (indexOf2 = a2.m1086b() + 1; indexOf2 < b.m1086b(); indexOf2++) {
                            c0252o = new C0252o(bfVar);
                            c0252o.m1797b(C0214b.f1313b, C0215c.f1319a, C0216e.f1363b);
                            c0252o.m1797b(C0214b.f1314c, bfVar.m1397a(C0214b.f1314c), bfVar.m1406b(C0214b.f1314c));
                            if (a2.e_() == b.e_()) {
                                c0252o.m1797b(C0214b.f1315d, bfVar.m1397a(C0214b.f1315d), bfVar.m1406b(C0214b.f1315d));
                            }
                            indexOf = arrayList.indexOf(c0252o);
                            if (indexOf != -1) {
                                c0252o = (C0252o) arrayList.get(indexOf);
                            } else {
                                arrayList.add(c0252o);
                            }
                            this.f1771x.m1747a(new C0264a(indexOf2, a2.e_(), c0252o));
                        }
                    }
                    if (b.m1086b() > a2.m1086b() || b.e_() > a2.e_()) {
                        c0252o = new C0252o(bfVar);
                        c0252o.m1797b(C0214b.f1313b, C0215c.f1319a, C0216e.f1363b);
                        c0252o.m1797b(C0214b.f1317f, bfVar.m1397a(C0214b.f1317f), bfVar.m1406b(C0214b.f1317f));
                        c0252o.m1797b(C0214b.f1315d, bfVar.m1397a(C0214b.f1315d), bfVar.m1406b(C0214b.f1315d));
                        if (b.e_() == a2.e_()) {
                            c0252o.m1797b(C0214b.f1314c, bfVar.m1397a(C0214b.f1314c), bfVar.m1406b(C0214b.f1314c));
                        }
                        if (b.m1086b() == a2.m1086b()) {
                            c0252o.m1797b(C0214b.f1316e, bfVar.m1397a(C0214b.f1316e), bfVar.m1406b(C0214b.f1316e));
                        }
                        indexOf2 = arrayList.indexOf(c0252o);
                        if (indexOf2 != -1) {
                            c0252o = (C0252o) arrayList.get(indexOf2);
                        } else {
                            arrayList.add(c0252o);
                        }
                        this.f1771x.m1747a(new C0264a(b.m1086b(), b.e_(), c0252o));
                        for (indexOf2 = a2.m1086b() + 1; indexOf2 < b.m1086b(); indexOf2++) {
                            c0252o = new C0252o(bfVar);
                            c0252o.m1797b(C0214b.f1313b, C0215c.f1319a, C0216e.f1363b);
                            c0252o.m1797b(C0214b.f1315d, bfVar.m1397a(C0214b.f1315d), bfVar.m1406b(C0214b.f1315d));
                            if (a2.e_() == b.e_()) {
                                c0252o.m1797b(C0214b.f1314c, bfVar.m1397a(C0214b.f1314c), bfVar.m1406b(C0214b.f1314c));
                            }
                            indexOf = arrayList.indexOf(c0252o);
                            if (indexOf != -1) {
                                c0252o = (C0252o) arrayList.get(indexOf);
                            } else {
                                arrayList.add(c0252o);
                            }
                            this.f1771x.m1747a(new C0264a(indexOf2, b.e_(), c0252o));
                        }
                    }
                } catch (C0236s e) {
                    f1748a.m1499b(e.toString());
                }
            }
        }
    }
}
