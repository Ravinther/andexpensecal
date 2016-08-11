package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0775h;
import com.google.api.client.json.C0783k;
import com.google.api.client.p050d.C0726n;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.an;
import com.google.api.client.p050d.aq;
import com.google.api.client.p051b.C0686k;
import com.google.api.client.p051b.C0688p;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.ac;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.api.client.googleapis.auth.oauth2.a */
public class C0743a {
    private static final Pattern f7664a;
    private final C0771d f7665b;
    private List<PublicKey> f7666c;
    private long f7667d;
    @Deprecated
    private Set<String> f7668e;
    private final ac f7669f;
    private final Lock f7670g;
    private final C0726n f7671h;

    static {
        f7664a = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");
    }

    long m7000a(C0688p c0688p) {
        long longValue;
        if (c0688p.m6730b() != null) {
            for (CharSequence matcher : c0688p.m6730b().split(",")) {
                Matcher matcher2 = f7664a.matcher(matcher);
                if (matcher2.matches()) {
                    longValue = Long.valueOf(matcher2.group(1)).longValue();
                    break;
                }
            }
        }
        longValue = 0;
        if (c0688p.m6744i() != null) {
            longValue -= c0688p.m6744i().longValue();
        }
        return Math.max(0, longValue);
    }

    public C0743a m7001a() {
        C0775h a;
        this.f7670g.lock();
        try {
            this.f7666c = new ArrayList();
            CertificateFactory b = an.m6921b();
            C0695x n = this.f7669f.m6578a().m6800a(new C0686k("https://www.googleapis.com/oauth2/v1/certs")).m6793n();
            this.f7667d = this.f7671h.m6959a() + (m7000a(n.m6809b()) * 1000);
            a = this.f7665b.m7054a(n.m6814g());
            C0783k d = a.m7112d();
            if (d == null) {
                d = a.m7111c();
            }
            am.m6914a(d == C0783k.START_OBJECT);
            while (a.m7111c() != C0783k.END_OBJECT) {
                a.m7111c();
                this.f7666c.add(((X509Certificate) b.generateCertificate(new ByteArrayInputStream(aq.m6923a(a.m7115g())))).getPublicKey());
            }
            this.f7666c = Collections.unmodifiableList(this.f7666c);
            a.m7110b();
            this.f7670g.unlock();
            return this;
        } catch (Throwable th) {
            this.f7670g.unlock();
        }
    }

    public boolean m7002a(GoogleIdToken googleIdToken) {
        if (!this.f7668e.isEmpty()) {
            return m7003a(this.f7668e, googleIdToken);
        }
        if (!googleIdToken.m6538a("accounts.google.com") || !googleIdToken.m6537a(this.f7671h.m6959a(), 300)) {
            return false;
        }
        this.f7670g.lock();
        try {
            if (this.f7666c == null || this.f7671h.m6959a() + 300000 > this.f7667d) {
                m7001a();
            }
            for (PublicKey a : this.f7666c) {
                if (googleIdToken.m6530a(a)) {
                    return true;
                }
            }
            this.f7670g.unlock();
            return false;
        } finally {
            this.f7670g.unlock();
        }
    }

    @Deprecated
    public boolean m7003a(Set<String> set, GoogleIdToken googleIdToken) {
        Payload c = googleIdToken.m6999c();
        if (!googleIdToken.m6537a(this.f7671h.m6959a(), 300) || !"accounts.google.com".equals(c.getIssuer()) || (!set.isEmpty() && (!set.contains(c.getAudience()) || !set.contains(c.getIssuee())))) {
            return false;
        }
        if (googleIdToken.m6531d().getAlgorithm().equals("RS256")) {
            this.f7670g.lock();
            try {
                if (this.f7666c == null || this.f7671h.m6959a() + 300000 > this.f7667d) {
                    m7001a();
                }
                Signature instance = Signature.getInstance("SHA256withRSA");
                for (PublicKey initVerify : this.f7666c) {
                    instance.initVerify(initVerify);
                    instance.update(googleIdToken.m6533f());
                    if (instance.verify(googleIdToken.m6532e())) {
                        return true;
                    }
                }
                this.f7670g.unlock();
            } finally {
                this.f7670g.unlock();
            }
        }
        return false;
    }
}
