package p007b.p008a.p009a;

import p007b.p013b.C0208c;

/* renamed from: b.a.a.w */
abstract class C0122w {
    private static C0208c f447a;
    private C0147x f448b;

    static {
        f447a = C0208c.m1493a(C0122w.class);
    }

    protected C0122w(C0147x c0147x) {
        this.f448b = c0147x;
    }

    protected C0122w(C0148y c0148y) {
        this.f448b = new C0147x(c0148y);
    }

    protected void m916a(boolean z) {
        this.f448b.m1060a(z);
    }

    abstract byte[] m917a();

    final byte[] m918a(byte[] bArr) {
        return this.f448b.m1062a(bArr);
    }

    protected final void m919b(int i) {
        this.f448b.m1059a(i);
    }

    protected final void m920c(int i) {
        this.f448b.m1064b(i);
    }

    public int m921g() {
        return this.f448b.m1063b() + 8;
    }

    protected final C0129z m922h() {
        return this.f448b.m1068f();
    }

    protected final int m923i() {
        return this.f448b.m1065c();
    }

    protected final int m924j() {
        return this.f448b.m1067e();
    }

    public C0148y m925k() {
        return this.f448b.m1066d();
    }

    byte[] m926l() {
        return this.f448b.m1069g();
    }

    protected int m927m() {
        return this.f448b.m1070h();
    }
}
