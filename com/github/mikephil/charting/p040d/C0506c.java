package com.github.mikephil.charting.p040d;

/* renamed from: com.github.mikephil.charting.d.c */
public class C0506c extends C0505h {
    private float[] f5799a;

    public C0506c(float f, int i) {
        super(f, i);
    }

    public float m4532a(int i) {
        float f = 0.0f;
        if (this.f5799a != null) {
            int length = this.f5799a.length - 1;
            while (length > i && length >= 0) {
                float f2 = this.f5799a[length] + f;
                length--;
                f = f2;
            }
        }
        return f;
    }

    public int m4533a(float f) {
        if (this.f5799a == null) {
            return 0;
        }
        int length = this.f5799a.length - 1;
        float f2 = 0.0f;
        while (length > 0 && f > this.f5799a[length] + f2) {
            f2 += this.f5799a[length];
            length--;
        }
        return length;
    }

    public float[] m4534a() {
        return this.f5799a;
    }
}
