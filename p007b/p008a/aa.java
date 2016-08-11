package p007b.p008a;

import p007b.C0287p;
import p007b.p008a.p012b.C0175t;
import p007b.p013b.C0208c;

/* renamed from: b.a.aa */
public class aa extends bd {
    private static C0208c f704a;
    private byte[] f705b;
    private C0200t f706c;
    private bb f707d;
    private C0175t f708e;
    private C0287p f709f;
    private C0205y f710g;

    static {
        f704a = C0208c.m1493a(aa.class);
    }

    public aa(C0200t c0200t) {
        super(ay.be);
        this.f706c = c0200t;
    }

    private void m1074i() {
        if (this.f706c == null) {
            this.f706c = new C0200t(this.f705b, this.f708e, this.f707d, this.f709f);
        }
    }

    void m1075a(C0205y c0205y) {
        this.f710g = c0205y;
    }

    public byte[] m1076a() {
        return this.f706c == null ? this.f705b : this.f706c.m1469a();
    }

    public int m1077c() {
        if (this.f706c == null) {
            m1074i();
        }
        return this.f706c.m1470b();
    }

    public int m1078d() {
        if (this.f706c == null) {
            m1074i();
        }
        return this.f706c.m1471c();
    }

    public int m1079e() {
        if (this.f706c == null) {
            m1074i();
        }
        return this.f706c.m1472d();
    }

    public int m1080f() {
        if (this.f706c == null) {
            m1074i();
        }
        return this.f706c.m1473e();
    }

    C0200t m1081h() {
        return this.f706c;
    }
}
