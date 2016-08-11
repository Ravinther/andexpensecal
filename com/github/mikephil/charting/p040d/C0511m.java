package com.github.mikephil.charting.p040d;

import com.github.mikephil.charting.p039h.C0544j;
import java.util.List;

/* renamed from: com.github.mikephil.charting.d.m */
public class C0511m extends C0502g<C0505h> {
    private float f5812a;
    private float f5813i;

    public C0511m(List<C0505h> list, String str) {
        super(list, str);
        this.f5812a = 0.0f;
        this.f5813i = 18.0f;
    }

    public float m4556a() {
        return this.f5812a;
    }

    public void m4557a(float f) {
        float f2 = 45.0f;
        float f3 = 0.0f;
        if (f <= 45.0f) {
            f2 = f;
        }
        if (f2 >= 0.0f) {
            f3 = f2;
        }
        this.f5812a = f3;
    }

    public float m4558b() {
        return this.f5813i;
    }

    public void m4559c(float f) {
        this.f5813i = C0544j.m4703a(f);
    }
}
