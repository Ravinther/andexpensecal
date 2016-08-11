package p007b.p008a.p009a;

import p007b.C0287p;
import p007b.p008a.C0198r;
import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p010e.p017a.al;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.a.i */
public class C0136i implements C0134t {
    private static C0208c f588a;
    private C0123v f589b;
    private C0123v f590c;
    private ab f591d;
    private ad f592e;
    private boolean f593f;
    private int f594g;
    private int f595h;
    private int f596i;
    private int f597j;
    private int f598k;
    private double f599l;
    private double f600m;
    private int f601n;
    private ah f602o;
    private C0146s f603p;
    private C0144q f604q;
    private ai f605r;
    private int f606s;
    private ab f607t;
    private ap f608u;
    private ac f609v;
    private C0198r f610w;
    private C0198r f611x;
    private String f612y;
    private C0287p f613z;

    static {
        f588a = C0208c.m1493a(C0136i.class);
    }

    public C0136i(String str, int i, int i2) {
        this.f593f = false;
        this.f593f = true;
        this.f602o = ah.f508b;
        this.f597j = i;
        this.f598k = i2;
        this.f601n = 1;
        this.f605r = ai.f513d;
        this.f612y = str;
        this.f599l = 3.0d;
        this.f600m = 4.0d;
    }

    private void m1008h() {
        int i = 0;
        this.f589b = this.f604q.m1050a(this.f606s);
        C0210a.m1505a(this.f589b != null);
        C0122w[] b = this.f589b.m931b();
        ak akVar = (ak) this.f589b.m931b()[0];
        this.f594g = this.f592e.m946c();
        this.f596i = akVar.m960b();
        this.f605r = ai.m953a(akVar.m961c());
        if (this.f605r == ai.f514e) {
            f588a.m1499b((Object) "Unknown shape type");
        }
        C0131e c0131e = null;
        while (i < b.length && c0131e == null) {
            if (b[i].m925k() == C0148y.f695m) {
                c0131e = (C0131e) b[i];
            }
            i++;
        }
        if (c0131e == null) {
            f588a.m1499b((Object) "client anchor not found");
        } else {
            this.f597j = ((int) c0131e.m978b()) - 1;
            this.f598k = ((int) c0131e.m979c()) + 1;
            this.f599l = c0131e.m980d() - c0131e.m978b();
            this.f600m = c0131e.m981e() - c0131e.m979c();
        }
        this.f593f = true;
    }

    private C0123v m1009i() {
        if (!this.f593f) {
            m1008h();
        }
        return this.f589b;
    }

    public String m1010a() {
        if (this.f612y == null) {
            C0210a.m1505a(this.f610w != null);
            byte[] a = this.f610w.m1464a();
            if (a[0] == null) {
                this.f612y = ax.m1162a(a, a.length - 1, 1, this.f613z);
            } else {
                this.f612y = ax.m1161a(a, (a.length - 1) / 2, 1);
            }
        }
        return this.f612y;
    }

    public void m1011a(double d) {
        if (this.f602o == ah.f507a) {
            if (!this.f593f) {
                m1008h();
            }
            this.f602o = ah.f509c;
        }
        this.f599l = d;
    }

    public final void m1012a(int i, int i2, int i3) {
        this.f594g = i;
        this.f595h = i2;
        this.f596i = i3;
        if (this.f602o == ah.f507a) {
            this.f602o = ah.f509c;
        }
    }

    public void m1013a(C0146s c0146s) {
        this.f603p = c0146s;
    }

    public void m1014a(al alVar) {
        if (this.f602o == ah.f507a) {
            alVar.m1568a(this.f592e);
            if (this.f607t != null) {
                alVar.m1568a(this.f607t);
            }
            alVar.m1568a(this.f608u);
            alVar.m1568a(this.f610w);
            if (this.f611x != null) {
                alVar.m1568a(this.f611x);
                return;
            }
            return;
        }
        alVar.m1568a(new ad(this.f594g, ad.f488w));
        alVar.m1568a(new ab(new C0133g().m984a()));
        alVar.m1568a(new ap(m1010a()));
        byte[] bArr = new byte[((this.f612y.length() * 2) + 1)];
        bArr[0] = (byte) 1;
        ax.m1166b(this.f612y, bArr, 1);
        alVar.m1568a(new C0198r(bArr));
        bArr = new byte[16];
        ar.m1150a(0, bArr, 0);
        ar.m1150a(0, bArr, 2);
        ar.m1150a(this.f612y.length(), bArr, 8);
        ar.m1150a(0, bArr, 10);
        alVar.m1568a(new C0198r(bArr));
    }

    public ab m1015b() {
        return this.f591d;
    }

    public void m1016b(double d) {
        if (this.f602o == ah.f507a) {
            if (!this.f593f) {
                m1008h();
            }
            this.f602o = ah.f509c;
        }
        this.f600m = d;
    }

    public void m1017b(al alVar) {
        if (this.f602o == ah.f507a) {
            alVar.m1568a(this.f609v);
        } else {
            alVar.m1568a(new ac(this.f597j, this.f598k, this.f594g));
        }
    }

    public C0123v m1018c() {
        if (!this.f593f) {
            m1008h();
        }
        if (this.f602o == ah.f507a) {
            return m1009i();
        }
        if (this.f590c == null) {
            this.f590c = new al();
            this.f590c.m929a(new ak(this.f605r, this.f596i, 2560));
            C0122w afVar = new af();
            afVar.m950a(344, false, false, 0);
            afVar.m950a(385, false, false, 134217808);
            afVar.m950a(387, false, false, 134217808);
            afVar.m950a(959, false, false, 131074);
            this.f590c.m929a(afVar);
            this.f590c.m929a(new C0131e(((double) this.f597j) + 1.3d, Math.max(0.0d, ((double) this.f598k) - 0.6d), (((double) this.f597j) + 1.3d) + this.f599l, ((double) this.f598k) + this.f600m, 1));
            this.f590c.m929a(new C0132f());
            this.f590c.m929a(new C0133g());
        }
        return this.f590c;
    }

    public ah m1019d() {
        return this.f602o;
    }

    public String m1020e() {
        C0210a.m1505a(false);
        return null;
    }

    public boolean m1021f() {
        return this.f591d.m940c();
    }

    public boolean m1022g() {
        return true;
    }

    public int hashCode() {
        return this.f612y.hashCode();
    }
}
