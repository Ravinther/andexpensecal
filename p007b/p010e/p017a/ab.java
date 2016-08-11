package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ab */
class ab extends bd {
    private byte[] f1542a;
    private int f1543b;
    private boolean f1544c;

    public ab(int i, boolean z) {
        super(ay.f785P);
        this.f1542a = new byte[4];
        this.f1543b = i;
        this.f1544c = z;
    }

    public byte[] m1545a() {
        if (this.f1544c) {
            byte[] bArr = this.f1542a;
            bArr[0] = (byte) (bArr[0] | 1);
        }
        ar.m1150a(this.f1543b, this.f1542a, 2);
        return this.f1542a;
    }
}
