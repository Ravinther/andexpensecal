package com.github.mikephil.charting.p040d;

/* renamed from: com.github.mikephil.charting.d.h */
public class C0505h {
    private float f5796a;
    private int f5797b;
    private Object f5798c;

    public C0505h(float f, int i) {
        this.f5796a = 0.0f;
        this.f5797b = 0;
        this.f5798c = null;
        this.f5796a = f;
        this.f5797b = i;
    }

    public void m4527a(Object obj) {
        this.f5798c = obj;
    }

    public boolean m4528a(C0505h c0505h) {
        return c0505h != null && c0505h.f5798c == this.f5798c && c0505h.f5797b == this.f5797b && Math.abs(c0505h.f5796a - this.f5796a) <= 1.0E-5f;
    }

    public int m4529b() {
        return this.f5797b;
    }

    public float m4530c() {
        return this.f5796a;
    }

    public Object m4531d() {
        return this.f5798c;
    }

    public String toString() {
        return "Entry, xIndex: " + this.f5797b + " val (sum): " + m4530c();
    }
}
