package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ap */
class ap extends bd {
    private byte[] f1574a;
    private boolean f1575b;

    public ap(boolean z) {
        super(ay.ak);
        this.f1575b = z;
        this.f1574a = new byte[2];
        if (this.f1575b) {
            this.f1574a[0] = (byte) 1;
        }
    }

    public byte[] m1578a() {
        return this.f1574a;
    }
}
