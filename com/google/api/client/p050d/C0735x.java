package com.google.api.client.p050d;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.d.x */
final class C0735x implements Iterator<Entry<String, Object>> {
    final /* synthetic */ C0656w f7645a;
    private boolean f7646b;
    private final Iterator<Entry<String, Object>> f7647c;
    private final Iterator<Entry<String, Object>> f7648d;

    C0735x(C0656w c0656w, C0732t c0732t) {
        this.f7645a = c0656w;
        this.f7647c = c0732t.m6976a();
        this.f7648d = c0656w.unknownFields.entrySet().iterator();
    }

    public Entry<String, Object> m6993a() {
        if (!this.f7646b) {
            if (this.f7647c.hasNext()) {
                return (Entry) this.f7647c.next();
            }
            this.f7646b = true;
        }
        return (Entry) this.f7648d.next();
    }

    public boolean hasNext() {
        return this.f7647c.hasNext() || this.f7648d.hasNext();
    }

    public /* synthetic */ Object next() {
        return m6993a();
    }

    public void remove() {
        if (this.f7646b) {
            this.f7648d.remove();
        }
        this.f7647c.remove();
    }
}
