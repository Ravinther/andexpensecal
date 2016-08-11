package p007b.p008a.p012b;

import p007b.p008a.C0193m;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.b.n */
class C0169n extends C0159c {
    private static C0208c f995a;
    private C0175t f996b;
    private int f997c;

    static {
        f995a = C0208c.m1493a(C0169n.class);
    }

    C0169n(String str, C0175t c0175t) {
        super(c0175t);
        this.f996b = c0175t;
        int lastIndexOf = str.lastIndexOf(":");
        C0210a.m1505a(lastIndexOf != -1);
        str.substring(0, lastIndexOf);
        String substring = str.substring(lastIndexOf + 1);
        int indexOf = str.indexOf(33);
        int a = C0193m.m1450a(str.substring(indexOf + 1, lastIndexOf));
        String substring2 = str.substring(0, indexOf);
        substring2.lastIndexOf(93);
        if (substring2.charAt(0) == '\'' && substring2.charAt(substring2.length() - 1) == '\'') {
            substring2 = substring2.substring(1, substring2.length() - 1);
        }
        this.f997c = c0175t.m1368b(substring2);
        if (this.f997c < 0) {
            throw new C0177v(C0177v.f1017f, substring2);
        }
        m1324a(this.f997c, a, C0193m.m1450a(substring), 0, 65535, true, true, true, true);
    }

    public void m1354a(StringBuffer stringBuffer) {
        stringBuffer.append('\'');
        stringBuffer.append(this.f996b.m1369b(this.f997c));
        stringBuffer.append('\'');
        stringBuffer.append('!');
        C0193m.m1455a(m1322a(), stringBuffer);
        stringBuffer.append(':');
        C0193m.m1455a(m1326b(), stringBuffer);
    }
}
