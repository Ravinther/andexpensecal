package com.google.api.client.p050d;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.d.y */
final class C0736y extends AbstractSet<Entry<String, Object>> {
    final /* synthetic */ C0656w f7649a;
    private final C0732t f7650b;

    C0736y(C0656w c0656w) {
        this.f7649a = c0656w;
        this.f7650b = new C0729q(c0656w, c0656w.classInfo.m6955a()).m6972a();
    }

    public void clear() {
        this.f7649a.unknownFields.clear();
        this.f7650b.clear();
    }

    public Iterator<Entry<String, Object>> iterator() {
        return new C0735x(this.f7649a, this.f7650b);
    }

    public int size() {
        return this.f7649a.unknownFields.size() + this.f7650b.size();
    }
}
