package com.google.api.client.p050d;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* renamed from: com.google.api.client.d.c */
final class C0715c implements Iterator<Entry<K, V>> {
    final /* synthetic */ C0713a f7589a;
    private boolean f7590b;
    private int f7591c;

    C0715c(C0713a c0713a) {
        this.f7589a = c0713a;
    }

    public Entry<K, V> m6942a() {
        int i = this.f7591c;
        if (i == this.f7589a.f7567a) {
            throw new NoSuchElementException();
        }
        this.f7591c++;
        return new C0714b(this.f7589a, i);
    }

    public boolean hasNext() {
        return this.f7591c < this.f7589a.f7567a;
    }

    public /* synthetic */ Object next() {
        return m6942a();
    }

    public void remove() {
        int i = this.f7591c - 1;
        if (this.f7590b || i < 0) {
            throw new IllegalArgumentException();
        }
        this.f7589a.m6897c(i);
        this.f7590b = true;
    }
}
