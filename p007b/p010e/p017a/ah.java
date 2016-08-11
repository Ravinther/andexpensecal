package p007b.p010e.p017a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.ah */
class ah extends bd {
    private int f1550a;
    private int[] f1551b;
    private int[] f1552c;
    private int f1553d;

    public ah(int i) {
        super(ay.f814t);
        this.f1553d = 0;
        this.f1550a = i;
        int c = m1557c();
        this.f1551b = new int[c];
        this.f1552c = new int[c];
        this.f1553d = 0;
    }

    public void m1555a(int i, int i2) {
        this.f1551b[this.f1553d] = i + i2;
        this.f1552c[this.f1553d] = i2;
        this.f1553d++;
    }

    public byte[] m1556a() {
        int i = 0;
        int c = m1557c();
        byte[] bArr = new byte[((c * 8) + 2)];
        ar.m1150a(m1558d(), bArr, 0);
        while (i < c) {
            ar.m1153b(this.f1551b[i], bArr, (i * 8) + 2);
            ar.m1150a(this.f1552c[i], bArr, (i * 8) + 6);
            i++;
        }
        return bArr;
    }

    public int m1557c() {
        int d = m1558d();
        return d != 0 ? ((this.f1550a + d) - 1) / d : 0;
    }

    public int m1558d() {
        return ((this.f1550a + 128) - 1) / 128;
    }
}
