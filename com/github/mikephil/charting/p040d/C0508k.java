package com.github.mikephil.charting.p040d;

import android.graphics.Color;
import com.github.mikephil.charting.p039h.C0544j;
import java.util.List;

/* renamed from: com.github.mikephil.charting.d.k */
public abstract class C0508k<T extends C0505h> extends C0503e<T> {
    private int f5800i;
    private int f5801j;
    private float f5802k;
    private boolean f5803l;

    public C0508k(List<T> list, String str) {
        super(list, str);
        this.f5800i = Color.rgb(140, 234, 255);
        this.f5801j = 85;
        this.f5802k = 2.5f;
        this.f5803l = false;
    }

    public int m4535E() {
        return this.f5800i;
    }

    public int m4536F() {
        return this.f5801j;
    }

    public float m4537G() {
        return this.f5802k;
    }

    public boolean m4538H() {
        return this.f5803l;
    }

    public void m4539c(float f) {
        float f2 = 10.0f;
        float f3 = f < 0.2f ? 0.5f : f;
        if (f3 <= 10.0f) {
            f2 = f3;
        }
        this.f5802k = C0544j.m4703a(f2);
    }
}
