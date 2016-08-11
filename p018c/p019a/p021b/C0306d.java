package p018c.p019a.p021b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.b.d */
public class C0306d implements Serializable {
    private List<C0307e> f2116a;

    public C0306d() {
        this.f2116a = new ArrayList();
    }

    public synchronized int m2026a() {
        return this.f2116a.size();
    }

    public synchronized C0307e m2027a(int i) {
        return (C0307e) this.f2116a.get(i);
    }

    public synchronized void m2028a(C0307e c0307e) {
        this.f2116a.add(c0307e);
    }

    public synchronized C0307e[] m2029b() {
        return (C0307e[]) this.f2116a.toArray(new C0307e[0]);
    }
}
