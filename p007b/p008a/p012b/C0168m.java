package p007b.p008a.p012b;

import p007b.p008a.C0193m;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.b.m */
class C0168m extends C0158b {
    private static C0208c f994a;

    static {
        f994a = C0208c.m1493a(C0168m.class);
    }

    C0168m() {
    }

    C0168m(String str) {
        int indexOf = str.indexOf(":");
        C0210a.m1505a(indexOf != -1);
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        m1264a(C0193m.m1450a(substring), C0193m.m1450a(substring2), 0, 65535, C0193m.m1458c(substring), C0193m.m1458c(substring2), false, false);
    }

    public void m1353a(StringBuffer stringBuffer) {
        C0193m.m1455a(m1262a(), stringBuffer);
        stringBuffer.append(':');
        C0193m.m1455a(m1266b(), stringBuffer);
    }
}
