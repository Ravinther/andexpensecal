package p007b.p008a.p012b;

import java.util.Stack;

/* renamed from: b.a.b.bl */
abstract class bl extends aq {
    public int m1243a(byte[] bArr, int i) {
        return 0;
    }

    abstract String m1244a();

    public void m1245a(StringBuffer stringBuffer) {
        at[] f = m1181f();
        stringBuffer.append(m1244a());
        f[0].m1170a(stringBuffer);
    }

    public void m1246a(Stack stack) {
        m1178a((at) stack.pop());
    }

    abstract bi m1247b();

    byte[] m1248c() {
        Object c = m1181f()[0].m1172c();
        Object obj = new byte[(c.length + 1)];
        System.arraycopy(c, 0, obj, 0, c.length);
        obj[c.length] = m1247b().m1285a();
        return obj;
    }
}
