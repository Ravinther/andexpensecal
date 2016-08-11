package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.p038e.C0493d;
import com.github.mikephil.charting.p039h.C0495c;
import com.github.mikephil.charting.p040d.C0507i;
import com.github.mikephil.charting.p041g.C0525f;

public class LineChart extends C0491a<C0507i> implements C0493d {
    protected float f5736T;
    private C0495c f5737U;

    public LineChart(Context context) {
        super(context);
        this.f5736T = 3.0f;
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5736T = 3.0f;
    }

    public LineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5736T = 3.0f;
    }

    protected void m4427a() {
        super.m4387a();
        this.K = new C0525f(this, this.M, this.L);
        this.f5737U = new C0496b(this);
    }

    protected void m4428b() {
        super.m4393b();
        if (this.C == 0.0f && ((C0507i) this.v).m4478h() > 0) {
            this.C = 1.0f;
        }
    }

    public C0495c getFillFormatter() {
        return this.f5737U;
    }

    public float getHighlightLineWidth() {
        return this.f5736T;
    }

    public C0507i getLineData() {
        return (C0507i) this.v;
    }

    public void setFillFormatter(C0495c c0495c) {
        if (c0495c == null) {
            C0496b c0496b = new C0496b(this);
        } else {
            this.f5737U = c0495c;
        }
    }

    public void setHighlightLineWidth(float f) {
        this.f5736T = f;
    }
}
