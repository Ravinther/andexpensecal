package p007b.p008a;

import p007b.p011c.C0222m;

/* renamed from: b.a.au */
public class au extends bd {
    private C0222m[] f760a;
    private boolean f761b;
    private boolean f762c;

    public byte[] m1154a() {
        int i = 0;
        if (this.f762c && !this.f761b) {
            return g_().m1542a();
        }
        byte[] bArr = new byte[226];
        ar.m1150a(56, bArr, 0);
        while (i < 56) {
            int i2 = (i * 4) + 2;
            bArr[i2] = (byte) this.f760a[i].m1520a();
            bArr[i2 + 1] = (byte) this.f760a[i].m1521b();
            bArr[i2 + 2] = (byte) this.f760a[i].m1522c();
            i++;
        }
        return bArr;
    }
}
