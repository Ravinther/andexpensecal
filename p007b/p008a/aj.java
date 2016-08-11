package p007b.p008a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.p010e.p017a.al;
import p007b.p013b.C0210a;

/* renamed from: b.a.aj */
public class aj {
    private ArrayList f735a;

    public aj() {
        this.f735a = new ArrayList();
    }

    public ag m1125a(int i) {
        if (i > 4) {
            i--;
        }
        return (ag) this.f735a.get(i);
    }

    aq m1126a() {
        aq aqVar = new aq(this.f735a.size() + 1);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            ag agVar = (ag) this.f735a.get(i);
            arrayList.add(agVar);
            aqVar.m1147a(agVar.m1116e(), agVar.m1116e());
        }
        int i2 = 4;
        int i3 = 0;
        while (i2 < this.f735a.size()) {
            ag agVar2 = (ag) this.f735a.get(i2);
            Iterator it = arrayList.iterator();
            int i4 = i3;
            Object obj = null;
            while (it.hasNext() && obj == null) {
                agVar = (ag) it.next();
                if (agVar2.equals(agVar)) {
                    aqVar.m1147a(agVar2.m1116e(), aqVar.m1146a(agVar.m1116e()));
                    obj = 1;
                    i4++;
                }
            }
            if (obj == null) {
                arrayList.add(agVar2);
                i3 = agVar2.m1116e() - i4;
                C0210a.m1505a(i3 > 4);
                aqVar.m1147a(agVar2.m1116e(), i3);
            }
            i2++;
            i3 = i4;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            agVar = (ag) it2.next();
            agVar.m1112a(aqVar.m1146a(agVar.m1116e()));
        }
        this.f735a = arrayList;
        return aqVar;
    }

    public void m1127a(ag agVar) {
        if (!agVar.m1114c()) {
            int size = this.f735a.size();
            if (size >= 4) {
                size++;
            }
            agVar.m1112a(size);
            this.f735a.add(agVar);
        }
    }

    public void m1128a(al alVar) {
        Iterator it = this.f735a.iterator();
        while (it.hasNext()) {
            alVar.m1568a((ag) it.next());
        }
    }
}
