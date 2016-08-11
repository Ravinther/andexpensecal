package com.google.api.client.googleapis.p068b.p069a.p071b.p072a;

import com.google.android.gms.auth.C0602d;
import com.google.android.gms.auth.C0603e;
import com.google.android.gms.auth.C0604g;
import com.google.android.gms.auth.C0605f;
import com.google.api.client.p051b.C0661o;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.ad;

/* renamed from: com.google.api.client.googleapis.b.a.b.a.b */
class C0746b implements ad, C0661o {
    boolean f7678a;
    String f7679b;
    final /* synthetic */ C0745a f7680c;

    C0746b(C0745a c0745a) {
        this.f7680c = c0745a;
    }

    public boolean m7011a(C0692t c0692t, C0695x c0695x, boolean z) {
        if (c0695x.m6811d() != 401 || this.f7678a) {
            return false;
        }
        this.f7678a = true;
        C0603e.m4927a(this.f7680c.f7673a, this.f7679b);
        return true;
    }

    public void a_(C0692t c0692t) {
        try {
            this.f7679b = this.f7680c.m7010b();
            c0692t.m6786g().m6729b("Bearer " + this.f7679b);
        } catch (C0605f e) {
            throw new C0749d(e);
        } catch (C0604g e2) {
            throw new C0748e(e2);
        } catch (C0602d e3) {
            throw new C0747c(e3);
        }
    }
}
