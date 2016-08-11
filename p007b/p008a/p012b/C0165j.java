package p007b.p008a.p012b;

import p007b.C0150a;
import p007b.p008a.C0193m;
import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.j */
class C0165j extends ap {
    private static C0208c f985a;
    private boolean f986b;
    private boolean f987c;
    private int f988d;
    private int f989e;
    private C0150a f990f;
    private int f991g;
    private C0175t f992h;

    static {
        f985a = C0208c.m1493a(C0165j.class);
    }

    public C0165j(C0150a c0150a, C0175t c0175t) {
        this.f990f = c0150a;
        this.f992h = c0175t;
    }

    public C0165j(String str, C0175t c0175t) {
        this.f992h = c0175t;
        this.f986b = true;
        this.f987c = true;
        int indexOf = str.indexOf(33);
        String substring = str.substring(indexOf + 1);
        this.f988d = C0193m.m1450a(substring);
        this.f989e = C0193m.m1457b(substring);
        String substring2 = str.substring(0, indexOf);
        if (substring2.charAt(0) == '\'' && substring2.charAt(substring2.length() - 1) == '\'') {
            substring2 = substring2.substring(1, substring2.length() - 1);
        }
        this.f991g = c0175t.m1368b(substring2);
        if (this.f991g < 0) {
            throw new C0177v(C0177v.f1017f, substring2);
        }
    }

    public int m1347a(byte[] bArr, int i) {
        boolean z = true;
        this.f991g = ar.m1148a(bArr[i], bArr[i + 1]);
        this.f989e = ar.m1148a(bArr[i + 2], bArr[i + 3]);
        int a = ar.m1148a(bArr[i + 4], bArr[i + 5]);
        this.f988d = a & 255;
        this.f986b = (a & 16384) != 0;
        if ((32768 & a) == 0) {
            z = false;
        }
        this.f987c = z;
        return 6;
    }

    public void m1348a(StringBuffer stringBuffer) {
        boolean z = true;
        int i = this.f991g;
        int i2 = this.f988d;
        boolean z2 = !this.f986b;
        int i3 = this.f989e;
        if (this.f987c) {
            z = false;
        }
        C0193m.m1454a(i, i2, z2, i3, z, this.f992h, stringBuffer);
    }

    byte[] m1349c() {
        byte[] bArr = new byte[7];
        bArr[0] = bi.f897c.m1285a();
        ar.m1150a(this.f991g, bArr, 1);
        ar.m1150a(this.f989e, bArr, 3);
        int i = this.f988d;
        if (this.f987c) {
            i |= 32768;
        }
        if (this.f986b) {
            i |= 16384;
        }
        ar.m1150a(i, bArr, 5);
        return bArr;
    }
}
