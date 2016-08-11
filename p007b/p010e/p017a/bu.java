package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.bu */
class bu extends bd {
    private String f1673a;
    private byte[] f1674b;

    public bu(int i) {
        super(ay.ap);
        this.f1674b = new byte[2];
        ar.m1150a(i, this.f1674b, 0);
    }

    public bu(String str) {
        super(ay.ap);
        this.f1673a = str;
        if (str == null) {
            this.f1674b = new byte[2];
            ar.m1150a(0, this.f1674b, 0);
            return;
        }
        int i;
        byte[] bytes = str.getBytes();
        int i2 = 0;
        for (i = 0; i < bytes.length; i++) {
            i2 ^= m1645a(bytes[i], i + 1);
        }
        i = (bytes.length ^ i2) ^ 52811;
        this.f1674b = new byte[2];
        ar.m1150a(i, this.f1674b, 0);
    }

    private int m1645a(int i, int i2) {
        int i3 = i & 32767;
        while (i2 > 0) {
            i3 = (i3 & 16384) != 0 ? ((i3 << 1) & 32767) + 1 : (i3 << 1) & 32767;
            i2--;
        }
        return i3;
    }

    public byte[] m1646a() {
        return this.f1674b;
    }
}
