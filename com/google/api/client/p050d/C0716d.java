package com.google.api.client.p050d;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.d.d */
final class C0716d extends AbstractSet<Entry<K, V>> {
    final /* synthetic */ C0713a f7592a;

    C0716d(C0713a c0713a) {
        this.f7592a = c0713a;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C0715c(this.f7592a);
    }

    public int size() {
        return this.f7592a.f7567a;
    }
}
