package p007b.p011c;

/* renamed from: b.c.p */
public class C0225p {
    public static C0225p f1493a;
    public static C0225p f1494b;
    public static C0225p f1495c;
    public static C0225p f1496d;
    private static C0225p[] f1497g;
    private int f1498e;
    private String f1499f;

    static {
        f1497g = new C0225p[0];
        f1493a = new C0225p(0, "top");
        f1494b = new C0225p(1, "centre");
        f1495c = new C0225p(2, "bottom");
        f1496d = new C0225p(3, "Justify");
    }

    protected C0225p(int i, String str) {
        this.f1498e = i;
        this.f1499f = str;
        Object obj = f1497g;
        f1497g = new C0225p[(obj.length + 1)];
        System.arraycopy(obj, 0, f1497g, 0, obj.length);
        f1497g[obj.length] = this;
    }

    public static C0225p m1527a(int i) {
        for (int i2 = 0; i2 < f1497g.length; i2++) {
            if (f1497g[i2].m1528a() == i) {
                return f1497g[i2];
            }
        }
        return f1495c;
    }

    public int m1528a() {
        return this.f1498e;
    }
}
