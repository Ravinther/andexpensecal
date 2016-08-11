package com.google.api.client.p050d;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.d.t */
final class C0732t extends AbstractSet<Entry<String, Object>> {
    final /* synthetic */ C0729q f7636a;

    C0732t(C0729q c0729q) {
        this.f7636a = c0729q;
    }

    public C0731s m6976a() {
        return new C0731s(this.f7636a);
    }

    public void clear() {
        for (String a : this.f7636a.f7625b.f7605a) {
            this.f7636a.f7625b.m6954a(a).m6986a(this.f7636a.f7624a, null);
        }
    }

    public boolean isEmpty() {
        for (String a : this.f7636a.f7625b.f7605a) {
            if (this.f7636a.f7625b.m6954a(a).m6984a(this.f7636a.f7624a) != null) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ Iterator iterator() {
        return m6976a();
    }

    public int size() {
        int i = 0;
        for (String a : this.f7636a.f7625b.f7605a) {
            i = this.f7636a.f7625b.m6954a(a).m6984a(this.f7636a.f7624a) != null ? i + 1 : i;
        }
        return i;
    }
}
