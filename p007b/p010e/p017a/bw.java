package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bw */
class bw extends bd {
    private byte[] f1677a;
    private boolean f1678b;

    public bw(boolean z) {
        super(ay.aj);
        this.f1678b = z;
        this.f1677a = new byte[2];
        if (this.f1678b) {
            this.f1677a[0] = (byte) 1;
        }
    }

    public byte[] m1648a() {
        return this.f1677a;
    }
}
