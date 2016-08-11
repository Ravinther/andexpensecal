package com.github.mikephil.charting.p039h;

/* renamed from: com.github.mikephil.charting.h.d */
public class C0538d {
    private int f5892a;
    private int f5893b;
    private int f5894c;

    public C0538d(int i, int i2) {
        this.f5894c = -1;
        this.f5892a = i;
        this.f5893b = i2;
    }

    public C0538d(int i, int i2, int i3) {
        this(i, i2);
        this.f5894c = i3;
    }

    public int m4685a() {
        return this.f5893b;
    }

    public boolean m4686a(C0538d c0538d) {
        return c0538d != null && this.f5893b == c0538d.f5893b && this.f5892a == c0538d.f5892a && this.f5894c == c0538d.f5894c;
    }

    public int m4687b() {
        return this.f5892a;
    }

    public int m4688c() {
        return this.f5894c;
    }

    public String toString() {
        return "Highlight, xIndex: " + this.f5892a + ", dataSetIndex: " + this.f5893b + ", stackIndex (only stacked barentry): " + this.f5894c;
    }
}
