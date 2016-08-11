package p007b.p008a.p009a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.v */
class C0123v extends C0122w {
    private static C0208c f449a;
    private boolean f450b;
    private ArrayList f451c;

    static {
        f449a = C0208c.m1493a(C0123v.class);
    }

    public C0123v(C0147x c0147x) {
        super(c0147x);
        this.f450b = false;
        this.f451c = new ArrayList();
    }

    protected C0123v(C0148y c0148y) {
        super(c0148y);
        m916a(true);
        this.f451c = new ArrayList();
    }

    private void m928c() {
        int i = m923i() + 8;
        int min = Math.min(m923i() + m921g(), m927m());
        C0122w c0139l;
        for (int i2 = i; i2 < min; i2 = c0139l.m921g() + i2) {
            C0147x c0147x = new C0147x(m922h(), i2);
            C0148y d = c0147x.m1066d();
            c0139l = d == C0148y.f689g ? new C0139l(c0147x) : d == C0148y.f691i ? new C0137j(c0147x) : d == C0148y.f685c ? new C0124a(c0147x) : d == C0148y.f687e ? new an(c0147x) : d == C0148y.f688f ? new al(c0147x) : d == C0148y.f692j ? new am(c0147x) : d == C0148y.f693k ? new ak(c0147x) : d == C0148y.f695m ? new C0131e(c0147x) : d == C0148y.f696n ? new C0132f(c0147x) : d == C0148y.f690h ? new C0127b(c0147x) : d == C0148y.f694l ? new af(c0147x) : d == C0148y.f698p ? new ao(c0147x) : d == C0148y.f697o ? new C0133g(c0147x) : new C0126u(c0147x);
            this.f451c.add(c0139l);
        }
        this.f450b = true;
    }

    public void m929a(C0122w c0122w) {
        this.f451c.add(c0122w);
    }

    byte[] m930a() {
        if (!this.f450b) {
            m928c();
        }
        Object obj = new byte[0];
        Iterator it = this.f451c.iterator();
        Object obj2 = obj;
        while (it.hasNext()) {
            Object a = ((C0122w) it.next()).m917a();
            if (a != null) {
                obj = new byte[(obj2.length + a.length)];
                System.arraycopy(obj2, 0, obj, 0, obj2.length);
                System.arraycopy(a, 0, obj, obj2.length, a.length);
            } else {
                obj = obj2;
            }
            obj2 = obj;
        }
        return m918a((byte[]) obj2);
    }

    public C0122w[] m931b() {
        if (!this.f450b) {
            m928c();
        }
        return (C0122w[]) this.f451c.toArray(new C0122w[this.f451c.size()]);
    }
}
