package p007b.p008a.p009a;

import p007b.p008a.ar;

/* renamed from: b.a.a.j */
class C0137j extends C0126u {
    private byte[] f614a;
    private int f615b;
    private int f616c;
    private int f617d;

    public C0137j(int i) {
        super(C0148y.f691i);
        this.f615b = 1;
        this.f616c = i + 1;
        this.f617d = (this.f616c + 1024) + 1;
        m919b(this.f615b);
    }

    public C0137j(C0147x c0147x) {
        super(c0147x);
        this.f615b = m924j();
        byte[] l = m926l();
        this.f616c = ar.m1149a(l[0], l[1], l[2], l[3]);
        this.f617d = ar.m1149a(l[4], l[5], l[6], l[7]);
    }

    byte[] m1023a() {
        this.f614a = new byte[8];
        ar.m1153b(this.f616c, this.f614a, 0);
        ar.m1153b(this.f617d, this.f614a, 4);
        return m918a(this.f614a);
    }
}
