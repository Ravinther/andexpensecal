package com.google.api.client.p050d;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.d.e */
public final class C0717e {
    private final Map<String, C0718f> f7593a;
    private final Map<Field, C0718f> f7594b;
    private final Object f7595c;

    public C0717e(Object obj) {
        this.f7593a = C0713a.m6885a();
        this.f7594b = C0713a.m6885a();
        this.f7595c = obj;
    }

    public void m6943a() {
        for (Entry entry : this.f7593a.entrySet()) {
            ((Map) this.f7595c).put(entry.getKey(), ((C0718f) entry.getValue()).m6945a());
        }
        for (Entry entry2 : this.f7594b.entrySet()) {
            C0734v.m6983a((Field) entry2.getKey(), this.f7595c, ((C0718f) entry2.getValue()).m6945a());
        }
    }

    public void m6944a(Field field, Class<?> cls, Object obj) {
        C0718f c0718f = (C0718f) this.f7594b.get(field);
        if (c0718f == null) {
            c0718f = new C0718f(cls);
            this.f7594b.put(field, c0718f);
        }
        c0718f.m6946a(cls, obj);
    }
}
