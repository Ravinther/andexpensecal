package p018c.p019a;

import android.content.Context;
import p018c.p019a.p020a.C0290b;
import p018c.p019a.p020a.C0291c;
import p018c.p019a.p020a.C0293e;
import p018c.p019a.p020a.C0296g;
import p018c.p019a.p021b.C0303a;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p022c.C0312d;

/* renamed from: c.a.a */
public class C0302a {
    public static final C0308b m2013a(Context context, C0303a c0303a, C0310b c0310b) {
        C0302a.m2016a(c0303a, c0310b);
        return new C0308b(context, new C0296g(c0303a, c0310b));
    }

    public static final C0308b m2014a(Context context, C0306d c0306d, C0312d c0312d) {
        C0302a.m2017a(c0306d, c0312d);
        return new C0308b(context, new C0293e(c0306d, c0312d));
    }

    public static final C0308b m2015a(Context context, C0306d c0306d, C0312d c0312d, C0291c c0291c) {
        C0302a.m2017a(c0306d, c0312d);
        return new C0308b(context, new C0290b(c0306d, c0312d, c0291c));
    }

    private static void m2016a(C0303a c0303a, C0310b c0310b) {
        if (c0303a == null || c0310b == null || c0303a.m2019a() != c0310b.m2078c()) {
            throw new IllegalArgumentException("Dataset and renderer should be not null and the dataset number of items should be equal to the number of series renderers");
        }
    }

    private static void m2017a(C0306d c0306d, C0312d c0312d) {
        if (c0306d == null || c0312d == null || c0306d.m2026a() != c0312d.m2078c()) {
            throw new IllegalArgumentException("Dataset and renderer should be not null and should have the same number of series");
        }
    }
}
