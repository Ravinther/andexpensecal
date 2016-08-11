package p007b.p010e;

import p007b.p008a.ab;

/* renamed from: b.e.d */
class C0267d implements ab {
    private int f1941a;
    private String f1942b;

    public C0267d(int i, String str) {
        this.f1941a = i;
        this.f1942b = str;
    }

    public void m1834a(int i) {
    }

    public int a_() {
        return this.f1941a;
    }

    public boolean b_() {
        return true;
    }

    public boolean m1835c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0267d)) {
            return false;
        }
        return this.f1941a == ((C0267d) obj).f1941a;
    }

    public int hashCode() {
        return this.f1941a;
    }
}
