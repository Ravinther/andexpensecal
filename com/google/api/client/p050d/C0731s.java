package com.google.api.client.p050d;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* renamed from: com.google.api.client.d.s */
final class C0731s implements Iterator<Entry<String, Object>> {
    final /* synthetic */ C0729q f7629a;
    private int f7630b;
    private C0734v f7631c;
    private Object f7632d;
    private boolean f7633e;
    private boolean f7634f;
    private C0734v f7635g;

    C0731s(C0729q c0729q) {
        this.f7629a = c0729q;
        this.f7630b = -1;
    }

    public Entry<String, Object> m6975a() {
        if (hasNext()) {
            this.f7635g = this.f7631c;
            Object obj = this.f7632d;
            this.f7634f = false;
            this.f7633e = false;
            this.f7631c = null;
            this.f7632d = null;
            return new C0730r(this.f7629a, this.f7635g, obj);
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        if (!this.f7634f) {
            this.f7634f = true;
            this.f7632d = null;
            while (this.f7632d == null) {
                int i = this.f7630b + 1;
                this.f7630b = i;
                if (i >= this.f7629a.f7625b.f7605a.size()) {
                    break;
                }
                this.f7631c = this.f7629a.f7625b.m6954a((String) this.f7629a.f7625b.f7605a.get(this.f7630b));
                this.f7632d = this.f7631c.m6984a(this.f7629a.f7624a);
            }
        }
        return this.f7632d != null;
    }

    public /* synthetic */ Object next() {
        return m6975a();
    }

    public void remove() {
        boolean z = (this.f7635g == null || this.f7633e) ? false : true;
        am.m6917b(z);
        this.f7633e = true;
        this.f7635g.m6986a(this.f7629a.f7624a, null);
    }
}
