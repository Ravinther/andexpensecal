package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bb */
class bb extends bd {
    private boolean f1610a;
    private byte[] f1611b;

    public bb(boolean z) {
        super(ay.aH);
        this.f1610a = z;
        this.f1611b = new byte[2];
        if (this.f1610a) {
            this.f1611b[0] = (byte) 1;
        }
    }

    public byte[] m1601a() {
        return this.f1611b;
    }
}
