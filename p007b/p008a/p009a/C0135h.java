package p007b.p008a.p009a;

import p007b.p010e.p017a.al;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.a.h */
public class C0135h implements C0134t {
    private static C0208c f572a;
    private C0123v f573b;
    private ab f574c;
    private ad f575d;
    private boolean f576e;
    private int f577f;
    private int f578g;
    private int f579h;
    private int f580i;
    private int f581j;
    private int f582k;
    private ah f583l;
    private C0146s f584m;
    private C0144q f585n;
    private ai f586o;
    private int f587p;

    static {
        f572a = C0208c.m1493a(C0135h.class);
    }

    public C0135h() {
        this.f576e = false;
        this.f576e = true;
        this.f583l = ah.f508b;
        this.f582k = 1;
        this.f586o = ai.f512c;
    }

    private void m995h() {
        int i = 0;
        this.f573b = this.f585n.m1050a(this.f587p);
        C0210a.m1505a(this.f573b != null);
        C0122w[] b = this.f573b.m931b();
        ak akVar = (ak) this.f573b.m931b()[0];
        this.f577f = this.f575d.m946c();
        this.f579h = akVar.m960b();
        this.f586o = ai.m953a(akVar.m961c());
        if (this.f586o == ai.f514e) {
            f572a.m1499b((Object) "Unknown shape type");
        }
        C0131e c0131e = null;
        while (i < b.length && c0131e == null) {
            if (b[i].m925k() == C0148y.f695m) {
                c0131e = (C0131e) b[i];
            }
            i++;
        }
        if (c0131e == null) {
            f572a.m1499b((Object) "Client anchor not found");
        } else {
            this.f580i = (int) c0131e.m978b();
            this.f581j = (int) c0131e.m979c();
        }
        this.f576e = true;
    }

    private C0123v m996i() {
        if (!this.f576e) {
            m995h();
        }
        return this.f573b;
    }

    public final int m997a() {
        if (!this.f576e) {
            m995h();
        }
        return this.f577f;
    }

    public final void m998a(int i, int i2, int i3) {
        this.f577f = i;
        this.f578g = i2;
        this.f579h = i3;
        if (this.f583l == ah.f507a) {
            this.f583l = ah.f509c;
        }
    }

    public void m999a(C0146s c0146s) {
        this.f584m = c0146s;
    }

    public void m1000a(al alVar) {
        if (this.f583l == ah.f507a) {
            alVar.m1568a(this.f575d);
        } else {
            alVar.m1568a(new ad(this.f577f, ad.f485t));
        }
    }

    public ab m1001b() {
        return this.f574c;
    }

    public void m1002b(al alVar) {
    }

    public C0123v m1003c() {
        if (!this.f576e) {
            m995h();
        }
        if (this.f583l == ah.f507a) {
            return m996i();
        }
        C0123v alVar = new al();
        alVar.m929a(new ak(this.f586o, this.f579h, 2560));
        C0122w afVar = new af();
        afVar.m950a(127, false, false, 17039620);
        afVar.m950a(191, false, false, 524296);
        afVar.m950a(511, false, false, 524288);
        afVar.m950a(959, false, false, 131072);
        alVar.m929a(afVar);
        alVar.m929a(new C0131e((double) this.f580i, (double) this.f581j, (double) (this.f580i + 1), (double) (this.f581j + 1), 1));
        alVar.m929a(new C0132f());
        return alVar;
    }

    public ah m1004d() {
        return this.f583l;
    }

    public String m1005e() {
        C0210a.m1505a(false);
        return null;
    }

    public boolean m1006f() {
        return this.f574c.m940c();
    }

    public boolean m1007g() {
        return false;
    }

    public int hashCode() {
        return getClass().getName().hashCode();
    }
}
