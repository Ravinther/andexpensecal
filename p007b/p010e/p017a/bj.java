package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.C0150a;
import p007b.C0155l;
import p007b.C0233d;
import p007b.p008a.aw;
import p007b.p010e.C0236s;
import p007b.p010e.C0241q;
import p007b.p010e.C0264a;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.e.a.bj */
class bj {
    private static C0208c f1639a;
    private ArrayList f1640b;
    private C0241q f1641c;

    static {
        f1639a = C0208c.m1493a(bj.class);
    }

    public bj(C0241q c0241q) {
        this.f1640b = new ArrayList();
        this.f1641c = c0241q;
    }

    private void m1626b() {
        ArrayList arrayList = new ArrayList(this.f1640b.size());
        Iterator it = this.f1640b.iterator();
        while (it.hasNext()) {
            aw awVar = (aw) it.next();
            Iterator it2 = arrayList.iterator();
            Object obj = null;
            while (it2.hasNext() && obj == null) {
                if (((aw) it2.next()).m1158a(awVar)) {
                    f1639a.m1499b("Could not merge cells " + awVar + " as they clash with an existing set of merged cells.");
                    obj = 1;
                }
            }
            if (obj == null) {
                arrayList.add(awVar);
            }
        }
        this.f1640b = arrayList;
    }

    private void m1627c() {
        int i = 0;
        while (i < this.f1640b.size()) {
            try {
                aw awVar = (aw) this.f1640b.get(i);
                C0150a a = awVar.m1157a();
                C0150a b = awVar.m1159b();
                int b2 = a.m1086b();
                boolean z = false;
                while (b2 <= b.m1086b()) {
                    boolean z2 = z;
                    for (int e_ = a.e_(); e_ <= b.e_(); e_++) {
                        if (this.f1641c.m1729a(b2, e_).m1087c() != C0233d.f1525a) {
                            if (z2) {
                                f1639a.m1499b("Range " + awVar + " contains more than one data cell.  " + "Setting the other cells to blank.");
                                this.f1641c.m1735a(new C0264a(b2, e_));
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    b2++;
                    z = z2;
                }
                i++;
            } catch (C0236s e) {
                C0210a.m1505a(false);
                return;
            }
        }
    }

    void m1628a(al alVar) {
        if (this.f1640b.size() != 0) {
            if (!((dj) this.f1641c).m1757f().m1911f()) {
                m1626b();
                m1627c();
            }
            if (this.f1640b.size() < 1020) {
                alVar.m1568a(new bk(this.f1640b));
                return;
            }
            int size = (this.f1640b.size() / 1020) + 1;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int min = Math.min(1020, this.f1640b.size() - i);
                ArrayList arrayList = new ArrayList(min);
                for (int i3 = 0; i3 < min; i3++) {
                    arrayList.add(this.f1640b.get(i + i3));
                }
                alVar.m1568a(new bk(arrayList));
                i += min;
            }
        }
    }

    C0155l[] m1629a() {
        C0155l[] c0155lArr = new C0155l[this.f1640b.size()];
        for (int i = 0; i < c0155lArr.length; i++) {
            c0155lArr[i] = (C0155l) this.f1640b.get(i);
        }
        return c0155lArr;
    }
}
