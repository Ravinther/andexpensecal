package com.google.api.client.p051b;

import com.google.api.client.p050d.aa;
import com.google.api.client.p050d.af;
import com.google.api.client.p050d.aj;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.ap;
import com.google.api.client.p050d.aq;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.b.t */
public final class C0692t {
    private C0661o f7486a;
    private C0688p f7487b;
    private C0688p f7488c;
    private int f7489d;
    private int f7490e;
    private boolean f7491f;
    private boolean f7492g;
    private C0670l f7493h;
    private final ac f7494i;
    private String f7495j;
    private C0686k f7496k;
    private int f7497l;
    private int f7498m;
    private ad f7499n;
    private aa f7500o;
    private aj f7501p;
    private C0683m f7502q;
    @Deprecated
    private boolean f7503r;
    private C0677c f7504s;
    private boolean f7505t;
    private boolean f7506u;
    private boolean f7507v;
    private boolean f7508w;

    C0692t(ac acVar, String str) {
        this.f7487b = new C0688p();
        this.f7488c = new C0688p();
        this.f7489d = 10;
        this.f7490e = 16384;
        this.f7491f = true;
        this.f7492g = true;
        this.f7497l = 20000;
        this.f7498m = 20000;
        this.f7505t = true;
        this.f7506u = true;
        this.f7507v = false;
        this.f7494i = acVar;
        m6776a(str);
    }

