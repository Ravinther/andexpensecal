package com.google.api.client.p051b;

import com.google.api.client.p050d.C0723k;
import com.google.api.client.p050d.aa;
import java.nio.charset.Charset;

/* renamed from: com.google.api.client.b.a */
public abstract class C0671a implements C0670l {
    private C0691s f7387a;
    private long f7388b;

    protected C0671a(C0691s c0691s) {
        this.f7388b = -1;
        this.f7387a = c0691s;
    }

    protected C0671a(String str) {
        this(str == null ? null : new C0691s(str));
    }

    public static long m6593a(C0670l c0670l) {
        return !c0670l.m6592g() ? -1 : aa.m6899a(c0670l);
    }

    @Deprecated
    public String m6594a() {
        return null;
    }

    public long m6595b() {
        if (this.f7388b == -1) {
            this.f7388b = m6599f();
        }
        return this.f7388b;
    }

    public final C0691s m6596c() {
        return this.f7387a;
    }

    protected final Charset m6597d() {
        return (this.f7387a == null || this.f7387a.m6765d() == null) ? C0723k.f7601a : this.f7387a.m6765d();
    }

    public String m6598e() {
        return this.f7387a == null ? null : this.f7387a.m6762c();
    }

    protected long m6599f() {
        return C0671a.m6593a(this);
    }

    public boolean m6600g() {
        return true;
    }
}
