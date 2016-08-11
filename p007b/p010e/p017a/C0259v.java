package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.v */
class C0259v extends bd {
    private int f1918a;
    private int f1919b;
    private ArrayList f1920c;
    private int f1921d;

    public C0259v(int i) {
        super(ay.f811q);
        this.f1918a = i;
        this.f1920c = new ArrayList(10);
    }

    void m1825a(int i) {
        this.f1919b = i;
    }

    protected byte[] m1826a() {
        byte[] bArr = new byte[((this.f1920c.size() * 2) + 4)];
        ar.m1153b(this.f1921d - this.f1918a, bArr, 0);
        int i = this.f1919b;
        Iterator it = this.f1920c.iterator();
        int i2 = 4;
        int i3 = i;
        while (it.hasNext()) {
            i = ((Integer) it.next()).intValue();
            ar.m1150a(i - i3, bArr, i2);
            i2 += 2;
            i3 = i;
        }
        return bArr;
    }

    void m1827b(int i) {
        this.f1920c.add(new Integer(i));
    }

    void m1828c(int i) {
        this.f1921d = i;
    }
}
