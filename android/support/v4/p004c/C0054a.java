package android.support.v4.p004c;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.c.a */
public class C0054a<K, V> extends C0053l<K, V> implements Map<K, V> {
    C0055f<K, V> f324a;

    private C0055f<K, V> m451b() {
        if (this.f324a == null) {
            this.f324a = new C0056b(this);
        }
        return this.f324a;
    }

    public boolean m452a(Collection<?> collection) {
        return C0055f.m456c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m451b().m468d();
    }

    public Set<K> keySet() {
        return m451b().m469e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m446a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m451b().m470f();
    }
}
