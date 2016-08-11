package com.github.mikephil.charting.p036b;

import com.github.mikephil.charting.p040d.C0506c;
import java.util.List;

/* renamed from: com.github.mikephil.charting.b.d */
public class C0472d extends C0470b {
    public C0472d(int i, float f, int i2, boolean z) {
        super(i, f, i2, z);
    }

    public void m4268a(List<C0506c> list) {
        float size = ((float) list.size()) * this.c;
        int i = this.j - 1;
        float f = this.g / 2.0f;
        float f2 = this.h / 2.0f;
        for (int i2 = 0; ((float) i2) < size; i2++) {
            C0506c c0506c = (C0506c) list.get(i2);
            float b = (((float) ((c0506c.m4529b() + (i2 * i)) + this.i)) + (this.h * ((float) i2))) + f2;
            float c = c0506c.m4530c();
            float[] a = c0506c.m4534a();
            float f3;
            float f4;
            float f5;
            int i3;
            float f6;
            float f7;
            if (this.l) {
                if (!this.k || a == null) {
                    f3 = (b - 0.5f) + f;
                    b = (b + 0.5f) - f;
                    f4 = c >= 0.0f ? c : 0.0f;
                    f5 = c <= 0.0f ? c : 0.0f;
                    if (f5 > 0.0f) {
                        f5 *= this.d;
                    } else {
                        f4 *= this.d;
                    }
                    m4262a(f4, b, f5, f3);
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
                        m4262a(f3, f7, c, f6);
                    }
                }
            } else if (!this.k || a == null) {
                f3 = (b - 0.5f) + f;
                b = (b + 0.5f) - f;
                f4 = c >= 0.0f ? c : 0.0f;
                f5 = c <= 0.0f ? c : 0.0f;
                if (f4 > 0.0f) {
                    f4 *= this.d;
                } else {
                    f5 *= this.d;
                }
                m4262a(f5, b, f4, f3);
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
                    m4262a(c, f7, f3, f6);
                }
            }
        }
        m4256a();
    }
}
