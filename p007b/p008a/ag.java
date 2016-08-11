package p007b.p008a;

import p007b.p011c.C0152f;
import p007b.p011c.C0216e;
import p007b.p011c.C0223n;
import p007b.p011c.C0224o;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.ag */
public class ag extends bd implements C0152f {
    public static final ai f721a;
    private static C0208c f722b;
    private int f723c;
    private int f724d;
    private int f725e;
    private int f726f;
    private int f727g;
    private byte f728h;
    private byte f729i;
    private boolean f730j;
    private boolean f731k;
    private String f732l;
    private boolean f733m;
    private int f734n;

    static {
        f722b = C0208c.m1493a(ag.class);
        f721a = new ai();
    }

    protected ag(C0152f c0152f) {
        super(ay.ay);
        C0210a.m1505a(c0152f != null);
        this.f723c = c0152f.m1104f();
        this.f724d = c0152f.m1108k().m1514a();
        this.f725e = c0152f.m1105h();
        this.f726f = c0152f.m1109l().m1524a();
        this.f727g = c0152f.m1107j().m1526a();
        this.f730j = c0152f.m1106i();
        this.f732l = c0152f.m1110m();
        this.f731k = c0152f.m1111n();
        this.f733m = false;
    }

    protected ag(String str, int i, int i2, boolean z, int i3, int i4, int i5) {
        super(ay.ay);
        this.f725e = i2;
        this.f727g = i3;
        this.f732l = str;
        this.f723c = i;
        this.f730j = z;
        this.f726f = i5;
        this.f724d = i4;
        this.f733m = false;
        this.f731k = false;
    }

    public final void m1112a(int i) {
        this.f734n = i;
        this.f733m = true;
    }

    public byte[] m1113a() {
        byte[] bArr = new byte[((this.f732l.length() * 2) + 16)];
        ar.m1150a(this.f723c * 20, bArr, 0);
        if (this.f730j) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.f731k) {
            bArr[2] = (byte) (bArr[2] | 8);
        }
        ar.m1150a(this.f724d, bArr, 4);
        ar.m1150a(this.f725e, bArr, 6);
        ar.m1150a(this.f726f, bArr, 8);
        bArr[10] = (byte) this.f727g;
        bArr[11] = this.f728h;
        bArr[12] = this.f729i;
        bArr[13] = (byte) 0;
        bArr[14] = (byte) this.f732l.length();
        bArr[15] = (byte) 1;
        ax.m1166b(this.f732l, bArr, 16);
        return bArr;
    }

    public final boolean m1114c() {
        return this.f733m;
    }

    public final void m1115d() {
        this.f733m = false;
    }

    public final int m1116e() {
        return this.f734n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return this.f723c == agVar.f723c && this.f724d == agVar.f724d && this.f725e == agVar.f725e && this.f726f == agVar.f726f && this.f727g == agVar.f727g && this.f730j == agVar.f730j && this.f731k == agVar.f731k && this.f728h == agVar.f728h && this.f729i == agVar.f729i && this.f732l.equals(agVar.f732l);
    }

    public int m1117f() {
        return this.f723c;
    }

    public int m1118h() {
        return this.f725e;
    }

    public int hashCode() {
        return this.f732l.hashCode();
    }

    public boolean m1119i() {
        return this.f730j;
    }

    public C0224o m1120j() {
        return C0224o.m1525a(this.f727g);
    }

    public C0216e m1121k() {
        return C0216e.m1513a(this.f724d);
    }

    public C0223n m1122l() {
        return C0223n.m1523a(this.f726f);
    }

    public String m1123m() {
        return this.f732l;
    }

    public boolean m1124n() {
        return this.f731k;
    }
}
