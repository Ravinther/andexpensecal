package p007b.p010e.p017a;

import p007b.C0285n;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.de */
class de extends bd {
    private byte[] f1800a;

    public de(C0285n c0285n) {
        super(ay.as);
        int i = ((c0285n.m1859D() ? 2 : 0) | 4) | 0;
        if (c0285n.m1858C()) {
            i |= 16;
        }
        i = (i | 32) | 128;
        if (!(c0285n.m1863H() == 0 && c0285n.m1864I() == 0)) {
            i = (i | 8) | 256;
        }
        if (c0285n.m1883h()) {
            i |= 1536;
        }
        if (c0285n.m1860E()) {
            i |= 2048;
        }
        this.f1800a = new byte[18];
        ar.m1150a(i, this.f1800a, 0);
        ar.m1150a(64, this.f1800a, 6);
        ar.m1150a(c0285n.m1856A(), this.f1800a, 10);
        ar.m1150a(c0285n.m1857B(), this.f1800a, 12);
    }

    public byte[] m1726a() {
        return this.f1800a;
    }
}
