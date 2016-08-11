package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.at */
class at extends bd {
    private byte[] f1585a;
    private boolean f1586b;

    public at(boolean z) {
        super(ay.af);
        this.f1586b = z;
        this.f1585a = new byte[2];
        if (this.f1586b) {
            this.f1585a[0] = (byte) 1;
        }
    }

    public byte[] m1584a() {
        return this.f1585a;
    }
}
