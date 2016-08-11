package p007b.p010e.p017a;

import p007b.C0287p;
import p007b.p008a.ae;
import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.e.a.ct */
class ct extends bd {
    public static final cv f1780a;
    public static final cv f1781b;
    public static final cv f1782c;
    public static final cv f1783d;
    public static final cv f1784e;
    private static C0208c f1785f;
    private cv f1786g;
    private byte[] f1787h;
    private int f1788i;
    private String f1789j;
    private String[] f1790k;
    private C0287p f1791l;

    static {
        f1785f = C0208c.m1493a(ct.class);
        f1780a = new cv();
        f1781b = new cv();
        f1782c = new cv();
        f1783d = new cv();
        f1784e = new cv();
    }

    public ct() {
        super(ay.f799e);
        this.f1786g = f1782c;
    }

    public ct(int i, C0287p c0287p) {
        super(ay.f799e);
        this.f1788i = i;
        this.f1786g = f1780a;
        this.f1791l = c0287p;
    }

    public ct(String str, C0287p c0287p) {
        super(ay.f799e);
        this.f1789j = str;
        this.f1788i = 1;
        this.f1790k = new String[0];
        this.f1791l = c0287p;
        this.f1786g = f1781b;
    }

    private void m1709f() {
        this.f1787h = new byte[4];
        ar.m1150a(this.f1788i, this.f1787h, 0);
        this.f1787h[2] = (byte) 1;
        this.f1787h[3] = (byte) 4;
        this.f1786g = f1780a;
    }

    private void m1710h() {
        int i;
        int i2 = 0;
        int i3 = 0;
        for (i = 0; i < this.f1788i; i++) {
            i3 += this.f1790k[i].length();
        }
        Object a = ae.m1100a(this.f1789j, this.f1791l);
        this.f1787h = new byte[((i3 * 2) + ((a.length + 6) + (this.f1788i * 3)))];
        ar.m1150a(this.f1788i, this.f1787h, 0);
        ar.m1150a(a.length + 1, this.f1787h, 2);
        this.f1787h[4] = (byte) 0;
        this.f1787h[5] = (byte) 1;
        System.arraycopy(a, 0, this.f1787h, 6, a.length);
        i = (a.length + 4) + 2;
        while (i2 < this.f1790k.length) {
            ar.m1150a(this.f1790k[i2].length(), this.f1787h, i);
            this.f1787h[i + 2] = (byte) 1;
            ax.m1166b(this.f1790k[i2], this.f1787h, i + 3);
            i += (this.f1790k[i2].length() * 2) + 3;
            i2++;
        }
    }

    private void m1711i() {
        this.f1787h = new byte[]{(byte) 1, (byte) 0, (byte) 1, (byte) 58};
    }

    public int m1712a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < this.f1790k.length && i == 0; i2++) {
            if (this.f1790k[i2].equals(str)) {
                i = 1;
            }
        }
        if (i != 0) {
            return 0;
        }
        Object obj = new String[(this.f1790k.length + 1)];
        System.arraycopy(this.f1790k, 0, obj, 0, this.f1790k.length);
        obj[this.f1790k.length] = str;
        this.f1790k = obj;
        return this.f1790k.length - 1;
    }

    void m1713a(int i) {
        C0210a.m1505a(this.f1786g == f1780a);
        this.f1788i = i;
        m1709f();
    }

    public byte[] m1714a() {
        if (this.f1786g == f1780a) {
            m1709f();
        } else if (this.f1786g == f1781b) {
            m1710h();
        } else if (this.f1786g == f1782c) {
            m1711i();
        } else {
            f1785f.m1499b((Object) "unsupported supbook type - defaulting to internal");
            m1709f();
        }
        return this.f1787h;
    }

    public String m1715b(int i) {
        return this.f1790k[i];
    }

    public cv m1716c() {
        return this.f1786g;
    }

    public int m1717d() {
        return this.f1788i;
    }

    public String m1718e() {
        return this.f1789j;
    }
}
