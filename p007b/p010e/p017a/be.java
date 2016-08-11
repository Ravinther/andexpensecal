package p007b.p010e.p017a;

import p007b.C0233d;
import p007b.p008a.an;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p011c.C0183d;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.be */
public abstract class be extends C0237n {
    private static C0208c f1627a;
    private String f1628b;
    private co f1629c;
    private int f1630d;

    static {
        f1627a = C0208c.m1493a(be.class);
    }

    protected be(int i, int i2, String str, C0183d c0183d) {
        super(ay.f818x, i, i2, c0183d);
        this.f1628b = str;
        if (this.f1628b == null) {
            this.f1628b = "";
        }
    }

    void m1615a(an anVar, co coVar, dj djVar) {
        super.m1604a(anVar, coVar, djVar);
        this.f1629c = coVar;
        this.f1630d = this.f1629c.m1676a(this.f1628b);
        this.f1628b = this.f1629c.m1677a(this.f1630d);
    }

    public byte[] m1616a() {
        Object a = super.m1607a();
        Object obj = new byte[(a.length + 4)];
        System.arraycopy(a, 0, obj, 0, a.length);
        ar.m1153b(this.f1630d, obj, a.length);
        return obj;
    }

    public C0233d m1617c() {
        return C0233d.f1526b;
    }

    public String m1618d() {
        return this.f1628b;
    }
}
