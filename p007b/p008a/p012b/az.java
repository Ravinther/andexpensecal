package p007b.p008a.p012b;

import p007b.C0150a;
import p007b.p008a.C0193m;
import p007b.p008a.ar;

/* renamed from: b.a.b.az */
class az extends ap {
    private int f842a;
    private int f843b;
    private int f844c;
    private int f845d;
    private boolean f846e;
    private boolean f847f;
    private boolean f848g;
    private boolean f849h;
    private C0150a f850i;

    public az(C0150a c0150a) {
        this.f850i = c0150a;
    }

    public int m1259a(byte[] bArr, int i) {
        boolean z = true;
        this.f843b = ar.m1152b(bArr[i], bArr[i + 1]);
        this.f845d = ar.m1152b(bArr[i + 2], bArr[i + 3]);
        int a = ar.m1148a(bArr[i + 4], bArr[i + 5]);
        this.f842a = a & 255;
        this.f846e = (a & 16384) != 0;
        this.f847f = (a & 32768) != 0;
        if (this.f846e) {
            this.f842a = this.f850i.m1086b() + this.f842a;
        }
        if (this.f847f) {
            this.f843b = this.f850i.e_() + this.f843b;
        }
        a = ar.m1148a(bArr[i + 6], bArr[i + 7]);
        this.f844c = a & 255;
        this.f848g = (a & 16384) != 0;
        if ((a & 32768) == 0) {
            z = false;
        }
        this.f849h = z;
        if (this.f848g) {
            this.f844c = this.f850i.m1086b() + this.f844c;
        }
        if (this.f849h) {
            this.f845d = this.f850i.e_() + this.f845d;
        }
        return 8;
    }

    public void m1260a(StringBuffer stringBuffer) {
        C0193m.m1453a(this.f842a, this.f843b, stringBuffer);
        stringBuffer.append(':');
        C0193m.m1453a(this.f844c, this.f845d, stringBuffer);
    }

    byte[] m1261c() {
        byte[] bArr = new byte[9];
        bArr[0] = bi.f908n.m1285a();
        ar.m1150a(this.f843b, bArr, 1);
        ar.m1150a(this.f845d, bArr, 3);
        ar.m1150a(this.f842a, bArr, 5);
        ar.m1150a(this.f844c, bArr, 7);
        return bArr;
    }
}
