package p007b.p008a;

import p007b.p013b.C0208c;

/* renamed from: b.a.z */
public class C0206z extends bd {
    private static C0208c f1297a;
    private C0204x f1298b;
    private byte[] f1299c;

    static {
        f1297a = C0208c.m1493a(C0206z.class);
    }

    public C0206z(C0204x c0204x) {
        super(ay.bf);
        this.f1298b = c0204x;
    }

    public byte[] m1489a() {
        return this.f1298b == null ? this.f1299c : this.f1298b.m1482a();
    }

    void m1490c() {
        if (this.f1298b == null) {
            this.f1298b = new C0204x(this.f1299c);
        }
        this.f1298b.m1483b();
    }

    void m1491d() {
        if (this.f1298b == null) {
            this.f1298b = new C0204x(this.f1299c);
        }
        this.f1298b.m1485d();
    }

    public boolean m1492e() {
        return this.f1298b == null || this.f1298b.m1484c() > 0;
    }
}
