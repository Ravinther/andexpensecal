package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.cl */
class cl extends bd {
    public static final cm f1722a;
    public static final cm f1723b;
    public static final cm f1724c;
    public static final cm f1725d;
    private cm f1726e;
    private int f1727f;
    private int f1728g;

    static {
        f1722a = new cm(0);
        f1723b = new cm(1);
        f1724c = new cm(2);
        f1725d = new cm(3);
    }

    public cl(cm cmVar, int i, int i2) {
        super(ay.aM);
        this.f1727f = i;
        this.f1728g = i2;
        this.f1726e = cmVar;
    }

    public byte[] m1673a() {
        byte[] bArr = new byte[15];
        bArr[0] = (byte) this.f1726e.f1729a;
        ar.m1150a(this.f1728g, bArr, 1);
        ar.m1150a(this.f1727f, bArr, 3);
        bArr[7] = (byte) 1;
        ar.m1150a(this.f1728g, bArr, 9);
        ar.m1150a(this.f1728g, bArr, 11);
        bArr[13] = (byte) this.f1727f;
        bArr[14] = (byte) this.f1727f;
        return bArr;
    }
}
