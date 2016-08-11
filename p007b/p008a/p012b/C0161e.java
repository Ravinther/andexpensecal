package p007b.p008a.p012b;

import java.util.Stack;
import p007b.C0287p;
import p007b.p008a.ar;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.e */
class C0161e extends aq {
    private static C0208c f970a;
    private int f971b;
    private int f972c;
    private C0287p f973d;
    private bn f974e;

    static {
        f970a = C0208c.m1493a(C0161e.class);
    }

    public C0161e(bc bcVar, C0287p c0287p) {
        this.f973d = c0287p;
        if (bcVar.m1278a(this.f973d) == C0180y.f1053e) {
            this.f971b |= 16;
        } else if (bcVar.m1278a(this.f973d) == C0180y.dy) {
            this.f971b |= 2;
        }
    }

    public C0161e(C0287p c0287p) {
        this.f973d = c0287p;
    }

    private byte[] m1328l() {
        int length;
        at[] f = this.f974e.m1181f();
        int length2 = f.length;
        Object c = f[0].m1172c();
        int length3 = c.length;
        Object obj = new byte[(c.length + 4)];
        System.arraycopy(c, 0, obj, 0, c.length);
        obj[length3] = bi.f892L.m1285a();
        obj[length3 + 1] = 2;
        length3 += 2;
        c = f[1].m1172c();
        Object obj2 = new byte[(obj.length + c.length)];
        System.arraycopy(obj, 0, obj2, 0, obj.length);
        System.arraycopy(c, 0, obj2, obj.length, c.length);
        int length4 = obj2.length;
        c = new byte[(obj2.length + 4)];
        System.arraycopy(obj2, 0, c, 0, obj2.length);
        c[length4] = bi.f892L.m1285a();
        c[length4 + 1] = 8;
        length4 += 2;
        if (length2 > 2) {
            ar.m1150a((c.length - length3) - 2, c, length3);
            Object c2 = f[length2 - 1].m1172c();
            obj2 = new byte[(c.length + c2.length)];
            System.arraycopy(c, 0, obj2, 0, c.length);
            System.arraycopy(c2, 0, obj2, c.length, c2.length);
            length = obj2.length;
            c = new byte[(obj2.length + 4)];
            System.arraycopy(obj2, 0, c, 0, obj2.length);
            c[length] = bi.f892L.m1285a();
            c[length + 1] = 8;
            c[length + 2] = 3;
        }
        length = c.length;
        obj2 = new byte[(c.length + 4)];
        System.arraycopy(c, 0, obj2, 0, c.length);
        obj2[length] = bi.f891K.m1285a();
        obj2[length + 1] = (byte) length2;
        obj2[length + 2] = 1;
        obj2[length + 3] = null;
        int length5 = obj2.length - 1;
        if (length2 < 3) {
            ar.m1150a((length5 - length3) - 5, obj2, length3);
        }
        ar.m1150a((length5 - length4) - 2, obj2, length4);
        return obj2;
    }

    public int m1329a(byte[] bArr, int i) {
        this.f971b = bArr[i];
        this.f972c = ar.m1148a(bArr[i + 1], bArr[i + 2]);
        return !m1336d() ? 3 : ((this.f972c + 1) * 2) + 3;
    }

    void m1330a(bn bnVar) {
        this.f974e = bnVar;
        this.f971b |= 2;
    }

    public void m1331a(StringBuffer stringBuffer) {
        int i = 0;
        at[] f;
        if ((this.f971b & 16) != 0) {
            f = m1181f();
            stringBuffer.append(C0180y.f1053e.m1382a(this.f973d));
            stringBuffer.append('(');
            f[0].m1170a(stringBuffer);
            stringBuffer.append(')');
        } else if ((this.f971b & 2) != 0) {
            stringBuffer.append(C0180y.dy.m1382a(this.f973d));
            stringBuffer.append('(');
            f = this.f974e.m1181f();
            while (i < f.length - 1) {
                f[i].m1170a(stringBuffer);
                stringBuffer.append(',');
                i++;
            }
            f[f.length - 1].m1170a(stringBuffer);
            stringBuffer.append(')');
        }
    }

    public void m1332a(Stack stack) {
        if ((this.f971b & 16) != 0) {
            m1178a((at) stack.pop());
        } else if ((this.f971b & 2) != 0) {
            m1178a((at) stack.pop());
        }
    }

    public boolean m1333a() {
        return (this.f971b & 16) != 0;
    }

    public boolean m1334b() {
        return (this.f971b & 2) != 0;
    }

    byte[] m1335c() {
        Object obj = new byte[0];
        if (!m1333a()) {
            return m1334b() ? m1328l() : obj;
        } else {
            at[] f = m1181f();
            Object obj2 = obj;
            int length = f.length - 1;
            while (length >= 0) {
                Object c = f[length].m1172c();
                Object obj3 = new byte[(obj2.length + c.length)];
                System.arraycopy(obj2, 0, obj3, 0, obj2.length);
                System.arraycopy(c, 0, obj3, obj2.length, c.length);
                length--;
                obj2 = obj3;
            }
            obj = new byte[(obj2.length + 4)];
            System.arraycopy(obj2, 0, obj, 0, obj2.length);
            obj[obj2.length] = bi.f892L.m1285a();
            obj[obj2.length + 1] = (byte) 16;
            return obj;
        }
    }

    public boolean m1336d() {
        return (this.f971b & 4) != 0;
    }

    int d_() {
        return 3;
    }
}
