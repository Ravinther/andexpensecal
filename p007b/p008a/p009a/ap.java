package p007b.p008a.p009a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.ap */
public class ap extends bd {
    private static C0208c f529a;
    private byte[] f530b;
    private int f531c;

    static {
        f529a = C0208c.m1493a(ap.class);
    }

    ap(String str) {
        super(ay.f806l);
        this.f531c = str.length();
    }

    public byte[] m964a() {
        if (this.f530b != null) {
            return this.f530b;
        }
        this.f530b = new byte[18];
        ar.m1150a(530, this.f530b, 0);
        ar.m1150a(this.f531c, this.f530b, 10);
        ar.m1150a(16, this.f530b, 12);
        return this.f530b;
    }
}
