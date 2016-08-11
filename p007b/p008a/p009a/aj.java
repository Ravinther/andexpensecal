package p007b.p008a.p009a;

import java.util.ArrayList;
import java.util.Iterator;
import p007b.C0287p;
import p007b.p008a.C0125l;
import p007b.p008a.ar;
import p007b.p010e.p017a.al;
import p007b.p013b.C0208c;

/* renamed from: b.a.a.aj */
public class aj {
    private static C0208c f517a;
    private ArrayList f518b;
    private boolean f519c;
    private C0130d[] f520d;

    static {
        f517a = C0208c.m1493a(aj.class);
    }

    public aj(C0287p c0287p) {
        this.f520d = new C0130d[0];
    }

    private void m955b(al alVar) {
        if (this.f520d.length != 0 || this.f518b.size() != 0) {
            Iterator it;
            C0134t c0134t;
            if (this.f520d.length == 0 && this.f518b.size() != 0) {
                it = this.f518b.iterator();
                while (it.hasNext()) {
                    c0134t = (C0134t) it.next();
                    alVar.m1568a(c0134t.m988b());
                    c0134t.m987a(alVar);
                }
                it = this.f518b.iterator();
                while (it.hasNext()) {
                    ((C0134t) it.next()).m989b(alVar);
                }
            } else if (this.f518b.size() != 0 || this.f520d.length == 0) {
                byte[] bArr;
                Object obj;
                int size = this.f518b.size();
                int i = 0;
                C0123v[] c0123vArr = new C0123v[(this.f520d.length + size)];
                boolean[] zArr = new boolean[(this.f520d.length + size)];
                for (int i2 = 0; i2 < size; i2++) {
                    c0134t = (C0134t) this.f518b.get(i2);
                    c0123vArr[i2] = c0134t.m990c();
                    if (i2 > 0) {
                        i += c0123vArr[i2].m921g();
                    }
                    if (c0134t.m994g()) {
                        zArr[i2] = true;
                    }
                }
                for (r0 = 0; r0 < this.f520d.length; r0++) {
                    c0123vArr[r0 + size] = this.f520d[r0].m973b();
                    i += c0123vArr[r0 + size].m921g();
                }
                C0138k c0138k = new C0138k();
                c0138k.m929a(new C0137j(this.f520d.length + size));
                C0122w anVar = new an();
                C0122w alVar2 = new al();
                alVar2.m929a(new am());
                alVar2.m929a(new ak(ai.f510a, 1024, 5));
                anVar.m929a(alVar2);
                anVar.m929a(c0123vArr[0]);
                c0138k.m929a(anVar);
                Object a = c0138k.m930a();
                ar.m1153b(ar.m1149a(a[4], a[5], a[6], a[7]) + i, a, 4);
                ar.m1153b(ar.m1149a(a[28], a[29], a[30], a[31]) + i, a, 28);
                if (zArr[0]) {
                    bArr = new byte[(a.length - 8)];
                    System.arraycopy(a, 0, bArr, 0, bArr.length);
                } else {
                    obj = a;
                }
                alVar.m1568a(new ab(bArr));
                ((C0134t) this.f518b.get(0)).m987a(alVar);
                for (i = 1; i < c0123vArr.length; i++) {
                    a = c0123vArr[i].m918a(c0123vArr[i].m926l());
                    if (zArr[i]) {
                        bArr = new byte[(a.length - 8)];
                        System.arraycopy(a, 0, bArr, 0, bArr.length);
                    } else {
                        obj = a;
                    }
                    alVar.m1568a(new ab(bArr));
                    if (i < size) {
                        ((C0134t) this.f518b.get(i)).m987a(alVar);
                    } else {
                        C0125l c0125l = this.f520d[i - size];
                        alVar.m1568a(c0125l.m975d());
                        alVar.m1568a(c0125l);
                    }
                }
                it = this.f518b.iterator();
                while (it.hasNext()) {
                    ((C0134t) it.next()).m989b(alVar);
                }
            } else {
                for (C0125l c0125l2 : this.f520d) {
                    if (c0125l2.m974c() != null) {
                        alVar.m1568a(c0125l2.m974c());
                    }
                    if (c0125l2.m975d() != null) {
                        alVar.m1568a(c0125l2.m975d());
                    }
                    alVar.m1568a(c0125l2);
                }
            }
        }
    }

