package p007b.p010e;

import p007b.p008a.ab;
import p007b.p011c.C0153g;

/* renamed from: b.e.i */
class C0275i implements ab, C0153g {
    private int f1969a;
    private String f1970b;

    public C0275i(int i, String str) {
        this.f1969a = i;
        this.f1970b = str;
    }

    public void m1836a(int i) {
    }

    public int a_() {
        return this.f1969a;
    }

    public boolean b_() {
        return true;
    }

    public boolean m1837c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0275i)) {
            return false;
        }
        return this.f1969a == ((C0275i) obj).f1969a;
    }

    public int hashCode() {
        return this.f1969a;
    }
}
