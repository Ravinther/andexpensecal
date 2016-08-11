package com.github.mikephil.charting.p039h;

import java.text.DecimalFormat;

/* renamed from: com.github.mikephil.charting.h.e */
public class C0539e implements C0536k {
    protected DecimalFormat f5895a;

    public C0539e() {
        this.f5895a = new DecimalFormat("###,###,##0.0");
    }

    public String m4689a(float f) {
        return new StringBuilder(String.valueOf(this.f5895a.format((double) f))).append(" %").toString();
    }
}
