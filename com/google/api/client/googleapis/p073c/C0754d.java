package com.google.api.client.googleapis.p073c;

import com.google.api.client.googleapis.C0750b;
import com.google.api.client.p050d.C0721i;
import com.google.api.client.p050d.am;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.C0670l;
import com.google.api.client.p051b.C0672b;
import com.google.api.client.p051b.C0678d;
import com.google.api.client.p051b.C0679e;
import com.google.api.client.p051b.C0680f;
import com.google.api.client.p051b.C0684i;
import com.google.api.client.p051b.C0686k;
import com.google.api.client.p051b.C0688p;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.C0694v;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.ac;
import com.google.api.client.p051b.ae;
import com.google.api.client.p051b.ah;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.api.client.googleapis.c.d */
public final class C0754d {
    private C0755e f7696a;
    private final C0672b f7697b;
    private final C0694v f7698c;
    private final ac f7699d;
    private C0670l f7700e;
    private long f7701f;
    private boolean f7702g;
    private String f7703h;
    private C0688p f7704i;
    private C0692t f7705j;
    private InputStream f7706k;
    private boolean f7707l;
    private boolean f7708m;
    private C0756f f7709n;
    private long f7710o;
    private int f7711p;
    private Byte f7712q;
    private byte[] f7713r;
    private boolean f7714s;

    public C0754d(C0672b c0672b, ac acVar, C0659w c0659w) {
        this.f7696a = C0755e.NOT_STARTED;
        this.f7703h = "POST";
        this.f7704i = new C0688p();
        this.f7707l = true;
        this.f7711p = 10485760;
        this.f7697b = (C0672b) am.m6911a((Object) c0672b);
        this.f7699d = (ac) am.m6911a((Object) acVar);
        this.f7698c = c0659w == null ? acVar.m6578a() : acVar.m6579a(c0659w);
    }

    private C0695x m7027a(C0692t c0692t) {
        new C0750b().a_(c0692t);
        c0692t.m6779b(false);
        c0692t.m6782c(true);
        return c0692t.m6793n();
    }

    private void m7028a(long j) {
        C0670l c;
        int i;
        String valueOf;
        int min = m7030b() >= 0 ? (int) Math.min((long) this.f7711p, m7030b() - j) : this.f7711p;
        if (m7030b() >= 0) {
            this.f7706k.mark(min);
            c = new ae(this.f7697b.m6611e(), C0721i.m6951a(this.f7706k, (long) min)).m6617b(true).m6612a((long) min).m6618c(false);
            i = min;
            valueOf = String.valueOf(m7030b());
        } else {
            int a;
            int i2;
            if (this.f7713r == null) {
                i = this.f7712q == null ? min + 1 : min;
                this.f7713r = new byte[(min + 1)];
                if (this.f7712q != null) {
                    this.f7713r[0] = this.f7712q.byteValue();
                }
                a = C0721i.m6949a(this.f7706k, this.f7713r, (min + 1) - i, i);
                i2 = 0;
            } else {
                i2 = (int) ((((long) this.f7711p) - (j - this.f7710o)) + 1);
                a = i2;
                int i3 = i2;
                i2 = (int) (j - this.f7710o);
                i = i3;
            }
            if (a < i) {
                min = Math.max(0, a);
                if (this.f7712q != null) {
                    min++;
                }
                i = min;
                valueOf = String.valueOf(((long) min) + j);
            } else {
                this.f7712q = Byte.valueOf(this.f7713r[min]);
                i = min;
                valueOf = "*";
            }
            c = new C0678d(this.f7697b.m6611e(), this.f7713r, i2, i);
        }
        this.f7705j.m6772a(c);
        if (i == 0) {
            this.f7705j.m6786g().m6733d("bytes */0");
        } else {
            this.f7705j.m6786g().m6733d("bytes " + j + "-" + ((((long) i) + j) - 1) + "/" + valueOf);
        }
    }

    private void m7029a(C0755e c0755e) {
        this.f7696a = c0755e;
        if (this.f7709n != null) {
            this.f7709n.m7040a(this);
        }
    }

    private long m7030b() {
        if (!this.f7702g) {
            this.f7701f = this.f7697b.m6590b();
            this.f7702g = true;
        }
        return this.f7701f;
    }

