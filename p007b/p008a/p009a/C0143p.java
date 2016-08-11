package p007b.p008a.p009a;

/* renamed from: b.a.a.p */
public class C0143p {
    private static C0143p[] f651b;
    private int f652a;

    static {
        f651b = new C0143p[0];
    }

    C0143p(int i) {
        this.f652a = i;
        Object obj = f651b;
        f651b = new C0143p[(obj.length + 1)];
        System.arraycopy(obj, 0, f651b, 0, obj.length);
        f651b[obj.length] = this;
    }

    static C0143p m1046a(int i) {
        C0143p c0143p = C0142o.f627a;
        for (int i2 = 0; i2 < f651b.length; i2++) {
            if (f651b[i2].m1047a() == i) {
                return f651b[i2];
            }
        }
        return c0143p;
    }

    int m1047a() {
        return this.f652a;
    }
}
