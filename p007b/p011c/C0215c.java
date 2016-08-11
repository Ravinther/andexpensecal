package p007b.p011c;

/* renamed from: b.c.c */
public class C0215c {
    public static final C0215c f1319a;
    public static final C0215c f1320b;
    public static final C0215c f1321c;
    public static final C0215c f1322d;
    public static final C0215c f1323e;
    public static final C0215c f1324f;
    public static final C0215c f1325g;
    public static final C0215c f1326h;
    public static final C0215c f1327i;
    public static final C0215c f1328j;
    public static final C0215c f1329k;
    public static final C0215c f1330l;
    public static final C0215c f1331m;
    public static final C0215c f1332n;
    private static C0215c[] f1333q;
    private int f1334o;
    private String f1335p;

    static {
        f1333q = new C0215c[0];
        f1319a = new C0215c(0, "none");
        f1320b = new C0215c(1, "thin");
        f1321c = new C0215c(2, "medium");
        f1322d = new C0215c(3, "dashed");
        f1323e = new C0215c(4, "dotted");
        f1324f = new C0215c(5, "thick");
        f1325g = new C0215c(6, "double");
        f1326h = new C0215c(7, "hair");
        f1327i = new C0215c(8, "medium dashed");
        f1328j = new C0215c(9, "dash dot");
        f1329k = new C0215c(10, "medium dash dot");
        f1330l = new C0215c(11, "Dash dot dot");
        f1331m = new C0215c(12, "Medium dash dot dot");
        f1332n = new C0215c(13, "Slanted dash dot");
    }

    protected C0215c(int i, String str) {
        this.f1334o = i;
        this.f1335p = str;
        Object obj = f1333q;
        f1333q = new C0215c[(obj.length + 1)];
        System.arraycopy(obj, 0, f1333q, 0, obj.length);
        f1333q[obj.length] = this;
    }

    public static C0215c m1510a(int i) {
        for (int i2 = 0; i2 < f1333q.length; i2++) {
            if (f1333q[i2].m1511a() == i) {
                return f1333q[i2];
            }
        }
        return f1319a;
    }

    public int m1511a() {
        return this.f1334o;
    }

    public String m1512b() {
        return this.f1335p;
    }
}
