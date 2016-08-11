package p007b.p008a.p012b;

import p007b.p008a.C0193m;
import p007b.p008a.ar;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.b.c */
class C0159c extends ap {
    private static C0208c f959a;
    private int f960b;
    private int f961c;
    private int f962d;
    private int f963e;
    private int f964f;
    private boolean f965g;
    private boolean f966h;
    private boolean f967i;
    private boolean f968j;
    private C0175t f969k;

    static {
        f959a = C0208c.m1493a(C0159c.class);
    }

    C0159c(C0175t c0175t) {
        this.f969k = c0175t;
    }

    C0159c(String str, C0175t c0175t) {
        this.f969k = c0175t;
        int lastIndexOf = str.lastIndexOf(":");
        C0210a.m1505a(lastIndexOf != -1);
        String substring = str.substring(lastIndexOf + 1);
        int indexOf = str.indexOf(33);
        String substring2 = str.substring(indexOf + 1, lastIndexOf);
        this.f961c = C0193m.m1450a(substring2);
        this.f962d = C0193m.m1457b(substring2);
        String substring3 = str.substring(0, indexOf);
        if (substring3.charAt(0) == '\'' && substring3.charAt(substring3.length() - 1) == '\'') {
            substring3 = substring3.substring(1, substring3.length() - 1);
        }
        this.f960b = c0175t.m1368b(substring3);
        if (this.f960b < 0) {
            throw new C0177v(C0177v.f1017f, substring3);
        }
        this.f963e = C0193m.m1450a(substring);
        this.f964f = C0193m.m1457b(substring);
        this.f965g = true;
        this.f966h = true;
        this.f967i = true;
        this.f968j = true;
    }

    int m1322a() {
        return this.f961c;
    }

    public int m1323a(byte[] bArr, int i) {
        boolean z = true;
        this.f960b = ar.m1148a(bArr[i], bArr[i + 1]);
        this.f962d = ar.m1148a(bArr[i + 2], bArr[i + 3]);
        this.f964f = ar.m1148a(bArr[i + 4], bArr[i + 5]);
        int a = ar.m1148a(bArr[i + 6], bArr[i + 7]);
        this.f961c = a & 255;
        this.f965g = (a & 16384) != 0;
        this.f966h = (a & 32768) != 0;
        a = ar.m1148a(bArr[i + 8], bArr[i + 9]);
        this.f963e = a & 255;
        this.f967i = (a & 16384) != 0;
        if ((a & 32768) == 0) {
            z = false;
        }
        this.f968j = z;
        return 10;
    }

    protected void m1324a(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f960b = i;
        this.f961c = i2;
        this.f963e = i3;
        this.f962d = i4;
        this.f964f = i5;
        this.f965g = z;
        this.f967i = z2;
        this.f966h = z3;
        this.f968j = z4;
    }

    public void m1325a(StringBuffer stringBuffer) {
        C0193m.m1452a(this.f960b, this.f961c, this.f962d, this.f969k, stringBuffer);
        stringBuffer.append(':');
        C0193m.m1453a(this.f963e, this.f964f, stringBuffer);
    }

    int m1326b() {
        return this.f963e;
    }

    byte[] m1327c() {
        byte[] bArr = new byte[11];
        bArr[0] = bi.f911q.m1285a();
        ar.m1150a(this.f960b, bArr, 1);
        ar.m1150a(this.f962d, bArr, 3);
        ar.m1150a(this.f964f, bArr, 5);
        int i = this.f961c;
        if (this.f966h) {
            i |= 32768;
        }
        if (this.f965g) {
            i |= 16384;
        }
        ar.m1150a(i, bArr, 7);
        i = this.f963e;
        if (this.f968j) {
            i |= 32768;
        }
        if (this.f967i) {
            i |= 16384;
        }
        ar.m1150a(i, bArr, 9);
        return bArr;
    }
}
