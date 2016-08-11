package p007b.p008a.p009a;

/* renamed from: b.a.a.c */
final class C0128c {
    public static final C0128c f538a;
    public static final C0128c f539b;
    public static final C0128c f540c;
    public static final C0128c f541d;
    public static final C0128c f542e;
    public static final C0128c f543f;
    public static final C0128c f544g;
    public static final C0128c f545h;
    public static final C0128c f546i;
    public static final C0128c f547j;
    private static C0128c[] f548m;
    private int f549k;
    private String f550l;

    static {
        f548m = new C0128c[0];
        f538a = new C0128c(0, "Error");
        f539b = new C0128c(1, "Unknown");
        f540c = new C0128c(2, "EMF");
        f541d = new C0128c(3, "WMF");
        f542e = new C0128c(4, "PICT");
        f543f = new C0128c(5, "JPEG");
        f544g = new C0128c(6, "PNG");
        f545h = new C0128c(7, "DIB");
        f546i = new C0128c(32, "FIRST");
        f547j = new C0128c(255, "LAST");
    }

    private C0128c(int i, String str) {
        this.f549k = i;
        this.f550l = str;
        Object obj = new C0128c[(f548m.length + 1)];
        System.arraycopy(f548m, 0, obj, 0, f548m.length);
        obj[f548m.length] = this;
        f548m = obj;
    }

    public static C0128c m967a(int i) {
        C0128c c0128c = f539b;
        for (int i2 = 0; i2 < f548m.length; i2++) {
            if (f548m[i2].f549k == i) {
                return f548m[i2];
            }
        }
        return c0128c;
    }

    public int m968a() {
        return this.f549k;
    }
}
