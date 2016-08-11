package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.PointF;
import com.github.mikephil.charting.charts.C0498f;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;

/* renamed from: com.github.mikephil.charting.g.m */
public class C0531m extends C0528j {
    private C0498f f5883g;

    public C0531m(C0545l c0545l, C0483j c0483j, C0498f c0498f) {
        super(c0545l, c0483j, null);
        this.f5883g = c0498f;
    }

    public void m4663a(Canvas canvas) {
        if (this.f.m4280q() && this.f.m4291g()) {
            this.c.setTypeface(this.f.m4277n());
            this.c.setTextSize(this.f.m4278o());
            this.c.setColor(this.f.m4279p());
            float sliceAngle = this.f5883g.getSliceAngle();
            float factor = this.f5883g.getFactor();
            PointF centerOffsets = this.f5883g.getCenterOffsets();
            for (int i = 0; i < this.f.m4343v().size(); i++) {
                String str = (String) this.f.m4343v().get(i);
                PointF a = C0544j.m4707a(centerOffsets, (this.f5883g.getYRange() * factor) + (((float) this.f.f5638m) / 2.0f), ((((float) i) * sliceAngle) + this.f5883g.getRotationAngle()) % 360.0f);
                canvas.drawText(str, a.x, a.y + (((float) this.f.f5639n) / 2.0f), this.c);
            }
        }
    }

    public void m4664d(Canvas canvas) {
    }
}
