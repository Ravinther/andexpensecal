package p007b.p008a.p012b;

import p007b.C0150a;
import p007b.C0287p;
import p007b.p008a.bb;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.b.x */
public class C0179x {
    private static final C0208c f1020a;
    private au f1021b;

    static {
        f1020a = C0208c.m1493a(C0179x.class);
    }

    public C0179x(String str, C0175t c0175t, bb bbVar, C0287p c0287p, as asVar) {
        this.f1021b = new bb(str, c0175t, bbVar, c0287p, asVar);
    }

    public C0179x(byte[] bArr, C0150a c0150a, C0175t c0175t, bb bbVar, C0287p c0287p, as asVar) {
        if (c0175t.m1367a() == null || c0175t.m1367a().m1531a()) {
            C0210a.m1505a(bbVar != null);
            this.f1021b = new bj(bArr, c0150a, c0175t, bbVar, c0287p, asVar);
            return;
        }
        throw new C0177v(C0177v.f1014c);
    }

    public void m1375a() {
        this.f1021b.m1240a();
    }

    public String m1376b() {
        return this.f1021b.m1241b();
    }

    public byte[] m1377c() {
        return this.f1021b.m1242c();
    }
}
