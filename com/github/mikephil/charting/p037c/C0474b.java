package com.github.mikephil.charting.p037c;

import android.graphics.Typeface;
import com.github.mikephil.charting.p039h.C0544j;

/* renamed from: com.github.mikephil.charting.c.b */
public abstract class C0474b {
    protected boolean f5577f;
    protected float f5578g;
    protected float f5579h;
    protected Typeface f5580i;
    protected float f5581j;
    protected int f5582k;

    public C0474b() {
        this.f5577f = true;
        this.f5578g = 5.0f;
        this.f5579h = 5.0f;
        this.f5580i = null;
        this.f5581j = 10.0f;
        this.f5582k = -16777216;
    }

    public void m4272a(int i) {
        this.f5582k = i;
    }

    public void m4273b(float f) {
        float f2 = 24.0f;
        float f3 = 6.0f;
        if (f <= 24.0f) {
            f2 = f;
        }
        if (f2 >= 6.0f) {
            f3 = f2;
        }
        this.f5581j = C0544j.m4703a(f3);
    }

    public void m4274c(boolean z) {
        this.f5577f = z;
    }

    public float m4275l() {
        return this.f5578g;
    }

    public float m4276m() {
        return this.f5579h;
    }

    public Typeface m4277n() {
        return this.f5580i;
    }

    public float m4278o() {
        return this.f5581j;
    }

    public int m4279p() {
        return this.f5582k;
    }

    public boolean m4280q() {
        return this.f5577f;
    }
}
