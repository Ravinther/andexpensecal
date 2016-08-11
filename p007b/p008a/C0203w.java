package p007b.p008a;

/* renamed from: b.a.w */
public class C0203w {
    private static C0203w[] f1278b;
    private int f1279a;

    static {
        f1278b = new C0203w[0];
    }

    C0203w(int i) {
        this.f1279a = i;
        Object obj = f1278b;
        f1278b = new C0203w[(obj.length + 1)];
        System.arraycopy(obj, 0, f1278b, 0, obj.length);
        f1278b[obj.length] = this;
    }

    static C0203w m1480a(int i) {
        C0203w c0203w = null;
        for (int i2 = 0; i2 < f1278b.length && c0203w == null; i2++) {
            if (f1278b[i2].f1279a == i) {
                c0203w = f1278b[i2];
            }
        }
        return c0203w;
    }

    public int m1481a() {
        return this.f1279a;
    }
}
