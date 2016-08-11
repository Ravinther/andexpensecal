package com.github.mikephil.charting.charts;

import com.github.mikephil.charting.p039h.C0495c;
import com.github.mikephil.charting.p040d.C0507i;
import com.github.mikephil.charting.p040d.C0509j;

/* renamed from: com.github.mikephil.charting.charts.b */
public class C0496b implements C0495c {
    final /* synthetic */ C0491a f5752a;

    protected C0496b(C0491a c0491a) {
        this.f5752a = c0491a;
    }

    public float m4452a(C0509j c0509j, C0507i c0507i, float f, float f2) {
        if ((c0509j.m4503m() > 0.0f && c0509j.m4502l() < 0.0f) || this.f5752a.m4391b(c0509j.m4508r()).m4363x()) {
            return 0.0f;
        }
        if (c0507i.m4475e() > 0.0f) {
            f = 0.0f;
        }
        if (c0507i.m4473d() < 0.0f) {
            f2 = 0.0f;
        }
        if (c0509j.m4502l() < 0.0f) {
            f2 = f;
        }
        return f2;
    }
}
