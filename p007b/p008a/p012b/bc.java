package p007b.p008a.p012b;

import p007b.C0287p;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.bc */
class bc extends be {
    private static C0208c f875a;
    private C0180y f876b;
    private String f877c;

    static {
        f875a = C0208c.m1493a(bc.class);
    }

    bc(String str) {
        this.f877c = str.substring(0, str.length() - 1);
    }

    C0180y m1278a(C0287p c0287p) {
        if (this.f876b == null) {
            this.f876b = C0180y.m1379a(this.f877c, c0287p);
        }
        return this.f876b;
    }
}
