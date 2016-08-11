package p007b.p011c;

/* renamed from: b.c.l */
public class C0221l {
    public static final C0221l f1454a;
    public static final C0221l f1455b;
    public static final C0221l f1456c;
    public static final C0221l f1457d;
    public static final C0221l f1458e;
    public static final C0221l f1459f;
    public static final C0221l f1460g;
    public static final C0221l f1461h;
    public static final C0221l f1462i;
    public static final C0221l f1463j;
    public static final C0221l f1464k;
    public static final C0221l f1465l;
    public static final C0221l f1466m;
    public static final C0221l f1467n;
    public static final C0221l f1468o;
    public static final C0221l f1469p;
    public static final C0221l f1470q;
    public static final C0221l f1471r;
    public static final C0221l f1472s;
    private static C0221l[] f1473v;
    private int f1474t;
    private String f1475u;

    static {
        f1473v = new C0221l[0];
        f1454a = new C0221l(0, "None");
        f1455b = new C0221l(1, "Solid");
        f1456c = new C0221l(2, "Gray 50%");
        f1457d = new C0221l(3, "Gray 75%");
        f1458e = new C0221l(4, "Gray 25%");
        f1459f = new C0221l(5, "Pattern 1");
        f1460g = new C0221l(6, "Pattern 2");
        f1461h = new C0221l(7, "Pattern 3");
        f1462i = new C0221l(8, "Pattern 4");
        f1463j = new C0221l(9, "Pattern 5");
        f1464k = new C0221l(10, "Pattern 6");
        f1465l = new C0221l(11, "Pattern 7");
        f1466m = new C0221l(12, "Pattern 8");
        f1467n = new C0221l(13, "Pattern 9");
        f1468o = new C0221l(14, "Pattern 10");
        f1469p = new C0221l(15, "Pattern 11");
        f1470q = new C0221l(16, "Pattern 12");
        f1471r = new C0221l(17, "Pattern 13");
        f1472s = new C0221l(18, "Pattern 14");
    }

    protected C0221l(int i, String str) {
        this.f1474t = i;
        this.f1475u = str;
        Object obj = f1473v;
        f1473v = new C0221l[(obj.length + 1)];
        System.arraycopy(obj, 0, f1473v, 0, obj.length);
        f1473v[obj.length] = this;
    }

    public static C0221l m1518a(int i) {
        for (int i2 = 0; i2 < f1473v.length; i2++) {
            if (f1473v[i2].m1519a() == i) {
                return f1473v[i2];
            }
        }
        return f1454a;
    }

    public int m1519a() {
        return this.f1474t;
    }
}
