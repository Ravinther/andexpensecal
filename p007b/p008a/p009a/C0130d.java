package p007b.p008a.p009a;

import p007b.p008a.C0125l;
import p007b.p008a.aq;
import p007b.p008a.ar;
import p007b.p008a.ay;
import p007b.p013b.C0208c;
import p007b.p015d.p016a.C0231e;

/* renamed from: b.a.a.d */
public class C0130d implements C0129z, C0125l {
    private static final C0208c f551a;
    private ab f552b;
    private ad f553c;
    private int f554d;
    private int f555e;
    private C0231e f556f;
    private C0144q f557g;
    private int f558h;
    private byte[] f559i;
    private boolean f560j;

    static {
        f551a = C0208c.m1493a(C0130d.class);
    }

    private void m970e() {
        this.f559i = this.f556f.m1541a(this.f554d, this.f555e - this.f554d);
        this.f560j = true;
    }

    public void m971a(aq aqVar, aq aqVar2, aq aqVar3) {
        if (!this.f560j) {
            m970e();
        }
        int i = 0;
        while (i < this.f559i.length) {
            int a = ar.m1148a(this.f559i[i], this.f559i[i + 1]);
            int a2 = ar.m1148a(this.f559i[i + 2], this.f559i[i + 3]);
            ay a3 = ay.m1168a(a);
            if (a3 == ay.bi) {
                ar.m1150a(aqVar2.m1146a(ar.m1148a(this.f559i[i + 4], this.f559i[i + 5])), this.f559i, i + 4);
            } else if (a3 == ay.bk) {
                ar.m1150a(aqVar2.m1146a(ar.m1148a(this.f559i[i + 12], this.f559i[i + 13])), this.f559i, i + 12);
            } else if (a3 == ay.bj) {
                ar.m1150a(aqVar3.m1146a(ar.m1148a(this.f559i[i + 4], this.f559i[i + 5])), this.f559i, i + 4);
            } else if (a3 == ay.bl) {
                int a4 = ar.m1148a(this.f559i[i + 4], this.f559i[i + 5]);
                int i2 = i + 6;
                for (a = 0; a < a4; a++) {
                    ar.m1150a(aqVar2.m1146a(ar.m1148a(this.f559i[i2 + 2], this.f559i[i2 + 3])), this.f559i, i2 + 2);
                    i2 += 4;
                }
            }
            i += a2 + 4;
        }
    }

    public byte[] m972a() {
        return this.f552b.g_().m1542a();
    }

    C0123v m973b() {
        return this.f557g.m1050a(this.f558h);
    }

    ab m974c() {
        return this.f552b;
    }

    ad m975d() {
        return this.f553c;
    }

    public byte[] m976g() {
        if (!this.f560j) {
            m970e();
        }
        return this.f559i;
    }
}
