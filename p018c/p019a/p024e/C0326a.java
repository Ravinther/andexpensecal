package p018c.p019a.p024e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: c.a.e.a */
public class C0326a<K, V> extends TreeMap<K, V> {
    private final List<K> f2274a;
    private double f2275b;

    public C0326a() {
        this.f2274a = new ArrayList();
        this.f2275b = 0.0d;
    }

    private void m2221a() {
        if (this.f2274a.size() < 2) {
            this.f2275b = 0.0d;
        } else if (Math.abs(((Double) this.f2274a.get(this.f2274a.size() - 1)).doubleValue() - ((Double) this.f2274a.get(this.f2274a.size() - 2)).doubleValue()) > this.f2275b) {
            this.f2275b = Math.abs(((Double) this.f2274a.get(this.f2274a.size() - 1)).doubleValue() - ((Double) this.f2274a.get(this.f2274a.size() - 2)).doubleValue());
        }
    }

    public int m2222a(K k) {
        return Collections.binarySearch(this.f2274a, k, null);
    }

    public K m2223a(int i) {
        return this.f2274a.get(i);
    }

    public V m2224b(int i) {
        return get(this.f2274a.get(i));
    }

    public void clear() {
        m2221a();
        super.clear();
        this.f2274a.clear();
    }

    public V put(K k, V v) {
        this.f2274a.add(k);
        m2221a();
        return super.put(k, v);
    }
}
