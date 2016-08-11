package com.github.mikephil.charting.p036b;

/* renamed from: com.github.mikephil.charting.b.a */
public abstract class C0469a<T> {
    protected int f5565a;
    public final float[] f5566b;
    protected float f5567c;
    protected float f5568d;
    protected int f5569e;
    protected int f5570f;

    public C0469a(int i) {
        this.f5565a = 0;
        this.f5567c = 1.0f;
        this.f5568d = 1.0f;
        this.f5569e = 0;
        this.f5570f = 0;
        this.f5565a = 0;
        this.f5566b = new float[i];
    }

    public void m4256a() {
        this.f5565a = 0;
    }

    public void m4257a(float f, float f2) {
        this.f5567c = f;
        this.f5568d = f2;
    }

    public void m4258a(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f5569e = i;
    }

    public int m4259b() {
        return this.f5566b.length;
    }

    public void m4260b(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f5570f = i;
    }
}
