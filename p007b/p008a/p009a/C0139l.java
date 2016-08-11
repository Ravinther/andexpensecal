package p007b.p008a.p009a;

import java.util.ArrayList;
import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.l */
class C0139l extends C0126u {
    private static C0208c f618a;
    private byte[] f619b;
    private int f620c;
    private int f621d;
    private int f622e;
    private int f623f;
    private ArrayList f624g;

    static {
        f618a = C0208c.m1493a(C0139l.class);
    }

    public C0139l(int i, int i2) {
        super(C0148y.f689g);
        this.f622e = i;
        this.f623f = i2;
        this.f624g = new ArrayList();
    }

    public C0139l(C0147x c0147x) {
        int i = 0;
        super(c0147x);
        this.f624g = new ArrayList();
        byte[] l = m926l();
        this.f621d = ar.m1149a(l[0], l[1], l[2], l[3]);
        this.f620c = ar.m1149a(l[4], l[5], l[6], l[7]);
        this.f622e = ar.m1149a(l[8], l[9], l[10], l[11]);
        this.f623f = ar.m1149a(l[12], l[13], l[14], l[15]);
        int i2 = 16;
        while (i < this.f620c) {
            this.f624g.add(new C0140m(ar.m1148a(l[i2], l[i2 + 1]), ar.m1148a(l[i2 + 2], l[i2 + 3])));
            i2 += 4;
            i++;
        }
    }

    C0140m m1024a(int i) {
        return (C0140m) this.f624g.get(i);
    }

    void m1025a(int i, int i2) {
        this.f624g.add(new C0140m(i, i2));
    }

    byte[] m1026a() {
        this.f620c = this.f624g.size();
        this.f619b = new byte[((this.f620c * 4) + 16)];
        ar.m1153b(this.f622e + 1024, this.f619b, 0);
        ar.m1153b(this.f620c, this.f619b, 4);
        ar.m1153b(this.f622e, this.f619b, 8);
        ar.m1153b(1, this.f619b, 12);
        int i = 16;
        for (int i2 = 0; i2 < this.f620c; i2++) {
            C0140m c0140m = (C0140m) this.f624g.get(i2);
            ar.m1150a(c0140m.f625a, this.f619b, i);
            ar.m1150a(c0140m.f626b, this.f619b, i + 2);
            i += 4;
        }
        return m918a(this.f619b);
    }
}
