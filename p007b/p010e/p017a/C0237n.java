package p007b.p010e.p017a;

import p007b.C0212b;
import p007b.C0226c;
import p007b.p008a.C0200t;
import p007b.p008a.an;
import p007b.p008a.ar;
import p007b.p008a.at;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p008a.bf;
import p007b.p008a.p009a.C0134t;
import p007b.p008a.p009a.C0135h;
import p007b.p008a.p009a.C0136i;
import p007b.p008a.p012b.C0177v;
import p007b.p010e.C0151j;
import p007b.p010e.C0242r;
import p007b.p010e.C0276k;
import p007b.p011c.C0183d;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.e.a.n */
public abstract class C0237n extends bd implements C0151j {
    private static C0208c f1618a;
    private int f1619b;
    private int f1620c;
    private bf f1621d;
    private an f1622e;
    private boolean f1623f;
    private dj f1624g;
    private C0276k f1625h;
    private boolean f1626i;

    static {
        f1618a = C0208c.m1493a(C0237n.class);
    }

    protected C0237n(ay ayVar, int i, int i2) {
        this(ayVar, i, i2, C0242r.f1838c);
        this.f1626i = false;
    }

    protected C0237n(ay ayVar, int i, int i2, C0183d c0183d) {
        super(ayVar);
        this.f1619b = i2;
        this.f1620c = i;
        this.f1621d = (bf) c0183d;
        this.f1623f = false;
        this.f1626i = false;
    }

    private void m1602l() {
        cs g = this.f1624g.m1760i().m1785g();
        this.f1621d = g.m1702a(this.f1621d);
        try {
            if (!this.f1621d.m1417k()) {
                this.f1622e.m1138a(this.f1621d);
            }
        } catch (at e) {
            f1618a.m1499b((Object) "Maximum number of format records exceeded.  Using default format.");
            this.f1621d = g.m1703a();
        }
    }

    public final void m1603a(C0136i c0136i) {
        this.f1624g.m1751b((C0134t) c0136i);
    }

    void m1604a(an anVar, co coVar, dj djVar) {
        this.f1623f = true;
        this.f1624g = djVar;
        this.f1622e = anVar;
        m1602l();
        m1613j();
    }

    public void m1605a(C0183d c0183d) {
        this.f1621d = (bf) c0183d;
        if (this.f1623f) {
            C0210a.m1505a(this.f1622e != null);
            m1602l();
        }
    }

    public void m1606a(C0276k c0276k) {
        if (this.f1625h != null) {
            f1618a.m1499b("current cell features for " + C0226c.m1530a(this) + " not null - overwriting");
            if (this.f1625h.m1432f() && this.f1625h.m1434h() != null && this.f1625h.m1434h().m1474f()) {
                C0200t h = this.f1625h.m1434h();
                f1618a.m1499b("Cannot add cell features to " + C0226c.m1530a(this) + " because it is part of the shared cell validation " + "group " + C0226c.m1529a(h.m1470b(), h.m1472d()) + "-" + C0226c.m1529a(h.m1471c(), h.m1473e()));
                return;
            }
        }
        this.f1625h = c0276k;
        c0276k.m1427a(this);
        if (this.f1623f) {
            m1613j();
        }
    }

    public byte[] m1607a() {
        byte[] bArr = new byte[6];
        ar.m1150a(this.f1619b, bArr, 0);
        ar.m1150a(this.f1620c, bArr, 2);
        ar.m1150a(this.f1621d.m1416j(), bArr, 4);
        return bArr;
    }

    public int m1608b() {
        return this.f1620c;
    }

    public C0183d m1609e() {
        return this.f1621d;
    }

    public int e_() {
        return this.f1619b;
    }

    public C0212b m1610f() {
        return this.f1625h;
    }

    public C0276k f_() {
        return this.f1625h;
    }

    final boolean m1611h() {
        return this.f1623f;
    }

    final int m1612i() {
        return this.f1621d.m1416j();
    }

    public final void m1613j() {
        if (this.f1625h != null) {
            if (this.f1626i) {
                this.f1626i = false;
                return;
            }
            if (this.f1625h.m1507a() != null) {
                C0134t c0136i = new C0136i(this.f1625h.m1507a(), this.f1620c, this.f1619b);
                c0136i.m1011a(this.f1625h.m1428b());
                c0136i.m1016b(this.f1625h.m1429c());
                this.f1624g.m1744a(c0136i);
                this.f1624g.m1760i().m1774a(c0136i);
                this.f1625h.m1425a((C0136i) c0136i);
            }
            if (this.f1625h.m1432f()) {
                try {
                    this.f1625h.m1434h().m1468a(this.f1620c, this.f1619b, this.f1624g.m1760i(), this.f1624g.m1760i(), this.f1624g.m1757f());
                } catch (C0177v e) {
                    C0210a.m1505a(false);
                }
                this.f1624g.m1752b(this);
                if (this.f1625h.m1433g()) {
                    if (this.f1624g.m1762k() == null) {
                        C0135h c0135h = new C0135h();
                        this.f1624g.m1744a((C0134t) c0135h);
                        this.f1624g.m1760i().m1774a((C0134t) c0135h);
                        this.f1624g.m1743a(c0135h);
                    }
                    this.f1625h.m1424a(this.f1624g.m1762k());
                }
            }
        }
    }

    public final void m1614k() {
        this.f1624g.m1746a(this);
    }
}
