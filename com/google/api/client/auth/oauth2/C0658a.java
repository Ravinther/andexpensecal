package com.google.api.client.auth.oauth2;

import com.google.api.client.json.C0769f;
import com.google.api.client.json.C0771d;
import com.google.api.client.p050d.C0656w;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.C0661o;
import com.google.api.client.p051b.C0686k;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.ac;
import com.google.api.client.p051b.al;

/* renamed from: com.google.api.client.auth.oauth2.a */
public class C0658a extends C0656w {
    C0659w f7355a;
    C0661o f7356b;
    private final ac f7357c;
    private final C0771d f7358d;
    private C0686k f7359e;

    public C0658a m6521a(String str, Object obj) {
        return (C0658a) super.set(str, obj);
    }

    public final C0695x m6522a() {
        C0692t a = this.f7357c.m6579a(new C0660b(this)).m6801a(this.f7359e, new al(this));
        a.m6775a(new C0769f(this.f7358d));
        a.m6779b(false);
        C0695x n = a.m6793n();
        if (n.m6810c()) {
            return n;
        }
        throw C0664d.m6526a(this.f7358d, n);
    }

    public /* synthetic */ C0656w set(String str, Object obj) {
        return m6521a(str, obj);
    }
}
