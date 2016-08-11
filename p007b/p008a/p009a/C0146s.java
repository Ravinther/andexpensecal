package p007b.p008a.p009a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p007b.p010e.p017a.al;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.a.s */
public class C0146s implements C0129z {
    private static C0208c f659a;
    private byte[] f660b;
    private C0123v f661c;
    private C0124a f662d;
    private boolean f663e;
    private ArrayList f664f;
    private int f665g;
    private int f666h;
    private int f667i;
    private boolean f668j;
    private ah f669k;
    private HashMap f670l;
    private int f671m;
    private int f672n;

    static {
        f659a = C0208c.m1493a(C0146s.class);
    }

    public C0146s(ah ahVar) {
        this.f669k = ahVar;
        this.f663e = ahVar == ah.f508b;
        this.f664f = new ArrayList();
        this.f670l = new HashMap();
        this.f668j = false;
        this.f671m = 1;
        this.f672n = 1024;
    }

    private void m1052c() {
        boolean z = false;
        C0147x c0147x = new C0147x(this, 0);
        C0210a.m1505a(c0147x.m1061a());
        this.f661c = new C0123v(c0147x);
        C0210a.m1505a(this.f661c.m921g() == this.f660b.length);
        if (this.f661c.m925k() == C0148y.f684b) {
            z = true;
        }
        C0210a.m1505a(z);
        this.f663e = true;
    }

    private C0124a m1053d() {
        if (this.f662d == null) {
            if (!this.f663e) {
                m1052c();
            }
            C0122w[] b = this.f661c.m931b();
            if (b.length > 1 && b[1].m925k() == C0148y.f685c) {
                this.f662d = (C0124a) b[1];
            }
        }
        return this.f662d;
    }

    public void m1054a(C0134t c0134t) {
        boolean z = false;
        if (this.f669k == ah.f507a) {
            this.f669k = ah.f509c;
            C0124a d = m1053d();
            this.f667i = (((C0139l) this.f661c.m931b()[0]).m1024a(1).f625a - this.f665g) - 1;
            this.f665g = d != null ? d.c_() : 0;
            if (d != null) {
                if (this.f665g == d.c_()) {
                    z = true;
                }
                C0210a.m1505a(z);
            }
        }
        if (c0134t instanceof C0142o) {
            C0142o c0142o = (C0142o) c0134t;
            C0142o c0142o2 = (C0142o) this.f670l.get(c0134t.m992e());
            if (c0142o2 == null) {
                this.f671m++;
                this.f672n++;
                this.f664f.add(c0142o);
                c0142o.m1032a(this);
                c0142o.m1031a(this.f671m, this.f665g + 1, this.f672n);
                this.f665g++;
                this.f670l.put(c0142o.m1038e(), c0142o);
                return;
            }
            c0142o2.m1030a(c0142o2.m1043j() + 1);
            c0142o.m1032a(this);
            c0142o.m1031a(c0142o2.m1029a(), c0142o2.m1042i(), c0142o2.m1041h());
            return;
        }
        this.f671m++;
        this.f672n++;
        c0134t.m986a(this);
        c0134t.m985a(this.f671m, this.f665g + 1, this.f672n);
        if (this.f664f.size() > this.f671m) {
            f659a.m1499b("drawings length " + this.f664f.size() + " exceeds the max object id " + this.f671m);
        }
    }

    public void m1055a(al alVar) {
        int i = 0;
        C0122w c0139l;
        if (this.f669k == ah.f508b) {
            C0141n c0141n = new C0141n();
            c0139l = new C0139l((this.f665g + this.f666h) + 1, this.f665g);
            c0139l.m1025a(1, 0);
            c0139l.m1025a(this.f665g + 1, 0);
            c0141n.m929a(c0139l);
            C0122w c0124a = new C0124a();
            Iterator it = this.f664f.iterator();
            while (it.hasNext()) {
                int i2;
                Object next = it.next();
                if (next instanceof C0142o) {
                    c0124a.m929a(new C0127b((C0142o) next));
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                i = i2;
            }
            if (i > 0) {
                c0124a.m932a(i);
                c0141n.m929a(c0124a);
            }
            c0141n.m929a(new af());
            c0141n.m929a(new ao());
            this.f660b = c0141n.m930a();
        } else if (this.f669k == ah.f509c) {
            C0141n c0141n2 = new C0141n();
            c0139l = new C0139l((this.f665g + this.f666h) + 1, this.f665g);
            c0139l.m1025a(1, 0);
            c0139l.m1025a((this.f667i + this.f665g) + 1, 0);
            c0141n2.m929a(c0139l);
            C0122w c0124a2 = new C0124a();
            c0124a2.m932a(this.f665g);
            C0124a d = m1053d();
            if (d != null) {
                C0122w[] b = d.m931b();
                for (C0122w c0139l2 : b) {
                    c0124a2.m929a((C0127b) c0139l2);
                }
            }
            Iterator it2 = this.f664f.iterator();
            while (it2.hasNext()) {
                C0134t c0134t = (C0134t) it2.next();
                if (c0134t instanceof C0142o) {
                    C0142o c0142o = (C0142o) c0134t;
                    if (c0142o.m1037d() == ah.f508b) {
                        c0124a2.m929a(new C0127b(c0142o));
                    }
                }
            }
            c0141n2.m929a(c0124a2);
            c0139l2 = new af();
            c0139l2.m950a(191, false, false, 524296);
            c0139l2.m950a(385, false, false, 134217737);
            c0139l2.m950a(448, false, false, 134217792);
            c0141n2.m929a(c0139l2);
            c0141n2.m929a(new ao());
            this.f660b = c0141n2.m930a();
        }
        alVar.m1568a(new aa(this.f660b));
    }

    public byte[] m1056a() {
        return this.f660b;
    }

    byte[] m1057a(int i) {
        boolean z = false;
        this.f665g = m1053d().c_();
        C0210a.m1505a(i <= this.f665g);
        if (this.f669k == ah.f507a || this.f669k == ah.f509c) {
            z = true;
        }
        C0210a.m1505a(z);
        return ((C0127b) m1053d().m931b()[i - 1]).m966b();
    }

    public boolean m1058b() {
        return this.f668j;
    }
}
