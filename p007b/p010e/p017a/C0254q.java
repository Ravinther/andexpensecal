package p007b.p010e.p017a;

import p007b.p008a.aq;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p008a.bf;

/* renamed from: b.e.a.q */
class C0254q extends bd {
    private byte[] f1881a;
    private int f1882b;
    private bf f1883c;
    private int f1884d;
    private int f1885e;
    private boolean f1886f;
    private int f1887g;
    private boolean f1888h;

    public C0254q(int i, int i2, bf bfVar) {
        super(ay.f813s);
        this.f1882b = i;
        this.f1885e = i2;
        this.f1883c = bfVar;
        this.f1884d = this.f1883c.m1416j();
        this.f1886f = false;
    }

    void m1800a(int i) {
        this.f1885e = i;
    }

    void m1801a(aq aqVar) {
        this.f1884d = aqVar.m1146a(this.f1884d);
    }

    void m1802a(boolean z) {
        this.f1886f = z;
    }

    public byte[] m1803a() {
        this.f1881a = new byte[12];
        ar.m1150a(this.f1882b, this.f1881a, 0);
        ar.m1150a(this.f1882b, this.f1881a, 2);
        ar.m1150a(this.f1885e, this.f1881a, 4);
        ar.m1150a(this.f1884d, this.f1881a, 6);
        int i = (this.f1887g << 8) | 6;
        if (this.f1886f) {
            i |= 1;
        }
        this.f1887g = (i & 1792) / 256;
        if (this.f1888h) {
            i |= 4096;
        }
        ar.m1150a(i, this.f1881a, 8);
        return this.f1881a;
    }

    public int m1804c() {
        return this.f1882b;
    }

    int m1805d() {
        return this.f1885e;
    }

    public bf m1806e() {
        return this.f1883c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0254q)) {
            return false;
        }
        C0254q c0254q = (C0254q) obj;
        return (this.f1882b == c0254q.f1882b && this.f1884d == c0254q.f1884d && this.f1885e == c0254q.f1885e && this.f1886f == c0254q.f1886f && this.f1887g == c0254q.f1887g && this.f1888h == c0254q.f1888h) ? (this.f1883c != null || c0254q.f1883c == null) ? (this.f1883c == null || c0254q.f1883c != null) ? this.f1883c.equals(c0254q.f1883c) : false : false : false;
    }

    boolean m1807f() {
        return this.f1886f;
    }

    public int hashCode() {
        int i = (this.f1886f ? 1 : 0) + ((((((this.f1882b + 10823) * 79) + this.f1884d) * 79) + this.f1885e) * 79);
        return this.f1883c != null ? i ^ this.f1883c.hashCode() : i;
    }
}
