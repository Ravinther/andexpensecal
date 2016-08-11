package p007b.p010e.p017a;

import p007b.C0285n;
import p007b.p008a.ac;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p011c.C0218i;
import p007b.p011c.C0219j;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.cn */
class cn extends bd {
    C0208c f1730a;
    private byte[] f1731b;
    private double f1732c;
    private double f1733d;
    private C0219j f1734e;
    private C0218i f1735f;
    private int f1736g;
    private int f1737h;
    private int f1738i;
    private int f1739j;
    private int f1740k;
    private int f1741l;
    private int f1742m;
    private int f1743n;
    private boolean f1744o;

    public cn(C0285n c0285n) {
        super(ay.ai);
        this.f1730a = C0208c.m1493a(cn.class);
        this.f1734e = c0285n.m1875a();
        this.f1735f = c0285n.m1877b();
        this.f1732c = c0285n.m1880e();
        this.f1733d = c0285n.m1881f();
        this.f1736g = c0285n.m1878c().m1517a();
        this.f1741l = c0285n.m1888m();
        this.f1742m = c0285n.m1889n();
        this.f1739j = c0285n.m1886k();
        this.f1740k = c0285n.m1887l();
        this.f1738i = c0285n.m1885j();
        this.f1737h = c0285n.m1884i();
        this.f1743n = c0285n.m1865J();
        this.f1744o = true;
    }

    public byte[] m1674a() {
        int i = 0;
        this.f1731b = new byte[34];
        ar.m1150a(this.f1736g, this.f1731b, 0);
        ar.m1150a(this.f1737h, this.f1731b, 2);
        ar.m1150a(this.f1738i, this.f1731b, 4);
        ar.m1150a(this.f1739j, this.f1731b, 6);
        ar.m1150a(this.f1740k, this.f1731b, 8);
        if (this.f1735f == C0218i.f1399b) {
            i = 1;
        }
        if (this.f1734e == C0219j.f1400a) {
            i |= 2;
        }
        if (this.f1738i != 0) {
            i |= 128;
        }
        if (!this.f1744o) {
            i |= 4;
        }
        ar.m1150a(i, this.f1731b, 10);
        ar.m1150a(this.f1741l, this.f1731b, 12);
        ar.m1150a(this.f1742m, this.f1731b, 14);
        ac.m1085a(this.f1732c, this.f1731b, 16);
        ac.m1085a(this.f1733d, this.f1731b, 24);
        ar.m1150a(this.f1743n, this.f1731b, 32);
        return this.f1731b;
    }
}
