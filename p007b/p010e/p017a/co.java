package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p007b.p008a.C0125l;

/* renamed from: b.e.a.co */
class co {
    private HashMap f1745a;
    private ArrayList f1746b;
    private int f1747c;

    public co() {
        this.f1745a = new HashMap(100);
        this.f1746b = new ArrayList(100);
        this.f1747c = 0;
    }

    private ch m1675a(String str, int i, al alVar) {
        ch chVar = null;
        while (i != 0) {
            chVar = new ch();
            i = (i == str.length() || str.length() == 0) ? chVar.m1665a(str, true) : chVar.m1665a(str.substring(str.length() - i), false);
            if (i != 0) {
                alVar.m1568a((C0125l) chVar);
                chVar = new ch();
            }
        }
        return chVar;
    }

    public int m1676a(String str) {
        Integer num = (Integer) this.f1745a.get(str);
        if (num == null) {
            num = new Integer(this.f1745a.size());
            this.f1745a.put(str, num);
            this.f1746b.add(str);
        }
        this.f1747c++;
        return num.intValue();
    }

    public String m1677a(int i) {
        return (String) this.f1746b.get(i);
    }

    public void m1678a(al alVar) {
        C0125l ciVar = new ci(this.f1747c, this.f1746b.size());
        C0125l ahVar = new ah(this.f1746b.size());
        int d = ahVar.m1558d();
        Iterator it = this.f1746b.iterator();
        int i = 0;
        int i2 = 0;
        String str = null;
        while (it.hasNext() && i == 0) {
            str = (String) it.next();
            int c = ciVar.m1670c() + 4;
            i = ciVar.m1668a(str);
            if (i2 % d == 0) {
                ahVar.m1555a(alVar.m1567a(), c);
            }
            i2++;
        }
        alVar.m1568a(ciVar);
        if (i != 0 || it.hasNext()) {
            ch a = m1675a(str, i, alVar);
            i = i2;
            C0125l c0125l = a;
            while (it.hasNext()) {
                str = (String) it.next();
                int c2 = c0125l.m1667c() + 4;
                c = c0125l.m1664a(str);
                if (i % d == 0) {
                    ahVar.m1555a(alVar.m1567a(), c2);
                }
                i++;
                if (c != 0) {
                    alVar.m1568a(c0125l);
                    a = m1675a(str, c, alVar);
                } else {
                    C0125l c0125l2 = c0125l;
                }
                Object obj = a;
            }
            alVar.m1568a(c0125l);
        }
        alVar.m1568a(ahVar);
    }
}
