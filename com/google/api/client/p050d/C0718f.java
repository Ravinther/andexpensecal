package com.google.api.client.p050d;

import java.util.ArrayList;

/* renamed from: com.google.api.client.d.f */
class C0718f {
    final Class<?> f7596a;
    final ArrayList<Object> f7597b;

    C0718f(Class<?> cls) {
        this.f7597b = new ArrayList();
        this.f7596a = cls;
    }

    Object m6945a() {
        return at.m6931a(this.f7597b, this.f7596a);
    }

    void m6946a(Class<?> cls, Object obj) {
        am.m6914a(cls == this.f7596a);
        this.f7597b.add(obj);
    }
}
