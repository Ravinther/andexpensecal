package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.C0233d;
import p007b.p008a.C0125l;
import p007b.p008a.C0193m;
import p007b.p008a.aq;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p010e.C0241q;
import p007b.p010e.C0273g;
import p007b.p010e.C0276k;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.ce */
class ce extends bd {
    private static final C0208c f1688a;
    private static int f1689j;
    private static int f1690k;
    private C0237n[] f1691b;
    private int f1692c;
    private boolean f1693d;
    private int f1694e;
    private int f1695f;
    private int f1696g;
    private boolean f1697h;
    private boolean f1698i;
    private int f1699l;
    private boolean f1700m;
    private C0241q f1701n;

    static {
        f1688a = C0208c.m1493a(ce.class);
        f1689j = 255;
        f1690k = 256;
    }

    public ce(int i, C0241q c0241q) {
        super(ay.f804j);
        this.f1694e = i;
        this.f1691b = new C0237n[0];
        this.f1695f = 0;
        this.f1692c = f1689j;
        this.f1693d = false;
        this.f1698i = true;
        this.f1701n = c0241q;
    }

    private void m1655a(ArrayList arrayList, al alVar) {
        if (arrayList.size() != 0) {
            if (arrayList.size() >= 3) {
                alVar.m1568a(new bl(arrayList));
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    alVar.m1568a((C0237n) it.next());
                }
            }
            arrayList.clear();
        }
    }

    public C0237n m1656a(int i) {
        return (i < 0 || i >= this.f1695f) ? null : this.f1691b[i];
    }

    void m1657a(aq aqVar) {
        if (this.f1697h) {
            this.f1696g = aqVar.m1146a(this.f1696g);
        }
    }

    public void m1658a(al alVar) {
        alVar.m1568a((C0125l) this);
    }

    public void m1659a(C0237n c0237n) {
        int b = c0237n.m1608b();
        if (b >= f1690k) {
            f1688a.m1499b("Could not add cell at " + C0193m.m1451a(c0237n.e_(), c0237n.m1608b()) + " because it exceeds the maximum column limit");
            return;
        }
        if (b >= this.f1691b.length) {
            Object obj = this.f1691b;
            this.f1691b = new C0237n[Math.max(obj.length + 10, b + 1)];
            System.arraycopy(obj, 0, this.f1691b, 0, obj.length);
        }
        if (this.f1691b[b] != null) {
            C0276k f_ = this.f1691b[b].f_();
            if (f_ != null) {
                f_.m1838d();
                if (!(f_.m1434h() == null || f_.m1434h().m1474f())) {
                    f_.m1839e();
                }
            }
        }
        this.f1691b[b] = c0237n;
        this.f1695f = Math.max(b + 1, this.f1695f);
    }

    public byte[] m1660a() {
        byte[] bArr = new byte[16];
        int i = this.f1692c;
        if (this.f1701n.m1733d().m1900y() != 255 && i == f1689j) {
            i = this.f1701n.m1733d().m1900y();
        }
        ar.m1150a(this.f1694e, bArr, 0);
        ar.m1150a(this.f1695f, bArr, 4);
        ar.m1150a(i, bArr, 6);
        i = this.f1699l + 256;
        if (this.f1700m) {
            i |= 16;
        }
        if (this.f1693d) {
            i |= 32;
        }
        if (!this.f1698i) {
            i |= 64;
        }
        if (this.f1697h) {
            i = (i | 128) | (this.f1696g << 16);
        }
        ar.m1153b(i, bArr, 12);
        return bArr;
    }

    public void m1661b(al alVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f1695f; i++) {
            if (this.f1691b[i] != null) {
                Object obj;
                if (this.f1691b[i].m1087c() == C0233d.f1527c) {
                    C0273g c0273g = (C0273g) this.f1691b[i];
                    if (c0273g.m1640l() == ((double) ((int) c0273g.m1640l())) && c0273g.m1640l() < 5.36870911E8d && c0273g.m1640l() > -5.36870912E8d && c0273g.m1610f() == null) {
                        obj = 1;
                        if (obj == null) {
                            arrayList.add(this.f1691b[i]);
                        } else {
                            m1655a(arrayList, alVar);
                            alVar.m1568a(this.f1691b[i]);
                            if (this.f1691b[i].m1087c() == C0233d.f1532h) {
                                alVar.m1568a(new cq(this.f1691b[i].m1088d()));
                            }
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    m1655a(arrayList, alVar);
                    alVar.m1568a(this.f1691b[i]);
                    if (this.f1691b[i].m1087c() == C0233d.f1532h) {
                        alVar.m1568a(new cq(this.f1691b[i].m1088d()));
                    }
                } else {
                    arrayList.add(this.f1691b[i]);
                }
            } else {
                m1655a(arrayList, alVar);
            }
        }
        m1655a(arrayList, alVar);
    }

    public int m1662c() {
        return this.f1695f;
    }
}
