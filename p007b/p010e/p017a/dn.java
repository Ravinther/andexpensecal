package p007b.p010e.p017a;

import p007b.C0286o;
import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.dn */
class dn extends bd {
    private byte[] f1863a;

    public dn(String str) {
        super(ay.f786Q);
        this.f1863a = new byte[112];
        if (str == null) {
            str = "Java Excel API v" + C0286o.m1903a();
        }
        ax.m1163a(str, this.f1863a, 0);
        for (int length = str.length(); length < this.f1863a.length; length++) {
            this.f1863a[length] = (byte) 32;
        }
    }

    public byte[] m1786a() {
        return this.f1863a;
    }
}
