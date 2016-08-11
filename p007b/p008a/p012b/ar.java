package p007b.p008a.p012b;

import java.util.Stack;

/* renamed from: b.a.b.ar */
class ar extends aq {
    public int m1235a(byte[] bArr, int i) {
        return 0;
    }

    bi m1236a() {
        return bi.f915u;
    }

    public void m1237a(StringBuffer stringBuffer) {
        at[] f = m1181f();
        stringBuffer.append('(');
        f[0].m1170a(stringBuffer);
        stringBuffer.append(')');
    }

    public void m1238a(Stack stack) {
        m1178a((at) stack.pop());
    }

    byte[] m1239c() {
        Object c = m1181f()[0].m1172c();
        Object obj = new byte[(c.length + 1)];
        System.arraycopy(c, 0, obj, 0, c.length);
        obj[c.length] = m1236a().m1285a();
        return obj;
    }

    int d_() {
        return 4;
    }
}
