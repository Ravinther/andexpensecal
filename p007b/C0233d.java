package p007b;

/* renamed from: b.d */
public final class C0233d {
    public static final C0233d f1525a;
    public static final C0233d f1526b;
    public static final C0233d f1527c;
    public static final C0233d f1528d;
    public static final C0233d f1529e;
    public static final C0233d f1530f;
    public static final C0233d f1531g;
    public static final C0233d f1532h;
    public static final C0233d f1533i;
    public static final C0233d f1534j;
    public static final C0233d f1535k;
    private String f1536l;

    static {
        f1525a = new C0233d("Empty");
        f1526b = new C0233d("Label");
        f1527c = new C0233d("Number");
        f1528d = new C0233d("Boolean");
        f1529e = new C0233d("Error");
        f1530f = new C0233d("Numerical Formula");
        f1531g = new C0233d("Date Formula");
        f1532h = new C0233d("String Formula");
        f1533i = new C0233d("Boolean Formula");
        f1534j = new C0233d("Formula Error");
        f1535k = new C0233d("Date");
    }

    private C0233d(String str) {
        this.f1536l = str;
    }

    public String toString() {
        return this.f1536l;
    }
}
