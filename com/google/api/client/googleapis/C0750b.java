package com.google.api.client.googleapis;

import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.C0661o;
import com.google.api.client.p051b.C0679e;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.al;

/* renamed from: com.google.api.client.googleapis.b */
public final class C0750b implements C0661o, C0659w {
    private final boolean f7681a;

    public C0750b() {
        this(false);
    }

    C0750b(boolean z) {
        this.f7681a = z;
    }

    private boolean m7019b(C0692t c0692t) {
        String b = c0692t.m6780b();
        if (b.equals("POST")) {
            return false;
        }
        if (b.equals("GET")) {
            if (c0692t.m6781c().m6707b().length() > 2048) {
                return true;
            }
        } else if (this.f7681a) {
            return true;
        }
        return !c0692t.m6767a().m6580a(b);
    }

    public void m7020a(C0692t c0692t) {
        c0692t.m6774a((C0661o) this);
    }

    public void a_(C0692t c0692t) {
        if (m7019b(c0692t)) {
            Object b = c0692t.m6780b();
            c0692t.m6776a("POST");
            c0692t.m6786g().m6724a("X-HTTP-Method-Override", b);
            if (b.equals("GET")) {
                c0692t.m6772a(new al(c0692t.m6781c()));
            } else if (c0692t.m6783d() == null) {
                c0692t.m6772a(new C0679e());
            }
        }
    }
}
