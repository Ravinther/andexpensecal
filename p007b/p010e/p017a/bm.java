package p007b.p010e.p017a;

import p007b.p008a.C0190i;
import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.bm */
class bm extends bd {
    private static C0208c f1648a;
    private static final bn f1649i;
    private byte[] f1650b;
    private String f1651c;
    private C0190i f1652d;
    private int f1653e;
    private int f1654f;
    private boolean f1655g;
    private bn[] f1656h;

    static {
        f1648a = C0208c.m1493a(bm.class);
        f1649i = new bn(0, 0, 0, 0, 0);
    }

    bm(C0190i c0190i, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z) {
        super(ay.f820z);
        this.f1654f = 0;
        this.f1652d = c0190i;
        this.f1653e = i;
        this.f1654f = z ? 0 : this.f1653e + 1;
        this.f1656h = new bn[2];
        this.f1656h[0] = new bn(i2, i3, i4, i5, i6);
        this.f1656h[1] = new bn(i2, i7, i8, i9, i10);
    }

    bm(C0190i c0190i, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(ay.f820z);
        this.f1654f = 0;
        this.f1652d = c0190i;
        this.f1653e = i;
        this.f1654f = z ? 0 : this.f1653e + 1;
        this.f1656h = new bn[1];
        this.f1656h[0] = new bn(i2, i3, i4, i5, i6);
    }

    public byte[] m1632a() {
        if (this.f1650b != null && !this.f1655g) {
            return this.f1650b;
        }
        int length = this.f1656h.length > 1 ? (this.f1656h.length * 11) + 4 : 11;
        this.f1650b = new byte[((this.f1652d != null ? 1 : this.f1651c.length()) + (length + 15))];
        ar.m1150a(this.f1652d != null ? 32 : 0, this.f1650b, 0);
        this.f1650b[2] = (byte) 0;
        if (this.f1652d != null) {
            this.f1650b[3] = (byte) 1;
        } else {
            this.f1650b[3] = (byte) this.f1651c.length();
        }
        ar.m1150a(length, this.f1650b, 4);
        ar.m1150a(this.f1654f, this.f1650b, 6);
        ar.m1150a(this.f1654f, this.f1650b, 8);
        if (this.f1652d != null) {
            this.f1650b[15] = (byte) this.f1652d.m1444a();
        } else {
            ax.m1163a(this.f1651c, this.f1650b, 15);
        }
        int length2 = this.f1652d != null ? 16 : this.f1651c.length() + 15;
        if (this.f1656h.length > 1) {
            int i = length2 + 1;
            this.f1650b[length2] = (byte) 41;
            ar.m1150a(length - 3, this.f1650b, i);
            length2 = i + 2;
            for (bn a : this.f1656h) {
                i = length2 + 1;
                this.f1650b[length2] = (byte) 59;
                Object a2 = a.m1635a();
                System.arraycopy(a2, 0, this.f1650b, i, a2.length);
                length2 = a2.length + i;
            }
            this.f1650b[length2] = (byte) 16;
        } else {
            this.f1650b[length2] = (byte) 59;
            Object a3 = this.f1656h[0].m1635a();
            System.arraycopy(a3, 0, this.f1650b, length2 + 1, a3.length);
        }
        return this.f1650b;
    }

    public String m1633c() {
        return this.f1651c;
    }

    public int m1634d() {
        return this.f1653e;
    }
}
