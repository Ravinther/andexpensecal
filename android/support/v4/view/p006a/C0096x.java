package android.support.v4.view.p006a;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.view.a.x */
public class C0096x {
    private static final aa f415a;
    private final Object f416b;

    static {
        if (VERSION.SDK_INT >= 16) {
            f415a = new ab();
        } else if (VERSION.SDK_INT >= 15) {
            f415a = new C0073z();
        } else if (VERSION.SDK_INT >= 14) {
            f415a = new C0072y();
        } else {
            f415a = new ac();
        }
    }

    public C0096x(Object obj) {
        this.f416b = obj;
    }

    public static C0096x m719a() {
        return new C0096x(f415a.m590a());
    }

    public void m720a(int i) {
        f415a.m593b(this.f416b, i);
    }

    public void m721a(boolean z) {
        f415a.m592a(this.f416b, z);
    }

    public void m722b(int i) {
        f415a.m591a(this.f416b, i);
    }

    public void m723c(int i) {
        f415a.m594c(this.f416b, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0096x c0096x = (C0096x) obj;
        return this.f416b == null ? c0096x.f416b == null : this.f416b.equals(c0096x.f416b);
    }

    public int hashCode() {
        return this.f416b == null ? 0 : this.f416b.hashCode();
    }
}
