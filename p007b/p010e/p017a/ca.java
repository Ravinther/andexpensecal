package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ca */
class ca extends bd {
    private boolean f1684a;
    private byte[] f1685b;

    public ca(boolean z) {
        super(ay.f795Z);
        this.f1684a = z;
        this.f1685b = new byte[2];
        if (this.f1684a) {
            ar.m1150a(1, this.f1685b, 0);
        }
    }

    public byte[] m1652a() {
        return this.f1685b;
    }
}
