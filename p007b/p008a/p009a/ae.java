package p007b.p008a.p009a;

/* renamed from: b.a.a.ae */
final class ae {
    private static ae[] f494c;
    public int f495a;
    public String f496b;

    static {
        f494c = new ae[0];
    }

    ae(int i, String str) {
        this.f495a = i;
        this.f496b = str;
        Object obj = f494c;
        f494c = new ae[(f494c.length + 1)];
        System.arraycopy(obj, 0, f494c, 0, obj.length);
        f494c[obj.length] = this;
    }

    public String toString() {
        return this.f496b;
    }
}
