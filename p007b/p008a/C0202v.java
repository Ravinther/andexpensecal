package p007b.p008a;

/* renamed from: b.a.v */
public class C0202v {
    private static C0202v[] f1275c;
    private int f1276a;
    private String f1277b;

    static {
        f1275c = new C0202v[0];
    }

    C0202v(int i, String str) {
        this.f1276a = i;
        this.f1277b = str;
        Object obj = f1275c;
        f1275c = new C0202v[(obj.length + 1)];
        System.arraycopy(obj, 0, f1275c, 0, obj.length);
        f1275c[obj.length] = this;
    }

    static C0202v m1478a(int i) {
        C0202v c0202v = null;
        for (int i2 = 0; i2 < f1275c.length && c0202v == null; i2++) {
            if (f1275c[i2].f1276a == i) {
                c0202v = f1275c[i2];
            }
        }
        return c0202v;
    }

    public int m1479a() {
        return this.f1276a;
    }
}
