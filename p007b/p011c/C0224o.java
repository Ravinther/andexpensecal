package p007b.p011c;

/* renamed from: b.c.o */
public final class C0224o {
    public static final C0224o f1485a;
    public static final C0224o f1486b;
    public static final C0224o f1487c;
    public static final C0224o f1488d;
    public static final C0224o f1489e;
    private static C0224o[] f1490h;
    private int f1491f;
    private String f1492g;

    static {
        f1490h = new C0224o[0];
        f1485a = new C0224o(0, "none");
        f1486b = new C0224o(1, "single");
        f1487c = new C0224o(2, "double");
        f1488d = new C0224o(33, "single accounting");
        f1489e = new C0224o(34, "double accounting");
    }

    protected C0224o(int i, String str) {
        this.f1491f = i;
        this.f1492g = str;
        Object obj = f1490h;
        f1490h = new C0224o[(obj.length + 1)];
        System.arraycopy(obj, 0, f1490h, 0, obj.length);
        f1490h[obj.length] = this;
    }

    public static C0224o m1525a(int i) {
        for (int i2 = 0; i2 < f1490h.length; i2++) {
            if (f1490h[i2].m1526a() == i) {
                return f1490h[i2];
            }
        }
        return f1485a;
    }

    public int m1526a() {
        return this.f1491f;
    }
}
