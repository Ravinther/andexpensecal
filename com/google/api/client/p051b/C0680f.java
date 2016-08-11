package com.google.api.client.p051b;

import com.google.api.client.p050d.ag;
import com.google.api.client.p050d.am;

/* renamed from: com.google.api.client.b.f */
public class C0680f implements C0677c {
    long f7432a;
    private int f7433b;
    private final int f7434c;
    private final double f7435d;
    private final double f7436e;
    private final int f7437f;
    private final int f7438g;
    private final ag f7439h;

    public C0680f() {
        this(new C0681g());
    }

    protected C0680f(C0681g c0681g) {
        boolean z = true;
        this.f7434c = c0681g.f7440a;
        this.f7435d = c0681g.f7441b;
        this.f7436e = c0681g.f7442c;
        this.f7437f = c0681g.f7443d;
        this.f7438g = c0681g.f7444e;
        this.f7439h = c0681g.f7445f;
        am.m6914a(this.f7434c > 0);
        boolean z2 = 0.0d <= this.f7435d && this.f7435d < 1.0d;
        am.m6914a(z2);
        am.m6914a(this.f7436e >= 1.0d);
        am.m6914a(this.f7437f >= this.f7434c);
        if (this.f7438g <= 0) {
            z = false;
        }
        am.m6914a(z);
        m6686b();
    }

    static int m6682a(double d, double d2, int i) {
        double d3 = ((double) i) * d;
        double d4 = ((double) i) - d3;
        return (int) (((((d3 + ((double) i)) - d4) + 1.0d) * d2) + d4);
    }

    private void m6683d() {
        if (((double) this.f7433b) >= ((double) this.f7437f) / this.f7436e) {
            this.f7433b = this.f7437f;
        } else {
            this.f7433b = (int) (((double) this.f7433b) * this.f7436e);
        }
    }

    public long m6684a() {
        if (m6687c() > ((long) this.f7438g)) {
            return -1;
        }
        int a = C0680f.m6682a(this.f7435d, Math.random(), this.f7433b);
        m6683d();
        return (long) a;
    }

    public boolean m6685a(int i) {
        switch (i) {
            case 500:
            case 503:
                return true;
            default:
                return false;
        }
    }

    public final void m6686b() {
        this.f7433b = this.f7434c;
        this.f7432a = this.f7439h.m6906a();
    }

    public final long m6687c() {
        return (this.f7439h.m6906a() - this.f7432a) / 1000000;
    }
}
