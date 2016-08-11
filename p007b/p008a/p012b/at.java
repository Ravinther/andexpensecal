package p007b.p008a.p012b;

import p007b.p013b.C0208c;

/* renamed from: b.a.b.at */
abstract class at {
    private static C0208c f822a;
    private at f823b;
    private boolean f824c;
    private boolean f825d;
    private as f826e;
    private boolean f827f;

    static {
        f822a = C0208c.m1493a(at.class);
    }

    public at() {
        this.f824c = false;
        this.f825d = false;
        this.f827f = true;
        as asVar = this.f826e;
        this.f826e = as.f840a;
    }

    protected void m1169a(as asVar) {
        this.f826e = asVar;
    }

    abstract void m1170a(StringBuffer stringBuffer);

    protected void m1171b(at atVar) {
        this.f823b = atVar;
    }

    abstract byte[] m1172c();

    protected void m1173g() {
        this.f824c = true;
        if (this.f823b != null && !this.f823b.m1174h()) {
            this.f823b.m1173g();
        }
    }

    final boolean m1174h() {
        return this.f824c;
    }

    protected void m1175i() {
        this.f825d = true;
    }

    protected final boolean m1176j() {
        return this.f825d;
    }

    protected final as m1177k() {
        return this.f826e;
    }
}
