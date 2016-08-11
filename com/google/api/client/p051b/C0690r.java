package com.google.api.client.p051b;

import com.google.api.client.p050d.C0717e;
import com.google.api.client.p050d.C0724l;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.api.client.b.r */
final class C0690r {
    final C0717e f7474a;
    final StringBuilder f7475b;
    final C0724l f7476c;
    final List<Type> f7477d;

    public C0690r(C0688p c0688p, StringBuilder stringBuilder) {
        this.f7477d = Arrays.asList(new Type[]{c0688p.getClass()});
        this.f7476c = C0724l.m6953a(r0, true);
        this.f7475b = stringBuilder;
        this.f7474a = new C0717e(c0688p);
    }

    void m6750a() {
        this.f7474a.m6943a();
    }
}
