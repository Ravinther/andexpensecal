package p007b.p011c;

/* renamed from: b.c.a */
public class C0213a {
    public static C0213a f1303a;
    public static C0213a f1304b;
    public static C0213a f1305c;
    public static C0213a f1306d;
    public static C0213a f1307e;
    public static C0213a f1308f;
    private static C0213a[] f1309i;
    private int f1310g;
    private String f1311h;

    static {
        f1309i = new C0213a[0];
        f1303a = new C0213a(0, "general");
        f1304b = new C0213a(1, "left");
        f1305c = new C0213a(2, "centre");
        f1306d = new C0213a(3, "right");
        f1307e = new C0213a(4, "fill");
        f1308f = new C0213a(5, "justify");
    }

    protected C0213a(int i, String str) {
        this.f1310g = i;
        this.f1311h = str;
        Object obj = f1309i;
        f1309i = new C0213a[(obj.length + 1)];
        System.arraycopy(obj, 0, f1309i, 0, obj.length);
        f1309i[obj.length] = this;
    }

    public static C0213a m1508a(int i) {
        for (int i2 = 0; i2 < f1309i.length; i2++) {
            if (f1309i[i2].m1509a() == i) {
                return f1309i[i2];
            }
        }
        return f1303a;
    }

    public int m1509a() {
        return this.f1310g;
    }
}
