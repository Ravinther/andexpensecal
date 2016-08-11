package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.cq */
class cq extends bd {
    private String f1772a;

    public cq(String str) {
        super(ay.f772C);
        this.f1772a = str;
    }

    public byte[] m1693a() {
        byte[] bArr = new byte[((this.f1772a.length() * 2) + 3)];
        ar.m1150a(this.f1772a.length(), bArr, 0);
        bArr[2] = (byte) 1;
        ax.m1166b(this.f1772a, bArr, 3);
        return bArr;
    }
}
