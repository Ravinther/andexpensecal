package p007b.p008a;

import p007b.p013b.C0208c;

/* renamed from: b.a.s */
public class C0199s {
    public static final C0199s f1206a;
    public static final C0199s f1207b;
    public static final C0199s f1208c;
    public static final C0199s f1209d;
    public static final C0199s f1210e;
    public static final C0199s f1211f;
    public static final C0199s f1212g;
    public static final C0199s f1213h;
    public static final C0199s f1214i;
    public static final C0199s f1215j;
    public static final C0199s f1216k;
    public static final C0199s f1217l;
    public static final C0199s f1218m;
    public static final C0199s f1219n;
    public static final C0199s f1220o;
    public static final C0199s f1221p;
    public static final C0199s f1222q;
    public static final C0199s f1223r;
    private static C0208c f1224s;
    private static C0199s[] f1225w;
    private int f1226t;
    private String f1227u;
    private String f1228v;

    static {
        f1224s = C0208c.m1493a(C0199s.class);
        f1225w = new C0199s[0];
        f1206a = new C0199s(1, "US", "USA");
        f1207b = new C0199s(2, "CA", "Canada");
        f1208c = new C0199s(30, "GR", "Greece");
        f1209d = new C0199s(31, "NE", "Netherlands");
        f1210e = new C0199s(32, "BE", "Belgium");
        f1211f = new C0199s(33, "FR", "France");
        f1212g = new C0199s(34, "ES", "Spain");
        f1213h = new C0199s(39, "IT", "Italy");
        f1214i = new C0199s(41, "CH", "Switzerland");
        f1215j = new C0199s(44, "UK", "United Kingdowm");
        f1216k = new C0199s(45, "DK", "Denmark");
        f1217l = new C0199s(46, "SE", "Sweden");
        f1218m = new C0199s(47, "NO", "Norway");
        f1219n = new C0199s(49, "DE", "Germany");
        f1220o = new C0199s(63, "PH", "Philippines");
        f1221p = new C0199s(86, "CN", "China");
        f1222q = new C0199s(91, "IN", "India");
        f1223r = new C0199s(65535, "??", "Unknown");
    }

    private C0199s(int i, String str, String str2) {
        this.f1226t = i;
        this.f1227u = str;
        this.f1228v = str2;
        Object obj = new C0199s[(f1225w.length + 1)];
        System.arraycopy(f1225w, 0, obj, 0, f1225w.length);
        obj[f1225w.length] = this;
        f1225w = obj;
    }

    public static C0199s m1465a(String str) {
        if (str == null || str.length() != 2) {
            f1224s.m1499b((Object) "Please specify two character ISO 3166 country code");
            return f1206a;
        }
        C0199s c0199s = f1223r;
        for (int i = 0; i < f1225w.length && c0199s == f1223r; i++) {
            if (f1225w[i].f1227u.equals(str)) {
                c0199s = f1225w[i];
            }
        }
        return c0199s;
    }

    public int m1466a() {
        return this.f1226t;
    }

    public String m1467b() {
        return this.f1227u;
    }
}
