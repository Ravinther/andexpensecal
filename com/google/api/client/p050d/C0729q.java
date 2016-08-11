package com.google.api.client.p050d;

import java.util.AbstractMap;
import java.util.Set;

/* renamed from: com.google.api.client.d.q */
final class C0729q extends AbstractMap<String, Object> {
    final Object f7624a;
    final C0724l f7625b;

    C0729q(Object obj, boolean z) {
        this.f7624a = obj;
        this.f7625b = C0724l.m6953a(obj.getClass(), z);
        am.m6914a(!this.f7625b.m6957b());
    }

    public C0732t m6972a() {
        return new C0732t(this);
    }

    public Object m6973a(String str, Object obj) {
        Object a = this.f7625b.m6954a(str);
        am.m6912a(a, "no field of key " + str);
        Object a2 = a.m6984a(this.f7624a);
        a.m6986a(this.f7624a, am.m6911a(obj));
        return a2;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public /* synthetic */ Set entrySet() {
        return m6972a();
    }

    public Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        C0734v a = this.f7625b.m6954a((String) obj);
        return a != null ? a.m6984a(this.f7624a) : null;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m6973a((String) obj, obj2);
    }
}
