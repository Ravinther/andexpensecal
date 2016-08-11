package com.google.api.client.p050d;

import java.util.Map.Entry;

/* renamed from: com.google.api.client.d.r */
final class C0730r implements Entry<String, Object> {
    final /* synthetic */ C0729q f7626a;
    private Object f7627b;
    private final C0734v f7628c;

    C0730r(C0729q c0729q, C0734v c0734v, Object obj) {
        this.f7626a = c0729q;
        this.f7628c = c0734v;
        this.f7627b = am.m6911a(obj);
    }

    public String m6974a() {
        String b = this.f7628c.m6987b();
        return this.f7626a.f7625b.m6955a() ? b.toLowerCase() : b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m6974a().equals(entry.getKey()) && getValue().equals(entry.getValue());
    }

    public /* synthetic */ Object getKey() {
        return m6974a();
    }

    public Object getValue() {
        return this.f7627b;
    }

    public int hashCode() {
        return m6974a().hashCode() ^ getValue().hashCode();
    }

    public Object setValue(Object obj) {
        Object obj2 = this.f7627b;
        this.f7627b = am.m6911a(obj);
        this.f7628c.m6986a(this.f7626a.f7624a, obj);
        return obj2;
    }
}
