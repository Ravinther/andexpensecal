package p007b.p008a;

import p007b.p013b.C0208c;

/* renamed from: b.a.x */
public class C0204x {
    private static C0208c f1280a;
    private static int f1281b;
    private static int f1282c;
    private static int f1283d;
    private boolean f1284e;
    private boolean f1285f;
    private boolean f1286g;
    private int f1287h;
    private int f1288i;

    static {
        f1280a = C0208c.m1493a(C0204x.class);
        f1281b = 1;
        f1282c = 2;
        f1283d = 4;
    }

    public C0204x(int i, int i2) {
        this.f1288i = i;
        this.f1287h = i2;
        this.f1286g = true;
    }

    public C0204x(byte[] bArr) {
        boolean z = true;
        int a = ar.m1148a(bArr[0], bArr[1]);
        this.f1284e = (f1281b & a) != 0;
        this.f1285f = (f1282c & a) != 0;
        if ((f1283d & a) == 0) {
            z = false;
        }
        this.f1286g = z;
        this.f1288i = ar.m1149a(bArr[10], bArr[11], bArr[12], bArr[13]);
        this.f1287h = ar.m1149a(bArr[14], bArr[15], bArr[16], bArr[17]);
    }

    public byte[] m1482a() {
        byte[] bArr = new byte[18];
        int i = this.f1284e ? f1281b | 0 : 0;
        if (this.f1285f) {
            i |= f1282c;
        }
        if (this.f1286g) {
            i |= f1283d;
        }
        ar.m1150a(i, bArr, 0);
        ar.m1153b(this.f1288i, bArr, 10);
        ar.m1153b(this.f1287h, bArr, 14);
        return bArr;
    }

    public void m1483b() {
        this.f1287h--;
    }

    public int m1484c() {
        return this.f1287h;
    }

    public void m1485d() {
        this.f1287h++;
    }
}
