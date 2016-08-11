package p018c.p019a.p022c;

import android.graphics.Typeface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.c.b */
public class C0310b implements Serializable {
    private static final Typeface f2152c;
    private boolean f2153A;
    private float f2154B;
    private boolean f2155C;
    private float f2156D;
    private boolean f2157E;
    private int f2158F;
    private boolean f2159G;
    private boolean f2160H;
    private float f2161I;
    private String f2162a;
    private float f2163b;
    private String f2164d;
    private int f2165e;
    private Typeface f2166f;
    private int f2167g;
    private boolean f2168h;
    private boolean f2169i;
    private int f2170j;
    private boolean f2171k;
    private int f2172l;
    private float f2173m;
    private boolean f2174n;
    private float f2175o;
    private boolean f2176p;
    private boolean f2177q;
    private boolean f2178r;
    private boolean f2179s;
    private List<C0311c> f2180t;
    private boolean f2181u;
    private int f2182v;
    private int[] f2183w;
    private float f2184x;
    private boolean f2185y;
    private boolean f2186z;

    static {
        f2152c = Typeface.create(Typeface.SERIF, 0);
    }

    public C0310b() {
        this.f2162a = "";
        this.f2163b = 15.0f;
        this.f2164d = f2152c.toString();
        this.f2165e = 0;
        this.f2169i = true;
        this.f2170j = -3355444;
        this.f2171k = true;
        this.f2172l = -3355444;
        this.f2173m = 10.0f;
        this.f2174n = true;
        this.f2175o = 12.0f;
        this.f2176p = false;
        this.f2177q = false;
        this.f2178r = false;
        this.f2179s = false;
        this.f2180t = new ArrayList();
        this.f2181u = true;
        this.f2182v = 0;
        this.f2183w = new int[]{20, 30, 10, 20};
        this.f2184x = 1.0f;
        this.f2185y = true;
        this.f2186z = true;
        this.f2153A = false;
        this.f2154B = 1.5f;
        this.f2155C = false;
        this.f2156D = this.f2184x;
        this.f2157E = false;
        this.f2158F = 15;
        this.f2161I = 0.0f;
    }

    public float m2059A() {
        return this.f2154B;
    }

    public boolean m2060B() {
        return this.f2185y;
    }

    public boolean m2061C() {
        return this.f2157E;
    }

    public int m2062D() {
        return this.f2158F;
    }

    public int m2063E() {
        return this.f2182v;
    }

    public int[] m2064F() {
        return this.f2183w;
    }

    public boolean m2065G() {
        return this.f2160H;
    }

    public float m2066H() {
        return this.f2161I;
    }

    public boolean m2067I() {
        return this.f2159G;
    }

    public C0311c m2068a(int i) {
        return (C0311c) this.f2180t.get(i);
    }

    public String m2069a() {
        return this.f2162a;
    }

    public void m2070a(float f) {
        this.f2173m = f;
    }

    public void m2071a(C0311c c0311c) {
        this.f2180t.add(c0311c);
    }

    public void m2072a(boolean z) {
        this.f2171k = z;
    }

    public void m2073a(int[] iArr) {
        this.f2183w = iArr;
    }

    public float m2074b() {
        return this.f2163b;
    }

    public void m2075b(float f) {
        this.f2175o = f;
    }

    public void m2076b(int i) {
        this.f2172l = i;
    }

    public void m2077b(boolean z) {
        this.f2177q = z;
    }

    public int m2078c() {
        return this.f2180t.size();
    }

    public void m2079c(float f) {
        this.f2184x = f;
    }

    public void m2080c(int i) {
        this.f2182v = i;
    }

    public void m2081c(boolean z) {
        this.f2178r = z;
    }

    public void m2082d(boolean z) {
        m2077b(z);
        m2081c(z);
    }

    public C0311c[] m2083d() {
        return (C0311c[]) this.f2180t.toArray(new C0311c[0]);
    }

    public int m2084e() {
        return this.f2167g;
    }

    public void m2085e(boolean z) {
        this.f2174n = z;
    }

    public void m2086f(boolean z) {
        this.f2176p = z;
    }

    public boolean m2087f() {
        return this.f2168h;
    }

    public int m2088g() {
        return this.f2170j;
    }

    public void m2089g(boolean z) {
        this.f2160H = z;
    }

    public int m2090h() {
        return this.f2172l;
    }

    public void m2091h(boolean z) {
        this.f2159G = z;
    }

    public float m2092i() {
        return this.f2173m;
    }

    public boolean m2093j() {
        return this.f2169i;
    }

    public boolean m2094k() {
        return this.f2171k;
    }

    public boolean m2095l() {
        return this.f2177q;
    }

    public boolean m2096m() {
        return this.f2178r;
    }

    public boolean m2097n() {
        return this.f2179s;
    }

    public boolean m2098o() {
        return this.f2174n;
    }

    public boolean m2099p() {
        return this.f2176p;
    }

    public String m2100q() {
        return this.f2164d;
    }

    public int m2101r() {
        return this.f2165e;
    }

    public Typeface m2102s() {
        return this.f2166f;
    }

    public float m2103t() {
        return this.f2175o;
    }

    public boolean m2104u() {
        return this.f2181u;
    }

    public float m2105v() {
        return this.f2184x;
    }

    public float m2106w() {
        return this.f2156D;
    }

    public boolean m2107x() {
        return this.f2186z;
    }

    public boolean m2108y() {
        return this.f2153A;
    }

    public boolean m2109z() {
        return this.f2155C;
    }
}
