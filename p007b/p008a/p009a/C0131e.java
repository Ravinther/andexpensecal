package p007b.p008a.p009a;

import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.e */
class C0131e extends C0126u {
    private static final C0208c f561a;
    private byte[] f562b;
    private int f563c;
    private double f564d;
    private double f565e;
    private double f566f;
    private double f567g;

    static {
        f561a = C0208c.m1493a(C0131e.class);
    }

    public C0131e(double d, double d2, double d3, double d4, int i) {
        super(C0148y.f695m);
        this.f564d = d;
        this.f565e = d2;
        this.f566f = d3;
        this.f567g = d4;
        this.f563c = i;
    }

    public C0131e(C0147x c0147x) {
        super(c0147x);
        byte[] l = m926l();
        this.f563c = ar.m1148a(l[0], l[1]);
        double a = ((double) ar.m1148a(l[4], l[5])) / 1024.0d;
        this.f564d = a + ((double) ar.m1148a(l[2], l[3]));
        a = ((double) ar.m1148a(l[8], l[9])) / 256.0d;
        this.f565e = a + ((double) ar.m1148a(l[6], l[7]));
        a = ((double) ar.m1148a(l[12], l[13])) / 1024.0d;
        this.f566f = a + ((double) ar.m1148a(l[10], l[11]));
        int a2 = ar.m1148a(l[14], l[15]);
        this.f567g = (((double) ar.m1148a(l[16], l[17])) / 256.0d) + ((double) a2);
    }

    byte[] m977a() {
        this.f562b = new byte[18];
        ar.m1150a(this.f563c, this.f562b, 0);
        ar.m1150a((int) this.f564d, this.f562b, 2);
        ar.m1150a((int) ((this.f564d - ((double) ((int) this.f564d))) * 1024.0d), this.f562b, 4);
        ar.m1150a((int) this.f565e, this.f562b, 6);
        ar.m1150a((int) ((this.f565e - ((double) ((int) this.f565e))) * 256.0d), this.f562b, 8);
        ar.m1150a((int) this.f566f, this.f562b, 10);
        ar.m1150a((int) ((this.f566f - ((double) ((int) this.f566f))) * 1024.0d), this.f562b, 12);
        ar.m1150a((int) this.f567g, this.f562b, 14);
        ar.m1150a((int) ((this.f567g - ((double) ((int) this.f567g))) * 256.0d), this.f562b, 16);
        return m918a(this.f562b);
    }

    double m978b() {
        return this.f564d;
    }

    double m979c() {
        return this.f565e;
    }

    double m980d() {
        return this.f566f;
    }

    double m981e() {
        return this.f567g;
    }

    int m982f() {
        return this.f563c;
    }
}
