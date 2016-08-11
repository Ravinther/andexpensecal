package p007b.p008a.p009a;

import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.ak */
class ak extends C0126u {
    private static C0208c f521a;
    private byte[] f522b;
    private int f523c;
    private int f524d;
    private int f525e;

    static {
        f521a = C0208c.m1493a(ak.class);
    }

    public ak(ai aiVar, int i, int i2) {
        super(C0148y.f693k);
        m920c(2);
        this.f523c = aiVar.m954a();
        this.f524d = i;
        this.f525e = i2;
        m919b(this.f523c);
    }

    public ak(C0147x c0147x) {
        super(c0147x);
        this.f523c = m924j();
        byte[] l = m926l();
        this.f524d = ar.m1149a(l[0], l[1], l[2], l[3]);
        this.f525e = ar.m1149a(l[4], l[5], l[6], l[7]);
    }

    byte[] m959a() {
        this.f522b = new byte[8];
        ar.m1153b(this.f524d, this.f522b, 0);
        ar.m1153b(this.f525e, this.f522b, 4);
        return m918a(this.f522b);
    }

    int m960b() {
        return this.f524d;
    }

    int m961c() {
        return this.f523c;
    }
}
