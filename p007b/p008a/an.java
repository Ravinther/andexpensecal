package p007b.p008a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p007b.p010e.p017a.al;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.an */
public class an {
    private static C0208c f746a;
    private HashMap f747b;
    private ArrayList f748c;
    private ArrayList f749d;
    private int f750e;
    private aj f751f;
    private au f752g;

    static {
        f746a = C0208c.m1493a(an.class);
    }

    public an(aj ajVar) {
        this.f749d = new ArrayList(10);
        this.f747b = new HashMap(10);
        this.f748c = new ArrayList(10);
        this.f751f = ajVar;
        this.f750e = 164;
    }

    protected final aj m1134a() {
        return this.f751f;
    }

    ak m1135a(int i) {
        return (ak) this.f747b.get(new Integer(i));
    }

    public aq m1136a(aq aqVar, aq aqVar2) {
        Iterator it = this.f749d.iterator();
        while (it.hasNext()) {
            bf bfVar = (bf) it.next();
            if (bfVar.m1411d() >= 164) {
                bfVar.m1407b(aqVar2.m1146a(bfVar.m1411d()));
            }
            bfVar.m1410c(aqVar.m1146a(bfVar.m1420n()));
        }
        ArrayList arrayList = new ArrayList(21);
        aq aqVar3 = new aq(this.f749d.size());
        int min = Math.min(21, this.f749d.size());
        for (int i = 0; i < min; i++) {
            arrayList.add(this.f749d.get(i));
            aqVar3.m1147a(i, i);
        }
        if (min < 21) {
            f746a.m1499b((Object) "There are less than the expected minimum number of XF records");
            return aqVar3;
        }
        min = 21;
        int i2 = 0;
        while (min < this.f749d.size()) {
            bfVar = (bf) this.f749d.get(min);
            Iterator it2 = arrayList.iterator();
            Object obj = null;
            int i3 = i2;
            while (it2.hasNext() && obj == null) {
                Object obj2;
                bf bfVar2 = (bf) it2.next();
                if (bfVar2.equals(bfVar)) {
                    aqVar3.m1147a(min, aqVar3.m1146a(bfVar2.m1416j()));
                    i3++;
                    obj2 = 1;
                } else {
                    obj2 = obj;
                }
                obj = obj2;
            }
            if (obj == null) {
                arrayList.add(bfVar);
                aqVar3.m1147a(min, min - i3);
            }
            min++;
            i2 = i3;
        }
        Iterator it3 = this.f749d.iterator();
        while (it3.hasNext()) {
            ((bf) it3.next()).m1401a(aqVar3);
        }
        this.f749d = arrayList;
        return aqVar3;
    }

    public final void m1137a(ab abVar) {
        if (abVar.b_() && abVar.a_() >= 441) {
            f746a.m1499b((Object) "Format index exceeds Excel maximum - assigning custom number");
            abVar.m1082a(this.f750e);
            this.f750e++;
        }
        if (!abVar.b_()) {
            abVar.m1082a(this.f750e);
            this.f750e++;
        }
        if (this.f750e > 441) {
            this.f750e = 441;
            throw new at();
        }
        if (abVar.a_() >= this.f750e) {
            this.f750e = abVar.a_() + 1;
        }
        if (!abVar.m1083c()) {
            this.f748c.add(abVar);
            this.f747b.put(new Integer(abVar.a_()), abVar);
        }
    }

    public final void m1138a(bf bfVar) {
        if (!bfVar.m1417k()) {
            bfVar.m1399a(this.f749d.size(), this, this.f751f);
            this.f749d.add(bfVar);
        } else if (bfVar.m1416j() >= this.f749d.size()) {
            this.f749d.add(bfVar);
        }
    }

    public void m1139a(al alVar) {
        Iterator it = this.f748c.iterator();
        while (it.hasNext()) {
            alVar.m1568a((ak) it.next());
        }
        it = this.f749d.iterator();
        while (it.hasNext()) {
            alVar.m1568a((bf) it.next());
        }
        alVar.m1568a(new C0191j(16, 3));
        alVar.m1568a(new C0191j(17, 6));
        alVar.m1568a(new C0191j(18, 4));
        alVar.m1568a(new C0191j(19, 7));
        alVar.m1568a(new C0191j(0, 0));
        alVar.m1568a(new C0191j(20, 5));
    }

    public aq m1140b() {
        return this.f751f.m1126a();
    }

    public aq m1141c() {
        ArrayList arrayList = new ArrayList();
        aq aqVar = new aq(this.f750e);
        Iterator it = this.f748c.iterator();
        int i = 0;
        while (it.hasNext()) {
            ab abVar = (ab) it.next();
            C0210a.m1505a(!abVar.m1083c());
            Iterator it2 = arrayList.iterator();
            int i2 = i;
            Object obj = null;
            while (it2.hasNext() && obj == null) {
                ab abVar2 = (ab) it2.next();
                if (abVar2.equals(abVar)) {
                    aqVar.m1147a(abVar.a_(), aqVar.m1146a(abVar2.a_()));
                    obj = 1;
                    i2++;
                }
            }
            if (obj == null) {
                arrayList.add(abVar);
                if (abVar.a_() - i2 > 441) {
                    f746a.m1499b((Object) "Too many number formats - using default format.");
                }
                aqVar.m1147a(abVar.a_(), abVar.a_() - i2);
            }
            i = i2;
        }
        this.f748c = arrayList;
        Iterator it3 = this.f748c.iterator();
        while (it3.hasNext()) {
            abVar2 = (ab) it3.next();
            abVar2.m1082a(aqVar.m1146a(abVar2.a_()));
        }
        return aqVar;
    }

    public au m1142d() {
        return this.f752g;
    }
}