    private long m7031b(String str) {
        return str == null ? 0 : Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    private C0695x m7032b(C0686k c0686k) {
        m7029a(C0755e.INITIATION_STARTED);
        c0686k.put("uploadType", (Object) "resumable");
        C0692t a = this.f7698c.m6802a(this.f7703h, c0686k, this.f7700e == null ? new C0679e() : this.f7700e);
        this.f7704i.m6724a("X-Upload-Content-Type", this.f7697b.m6611e());
        if (m7030b() >= 0) {
            this.f7704i.m6724a("X-Upload-Content-Length", Long.valueOf(m7030b()));
        }
        a.m6786g().putAll(this.f7704i);
        C0695x b = m7033b(a);
        try {
            m7029a(C0755e.INITIATION_COMPLETE);
            return b;
        } catch (Throwable th) {
            b.m6816i();
        }
    }

    private C0695x m7033b(C0692t c0692t) {
        if (this.f7707l) {
            c0692t.m6770a(new C0680f());
        }
        if (!(this.f7714s || (c0692t.m6783d() instanceof C0679e))) {
            c0692t.m6773a(new C0684i());
        }
        return m7027a(c0692t);
    }

    public C0695x m7034a(C0686k c0686k) {
        am.m6914a(this.f7696a == C0755e.NOT_STARTED);
        if (this.f7708m) {
            m7029a(C0755e.MEDIA_IN_PROGRESS);
            C0670l c0670l = this.f7697b;
            if (this.f7700e != null) {
                c0670l = new ah().m6622a(Arrays.asList(new C0670l[]{this.f7700e, this.f7697b}));
                c0686k.put("uploadType", (Object) "multipart");
            } else {
                c0686k.put("uploadType", (Object) "media");
            }
            C0692t a = this.f7698c.m6802a(this.f7703h, c0686k, c0670l);
            a.m6786g().putAll(this.f7704i);
            C0695x b = m7033b(a);
            try {
                if (m7030b() >= 0) {
                    this.f7710o = m7030b();
                }
                m7029a(C0755e.MEDIA_COMPLETE);
                return b;
            } catch (Throwable th) {
                b.m6816i();
            }
        } else {
            C0695x b2 = m7032b(c0686k);
            if (!b2.m6810c()) {
                return b2;
            }
            try {
                C0686k c0686k2 = new C0686k(b2.m6809b().m6738f());
                this.f7706k = this.f7697b.m6609c();
                if (!this.f7706k.markSupported() && m7030b() >= 0) {
                    this.f7706k = new BufferedInputStream(this.f7706k);
                }
                while (true) {
                    this.f7705j = this.f7698c.m6803b(c0686k2, null);
                    m7028a(this.f7710o);
                    if (this.f7707l) {
                        this.f7705j.m6770a(new C0757g(this));
                    }
                    if (m7030b() < 0 && !this.f7714s) {
                        this.f7705j.m6773a(new C0684i());
                    }
                    b2 = m7027a(this.f7705j);
                    if (b2.m6810c()) {
                        break;
                    }
                    try {
                        if (b2.m6811d() != 308) {
                            return b2;
                        }
                        String f = b2.m6809b().m6738f();
                        if (f != null) {
                            c0686k2 = new C0686k(f);
                        }
                        this.f7710o = m7031b(b2.m6809b().m6740g());
                        this.f7713r = null;
                        m7029a(C0755e.MEDIA_IN_PROGRESS);
                        b2.m6816i();
                    } catch (Throwable th2) {
                        b2.m6816i();
                    }
                }
                this.f7710o = m7030b();
                if (this.f7697b.m6610d()) {
                    this.f7706k.close();
                }
                m7029a(C0755e.MEDIA_COMPLETE);
                return b2;
            } finally {
                b2.m6816i();
            }
        }
    }

    public C0754d m7035a(C0670l c0670l) {
        this.f7700e = c0670l;
        return this;
    }

    public C0754d m7036a(C0688p c0688p) {
        this.f7704i = c0688p;
        return this;
    }

    public C0754d m7037a(String str) {
        boolean z = str.equals("POST") || str.equals("PUT");
        am.m6914a(z);
        this.f7703h = str;
        return this;
    }

    public C0754d m7038a(boolean z) {
        this.f7714s = z;
        return this;
    }

    public void m7039a() {
        am.m6912a(this.f7705j, (Object) "The current request should not be null");
        C0692t b = this.f7698c.m6803b(this.f7705j.m6781c(), new C0679e());
        b.m6786g().m6733d("bytes */" + (m7030b() >= 0 ? Long.valueOf(m7030b()) : "*"));
        C0695x b2 = m7033b(b);
        try {
            long b3 = m7031b(b2.m6809b().m6740g());
            String f = b2.m6809b().m6738f();
            if (f != null) {
                this.f7705j.m6771a(new C0686k(f));
            }
            if (m7030b() >= 0) {
                this.f7706k.reset();
                long j = this.f7710o - b3;
                am.m6917b(j == this.f7706k.skip(j));
            }
            m7028a(b3);
        } finally {
            b2.m6816i();
        }
    }
}
