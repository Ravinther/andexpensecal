package p007b.p008a.p012b;

import java.util.Stack;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.f */
abstract class C0156f extends aq {
    private static final C0208c f829a;

    static {
        f829a = C0208c.m1493a(C0156f.class);
    }

    public int m1182a(byte[] bArr, int i) {
        return 0;
    }

    abstract String m1183a();

    public void m1184a(StringBuffer stringBuffer) {
        at[] f = m1181f();
        f[1].m1170a(stringBuffer);
        stringBuffer.append(m1183a());
        f[0].m1170a(stringBuffer);
    }

    public void m1185a(Stack stack) {
        at atVar = (at) stack.pop();
        m1178a((at) stack.pop());
        m1178a(atVar);
    }

    abstract bi m1186b();

    byte[] m1187c() {
        at[] f = m1181f();
        Object obj = new byte[0];
        int length = f.length - 1;
        while (length >= 0) {
            Object c = f[length].m1172c();
            Object obj2 = new byte[(obj.length + c.length)];
            System.arraycopy(obj, 0, obj2, 0, obj.length);
            System.arraycopy(c, 0, obj2, obj.length, c.length);
            length--;
            obj = obj2;
        }
        Object obj3 = new byte[(obj.length + 1)];
        System.arraycopy(obj, 0, obj3, 0, obj.length);
        obj3[obj.length] = m1186b().m1285a();
        return obj3;
    }
}
