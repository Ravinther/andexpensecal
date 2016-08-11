package p007b.p008a.p009a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.p008a.ar;
import p007b.p008a.ax;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.af */
class af extends C0126u {
    private static C0208c f498a;
    private byte[] f499b;
    private int f500c;
    private ArrayList f501d;

    static {
        f498a = C0208c.m1493a(af.class);
    }

    public af() {
        super(C0148y.f694l);
        this.f501d = new ArrayList();
        m920c(3);
    }

    public af(C0147x c0147x) {
        super(c0147x);
        this.f500c = m924j();
        m948b();
    }

    private void m948b() {
        this.f501d = new ArrayList();
        byte[] l = m926l();
        int i = 0;
        for (int i2 = 0; i2 < this.f500c; i2++) {
            int a = ar.m1148a(l[i], l[i + 1]);
            int i3 = a & 16383;
            int a2 = ar.m1149a(l[i + 2], l[i + 3], l[i + 4], l[i + 5]);
            i += 6;
            this.f501d.add(new ag(i3, (a & 16384) != 0, (a & 32768) != 0, a2));
        }
        Iterator it = this.f501d.iterator();
        while (it.hasNext()) {
            ag agVar = (ag) it.next();
            if (agVar.f504c) {
                agVar.f506e = ax.m1161a(l, agVar.f505d / 2, i);
                i += agVar.f505d;
            }
        }
    }

    ag m949a(int i) {
        Iterator it = this.f501d.iterator();
        Object obj = null;
        ag agVar = null;
        while (it.hasNext() && obj == null) {
            agVar = (ag) it.next();
            if (agVar.f502a == i) {
                obj = 1;
            }
        }
        return obj != null ? agVar : null;
    }

    void m950a(int i, boolean z, boolean z2, int i2) {
        this.f501d.add(new ag(i, z, z2, i2));
    }

    void m951a(int i, boolean z, boolean z2, int i2, String str) {
        this.f501d.add(new ag(i, z, z2, i2, str));
    }

    byte[] m952a() {
        this.f500c = this.f501d.size();
        m919b(this.f500c);
        this.f499b = new byte[(this.f500c * 6)];
        Iterator it = this.f501d.iterator();
        int i = 0;
        while (it.hasNext()) {
            ag agVar = (ag) it.next();
            int i2 = agVar.f502a & 16383;
            if (agVar.f503b) {
                i2 |= 16384;
            }
            if (agVar.f504c) {
                i2 |= 32768;
            }
            ar.m1150a(i2, this.f499b, i);
            ar.m1153b(agVar.f505d, this.f499b, i + 2);
            i += 6;
        }
        Iterator it2 = this.f501d.iterator();
        while (it2.hasNext()) {
            agVar = (ag) it2.next();
            if (agVar.f504c && agVar.f506e != null) {
                Object obj = new byte[(this.f499b.length + (agVar.f506e.length() * 2))];
                System.arraycopy(this.f499b, 0, obj, 0, this.f499b.length);
                ax.m1166b(agVar.f506e, obj, this.f499b.length);
                this.f499b = obj;
            }
        }
        return m918a(this.f499b);
    }
}
