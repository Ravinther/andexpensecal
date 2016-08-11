package com.google.api.client.p051b;

/* renamed from: com.google.api.client.b.v */
public final class C0694v {
    private final ac f7515a;
    private final C0659w f7516b;

    C0694v(ac acVar, C0659w c0659w) {
        this.f7515a = acVar;
        this.f7516b = c0659w;
    }

    public ac m6799a() {
        return this.f7515a;
    }

    public C0692t m6800a(C0686k c0686k) {
        return m6802a("GET", c0686k, null);
    }

    public C0692t m6801a(C0686k c0686k, C0670l c0670l) {
        return m6802a("POST", c0686k, c0670l);
    }

    public C0692t m6802a(String str, C0686k c0686k, C0670l c0670l) {
        C0692t b = this.f7515a.m6581b();
        if (this.f7516b != null) {
            this.f7516b.m6523a(b);
        }
        b.m6776a(str);
        if (c0686k != null) {
            b.m6771a(c0686k);
        }
        if (c0670l != null) {
            b.m6772a(c0670l);
        }
        return b;
    }

    public C0692t m6803b(C0686k c0686k, C0670l c0670l) {
        return m6802a("PUT", c0686k, c0670l);
    }

    public C0659w m6804b() {
        return this.f7516b;
    }
}
