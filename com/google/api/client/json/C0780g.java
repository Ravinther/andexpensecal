package com.google.api.client.json;

import com.google.api.client.p050d.am;
import com.google.api.client.p050d.ao;
import java.util.Collection;

/* renamed from: com.google.api.client.json.g */
public class C0780g {
    final C0771d f7739a;
    Collection<String> f7740b;

    public C0780g(C0771d c0771d) {
        this.f7740b = ao.m6922a();
        this.f7739a = (C0771d) am.m6911a((Object) c0771d);
    }

    public C0769f m7144a() {
        return new C0769f(this);
    }

    public C0780g m7145a(Collection<String> collection) {
        this.f7740b = collection;
        return this;
    }
}
