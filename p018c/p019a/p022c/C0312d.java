package p018c.p019a.p022c;

import android.graphics.Color;
import android.graphics.Paint.Align;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: c.a.c.d */
public class C0312d extends C0310b {
    private Align f2203A;
    private Align[] f2204B;
    private float f2205C;
    private float f2206D;
    private float f2207E;
    private Align[] f2208F;
    private int f2209G;
    private int[] f2210H;
    private boolean f2211I;
    private NumberFormat f2212J;
    private float f2213K;
    private double f2214L;
    private double f2215M;
    private String f2216a;
    private String[] f2217b;
    private float f2218c;
    private double[] f2219d;
    private double[] f2220e;
    private double[] f2221f;
    private double[] f2222g;
    private int f2223h;
    private int f2224i;
    private C0313e f2225j;
    private Map<Double, String> f2226k;
    private Map<Integer, Map<Double, String>> f2227l;
    private boolean f2228m;
    private boolean f2229n;
    private boolean f2230o;
    private boolean f2231p;
    private double f2232q;
    private int f2233r;
    private double[] f2234s;
    private double[] f2235t;
    private float f2236u;
    private float f2237v;
    private Map<Integer, double[]> f2238w;
    private float f2239x;
    private int f2240y;
    private int f2241z;

    public C0312d() {
        this(1);
    }

    public C0312d(int i) {
        this.f2216a = "";
        this.f2218c = 12.0f;
        this.f2223h = 5;
        this.f2224i = 5;
        this.f2225j = C0313e.HORIZONTAL;
        this.f2226k = new HashMap();
        this.f2227l = new LinkedHashMap();
        this.f2228m = true;
        this.f2229n = true;
        this.f2230o = true;
        this.f2231p = true;
        this.f2232q = 0.0d;
        this.f2233r = 0;
        this.f2238w = new LinkedHashMap();
        this.f2239x = 3.0f;
        this.f2240y = Color.argb(75, 200, 200, 200);
        this.f2203A = Align.CENTER;
        this.f2205C = 0.0f;
        this.f2206D = 0.0f;
        this.f2207E = 2.0f;
        this.f2209G = -3355444;
        this.f2210H = new int[]{-3355444};
        this.f2211I = true;
        this.f2213K = -1.0f;
        this.f2214L = 0.0d;
        this.f2215M = 0.0d;
        this.f2241z = i;
        m2167d(i);
    }

    public boolean m2130B() {
        return m2139R() || m2140S();
    }

    public C0313e m2131J() {
        return this.f2225j;
    }

    public String m2132K() {
        return this.f2216a;
    }

    public String m2133L() {
        return m2171f(0);
    }

    public float m2134M() {
        return this.f2218c;
    }

    public int m2135N() {
        return this.f2223h;
    }

    public synchronized Double[] m2136O() {
        return (Double[]) this.f2226k.keySet().toArray(new Double[0]);
    }

    public int m2137P() {
        return this.f2224i;
    }

    public float m2138Q() {
        return this.f2213K;
    }

    public boolean m2139R() {
        return this.f2228m;
    }

    public boolean m2140S() {
        return this.f2229n;
    }

    public boolean m2141T() {
        return this.f2230o;
    }

    public boolean m2142U() {
        return this.f2231p;
    }

    public double m2143V() {
        return this.f2232q;
    }

    public int m2144W() {
        return this.f2233r;
    }

    public int m2145X() {
        return this.f2240y;
    }

    public double[] m2146Y() {
        return this.f2234s;
    }

    public double[] m2147Z() {
        return this.f2235t;
    }

    public synchronized String m2148a(Double d) {
        return (String) this.f2226k.get(d);
    }

    public synchronized String m2149a(Double d, int i) {
        return (String) ((Map) this.f2227l.get(Integer.valueOf(i))).get(d);
    }

    public void m2150a(double d) {
        m2151a(d, 0);
    }

    public void m2151a(double d, int i) {
        if (!m2175h(i)) {
            ((double[]) this.f2238w.get(Integer.valueOf(i)))[0] = d;
        }
        this.f2219d[i] = d;
    }

    public synchronized void m2152a(double d, String str) {
        this.f2226k.put(Double.valueOf(d), str);
    }

    public void m2153a(int i, int i2) {
        this.f2210H[i] = i2;
    }

    public void m2154a(Align align) {
        this.f2203A = align;
    }

    public void m2155a(String str) {
        this.f2216a = str;
    }

    public void m2156a(String str, int i) {
        this.f2217b[i] = str;
    }

    public void m2157a(boolean z, boolean z2) {
        this.f2230o = z;
        this.f2231p = z2;
    }

    public void m2158a(double[] dArr, int i) {
        m2151a(dArr[0], i);
        m2160b(dArr[1], i);
        m2163c(dArr[2], i);
        m2165d(dArr[3], i);
    }

    public float aa() {
        return this.f2236u;
    }

