package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0501a;

/* renamed from: com.github.mikephil.charting.g.k */
public class C0529k extends C0528j {
    protected BarChart f5882g;

    public C0529k(C0545l c0545l, C0483j c0483j, C0542h c0542h, BarChart barChart) {
        super(c0545l, c0483j, c0542h);
        this.f5882g = barChart;
    }

    protected void m4655a(Canvas canvas, float f) {
        float[] fArr = new float[]{0.0f, 0.0f};
        C0501a c0501a = (C0501a) this.f5882g.getData();
        int c = c0501a.m4471c();
        int i = this.o;
        while (i <= this.p) {
            fArr[0] = (((float) (i * c)) + (((float) i) * c0501a.m4484a())) + (c0501a.m4484a() / 2.0f);
            if (c > 1) {
                fArr[0] = fArr[0] + ((((float) c) - 1.0f) / 2.0f);
            }
            this.a.m4695a(fArr);
            if (this.n.m4727b(fArr[0]) && i >= 0 && i < this.f.m4343v().size()) {
                String str = (String) this.f.m4343v().get(i);
                if (this.f.m4342u()) {
                    if (i == this.f.m4343v().size() - 1) {
                        float a = (float) C0544j.m4705a(this.c, str);
                        if (a > this.n.m4725b() * 2.0f && fArr[0] + a > this.n.m4747n()) {
                            fArr[0] = fArr[0] - (a / 2.0f);
                        }
                    } else if (i == 0) {
                        fArr[0] = (((float) C0544j.m4705a(this.c, str)) / 2.0f) + fArr[0];
                    }
                }
                canvas.drawText(str, fArr[0], f, this.c);
            }
            i = this.f.f5640o + i;
        }
    }

    public void m4656c(Canvas canvas) {
        if (this.f.m4284a() && this.f.m4280q()) {
            float[] fArr = new float[]{0.0f, 0.0f};
            this.b.setColor(this.f.m4287c());
            this.b.setStrokeWidth(this.f.m4289e());
            C0501a c0501a = (C0501a) this.f5882g.getData();
            int c = c0501a.m4471c();
            int i = this.o;
            while (i < this.p) {
                fArr[0] = (((float) (i * c)) + (((float) i) * c0501a.m4484a())) - 0.5f;
                this.a.m4695a(fArr);
                if (this.n.m4727b(fArr[0])) {
                    canvas.drawLine(fArr[0], this.n.m4729c(), fArr[0], this.n.m4739h(), this.b);
                }
                i = this.f.f5640o + i;
            }
        }
    }
}
