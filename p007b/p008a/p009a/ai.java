package p007b.p008a.p009a;

/* renamed from: b.a.a.ai */
final class ai {
    public static final ai f510a;
    public static final ai f511b;
    public static final ai f512c;
    public static final ai f513d;
    public static final ai f514e;
    private static ai[] f515g;
    private int f516f;

    static {
        f515g = new ai[0];
        f510a = new ai(0);
        f511b = new ai(75);
        f512c = new ai(201);
        f513d = new ai(202);
        f514e = new ai(-1);
    }

    ai(int i) {
        this.f516f = i;
        Object obj = f515g;
        f515g = new ai[(f515g.length + 1)];
        System.arraycopy(obj, 0, f515g, 0, obj.length);
        f515g[obj.length] = this;
    }

    static ai m953a(int i) {
        int i2 = 0;
        ai aiVar = f514e;
        int i3 = 0;
        while (i2 < f515g.length && r1 == 0) {
            if (f515g[i2].f516f == i) {
                i3 = 1;
                aiVar = f515g[i2];
            }
            i2++;
        }
        return aiVar;
    }

    public int m954a() {
        return this.f516f;
    }
}
