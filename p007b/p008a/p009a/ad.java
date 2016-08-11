package p007b.p008a.p009a;

import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;
import p007b.p015d.p016a.C0232f;

/* renamed from: b.a.a.ad */
public class ad extends bd {
    public static final ae f466a;
    public static final ae f467b;
    public static final ae f468c;
    public static final ae f469d;
    public static final ae f470e;
    public static final ae f471f;
    public static final ae f472g;
    public static final ae f473h;
    public static final ae f474i;
    public static final ae f475j;
    public static final ae f476k;
    public static final ae f477l;
    public static final ae f478m;
    public static final ae f479n;
    public static final ae f480o;
    public static final ae f481p;
    public static final ae f482q;
    public static final ae f483r;
    public static final ae f484s;
    public static final ae f485t;
    public static final ae f486u;
    public static final ae f487v;
    public static final ae f488w;
    public static final ae f489x;
    private static final C0208c f490y;
    private boolean f491A;
    private int f492B;
    private ae f493z;

    static {
        f490y = C0208c.m1493a(ad.class);
        f466a = new ae(0, "Group");
        f467b = new ae(1, "Line");
        f468c = new ae(2, "Rectangle");
        f469d = new ae(3, "Oval");
        f470e = new ae(4, "Arc");
        f471f = new ae(5, "Chart");
        f472g = new ae(6, "Text");
        f473h = new ae(7, "Button");
        f474i = new ae(8, "Picture");
        f475j = new ae(9, "Polygon");
        f476k = new ae(11, "Checkbox");
        f477l = new ae(12, "Option");
        f478m = new ae(13, "Edit Box");
        f479n = new ae(14, "Label");
        f480o = new ae(15, "Dialogue Box");
        f481p = new ae(16, "Spin Box");
        f482q = new ae(17, "Scrollbar");
        f483r = new ae(18, "List Box");
        f484s = new ae(19, "Group Box");
        f485t = new ae(20, "Combo Box");
        f486u = new ae(30, "MS Office Drawing");
        f487v = new ae(20, "Form Combo Box");
        f488w = new ae(25, "Excel Note");
        f489x = new ae(255, "Unknown");
    }

    ad(int i, ae aeVar) {
        super(ay.aO);
        this.f492B = i;
        this.f493z = aeVar;
    }

    private byte[] m942d() {
        byte[] bArr = new byte[38];
        ar.m1150a(21, bArr, 0);
        ar.m1150a(18, bArr, 2);
        ar.m1150a(this.f493z.f495a, bArr, 4);
        ar.m1150a(this.f492B, bArr, 6);
        ar.m1150a(24593, bArr, 8);
        ar.m1150a(7, bArr, 22);
        ar.m1150a(2, bArr, 24);
        ar.m1150a(65535, bArr, 26);
        ar.m1150a(8, bArr, 28);
        ar.m1150a(2, bArr, 30);
        ar.m1150a(1, bArr, 32);
        ar.m1150a(0, bArr, 34);
        ar.m1150a(0, bArr, 36);
        return bArr;
    }

    private byte[] m943e() {
        byte[] bArr = new byte[52];
        ar.m1150a(21, bArr, 0);
        ar.m1150a(18, bArr, 2);
        ar.m1150a(this.f493z.f495a, bArr, 4);
        ar.m1150a(this.f492B, bArr, 6);
        ar.m1150a(16401, bArr, 8);
        ar.m1150a(13, bArr, 22);
        ar.m1150a(22, bArr, 24);
        ar.m1150a(0, bArr, 48);
        ar.m1150a(0, bArr, 50);
        return bArr;
    }

    private byte[] m944f() {
        byte[] bArr = new byte[70];
        ar.m1150a(21, bArr, 0);
        ar.m1150a(18, bArr, 2);
        ar.m1150a(this.f493z.f495a, bArr, 4);
        ar.m1150a(this.f492B, bArr, 6);
        ar.m1150a(0, bArr, 8);
        ar.m1150a(12, bArr, 22);
        ar.m1150a(20, bArr, 24);
        bArr[36] = (byte) 1;
        bArr[38] = (byte) 4;
        bArr[42] = (byte) 16;
        bArr[46] = (byte) 19;
        bArr[48] = (byte) -18;
        bArr[49] = (byte) 31;
        bArr[52] = (byte) 4;
        bArr[56] = (byte) 1;
        bArr[57] = (byte) 6;
        bArr[60] = (byte) 2;
        bArr[62] = (byte) 8;
        bArr[64] = (byte) 64;
        ar.m1150a(0, bArr, 66);
        ar.m1150a(0, bArr, 68);
        return bArr;
    }

    public byte[] m945a() {
        if (this.f491A) {
            return g_().m1542a();
        }
        if (this.f493z == f474i || this.f493z == f471f) {
            return m942d();
        }
        if (this.f493z == f488w) {
            return m943e();
        }
        if (this.f493z == f485t) {
            return m944f();
        }
        C0210a.m1505a(false);
        return null;
    }

    public int m946c() {
        return this.f492B;
    }

    public C0232f g_() {
        return super.g_();
    }
}
