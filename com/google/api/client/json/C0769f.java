package com.google.api.client.json;

import com.google.api.client.p050d.aj;
import com.google.api.client.p050d.am;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.api.client.json.f */
public class C0769f implements aj {
    private final C0771d f7726a;
    private final Set<String> f7727b;

    public C0769f(C0771d c0771d) {
        this(new C0780g(c0771d));
    }

    protected C0769f(C0780g c0780g) {
        this.f7726a = c0780g.f7739a;
        this.f7727b = new HashSet(c0780g.f7740b);
    }

    private void m7044a(C0775h c0775h) {
        boolean z = true;
        if (!this.f7727b.isEmpty()) {
            try {
                if (c0775h.m7107a(this.f7727b) == null || c0775h.m7112d() == C0783k.END_OBJECT) {
                    z = false;
                }
                am.m6916a(z, "wrapper key(s) not found: %s", this.f7727b);
            } catch (Throwable th) {
                c0775h.m7110b();
            }
        }
    }

    public final C0771d m7045a() {
        return this.f7726a;
    }

    public <T> T m7046a(InputStream inputStream, Charset charset, Class<T> cls) {
        return m7047a(inputStream, charset, (Type) cls);
    }

    public Object m7047a(InputStream inputStream, Charset charset, Type type) {
        C0775h a = this.f7726a.m7055a(inputStream, charset);
        m7044a(a);
        return a.m7106a(type, true, null);
    }

    public Set<String> m7048b() {
        return Collections.unmodifiableSet(this.f7727b);
    }
}
