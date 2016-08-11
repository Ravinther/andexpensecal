package p007b.p008a;

/* renamed from: b.a.e */
public class C0186e {
    private static C0186e[] f1150b;
    private C0201u f1151a;

    static {
        f1150b = new C0186e[0];
    }

    C0186e(C0201u c0201u) {
        this.f1151a = c0201u;
        Object obj = f1150b;
        f1150b = new C0186e[(obj.length + 1)];
        System.arraycopy(obj, 0, f1150b, 0, obj.length);
        f1150b[obj.length] = this;
    }
}
