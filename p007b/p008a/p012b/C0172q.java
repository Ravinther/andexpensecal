package p007b.p008a.p012b;

import p007b.p008a.ac;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.q */
class C0172q extends an {
    private static C0208c f998a;
    private double f999b;

    static {
        f998a = C0208c.m1493a(C0172q.class);
    }

    C0172q(double d) {
        this.f999b = d;
    }

    public C0172q(String str) {
        try {
            this.f999b = Double.parseDouble(str);
        } catch (Throwable e) {
            f998a.m1496a(e, e);
            this.f999b = 0.0d;
        }
    }

    public double m1359a() {
        return this.f999b;
    }

    public int m1360a(byte[] bArr, int i) {
        this.f999b = ac.m1084a(bArr, i);
        return 8;
    }

    byte[] m1361c() {
        byte[] bArr = new byte[9];
        bArr[0] = bi.f903i.m1285a();
        ac.m1085a(this.f999b, bArr, 1);
        return bArr;
    }
}
