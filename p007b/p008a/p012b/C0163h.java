package p007b.p008a.p012b;

import java.util.Stack;
import p007b.C0287p;
import p007b.p008a.ar;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.b.h */
class C0163h extends aq {
    private static C0208c f976a;
    private C0180y f977b;
    private C0287p f978c;

    static {
        f976a = C0208c.m1493a(C0163h.class);
    }

    public C0163h(C0180y c0180y, C0287p c0287p) {
        this.f977b = c0180y;
        this.f978c = c0287p;
    }

    public C0163h(C0287p c0287p) {
        this.f978c = c0287p;
    }

    public int m1340a(byte[] bArr, int i) {
        int a = ar.m1148a(bArr[i], bArr[i + 1]);
        this.f977b = C0180y.m1378a(a);
        C0210a.m1506a(this.f977b != C0180y.dz, "function code " + a);
        return 2;
    }

    public void m1341a(StringBuffer stringBuffer) {
        stringBuffer.append(this.f977b.m1382a(this.f978c));
        stringBuffer.append('(');
        int c = this.f977b.m1384c();
        if (c > 0) {
            at[] f = m1181f();
            f[0].m1170a(stringBuffer);
            for (int i = 1; i < c; i++) {
                stringBuffer.append(',');
                f[i].m1170a(stringBuffer);
            }
        }
        stringBuffer.append(')');
    }

    public void m1342a(Stack stack) {
        at[] atVarArr = new at[this.f977b.m1384c()];
        for (int c = this.f977b.m1384c() - 1; c >= 0; c--) {
            atVarArr[c] = (at) stack.pop();
        }
        for (int i = 0; i < this.f977b.m1384c(); i++) {
            m1178a(atVarArr[i]);
        }
    }

    byte[] m1343c() {
        Object obj;
        at[] f = m1181f();
        Object obj2 = new byte[0];
        int i = 0;
        while (i < f.length) {
            Object c = f[i].m1172c();
            obj = new byte[(obj2.length + c.length)];
            System.arraycopy(obj2, 0, obj, 0, obj2.length);
            System.arraycopy(c, 0, obj, obj2.length, c.length);
            i++;
            obj2 = obj;
        }
        obj = new byte[(obj2.length + 3)];
        System.arraycopy(obj2, 0, obj, 0, obj2.length);
        obj[obj2.length] = !m1176j() ? bi.f890J.m1285a() : bi.f890J.m1287c();
        ar.m1150a(this.f977b.m1381a(), obj, obj2.length + 1);
        return obj;
    }

    int d_() {
        return 3;
    }
}
