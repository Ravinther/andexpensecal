package p007b.p008a.p012b;

import p007b.C0154i;

/* renamed from: b.a.b.v */
public class C0177v extends C0154i {
    static final C0178w f1012a;
    static final C0178w f1013b;
    public static final C0178w f1014c;
    static final C0178w f1015d;
    static final C0178w f1016e;
    static final C0178w f1017f;
    static final C0178w f1018g;

    static {
        f1012a = new C0178w("Unrecognized token");
        f1013b = new C0178w("Unrecognized function");
        f1014c = new C0178w("Only biff8 formulas are supported");
        f1015d = new C0178w("Lexical error:  ");
        f1016e = new C0178w("Incorrect arguments supplied to function");
        f1017f = new C0178w("Could not find sheet");
        f1018g = new C0178w("Could not find named cell");
    }

    public C0177v(C0178w c0178w) {
        super(c0178w.f1019a);
    }

    public C0177v(C0178w c0178w, int i) {
        super(c0178w.f1019a + " " + i);
    }

    public C0177v(C0178w c0178w, String str) {
        super(c0178w.f1019a + " " + str);
    }
}