    public void m956a(al alVar) {
        if (this.f518b.size() != 0 || this.f520d.length != 0) {
            boolean z = this.f519c;
            int size = this.f518b.size();
            Iterator it = this.f518b.iterator();
            boolean z2 = z;
            while (it.hasNext() && !z2) {
                z2 = ((C0134t) it.next()).m991d() != ah.f507a ? true : z2;
            }
            z = (size <= 0 || z2 || ((C0134t) this.f518b.get(0)).m993f()) ? z2 : true;
            if (size == 0 && this.f520d.length == 1 && this.f520d[0].m974c() == null) {
                z = false;
            }
            if (z) {
                byte[] a;
                C0122w b;
                byte[] bArr;
                C0125l c0125l;
                Object[] objArr = new Object[(this.f520d.length + size)];
                int i = 0;
                C0122w c0122w = null;
                int i2 = 0;
                while (i2 < size) {
                    int i3;
                    C0122w c = ((C0134t) this.f518b.get(i2)).m990c();
                    if (c != null) {
                        a = c.m930a();
                        objArr[i2] = a;
                        if (i2 == 0) {
                            i3 = i;
                        } else {
                            C0122w c0122w2 = c0122w;
                            i3 = a.length + i;
                            c = c0122w2;
                        }
                    } else {
                        c = c0122w;
                        i3 = i;
                    }
                    i2++;
                    i = i3;
                    c0122w = c;
                }
                for (int i4 = 0; i4 < this.f520d.length; i4++) {
                    b = this.f520d[i4].m973b();
                    a = b.m918a(b.m926l());
                    objArr[i4 + size] = a;
                    if (i4 == 0 && size == 0) {
                        c0122w = b;
                    } else {
                        i += a.length;
                    }
                }
                C0138k c0138k = new C0138k();
                c0138k.m929a(new C0137j(this.f520d.length + size));
                b = new an();
                C0122w alVar2 = new al();
                alVar2.m929a(new am());
                alVar2.m929a(new ak(ai.f510a, 1024, 5));
                b.m929a(alVar2);
                b.m929a(c0122w);
                c0138k.m929a(b);
                Object a2 = c0138k.m930a();
                ar.m1153b(ar.m1149a(a2[4], a2[5], a2[6], a2[7]) + i, a2, 4);
                ar.m1153b(ar.m1149a(a2[28], a2[29], a2[30], a2[31]) + i, a2, 28);
                if (size <= 0 || !((C0134t) this.f518b.get(0)).m994g()) {
                    Object obj = a2;
                } else {
                    bArr = new byte[(a2.length - 8)];
                    System.arraycopy(a2, 0, bArr, 0, bArr.length);
                }
                alVar.m1568a(new ab(bArr));
                if (size > 0) {
                    ((C0134t) this.f518b.get(0)).m987a(alVar);
                } else {
                    c0125l = this.f520d[0];
                    alVar.m1568a(c0125l.m975d());
                    alVar.m1568a(c0125l);
                }
                i = 1;
                while (i < objArr.length) {
                    bArr = (byte[]) objArr[i];
                    if (i < size && ((C0134t) this.f518b.get(i)).m994g()) {
                        a2 = new byte[(bArr.length - 8)];
                        System.arraycopy(bArr, 0, a2, 0, a2.length);
                        bArr = a2;
                    }
                    alVar.m1568a(new ab(bArr));
                    if (i < size) {
                        ((C0134t) this.f518b.get(i)).m987a(alVar);
                    } else {
                        c0125l = this.f520d[i - size];
                        alVar.m1568a(c0125l.m975d());
                        alVar.m1568a(c0125l);
                    }
                    i++;
                }
                Iterator it2 = this.f518b.iterator();
                while (it2.hasNext()) {
                    ((C0134t) it2.next()).m989b(alVar);
                }
                return;
            }
            m955b(alVar);
        }
    }

    public void m957a(ArrayList arrayList, boolean z) {
        this.f518b = arrayList;
        this.f519c = z;
    }

    public C0130d[] m958a() {
        return this.f520d;
    }
}
