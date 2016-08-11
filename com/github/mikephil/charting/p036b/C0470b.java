package com.github.mikephil.charting.p036b;

import com.github.mikephil.charting.p040d.C0506c;
import java.util.List;

/* renamed from: com.github.mikephil.charting.b.b */
public class C0470b extends C0469a<C0506c> {
    protected float f5571g;
    protected float f5572h;
    protected int f5573i;
    protected int f5574j;
    protected boolean f5575k;
    protected boolean f5576l;

    public C0470b(int i, float f, int i2, boolean z) {
        super(i);
        this.f5571g = 0.0f;
        this.f5572h = 0.0f;
        this.f5573i = 0;
        this.f5574j = 1;
        this.f5575k = false;
        this.f5576l = false;
        this.f5572h = f;
        this.f5574j = i2;
        this.f5575k = z;
    }

    public void m4261a(float f) {
        this.f5571g = f;
    }

    protected void m4262a(float f, float f2, float f3, float f4) {
        float[] fArr = this.b;
        int i = this.a;
        this.a = i + 1;
        fArr[i] = f;
        fArr = this.b;
        i = this.a;
        this.a = i + 1;
        fArr[i] = f2;
        fArr = this.b;
        i = this.a;
        this.a = i + 1;
        fArr[i] = f3;
        fArr = this.b;
        i = this.a;
        this.a = i + 1;
        fArr[i] = f4;
    }

    public void m4263a(List<C0506c> list) {
        float size = ((float) list.size()) * this.c;
        int i = this.f5574j - 1;
        float f = this.f5571g / 2.0f;
        float f2 = this.f5572h / 2.0f;
        for (int i2 = 0; ((float) i2) < size; i2++) {
            C0506c c0506c = (C0506c) list.get(i2);
            float b = (((float) ((c0506c.m4529b() + (i2 * i)) + this.f5573i)) + (this.f5572h * ((float) i2))) + f2;
            float c = c0506c.m4530c();
            float[] a = c0506c.m4534a();
            float f3;
            float f4;
            float f5;
            int i3;
            float f6;
            float f7;
            if (this.f5576l) {
                if (!this.f5575k || a == null) {
                    f3 = (b - 0.5f) + f;
                    b = (b + 0.5f) - f;
                    f4 = c >= 0.0f ? c : 0.0f;
                    f5 = c <= 0.0f ? c : 0.0f;
                    if (f5 > 0.0f) {
                        f5 *= this.d;
                    } else {
                        f4 *= this.d;
                    }
                    m4262a(f3, f5, b, f4);
                } else {
                    f4 = c0506c.m4530c();
                    for (i3 = 0; i3 < a.length; i3++) {
                        f4 -= a[i3];
                        c = a[i3] + f4;
                        f6 = (b - 0.5f) + f;
                        f7 = (b + 0.5f) - f;
                        f3 = c >= 0.0f ? c : 0.0f;
                        if (c > 0.0f) {
                            c = 0.0f;
                        }
                        if (c > 0.0f) {
                            c *= this.d;
                        } else {
                            f3 *= this.d;
                        }
                        m4262a(f6, c, f7, f3);
                    }
                }
            } else if (!this.f5575k || a == null) {
                f3 = (b - 0.5f) + f;
                b = (b + 0.5f) - f;
                f4 = c >= 0.0f ? c : 0.0f;
                f5 = c <= 0.0f ? c : 0.0f;
                if (f4 > 0.0f) {
                    f4 *= this.d;
                } else {
                    f5 *= this.d;
                }
                m4262a(f3, f4, b, f5);
            } else {
                f4 = c0506c.m4530c();
                for (i3 = 0; i3 < a.length; i3++) {
                    f4 -= a[i3];
                    c = a[i3] + f4;
                    f6 = (b - 0.5f) + f;
                    f7 = (b + 0.5f) - f;
                    f3 = c >= 0.0f ? c : 0.0f;
                    if (c > 0.0f) {
                        c = 0.0f;
                    }
                    if (f3 > 0.0f) {
                        f3 *= this.d;
                    } else {
                        c *= this.d;
                    }
                    m4262a(f6, f3, f7, c);
                }
            }
        }
        m4256a();
    }

    public void m4264a(boolean z) {
        this.f5576l = z;
    }

    public void m4265c(int i) {
        this.f5573i = i;
    }
}
