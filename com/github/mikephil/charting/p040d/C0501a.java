package com.github.mikephil.charting.p040d;

import java.util.List;

/* renamed from: com.github.mikephil.charting.d.a */
public class C0501a extends C0500d<C0504b> {
    private float f5775i;

    public C0501a() {
        this.f5775i = 0.8f;
    }

    public C0501a(List<String> list, List<C0504b> list2) {
        super(list, list2);
        this.f5775i = 0.8f;
    }

    public float m4484a() {
        return this.h.size() <= 1 ? 0.0f : this.f5775i;
    }

    public boolean m4485b() {
        return this.h.size() > 1;
    }
}
