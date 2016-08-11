package com.google.api.client.p055c.p056a.p057a.p058a.p059a;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.api.client.c.a.a.a.a.c */
public final class C0699c {
    private final String f7533a;
    private final List<C0700d> f7534b;
    private boolean f7535c;

    private C0699c(String str) {
        this.f7534b = new LinkedList();
        this.f7535c = false;
        this.f7533a = (String) C0701e.m6830a((Object) str);
    }

    private C0700d m6827a() {
        C0700d c0700d = new C0700d();
        this.f7534b.add(c0700d);
        return c0700d;
    }

    private C0700d m6828a(Object obj) {
        C0700d a = m6827a();
        a.f7537b = obj == null;
        return a;
    }

    public C0699c m6829a(String str, Object obj) {
        C0701e.m6830a((Object) str);
        m6828a(obj).f7536a.append(str).append('=').append(obj);
        return this;
    }

    public String toString() {
        boolean z = this.f7535c;
        StringBuilder append = new StringBuilder(32).append(this.f7533a).append('{');
        Object obj = null;
        for (C0700d c0700d : this.f7534b) {
            if (!z || !c0700d.f7537b) {
                if (obj != null) {
                    append.append(", ");
                } else {
                    obj = 1;
                }
                append.append(c0700d.f7536a);
            }
            obj = obj;
        }
        return append.append('}').toString();
    }
}
