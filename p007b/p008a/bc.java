package p007b.p008a;

import p007b.p013b.C0208c;

/* renamed from: b.a.bc */
public class bc extends bd {
    private static C0208c f1080a;
    private int f1081b;
    private boolean f1082c;
    private boolean f1083d;
    private boolean f1084e;

    static {
        f1080a = C0208c.m1493a(bc.class);
    }

    public bc() {
        super(ay.f787R);
        this.f1081b = 1217;
    }

    public void m1390a(boolean z) {
        this.f1084e = z;
    }

    public byte[] m1391a() {
        byte[] bArr = new byte[2];
        if (this.f1084e) {
            this.f1081b |= 256;
        }
        if (this.f1082c) {
            this.f1081b |= 1024;
        }
        if (this.f1083d) {
            this.f1081b |= 2048;
        }
        ar.m1150a(this.f1081b, bArr, 0);
        return bArr;
    }

    public void m1392b(boolean z) {
        this.f1082c = true;
    }

    public void m1393c(boolean z) {
        this.f1082c = true;
    }
}
