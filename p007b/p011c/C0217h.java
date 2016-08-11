package p007b.p011c;

/* renamed from: b.c.h */
public final class C0217h {
    public static C0217h f1388a;
    public static C0217h f1389b;
    public static C0217h f1390c;
    public static C0217h f1391d;
    public static C0217h f1392e;
    public static C0217h f1393f;
    public static C0217h f1394g;
    private static C0217h[] f1395j;
    private int f1396h;
    private String f1397i;

    static {
        f1395j = new C0217h[0];
        f1388a = new C0217h(0, "horizontal");
        f1389b = new C0217h(255, "vertical");
        f1390c = new C0217h(90, "up 90");
        f1391d = new C0217h(180, "down 90");
        f1392e = new C0217h(45, "up 45");
        f1393f = new C0217h(135, "down 45");
        f1394g = new C0217h(255, "stacked");
    }

    protected C0217h(int i, String str) {
        this.f1396h = i;
        this.f1397i = str;
        Object obj = f1395j;
        f1395j = new C0217h[(obj.length + 1)];
        System.arraycopy(obj, 0, f1395j, 0, obj.length);
        f1395j[obj.length] = this;
    }

    public static C0217h m1515a(int i) {
        for (int i2 = 0; i2 < f1395j.length; i2++) {
            if (f1395j[i2].m1516a() == i) {
                return f1395j[i2];
            }
        }
        return f1388a;
    }

    public int m1516a() {
        return this.f1396h;
    }
}
