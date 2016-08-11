package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.da */
class da extends bd {
    private byte[] f1795a;
    private boolean f1796b;

    public da(boolean z) {
        super(ay.ag);
        this.f1796b = z;
        this.f1795a = new byte[2];
        if (this.f1796b) {
            this.f1795a[0] = (byte) 1;
        }
    }

    public byte[] m1722a() {
        return this.f1795a;
    }
}
