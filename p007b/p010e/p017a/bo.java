package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bo */
class bo extends bd {
    private boolean f1662a;
    private byte[] f1663b;

    public bo(boolean z) {
        super(ay.av);
        this.f1662a = z;
        this.f1663b = new byte[2];
        if (this.f1662a) {
            ar.m1150a(1, this.f1663b, 0);
        }
    }

    public byte[] m1636a() {
        return this.f1663b;
    }
}
