package p007b.p008a.p012b;

import p007b.C0150a;
import p007b.p008a.C0193m;
import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.i */
class C0164i extends ap {
    private static C0208c f979a;
    private boolean f980b;
    private boolean f981c;
    private int f982d;
    private int f983e;
    private C0150a f984f;

    static {
        f979a = C0208c.m1493a(C0164i.class);
    }

    public C0164i(C0150a c0150a) {
        this.f984f = c0150a;
    }

    public C0164i(String str) {
        this.f982d = C0193m.m1450a(str);
        this.f983e = C0193m.m1457b(str);
        this.f980b = C0193m.m1458c(str);
        this.f981c = C0193m.m1459d(str);
    }

    public int m1344a(byte[] bArr, int i) {
        boolean z = true;
        this.f983e = ar.m1148a(bArr[i], bArr[i + 1]);
        int a = ar.m1148a(bArr[i + 2], bArr[i + 3]);
        this.f982d = a & 255;
        this.f980b = (a & 16384) != 0;
        if ((32768 & a) == 0) {
            z = false;
        }
        this.f981c = z;
        return 4;
    }

    public void m1345a(StringBuffer stringBuffer) {
        boolean z = true;
        int i = this.f982d;
        boolean z2 = !this.f980b;
        int i2 = this.f983e;
        if (this.f981c) {
            z = false;
        }
        C0193m.m1456a(i, z2, i2, z, stringBuffer);
    }

    byte[] m1346c() {
        byte[] bArr = new byte[5];
        bArr[0] = !m1176j() ? bi.f896b.m1285a() : bi.f896b.m1287c();
        ar.m1150a(this.f983e, bArr, 1);
        int i = this.f982d;
        if (this.f981c) {
            i |= 32768;
        }
        if (this.f980b) {
            i |= 16384;
        }
        ar.m1150a(i, bArr, 3);
        return bArr;
    }
}
