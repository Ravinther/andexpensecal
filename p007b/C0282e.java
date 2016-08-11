package p007b;

import p007b.p011c.C0183d;

/* renamed from: b.e */
public final class C0282e {
    private int f1987a;
    private int f1988b;
    private boolean f1989c;
    private boolean f1990d;
    private C0183d f1991e;
    private boolean f1992f;

    public C0282e() {
        this.f1990d = false;
        this.f1989c = false;
        this.f1987a = 1;
        this.f1988b = 1;
        this.f1992f = false;
    }

    public void m1843a(int i) {
        this.f1987a = i;
        this.f1989c = true;
    }

    public void m1844a(C0183d c0183d) {
        this.f1991e = c0183d;
    }

    public void m1845a(boolean z) {
        this.f1990d = z;
    }

    public boolean m1846a() {
        return this.f1990d;
    }

    public int m1847b() {
        return this.f1987a;
    }

    public void m1848b(int i) {
        this.f1988b = i;
        this.f1989c = false;
    }

    public void m1849b(boolean z) {
        this.f1992f = z;
    }

    public int m1850c() {
        return this.f1988b;
    }

    public C0183d m1851d() {
        return this.f1991e;
    }

    public boolean m1852e() {
        return this.f1989c;
    }

    public boolean m1853f() {
        return this.f1992f;
    }
}
