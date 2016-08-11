package p007b.p008a.p009a;

import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.x */
final class C0147x {
    private static C0208c f673a;
    private int f674b;
    private int f675c;
    private int f676d;
    private int f677e;
    private int f678f;
    private int f679g;
    private boolean f680h;
    private C0148y f681i;
    private C0129z f682j;

    static {
        f673a = C0208c.m1493a(C0147x.class);
    }

    public C0147x(C0148y c0148y) {
        this.f681i = c0148y;
        this.f677e = this.f681i.m1072a();
    }

    public C0147x(C0129z c0129z, int i) {
        this.f682j = c0129z;
        this.f674b = i;
        byte[] a = this.f682j.m969a();
        this.f679g = a.length;
        int a2 = ar.m1148a(a[this.f674b], a[this.f674b + 1]);
        this.f675c = (65520 & a2) >> 4;
        this.f676d = a2 & 15;
        this.f677e = ar.m1148a(a[this.f674b + 2], a[this.f674b + 3]);
        this.f678f = ar.m1149a(a[this.f674b + 4], a[this.f674b + 5], a[this.f674b + 6], a[this.f674b + 7]);
        if (this.f676d == 15) {
            this.f680h = true;
        } else {
            this.f680h = false;
        }
    }

    void m1059a(int i) {
        this.f675c = i;
    }

    void m1060a(boolean z) {
        this.f680h = z;
    }

    public boolean m1061a() {
        return this.f680h;
    }

    byte[] m1062a(byte[] bArr) {
        Object obj = new byte[(bArr.length + 8)];
        System.arraycopy(bArr, 0, obj, 8, bArr.length);
        if (this.f680h) {
            this.f676d = 15;
        }
        ar.m1150a((this.f675c << 4) | this.f676d, obj, 0);
        ar.m1150a(this.f677e, obj, 2);
        ar.m1153b(bArr.length, obj, 4);
        return obj;
    }

    public int m1063b() {
        return this.f678f;
    }

    void m1064b(int i) {
        this.f676d = i;
    }

    int m1065c() {
        return this.f674b;
    }

    C0148y m1066d() {
        if (this.f681i == null) {
            this.f681i = C0148y.m1071a(this.f677e);
        }
        return this.f681i;
    }

    int m1067e() {
        return this.f675c;
    }

    C0129z m1068f() {
        return this.f682j;
    }

    byte[] m1069g() {
        Object obj = new byte[this.f678f];
        System.arraycopy(this.f682j.m969a(), this.f674b + 8, obj, 0, this.f678f);
        return obj;
    }

    int m1070h() {
        return this.f679g;
    }
}
