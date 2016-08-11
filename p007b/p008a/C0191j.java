package p007b.p008a;

/* renamed from: b.a.j */
class C0191j extends bd {
    private int f1185a;
    private int f1186b;

    public C0191j(int i, int i2) {
        super(ay.aI);
        this.f1185a = i;
        this.f1186b = i2;
    }

    public byte[] m1445a() {
        r0 = new byte[4];
        ar.m1150a(this.f1185a, r0, 0);
        r0[1] = (byte) (r0[1] | 128);
        r0[2] = (byte) this.f1186b;
        r0[3] = (byte) -1;
        return r0;
    }
}
