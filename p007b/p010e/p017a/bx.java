package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bx */
class bx extends bd {
    private byte[] f1679a;
    private boolean f1680b;

    public bx(boolean z) {
        super(ay.ac);
        this.f1680b = z;
        this.f1679a = new byte[2];
        if (this.f1680b) {
            this.f1679a[0] = (byte) 1;
        }
    }

    public byte[] m1649a() {
        return this.f1679a;
    }
}
