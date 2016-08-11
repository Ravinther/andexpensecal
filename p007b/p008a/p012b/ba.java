package p007b.p008a.p012b;

import p007b.C0150a;
import p007b.p008a.C0193m;
import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.ba */
class ba extends ap {
    private static C0208c f860a;
    private boolean f861b;
    private boolean f862c;
    private int f863d;
    private int f864e;
    private C0150a f865f;

    static {
        f860a = C0208c.m1493a(ba.class);
    }

    public ba(C0150a c0150a) {
        this.f865f = c0150a;
    }

    public int m1268a(byte[] bArr, int i) {
        boolean z = true;
        this.f864e = ar.m1152b(bArr[i], bArr[i + 1]);
        int a = ar.m1148a(bArr[i + 2], bArr[i + 3]);
        this.f863d = (byte) (a & 255);
        this.f861b = (a & 16384) != 0;
        if ((32768 & a) == 0) {
            z = false;
        }
        this.f862c = z;
        if (this.f861b && this.f865f != null) {
            this.f863d = this.f865f.m1086b() + this.f863d;
        }
        if (this.f862c && this.f865f != null) {
            this.f864e = this.f865f.e_() + this.f864e;
        }
        return 4;
    }

    public void m1269a(StringBuffer stringBuffer) {
        C0193m.m1453a(this.f863d, this.f864e, stringBuffer);
    }

    byte[] m1270c() {
        byte[] bArr = new byte[5];
        bArr[0] = bi.f896b.m1285a();
        ar.m1150a(this.f864e, bArr, 1);
        int i = this.f863d;
        if (this.f861b) {
            i |= 16384;
        }
        if (this.f862c) {
            i |= 32768;
        }
        ar.m1150a(i, bArr, 3);
        return bArr;
    }
}
