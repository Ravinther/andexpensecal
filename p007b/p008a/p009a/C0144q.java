package p007b.p008a.p009a;

import java.util.ArrayList;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.a.q */
public class C0144q implements C0129z {
    private static C0208c f653a;
    private byte[] f654b;
    private int f655c;
    private boolean f656d;
    private C0122w[] f657e;

    static {
        f653a = C0208c.m1493a(C0144q.class);
    }

    public C0144q() {
        this.f655c = 0;
        this.f654b = null;
        this.f656d = false;
    }

    private void m1048a(C0123v c0123v, ArrayList arrayList) {
        C0122w[] b = c0123v.m931b();
        for (int i = 0; i < b.length; i++) {
            if (b[i].m925k() == C0148y.f688f) {
                arrayList.add(b[i]);
            } else if (b[i].m925k() == C0148y.f687e) {
                m1048a((C0123v) b[i], arrayList);
            } else {
                f653a.m1499b((Object) "Spgr Containers contains a record other than Sp/Spgr containers");
            }
        }
    }

    private void m1049b() {
        int i = 0;
        C0147x c0147x = new C0147x(this, 0);
        C0210a.m1505a(c0147x.m1061a());
        C0123v c0123v = new C0123v(c0147x);
        c0123v.m931b();
        C0122w[] b = c0123v.m931b();
        c0123v = null;
        int i2 = 0;
        while (i2 < b.length && c0123v == null) {
            C0122w c0122w = b[i2];
            i2++;
            c0123v = c0122w.m925k() == C0148y.f687e ? (C0123v) c0122w : c0123v;
        }
        C0210a.m1505a(c0123v != null);
        C0122w[] b2 = c0123v.m931b();
        int i3 = 0;
        while (i < b2.length && i3 == 0) {
            if (b2[i].m925k() == C0148y.f687e) {
                i3 = true;
            }
            i++;
        }
        if (i3 == 0) {
            this.f657e = b2;
        } else {
            ArrayList arrayList = new ArrayList();
            m1048a(c0123v, arrayList);
            this.f657e = new C0122w[arrayList.size()];
            this.f657e = (C0122w[]) arrayList.toArray(this.f657e);
        }
        this.f656d = true;
    }

    C0123v m1050a(int i) {
        if (!this.f656d) {
            m1049b();
        }
        if (i + 1 >= this.f657e.length) {
            throw new C0145r();
        }
        C0123v c0123v = (C0123v) this.f657e[i + 1];
        C0210a.m1505a(c0123v != null);
        return c0123v;
    }

    public byte[] m1051a() {
        return this.f654b;
    }
}
