package p007b.p008a;

import p007b.p013b.C0208c;

/* renamed from: b.a.o */
public class C0195o extends bd {
    private static C0208c f1193a;
    private C0196p f1194b;
    private C0196p[] f1195c;
    private int f1196d;
    private boolean f1197e;
    private byte[] f1198f;

    static {
        f1193a = C0208c.m1493a(C0195o.class);
    }

    public byte[] m1462a() {
        int i = 0;
        if (!this.f1197e) {
            return this.f1198f;
        }
        Object obj = new byte[((this.f1195c.length * 8) + 14)];
        System.arraycopy(this.f1198f, 0, obj, 0, 4);
        ar.m1150a(this.f1194b.f1199a, obj, 4);
        ar.m1150a(this.f1194b.f1201c, obj, 6);
        ar.m1150a(this.f1194b.f1200b, obj, 8);
        ar.m1150a(this.f1194b.f1202d, obj, 10);
        ar.m1150a(this.f1196d, obj, 12);
        int i2 = 14;
        while (i < this.f1195c.length) {
            ar.m1150a(this.f1195c[i].f1199a, obj, i2);
            ar.m1150a(this.f1195c[i].f1201c, obj, i2 + 2);
            ar.m1150a(this.f1195c[i].f1200b, obj, i2 + 4);
            ar.m1150a(this.f1195c[i].f1202d, obj, i2 + 6);
            i2 += 8;
            i++;
        }
        return obj;
    }
}
