package p007b.p008a.p009a;

/* renamed from: b.a.a.y */
final class C0148y {
    public static final C0148y f683a;
    public static final C0148y f684b;
    public static final C0148y f685c;
    public static final C0148y f686d;
    public static final C0148y f687e;
    public static final C0148y f688f;
    public static final C0148y f689g;
    public static final C0148y f690h;
    public static final C0148y f691i;
    public static final C0148y f692j;
    public static final C0148y f693k;
    public static final C0148y f694l;
    public static final C0148y f695m;
    public static final C0148y f696n;
    public static final C0148y f697o;
    public static final C0148y f698p;
    private static C0148y[] f699r;
    private int f700q;

    static {
        f699r = new C0148y[0];
        f683a = new C0148y(0);
        f684b = new C0148y(61440);
        f685c = new C0148y(61441);
        f686d = new C0148y(61442);
        f687e = new C0148y(61443);
        f688f = new C0148y(61444);
        f689g = new C0148y(61446);
        f690h = new C0148y(61447);
        f691i = new C0148y(61448);
        f692j = new C0148y(61449);
        f693k = new C0148y(61450);
        f694l = new C0148y(61451);
        f695m = new C0148y(61456);
        f696n = new C0148y(61457);
        f697o = new C0148y(61453);
        f698p = new C0148y(61726);
    }

    private C0148y(int i) {
        this.f700q = i;
        Object obj = new C0148y[(f699r.length + 1)];
        System.arraycopy(f699r, 0, obj, 0, f699r.length);
        obj[f699r.length] = this;
        f699r = obj;
    }

    public static C0148y m1071a(int i) {
        C0148y c0148y = f683a;
        for (int i2 = 0; i2 < f699r.length; i2++) {
            if (i == f699r[i2].f700q) {
                return f699r[i2];
            }
        }
        return c0148y;
    }

    public int m1072a() {
        return this.f700q;
    }
}
