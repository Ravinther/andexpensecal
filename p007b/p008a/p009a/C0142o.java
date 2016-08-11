package p007b.p008a.p009a;

import java.io.File;
import java.io.FileInputStream;
import p007b.p010e.p017a.al;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.a.o */
public class C0142o implements C0134t {
    public static C0143p f627a;
    public static C0143p f628b;
    public static C0143p f629c;
    private static C0208c f630d;
    private C0123v f631e;
    private ab f632f;
    private ad f633g;
    private boolean f634h;
    private File f635i;
    private byte[] f636j;
    private int f637k;
    private int f638l;
    private double f639m;
    private double f640n;
    private double f641o;
    private double f642p;
    private int f643q;
    private ah f644r;
    private C0146s f645s;
    private C0144q f646t;
    private ai f647u;
    private int f648v;
    private int f649w;
    private C0143p f650x;

    static {
        f630d = C0208c.m1493a(C0142o.class);
        f627a = new C0143p(1);
        f628b = new C0143p(2);
        f629c = new C0143p(3);
    }

    private void m1027m() {
        int i = 0;
        this.f631e = this.f646t.m1050a(this.f649w);
        C0210a.m1505a(this.f631e != null);
        C0122w[] b = this.f631e.m931b();
        ak akVar = (ak) this.f631e.m931b()[0];
        this.f648v = akVar.m960b();
        this.f637k = this.f633g.m946c();
        this.f647u = ai.m953a(akVar.m961c());
        if (this.f647u == ai.f514e) {
            f630d.m1499b((Object) "Unknown shape type");
        }
        af afVar = (af) this.f631e.m931b()[1];
        if (afVar.m949a(260) != null) {
            this.f638l = afVar.m949a(260).f505d;
        }
        if (afVar.m949a(261) != null) {
            this.f635i = new File(afVar.m949a(261).f506e);
        } else if (this.f647u == ai.f511b) {
            f630d.m1499b((Object) "no filename property for drawing");
            this.f635i = new File(Integer.toString(this.f638l));
        }
        C0131e c0131e = null;
        while (i < b.length && c0131e == null) {
            if (b[i].m925k() == C0148y.f695m) {
                c0131e = (C0131e) b[i];
            }
            i++;
        }
        if (c0131e == null) {
            f630d.m1499b((Object) "client anchor not found");
        } else {
            this.f639m = c0131e.m978b();
            this.f640n = c0131e.m979c();
            this.f641o = c0131e.m980d() - this.f639m;
            this.f642p = c0131e.m981e() - this.f640n;
            this.f650x = C0143p.m1046a(c0131e.m982f());
        }
        if (this.f638l == 0) {
            f630d.m1499b((Object) "linked drawings are not supported");
        }
        this.f634h = true;
    }

    private C0123v m1028n() {
        if (!this.f634h) {
            m1027m();
        }
        return this.f631e;
    }

    public final int m1029a() {
        if (!this.f634h) {
            m1027m();
        }
        return this.f637k;
    }

    public void m1030a(int i) {
        this.f643q = i;
    }

    public final void m1031a(int i, int i2, int i3) {
        this.f637k = i;
        this.f638l = i2;
        this.f648v = i3;
        if (this.f644r == ah.f507a) {
            this.f644r = ah.f509c;
        }
    }

    public void m1032a(C0146s c0146s) {
        this.f645s = c0146s;
    }

    public void m1033a(al alVar) {
        if (this.f644r == ah.f507a) {
            alVar.m1568a(this.f633g);
        } else {
            alVar.m1568a(new ad(this.f637k, ad.f474i));
        }
    }

    public ab m1034b() {
        return this.f632f;
    }

    public void m1035b(al alVar) {
    }

    public C0123v m1036c() {
        if (!this.f634h) {
            m1027m();
        }
        if (this.f644r == ah.f507a) {
            return m1028n();
        }
        C0123v alVar = new al();
        alVar.m929a(new ak(this.f647u, this.f648v, 2560));
        C0122w afVar = new af();
        afVar.m950a(260, true, false, this.f638l);
        if (this.f647u == ai.f511b) {
            String path = this.f635i != null ? this.f635i.getPath() : "";
            afVar.m951a(261, true, true, path.length() * 2, path);
            afVar.m950a(447, false, false, 65536);
            afVar.m950a(959, false, false, 524288);
            alVar.m929a(afVar);
        }
        alVar.m929a(new C0131e(this.f639m, this.f640n, this.f639m + this.f641o, this.f640n + this.f642p, this.f650x.m1047a()));
        alVar.m929a(new C0132f());
        return alVar;
    }

    public ah m1037d() {
        return this.f644r;
    }

    public String m1038e() {
        return this.f635i == null ? this.f638l != 0 ? Integer.toString(this.f638l) : "__new__image__" : this.f635i.getPath();
    }

    public boolean m1039f() {
        return this.f632f.m940c();
    }

    public boolean m1040g() {
        return false;
    }

    public int m1041h() {
        if (!this.f634h) {
            m1027m();
        }
        return this.f648v;
    }

    public final int m1042i() {
        if (!this.f634h) {
            m1027m();
        }
        return this.f638l;
    }

    public int m1043j() {
        return this.f643q;
    }

    public byte[] m1044k() {
        boolean z = this.f644r == ah.f507a || this.f644r == ah.f509c;
        C0210a.m1505a(z);
        if (!this.f634h) {
            m1027m();
        }
        return this.f645s.m1057a(this.f638l);
    }

    public byte[] m1045l() {
        boolean z = true;
        if (this.f644r == ah.f507a || this.f644r == ah.f509c) {
            return m1044k();
        }
        C0210a.m1505a(this.f644r == ah.f508b);
        if (this.f635i == null) {
            if (this.f636j == null) {
                z = false;
            }
            C0210a.m1505a(z);
            return this.f636j;
        }
        byte[] bArr = new byte[((int) this.f635i.length())];
        FileInputStream fileInputStream = new FileInputStream(this.f635i);
        fileInputStream.read(bArr, 0, bArr.length);
        fileInputStream.close();
        return bArr;
    }
}
