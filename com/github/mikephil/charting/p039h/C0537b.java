package com.github.mikephil.charting.p039h;

import java.text.DecimalFormat;

/* renamed from: com.github.mikephil.charting.h.b */
public class C0537b implements C0536k {
    private DecimalFormat f5891a;

    public C0537b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f5891a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public String m4684a(float f) {
        return this.f5891a.format((double) f);
    }
}
