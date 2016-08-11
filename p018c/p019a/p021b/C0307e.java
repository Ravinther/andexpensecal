package p018c.p019a.p021b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import p018c.p019a.p024e.C0326a;

/* renamed from: c.a.b.e */
public class C0307e implements Serializable {
    private String f2117a;
    private final C0326a<Double, Double> f2118b;
    private double f2119c;
    private double f2120d;
    private double f2121e;
    private double f2122f;
    private final int f2123g;
    private List<String> f2124h;
    private final C0326a<Double, Double> f2125i;

    public C0307e(String str) {
        this(str, 0);
    }

    public C0307e(String str, int i) {
        this.f2118b = new C0326a();
        this.f2119c = Double.MAX_VALUE;
        this.f2120d = -1.7976931348623157E308d;
        this.f2121e = Double.MAX_VALUE;
        this.f2122f = -1.7976931348623157E308d;
        this.f2124h = new ArrayList();
        this.f2125i = new C0326a();
        this.f2117a = str;
        this.f2123g = i;
        m2031j();
    }

    private void m2030b(double d, double d2) {
        this.f2119c = Math.min(this.f2119c, d);
        this.f2120d = Math.max(this.f2120d, d);
        this.f2121e = Math.min(this.f2121e, d2);
        this.f2122f = Math.max(this.f2122f, d2);
    }

    private void m2031j() {
        this.f2119c = Double.MAX_VALUE;
        this.f2120d = -1.7976931348623157E308d;
        this.f2121e = Double.MAX_VALUE;
        this.f2122f = -1.7976931348623157E308d;
        int e = m2043e();
        for (int i = 0; i < e; i++) {
            m2030b(m2032a(i), m2037b(i));
        }
    }

    public synchronized double m2032a(int i) {
        return ((Double) this.f2118b.m2223a(i)).doubleValue();
    }

    public int m2033a() {
        return this.f2123g;
    }

    public int m2034a(double d) {
        return this.f2118b.m2222a(Double.valueOf(d));
    }

    public synchronized SortedMap<Double, Double> m2035a(double d, double d2, boolean z) {
        if (z) {
            SortedMap headMap = this.f2118b.headMap(Double.valueOf(d));
            if (!headMap.isEmpty()) {
                d = ((Double) headMap.lastKey()).doubleValue();
            }
            headMap = this.f2118b.tailMap(Double.valueOf(d2));
            if (!headMap.isEmpty()) {
                Iterator it = headMap.keySet().iterator();
                d2 = it.hasNext() ? ((Double) it.next()).doubleValue() : d2 + ((Double) it.next()).doubleValue();
            }
        }
        return this.f2118b.subMap(Double.valueOf(d), Double.valueOf(d2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m2036a(double r4, double r6) {
        /*
        r3 = this;
        monitor-enter(r3);
    L_0x0001:
        r0 = r3.f2118b;	 Catch:{ all -> 0x0025 }
        r1 = java.lang.Double.valueOf(r4);	 Catch:{ all -> 0x0025 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x0013;
    L_0x000d:
        r0 = r3.m2039c();	 Catch:{ all -> 0x0025 }
        r4 = r4 + r0;
        goto L_0x0001;
    L_0x0013:
        r0 = r3.f2118b;	 Catch:{ all -> 0x0025 }
        r1 = java.lang.Double.valueOf(r4);	 Catch:{ all -> 0x0025 }
        r2 = java.lang.Double.valueOf(r6);	 Catch:{ all -> 0x0025 }
        r0.put(r1, r2);	 Catch:{ all -> 0x0025 }
        r3.m2030b(r4, r6);	 Catch:{ all -> 0x0025 }
        monitor-exit(r3);
        return;
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.e.a(double, double):void");
    }

    public synchronized double m2037b(int i) {
        return ((Double) this.f2118b.m2224b(i)).doubleValue();
    }

    public String m2038b() {
        return this.f2117a;
    }

    protected double m2039c() {
        return 1.0E-12d;
    }

    public double m2040c(int i) {
        return ((Double) this.f2125i.m2223a(i)).doubleValue();
    }

    public double m2041d(int i) {
        return ((Double) this.f2125i.m2224b(i)).doubleValue();
    }

    public int m2042d() {
        return this.f2124h.size();
    }

    public synchronized int m2043e() {
        return this.f2118b.size();
    }

    public String m2044e(int i) {
        return (String) this.f2124h.get(i);
    }

    public double m2045f() {
        return this.f2119c;
    }

    public double m2046g() {
        return this.f2121e;
    }

    public double m2047h() {
        return this.f2120d;
    }

    public double m2048i() {
        return this.f2122f;
    }
}