    private void m6766a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }

    public ac m6767a() {
        return this.f7494i;
    }

    public C0692t m6768a(aa aaVar) {
        this.f7500o = aaVar;
        return this;
    }

    public C0692t m6769a(ad adVar) {
        this.f7499n = adVar;
        return this;
    }

    public C0692t m6770a(C0677c c0677c) {
        this.f7504s = c0677c;
        return this;
    }

    public C0692t m6771a(C0686k c0686k) {
        this.f7496k = (C0686k) am.m6911a((Object) c0686k);
        return this;
    }

    public C0692t m6772a(C0670l c0670l) {
        this.f7493h = c0670l;
        return this;
    }

    public C0692t m6773a(C0683m c0683m) {
        this.f7502q = c0683m;
        return this;
    }

    public C0692t m6774a(C0661o c0661o) {
        this.f7486a = c0661o;
        return this;
    }

    public C0692t m6775a(aj ajVar) {
        this.f7501p = ajVar;
        return this;
    }

    public C0692t m6776a(String str) {
        boolean z = str == null || C0691s.m6752e(str);
        am.m6914a(z);
        this.f7495j = str;
        return this;
    }

    @Deprecated
    public C0692t m6777a(boolean z) {
        this.f7503r = z;
        return this;
    }

    public boolean m6778a(int i, C0688p c0688p) {
        String f = c0688p.m6738f();
        if (!m6791l() || !ab.m6603b(i) || f == null) {
            return false;
        }
        m6771a(new C0686k(this.f7496k.m6706a(f)));
        if (i == 303) {
            m6776a("GET");
        }
        this.f7487b.m6729b((String) null);
        this.f7487b.m6739g((String) null);
        this.f7487b.m6741h((String) null);
        this.f7487b.m6737f((String) null);
        this.f7487b.m6743i((String) null);
        this.f7487b.m6745j((String) null);
        return true;
    }

    public C0692t m6779b(boolean z) {
        this.f7506u = z;
        return this;
    }

    public String m6780b() {
        return this.f7495j;
    }

    public C0686k m6781c() {
        return this.f7496k;
    }

    public C0692t m6782c(boolean z) {
        this.f7507v = z;
        return this;
    }

    public C0670l m6783d() {
        return this.f7493h;
    }

    public int m6784e() {
        return this.f7490e;
    }

    public boolean m6785f() {
        return this.f7491f;
    }

    public C0688p m6786g() {
        return this.f7487b;
    }

    public C0688p m6787h() {
        return this.f7488c;
    }

    public C0661o m6788i() {
        return this.f7486a;
    }

    public aa m6789j() {
        return this.f7500o;
    }

    public final aj m6790k() {
        return this.f7501p;
    }

    public boolean m6791l() {
        return this.f7505t;
    }

    public boolean m6792m() {
        return this.f7506u;
    }

    public C0695x m6793n() {
        Throwable th;
        am.m6914a(this.f7489d >= 0);
        int i = this.f7489d;
        if (this.f7504s != null) {
            this.f7504s.m6669b();
        }
        C0695x c0695x = null;
        am.m6911a(this.f7495j);
        am.m6911a(this.f7496k);
        int i2 = i;
        while (true) {
            Object obj;
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            StringBuilder stringBuilder3;
            StringBuilder stringBuilder4;
            String h;
            ap apVar;
            boolean z;
            String e;
            ap afVar;
            String a;
            boolean z2;
            String a2;
            ap c0687n;
            long a3;
            boolean z3;
            boolean z4;
            Object obj2;
            Object obj3;
            long a4;
            int i3;
            if (c0695x != null) {
                c0695x.m6815h();
            }
            if (this.f7486a != null) {
                this.f7486a.a_(this);
            }
            String b = this.f7496k.m6707b();
            af a5 = this.f7494i.m6577a(this.f7495j, b);
            Logger logger = ac.f7381a;
            if (this.f7491f) {
                if (logger.isLoggable(Level.CONFIG)) {
                    obj = 1;
                    if (obj == null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("-------------- REQUEST  --------------").append(aq.f7582a);
                        stringBuilder.append(this.f7495j).append(' ').append(b).append(aq.f7582a);
                        if (this.f7492g) {
                            stringBuilder2 = null;
                            stringBuilder3 = stringBuilder;
                        } else {
                            stringBuilder4 = new StringBuilder("curl -v --compressed");
                            if (!this.f7495j.equals("GET")) {
                                stringBuilder4.append(" -X ").append(this.f7495j);
                            }
                            stringBuilder2 = stringBuilder4;
                            stringBuilder3 = stringBuilder;
                        }
                    } else {
                        stringBuilder2 = null;
                        stringBuilder3 = null;
                    }
                    h = this.f7487b.m6742h();
                    if (!this.f7508w) {
                        if (h != null) {
                            this.f7487b.m6747l("Google-HTTP-Java-Client/1.14.1-beta (gzip)");
                        } else {
                            this.f7487b.m6747l(h + " " + "Google-HTTP-Java-Client/1.14.1-beta (gzip)");
                        }
                    }
                    C0688p.m6715a(this.f7487b, stringBuilder3, stringBuilder2, logger, a5);
                    if (!this.f7508w) {
                        this.f7487b.m6747l(h);
                    }
                    apVar = this.f7493h;
                    z = apVar != null || this.f7493h.m6592g();
                    if (apVar == null) {
                        e = this.f7493h.m6591e();
                        afVar = obj == null ? new af(apVar, ac.f7381a, Level.CONFIG, this.f7490e) : apVar;
                        a = this.f7493h.m6589a();
                        if (this.f7503r) {
                            z2 = this.f7502q != null || (this.f7502q instanceof C0684i);
                            am.m6914a(z2);
                            m6773a(new C0684i());
                        }
                        if (this.f7502q == null && a == null) {
                            a2 = this.f7502q.m6695a();
                            c0687n = new C0687n(afVar, this.f7502q);
                            a3 = z ? aa.m6899a(c0687n) : -1;
                        } else {
                            z2 = this.f7502q != null || a == null;
                            am.m6914a(z2);
                            a3 = this.f7493h.m6590b();
                            a2 = a;
                            c0687n = afVar;
                        }
                        if (obj != null) {
                            if (e != null) {
                                h = "Content-Type: " + e;
                                stringBuilder3.append(h).append(aq.f7582a);
                                if (stringBuilder2 != null) {
                                    stringBuilder2.append(" -H '" + h + "'");
                                }
                            }
                            if (a != null) {
                                h = "Content-Encoding: " + a;
                                stringBuilder3.append(h).append(aq.f7582a);
                                if (stringBuilder2 != null) {
                                    stringBuilder2.append(" -H '" + h + "'");
                                }
                            }
                            if (a3 >= 0) {
                                stringBuilder3.append("Content-Length: " + a3).append(aq.f7582a);
                            }
                        }
                        if (stringBuilder2 != null) {
                            stringBuilder2.append(" -d '@-'");
                        }
                        a5.m6545a(new C0693u(this, c0687n, a2, a3, e, z));
                        a5.m6550b(e);
                        a5.m6547a(a2);
                        a5.m6544a(a3);
                        a5.m6546a(c0687n);
                    } else {
                        c0687n = apVar;
                    }
                    if (obj != null) {
                        logger.config(stringBuilder3.toString());
                        if (stringBuilder2 != null) {
                            stringBuilder2.append(" -- ");
                            stringBuilder2.append(b);
                            if (c0687n != null) {
                                stringBuilder2.append(" << $$$");
                            }
                            logger.config(stringBuilder2.toString());
                        }
                    }
                    z3 = z && i2 > 0;
                    a5.m6543a(this.f7497l, this.f7498m);
                    ag a6 = a5.m6542a();
                    c0695x = new C0695x(this, a6);
                    th = null;
                    if (c0695x != null) {
                        try {
                            if (!c0695x.m6810c()) {
                                z4 = false;
                                obj2 = null;
                                obj3 = null;
                                if (this.f7499n != null) {
                                    z4 = this.f7499n.m6604a(this, c0695x, z3);
                                }
                                if (!z4) {
                                    if (m6778a(c0695x.m6811d(), c0695x.m6809b())) {
                                        obj2 = 1;
                                    } else if (z3) {
                                        if (this.f7504s != null && this.f7504s.m6668a(c0695x.m6811d())) {
                                            a4 = this.f7504s.m6667a();
                                            if (a4 != -1) {
                                                m6766a(a4);
                                                obj3 = 1;
                                            }
                                        }
                                    }
                                }
                                i3 = (!z4 && obj2 == null && obj3 == null) ? 0 : 1;
                                i = z3 & i3;
                                if (i != 0) {
                                    c0695x.m6815h();
                                }
                                i3 = i2 - 1;
                                if (c0695x == null) {
                                    if (i != 0) {
                                        break;
                                    }
                                    i2 = i3;
                                } else if (i != 0) {
                                    break;
                                } else {
                                    i2 = i3;
                                }
                            }
                        } catch (Throwable th2) {
                            if (c0695x != null) {
                                c0695x.m6816i();
                            }
                        }
                    }
                    i = z3 & (c0695x != null ? 1 : 0);
                    i3 = i2 - 1;
                    if (c0695x == null) {
                        if (i != 0) {
                            break;
                        }
                        i2 = i3;
                    } else if (i != 0) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            obj = null;
            if (obj == null) {
                stringBuilder2 = null;
                stringBuilder3 = null;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("-------------- REQUEST  --------------").append(aq.f7582a);
                stringBuilder.append(this.f7495j).append(' ').append(b).append(aq.f7582a);
                if (this.f7492g) {
                    stringBuilder2 = null;
                    stringBuilder3 = stringBuilder;
                } else {
                    stringBuilder4 = new StringBuilder("curl -v --compressed");
                    if (this.f7495j.equals("GET")) {
                        stringBuilder4.append(" -X ").append(this.f7495j);
                    }
                    stringBuilder2 = stringBuilder4;
                    stringBuilder3 = stringBuilder;
                }
            }
            h = this.f7487b.m6742h();
            if (this.f7508w) {
                if (h != null) {
                    this.f7487b.m6747l(h + " " + "Google-HTTP-Java-Client/1.14.1-beta (gzip)");
                } else {
                    this.f7487b.m6747l("Google-HTTP-Java-Client/1.14.1-beta (gzip)");
                }
            }
            C0688p.m6715a(this.f7487b, stringBuilder3, stringBuilder2, logger, a5);
            if (this.f7508w) {
                this.f7487b.m6747l(h);
            }
            apVar = this.f7493h;
            if (apVar != null) {
            }
            if (apVar == null) {
                c0687n = apVar;
            } else {
                e = this.f7493h.m6591e();
                if (obj == null) {
                }
                a = this.f7493h.m6589a();
                if (this.f7503r) {
                    if (this.f7502q != null) {
                    }
                    am.m6914a(z2);
                    m6773a(new C0684i());
                }
                if (this.f7502q == null) {
                }
                if (this.f7502q != null) {
                }
                am.m6914a(z2);
                a3 = this.f7493h.m6590b();
                a2 = a;
                c0687n = afVar;
                if (obj != null) {
                    if (e != null) {
                        h = "Content-Type: " + e;
                        stringBuilder3.append(h).append(aq.f7582a);
                        if (stringBuilder2 != null) {
                            stringBuilder2.append(" -H '" + h + "'");
                        }
                    }
                    if (a != null) {
                        h = "Content-Encoding: " + a;
                        stringBuilder3.append(h).append(aq.f7582a);
                        if (stringBuilder2 != null) {
                            stringBuilder2.append(" -H '" + h + "'");
                        }
                    }
                    if (a3 >= 0) {
                        stringBuilder3.append("Content-Length: " + a3).append(aq.f7582a);
                    }
                }
                if (stringBuilder2 != null) {
                    stringBuilder2.append(" -d '@-'");
                }
                a5.m6545a(new C0693u(this, c0687n, a2, a3, e, z));
                a5.m6550b(e);
                a5.m6547a(a2);
                a5.m6544a(a3);
                a5.m6546a(c0687n);
            }
            if (obj != null) {
                logger.config(stringBuilder3.toString());
                if (stringBuilder2 != null) {
                    stringBuilder2.append(" -- ");
                    stringBuilder2.append(b);
                    if (c0687n != null) {
                        stringBuilder2.append(" << $$$");
                    }
                    logger.config(stringBuilder2.toString());
                }
            }
            if (!z) {
            }
            a5.m6543a(this.f7497l, this.f7498m);
            try {
                ag a62 = a5.m6542a();
                c0695x = new C0695x(this, a62);
                th = null;
            } catch (IOException e2) {
                th = e2;
                c0695x = null;
                if (this.f7507v) {
                    logger.log(Level.WARNING, "exception thrown while executing request", th);
                } else {
                    break;
                    throw th;
                }
            } catch (Throwable th3) {
                break;
                a62.m6557a().close();
            }
            if (c0695x != null) {
                if (c0695x.m6810c()) {
                    z4 = false;
                    obj2 = null;
                    obj3 = null;
                    if (this.f7499n != null) {
                        z4 = this.f7499n.m6604a(this, c0695x, z3);
                    }
                    if (z4) {
                        if (m6778a(c0695x.m6811d(), c0695x.m6809b())) {
                            obj2 = 1;
                        } else if (z3) {
                            a4 = this.f7504s.m6667a();
                            if (a4 != -1) {
                                m6766a(a4);
                                obj3 = 1;
                            }
                        }
                    }
                    if (!!z4) {
                    }
                    i = z3 & i3;
                    if (i != 0) {
                        c0695x.m6815h();
                    }
                    i3 = i2 - 1;
                    if (c0695x == null) {
                        if (i != 0) {
                            break;
                        }
                        i2 = i3;
                    } else if (i != 0) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            if (c0695x != null) {
            }
            i = z3 & (c0695x != null ? 1 : 0);
            i3 = i2 - 1;
            if (c0695x == null) {
                if (i != 0) {
                    break;
                }
                i2 = i3;
            } else if (i != 0) {
                break;
            } else {
                i2 = i3;
            }
        }
        if (c0695x == null) {
            throw th;
        }
        if (this.f7500o != null) {
            this.f7500o.m6601a(c0695x);
        }
        if (!this.f7506u || c0695x.m6810c()) {
            return c0695x;
        }
        try {
            throw new C0663y(c0695x);
        } catch (Throwable th4) {
            c0695x.m6816i();
        }
    }
}
