package p007b.p010e.p017a;

import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bg */
class bg extends bd {
    private byte f1632a;
    private byte f1633b;
    private byte[] f1634c;

    public bg(int i, int i2) {
        super(ay.az);
        this.f1632a = (byte) i;
        this.f1633b = (byte) i2;
        this.f1634c = new byte[2];
        this.f1634c[0] = this.f1632a;
        this.f1634c[1] = this.f1633b;
    }

    public byte[] m1620a() {
        return this.f1634c;
    }
}
