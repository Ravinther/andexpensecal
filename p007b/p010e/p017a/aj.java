package p007b.p010e.p017a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p008a.bd;

/* renamed from: b.e.a.aj */
class aj extends bd {
    private ArrayList f1556a;

    public aj() {
        super(ay.f800f);
        this.f1556a = new ArrayList();
    }

    public int m1560a(int i) {
        return ((ak) this.f1556a.get(i)).f1557a;
    }

    int m1561a(int i, int i2) {
        Iterator it = this.f1556a.iterator();
        int i3 = 0;
        Object obj = null;
        while (it.hasNext() && obj == null) {
            ak akVar = (ak) it.next();
            if (akVar.f1557a == i && akVar.f1558b == i2) {
                obj = 1;
            } else {
                i3++;
            }
        }
        if (obj != null) {
            return i3;
        }
        this.f1556a.add(new ak(i, i2, i2));
        return this.f1556a.size() - 1;
    }

    public byte[] m1562a() {
        byte[] bArr = new byte[((this.f1556a.size() * 6) + 2)];
        ar.m1150a(this.f1556a.size(), bArr, 0);
        Iterator it = this.f1556a.iterator();
        int i = 2;
        while (it.hasNext()) {
            ak akVar = (ak) it.next();
            ar.m1150a(akVar.f1557a, bArr, i);
            ar.m1150a(akVar.f1558b, bArr, i + 2);
            ar.m1150a(akVar.f1559c, bArr, i + 4);
            i += 6;
        }
        return bArr;
    }

    public int m1563b(int i) {
        return ((ak) this.f1556a.get(i)).f1558b;
    }

    void m1564c(int i) {
        Iterator it = this.f1556a.iterator();
        while (it.hasNext()) {
            ((ak) it.next()).m1565a(i);
        }
    }
}
