package p007b.p008a.p012b;

import p007b.p008a.C0193m;
import p007b.p008a.ar;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.b.b */
class C0158b extends ap {
    private static C0208c f851a;
    private int f852b;
    private int f853c;
    private int f854d;
    private int f855e;
    private boolean f856f;
    private boolean f857g;
    private boolean f858h;
    private boolean f859i;

    static {
        f851a = C0208c.m1493a(C0158b.class);
    }

    C0158b() {
    }

    C0158b(String str) {
        int indexOf = str.indexOf(":");
        C0210a.m1505a(indexOf != -1);
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        this.f852b = C0193m.m1450a(substring);
        this.f853c = C0193m.m1457b(substring);
        this.f854d = C0193m.m1450a(substring2);
        this.f855e = C0193m.m1457b(substring2);
        this.f856f = C0193m.m1458c(substring);
        this.f857g = C0193m.m1459d(substring);
        this.f858h = C0193m.m1458c(substring2);
        this.f859i = C0193m.m1459d(substring2);
    }

    int m1262a() {
        return this.f852b;
    }

    public int m1263a(byte[] bArr, int i) {
        boolean z = true;
        this.f853c = ar.m1148a(bArr[i], bArr[i + 1]);
        this.f855e = ar.m1148a(bArr[i + 2], bArr[i + 3]);
        int a = ar.m1148a(bArr[i + 4], bArr[i + 5]);
        this.f852b = a & 255;
        this.f856f = (a & 16384) != 0;
        this.f857g = (a & 32768) != 0;
        a = ar.m1148a(bArr[i + 6], bArr[i + 7]);
        this.f854d = a & 255;
        this.f858h = (a & 16384) != 0;
        if ((a & 32768) == 0) {
            z = false;
        }
        this.f859i = z;
        return 8;
    }

    protected void m1264a(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f852b = i;
        this.f854d = i2;
        this.f853c = i3;
        this.f855e = i4;
        this.f856f = z;
        this.f858h = z2;
        this.f857g = z3;
        this.f859i = z4;
    }

    public void m1265a(StringBuffer stringBuffer) {
        C0193m.m1453a(this.f852b, this.f853c, stringBuffer);
        stringBuffer.append(':');
        C0193m.m1453a(this.f854d, this.f855e, stringBuffer);
    }

    int m1266b() {
        return this.f854d;
    }

    byte[] m1267c() {
        byte[] bArr = new byte[9];
        bArr[0] = !m1176j() ? bi.f908n.m1285a() : bi.f908n.m1287c();
        ar.m1150a(this.f853c, bArr, 1);
        ar.m1150a(this.f855e, bArr, 3);
        int i = this.f852b;
        if (this.f857g) {
            i |= 32768;
        }
        if (this.f856f) {
            i |= 16384;
        }
        ar.m1150a(i, bArr, 5);
        i = this.f854d;
        if (this.f859i) {
            i |= 32768;
        }
        if (this.f858h) {
            i |= 16384;
        }
        ar.m1150a(i, bArr, 7);
        return bArr;
    }
}
