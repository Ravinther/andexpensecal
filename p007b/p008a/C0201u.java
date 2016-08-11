package p007b.p008a;

import java.text.MessageFormat;

/* renamed from: b.a.u */
public class C0201u {
    private static C0201u[] f1272c;
    private int f1273a;
    private MessageFormat f1274b;

    static {
        f1272c = new C0201u[0];
    }

    C0201u(int i, String str) {
        this.f1273a = i;
        this.f1274b = new MessageFormat(str);
        Object obj = f1272c;
        f1272c = new C0201u[(obj.length + 1)];
        System.arraycopy(obj, 0, f1272c, 0, obj.length);
        f1272c[obj.length] = this;
    }

    static C0201u m1476a(int i) {
        C0201u c0201u = null;
        for (int i2 = 0; i2 < f1272c.length && c0201u == null; i2++) {
            if (f1272c[i2].f1273a == i) {
                c0201u = f1272c[i2];
            }
        }
        return c0201u;
    }

    public int m1477a() {
        return this.f1273a;
    }
}
