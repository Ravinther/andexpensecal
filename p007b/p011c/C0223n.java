package p007b.p011c;

/* renamed from: b.c.n */
public final class C0223n {
    public static final C0223n f1479a;
    public static final C0223n f1480b;
    public static final C0223n f1481c;
    private static C0223n[] f1482f;
    private int f1483d;
    private String f1484e;

    static {
        f1482f = new C0223n[0];
        f1479a = new C0223n(0, "normal");
        f1480b = new C0223n(1, "super");
        f1481c = new C0223n(2, "sub");
    }

    protected C0223n(int i, String str) {
        this.f1483d = i;
        this.f1484e = str;
        Object obj = f1482f;
        f1482f = new C0223n[(obj.length + 1)];
        System.arraycopy(obj, 0, f1482f, 0, obj.length);
        f1482f[obj.length] = this;
    }

    public static C0223n m1523a(int i) {
        for (int i2 = 0; i2 < f1482f.length; i2++) {
            if (f1482f[i2].m1524a() == i) {
                return f1482f[i2];
            }
        }
        return f1479a;
    }

    public int m1524a() {
        return this.f1483d;
    }
}
