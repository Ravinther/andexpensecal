package p007b;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import p007b.p008a.C0199s;
import p007b.p008a.p012b.C0181z;
import p007b.p013b.C0208c;

/* renamed from: b.p */
public final class C0287p {
    private static C0208c f2040a;
    private int f2041A;
    private int f2042b;
    private int f2043c;
    private boolean f2044d;
    private boolean f2045e;
    private boolean f2046f;
    private boolean f2047g;
    private boolean f2048h;
    private boolean f2049i;
    private boolean f2050j;
    private boolean f2051k;
    private boolean f2052l;
    private boolean f2053m;
    private boolean f2054n;
    private File f2055o;
    private Locale f2056p;
    private C0181z f2057q;
    private String f2058r;
    private String f2059s;
    private String f2060t;
    private HashMap f2061u;
    private boolean f2062v;
    private boolean f2063w;
    private boolean f2064x;
    private boolean f2065y;
    private String f2066z;

    static {
        f2040a = C0208c.m1493a(C0287p.class);
    }

    public C0287p() {
        boolean z = false;
        this.f2064x = false;
        this.f2042b = 5242880;
        this.f2043c = 1048576;
        this.f2061u = new HashMap();
        this.f2059s = C0199s.f1206a.m1467b();
        this.f2060t = C0199s.f1215j.m1467b();
        this.f2062v = false;
        this.f2063w = false;
        this.f2064x = false;
        this.f2065y = false;
        this.f2041A = 0;
        try {
            m1906a(Boolean.getBoolean("jxl.nowarnings"));
            this.f2044d = Boolean.getBoolean("jxl.nodrawings");
            this.f2045e = Boolean.getBoolean("jxl.nonames");
            this.f2047g = Boolean.getBoolean("jxl.nogc");
            this.f2048h = Boolean.getBoolean("jxl.norat");
            this.f2049i = Boolean.getBoolean("jxl.nomergedcellchecks");
            this.f2046f = Boolean.getBoolean("jxl.noformulaadjust");
            this.f2050j = Boolean.getBoolean("jxl.nopropertysets");
            this.f2052l = Boolean.getBoolean("jxl.ignoreblanks");
            this.f2051k = Boolean.getBoolean("jxl.nocellvalidation");
            if (!Boolean.getBoolean("jxl.autofilter")) {
                z = true;
            }
            this.f2053m = z;
            this.f2054n = Boolean.getBoolean("jxl.usetemporaryfileduringwrite");
            String property = System.getProperty("jxl.temporaryfileduringwritedirectory");
            if (property != null) {
                this.f2055o = new File(property);
            }
            this.f2058r = System.getProperty("file.encoding");
        } catch (Throwable e) {
            f2040a.m1496a("Error accessing system properties.", e);
        }
        try {
            if (System.getProperty("jxl.lang") == null || System.getProperty("jxl.country") == null) {
                this.f2056p = Locale.getDefault();
            } else {
                this.f2056p = new Locale(System.getProperty("jxl.lang"), System.getProperty("jxl.country"));
            }
            if (System.getProperty("jxl.encoding") != null) {
                this.f2058r = System.getProperty("jxl.encoding");
            }
        } catch (Throwable e2) {
            f2040a.m1496a("Error accessing system properties.", e2);
            this.f2056p = Locale.getDefault();
        }
    }

    public int m1904a() {
        return this.f2043c;
    }

    public void m1905a(Locale locale) {
        this.f2056p = locale;
    }

    public void m1906a(boolean z) {
        f2040a.m1497a(z);
    }

    public int m1907b() {
        return this.f2042b;
    }

    public boolean m1908c() {
        return this.f2044d;
    }

    public boolean m1909d() {
        return this.f2047g;
    }

    public boolean m1910e() {
        return this.f2048h;
    }

    public boolean m1911f() {
        return this.f2049i;
    }

    public String m1912g() {
        return this.f2058r;
    }

    public C0181z m1913h() {
        if (this.f2057q == null) {
            this.f2057q = (C0181z) this.f2061u.get(this.f2056p);
            if (this.f2057q == null) {
                this.f2057q = new C0181z(this.f2056p);
                this.f2061u.put(this.f2056p, this.f2057q);
            }
        }
        return this.f2057q;
    }

    public String m1914i() {
        return this.f2059s;
    }

    public String m1915j() {
        return this.f2060t;
    }

    public boolean m1916k() {
        return this.f2054n;
    }

    public File m1917l() {
        return this.f2055o;
    }

    public boolean m1918m() {
        return this.f2062v;
    }

    public boolean m1919n() {
        return this.f2063w;
    }

    public boolean m1920o() {
        return this.f2064x;
    }

    public boolean m1921p() {
        return this.f2065y;
    }

    public int m1922q() {
        return this.f2041A;
    }

    public String m1923r() {
        return this.f2066z;
    }
}
