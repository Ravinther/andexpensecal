package com.google.api.client.p050d;

import java.util.Map.Entry;

/* renamed from: com.google.api.client.d.b */
final class C0714b implements Entry<K, V> {
    final /* synthetic */ C0713a f7587a;
    private int f7588b;

    C0714b(C0713a c0713a, int i) {
        this.f7587a = c0713a;
        this.f7588b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return ak.m6909a(getKey(), entry.getKey()) && ak.m6909a(getValue(), entry.getValue());
    }

    public K getKey() {
        return this.f7587a.m6892a(this.f7588b);
    }

    public V getValue() {
        return this.f7587a.m6896b(this.f7588b);
    }

    public int hashCode() {
        return getKey().hashCode() ^ getValue().hashCode();
    }

    public V setValue(V v) {
        return this.f7587a.m6893a(this.f7588b, v);
    }
}