    public float ab() {
        return this.f2237v;
    }

    public float ac() {
        return this.f2239x;
    }

    public boolean ad() {
        return m2187s(0);
    }

    public int ae() {
        return this.f2209G;
    }

    public Align af() {
        return this.f2203A;
    }

    public float ag() {
        return this.f2205C;
    }

    public float ah() {
        return this.f2206D;
    }

    public float ai() {
        return this.f2207E;
    }

    public NumberFormat aj() {
        return this.f2212J;
    }

    public double ak() {
        return this.f2214L;
    }

    public double al() {
        return this.f2215M;
    }

    public int am() {
        return this.f2241z;
    }

    public void m2159b(double d) {
        m2160b(d, 0);
    }

    public void m2160b(double d, int i) {
        if (!m2178j(i)) {
            ((double[]) this.f2238w.get(Integer.valueOf(i)))[1] = d;
        }
        this.f2220e[i] = d;
    }

    public void m2161b(String str) {
        m2156a(str, 0);
    }

    public void m2162c(double d) {
        m2163c(d, 0);
    }

    public void m2163c(double d, int i) {
        if (!m2180l(i)) {
            ((double[]) this.f2238w.get(Integer.valueOf(i)))[2] = d;
        }
        this.f2221f[i] = d;
    }

    public void m2164d(double d) {
        m2165d(d, 0);
    }

    public void m2165d(double d, int i) {
        if (!m2182n(i)) {
            ((double[]) this.f2238w.get(Integer.valueOf(i)))[3] = d;
        }
        this.f2222g[i] = d;
    }

    public void m2166d(float f) {
        this.f2218c = f;
    }

    public void m2167d(int i) {
        this.f2217b = new String[i];
        this.f2204B = new Align[i];
        this.f2208F = new Align[i];
        this.f2210H = new int[i];
        this.f2219d = new double[i];
        this.f2220e = new double[i];
        this.f2221f = new double[i];
        this.f2222g = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f2210H[i2] = -3355444;
            m2170e(i2);
        }
    }

    public void m2168e(double d) {
        this.f2232q = d;
    }

    public void m2169e(float f) {
        for (C0311c a : m2083d()) {
            a.m2111a(f);
        }
    }

    public void m2170e(int i) {
        this.f2219d[i] = Double.MAX_VALUE;
        this.f2220e[i] = -1.7976931348623157E308d;
        this.f2221f[i] = Double.MAX_VALUE;
        this.f2222g[i] = -1.7976931348623157E308d;
        this.f2238w.put(Integer.valueOf(i), new double[]{this.f2219d[i], this.f2220e[i], this.f2221f[i], this.f2222g[i]});
        this.f2217b[i] = "";
        this.f2227l.put(Integer.valueOf(i), new HashMap());
        this.f2204B[i] = Align.CENTER;
        this.f2208F[i] = Align.LEFT;
    }

    public String m2171f(int i) {
        return this.f2217b[i];
    }

    public void m2172f(float f) {
        this.f2213K = f;
    }

    public double m2173g(int i) {
        return this.f2219d[i];
    }

    public void m2174g(float f) {
        this.f2236u = f;
    }

    public boolean m2175h(int i) {
        return this.f2219d[i] != Double.MAX_VALUE;
    }

    public double m2176i(int i) {
        return this.f2220e[i];
    }

    public void m2177i(boolean z) {
        for (C0311c a : m2083d()) {
            a.m2114a(z);
        }
    }

    public boolean m2178j(int i) {
        return this.f2220e[i] != -1.7976931348623157E308d;
    }

    public double m2179k(int i) {
        return this.f2221f[i];
    }

    public boolean m2180l(int i) {
        return this.f2221f[i] != Double.MAX_VALUE;
    }

    public double m2181m(int i) {
        return this.f2222g[i];
    }

    public boolean m2182n(int i) {
        return this.f2222g[i] != -1.7976931348623157E308d;
    }

    public void m2183o(int i) {
        this.f2223h = i;
    }

    public synchronized Double[] m2184p(int i) {
        return (Double[]) ((Map) this.f2227l.get(Integer.valueOf(i))).keySet().toArray(new Double[0]);
    }

    public void m2185q(int i) {
        this.f2224i = i;
    }

    public void m2186r(int i) {
        this.f2233r = i;
    }

    public boolean m2187s(int i) {
        return this.f2238w.get(Integer.valueOf(i)) != null;
    }

    public double[] m2188t(int i) {
        return (double[]) this.f2238w.get(Integer.valueOf(i));
    }

    public int m2189u(int i) {
        return this.f2210H[i];
    }

    public void m2190v(int i) {
        this.f2209G = i;
    }

    public Align m2191w(int i) {
        return this.f2204B[i];
    }

    public Align m2192x(int i) {
        return this.f2208F[i];
    }

    public boolean m2193x() {
        return m2141T() || m2142U();
    }
}
