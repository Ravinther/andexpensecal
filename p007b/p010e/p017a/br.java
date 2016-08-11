package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.br */
class br extends bd {
    private boolean f1668a;
    private byte[] f1669b;

    public br(boolean z) {
        super(ay.ab);
        this.f1668a = z;
        this.f1669b = new byte[2];
        if (this.f1668a) {
            ar.m1150a(1, this.f1669b, 0);
        }
    }

    public byte[] m1642a() {
        return this.f1669b;
    }
}
