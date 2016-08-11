package com.google.api.client.googleapis.p066a;

import com.google.api.client.p050d.am;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.C0686k;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.C0694v;
import com.google.api.client.p051b.ac;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.api.client.googleapis.a.b */
public final class C0740b {
    List<C0741c<?, ?>> f7653a;
    private C0686k f7654b;
    private final C0694v f7655c;

    public C0740b(ac acVar, C0659w c0659w) {
        this.f7654b = new C0686k("https://www.googleapis.com/batch");
        this.f7653a = new ArrayList();
        this.f7655c = c0659w == null ? acVar.m6578a() : acVar.m6579a(c0659w);
    }

    public C0740b m6994a(C0686k c0686k) {
        this.f7654b = c0686k;
        return this;
    }

    public <T, E> C0740b m6995a(C0692t c0692t, Class<T> cls, Class<E> cls2, C0738a<T, E> c0738a) {
        am.m6911a((Object) c0692t);
        am.m6911a((Object) c0738a);
        am.m6911a((Object) cls);
        am.m6911a((Object) cls2);
        this.f7653a.add(new C0741c(c0738a, cls, cls2, c0692t));
        return this;
    }
}
