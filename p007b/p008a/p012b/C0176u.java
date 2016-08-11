package p007b.p008a.p012b;

/* renamed from: b.a.b.u */
public class C0176u {
    public static final C0176u f1001a;
    public static final C0176u f1002b;
    public static final C0176u f1003c;
    public static final C0176u f1004d;
    public static final C0176u f1005e;
    public static final C0176u f1006f;
    public static final C0176u f1007g;
    public static final C0176u f1008h;
    private static C0176u[] f1009k;
    private int f1010i;
    private String f1011j;

    static {
        f1009k = new C0176u[0];
        f1001a = new C0176u(255, "?");
        f1002b = new C0176u(0, "#NULL!");
        f1003c = new C0176u(7, "#DIV/0!");
        f1004d = new C0176u(15, "#VALUE!");
        f1005e = new C0176u(23, "#REF!");
        f1006f = new C0176u(29, "#NAME?");
        f1007g = new C0176u(36, "#NUM!");
        f1008h = new C0176u(42, "#N/A!");
    }

    C0176u(int i, String str) {
        this.f1010i = i;
        this.f1011j = str;
        Object obj = new C0176u[(f1009k.length + 1)];
        System.arraycopy(f1009k, 0, obj, 0, f1009k.length);
        obj[f1009k.length] = this;
        f1009k = obj;
    }

    public static C0176u m1370a(int i) {
        int i2 = 0;
        C0176u c0176u = f1001a;
        int i3 = 0;
        while (i2 < f1009k.length && r2 == 0) {
            if (f1009k[i2].f1010i == i) {
                i3 = 1;
                c0176u = f1009k[i2];
            }
            i2++;
        }
        return c0176u;
    }

    public static C0176u m1371a(String str) {
        int i = 0;
        C0176u c0176u = f1001a;
        if (!(str == null || str.length() == 0)) {
            int i2 = 0;
            while (i < f1009k.length && r2 == 0) {
                if (f1009k[i].f1011j.equals(str)) {
                    i2 = 1;
                    c0176u = f1009k[i];
                }
                i++;
            }
        }
        return c0176u;
    }

    public int m1372a() {
        return this.f1010i;
    }

    public String m1373b() {
        return this.f1011j;
    }
}
