package p018c.p019a.p022c;

import java.util.ArrayList;
import java.util.List;
import p018c.p019a.p020a.C0299j;

/* renamed from: c.a.c.f */
public class C0314f extends C0311c {
    private boolean f2246a;
    private List<C0315g> f2247b;
    private C0299j f2248c;
    private float f2249d;
    private float f2250e;

    public C0314f() {
        this.f2246a = false;
        this.f2247b = new ArrayList();
        this.f2248c = C0299j.POINT;
        this.f2249d = 1.0f;
        this.f2250e = 1.0f;
    }

    public void m2195a(C0299j c0299j) {
        this.f2248c = c0299j;
    }

    public void m2196b(float f) {
        this.f2250e = f;
    }

    public C0315g[] m2197q() {
        return (C0315g[]) this.f2247b.toArray(new C0315g[0]);
    }

    public boolean m2198r() {
        return this.f2246a;
    }

    public C0299j m2199s() {
        return this.f2248c;
    }

    public float m2200t() {
        return this.f2249d;
    }

    public float m2201u() {
        return this.f2250e;
    }
}
