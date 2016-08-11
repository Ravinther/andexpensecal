package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.cj */
class cj extends bd {
    private byte[] f1718a;
    private boolean f1719b;

    public cj(boolean z) {
        super(ay.f780K);
        this.f1719b = z;
        this.f1718a = new byte[2];
        if (this.f1719b) {
            this.f1718a[0] = (byte) 1;
        }
    }

    public byte[] m1671a() {
        return this.f1718a;
    }
}
