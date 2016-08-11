package p007b.p010e.p017a;

import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.i */
class C0247i extends bd {
    private boolean f1869a;
    private boolean f1870b;
    private String f1871c;
    private byte[] f1872d;

    public C0247i(String str) {
        super(ay.f798d);
        this.f1871c = str;
        this.f1869a = false;
        this.f1870b = false;
    }

    public byte[] m1791a() {
        this.f1872d = new byte[((this.f1871c.length() * 2) + 8)];
        if (this.f1870b) {
            this.f1872d[5] = (byte) 2;
        } else {
            this.f1872d[5] = (byte) 0;
        }
        if (this.f1869a) {
            this.f1872d[4] = (byte) 1;
            this.f1872d[5] = (byte) 0;
        }
        this.f1872d[6] = (byte) this.f1871c.length();
        this.f1872d[7] = (byte) 1;
        ax.m1166b(this.f1871c, this.f1872d, 8);
        return this.f1872d;
    }

    void m1792c() {
        this.f1869a = true;
    }

    void m1793d() {
        this.f1870b = true;
    }
}
