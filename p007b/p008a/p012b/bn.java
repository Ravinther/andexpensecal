package p007b.p008a.p012b;

import java.util.Stack;
import p007b.C0287p;
import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.bn */
class bn extends aq {
    private static C0208c f932a;
    private C0180y f933b;
    private int f934c;
    private boolean f935d;
    private C0287p f936e;

    static {
        f932a = C0208c.m1493a(bn.class);
    }

    public bn(C0180y c0180y, int i, C0287p c0287p) {
        this.f933b = c0180y;
        this.f934c = i;
        this.f935d = false;
        this.f936e = c0287p;
    }

    public bn(C0287p c0287p) {
        this.f935d = true;
        this.f936e = c0287p;
    }

    private void m1299b() {
        if (this.f933b == C0180y.bO) {
            at[] f = m1181f();
            for (int length = f.length - 1; length >= 0; length--) {
                if (f[length] instanceof C0158b) {
                    f[length].m1175i();
                }
            }
        }
    }

    public int m1300a(byte[] bArr, int i) {
        this.f934c = bArr[i];
        int a = ar.m1148a(bArr[i + 1], bArr[i + 2]);
        this.f933b = C0180y.m1378a(a);
        if (this.f933b != C0180y.dz) {
            return 3;
        }
        throw new C0177v(C0177v.f1013b, a);
    }

    C0180y m1301a() {
        return this.f933b;
    }

    public void m1302a(StringBuffer stringBuffer) {
        stringBuffer.append(this.f933b.m1382a(this.f936e));
        stringBuffer.append('(');
        if (this.f934c > 0) {
            at[] f = m1181f();
            int i;
            if (this.f935d) {
                f[0].m1170a(stringBuffer);
                for (i = 1; i < this.f934c; i++) {
                    stringBuffer.append(',');
                    f[i].m1170a(stringBuffer);
                }
            } else {
                f[this.f934c - 1].m1170a(stringBuffer);
                for (i = this.f934c - 2; i >= 0; i--) {
                    stringBuffer.append(',');
                    f[i].m1170a(stringBuffer);
                }
            }
        }
        stringBuffer.append(')');
    }

    public void m1303a(Stack stack) {
        at[] atVarArr = new at[this.f934c];
        for (int i = this.f934c - 1; i >= 0; i--) {
            atVarArr[i] = (at) stack.pop();
        }
        for (int i2 = 0; i2 < this.f934c; i2++) {
            m1178a(atVarArr[i2]);
        }
    }

    byte[] m1304c() {
        Object obj;
        m1299b();
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
        obj = new byte[(obj2.length + 4)];
        System.arraycopy(obj2, 0, obj, 0, obj2.length);
        obj[obj2.length] = !m1176j() ? bi.f891K.m1285a() : bi.f891K.m1287c();
        obj[obj2.length + 1] = (byte) this.f934c;
        ar.m1150a(this.f933b.m1381a(), obj, obj2.length + 2);
        return obj;
    }

    int d_() {
        return 3;
    }
}
