package p007b.p008a.p012b;

import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.ac */
class ac extends an {
    private static C0208c f830a;
    private double f831b;
    private boolean f832c;

    static {
        f830a = C0208c.m1493a(ac.class);
    }

    public ac() {
        this.f832c = false;
    }

    public ac(String str) {
        try {
            this.f831b = (double) Integer.parseInt(str);
        } catch (Throwable e) {
            f830a.m1496a(e, e);
            this.f831b = 0.0d;
        }
        this.f832c = this.f831b != ((double) ((short) ((int) this.f831b)));
    }

    public double m1196a() {
        return this.f831b;
    }

    public int m1197a(byte[] bArr, int i) {
        this.f831b = (double) ar.m1148a(bArr[i], bArr[i + 1]);
        return 2;
    }

    boolean m1198b() {
        return this.f832c;
    }

    byte[] m1199c() {
        byte[] bArr = new byte[3];
        bArr[0] = bi.f902h.m1285a();
        ar.m1150a((int) this.f831b, bArr, 1);
        return bArr;
    }
}
