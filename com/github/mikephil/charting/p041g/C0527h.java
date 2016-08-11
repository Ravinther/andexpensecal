package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import com.github.mikephil.charting.charts.C0498f;
import com.github.mikephil.charting.p035a.C0468a;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p040d.C0512n;
import com.github.mikephil.charting.p040d.C0513o;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.h */
public class C0527h extends C0521c {
    protected C0498f f5879a;
    protected Paint f5880b;

    public C0527h(C0498f c0498f, C0468a c0468a, C0545l c0545l) {
        super(c0468a, c0545l);
        this.f5879a = c0498f;
        this.g = new Paint(1);
        this.g.setStyle(Style.STROKE);
        this.g.setStrokeWidth(2.0f);
        this.g.setColor(Color.rgb(255, 187, 115));
        this.f5880b = new Paint(1);
        this.f5880b.setStyle(Style.STROKE);
    }

    public void m4642a() {
    }

    public void m4643a(Canvas canvas) {
        for (C0513o c0513o : ((C0512n) this.f5879a.getData()).m4480j()) {
            if (c0513o.m4507q()) {
                m4644a(canvas, c0513o);
            }
        }
    }

    protected void m4644a(Canvas canvas, C0513o c0513o) {
        float sliceAngle = this.f5879a.getSliceAngle();
        float factor = this.f5879a.getFactor();
        PointF centerOffsets = this.f5879a.getCenterOffsets();
        List j = c0513o.m4500j();
        Path path = new Path();
        for (int i = 0; i < j.size(); i++) {
            this.f.setColor(c0513o.m4496d(i));
            PointF a = C0544j.m4707a(centerOffsets, (((C0505h) j.get(i)).m4530c() - this.f5879a.getYChartMin()) * factor, (((float) i) * sliceAngle) + this.f5879a.getRotationAngle());
            if (i == 0) {
                path.moveTo(a.x, a.y);
            } else {
                path.lineTo(a.x, a.y);
            }
        }
        path.close();
        if (c0513o.m4538H()) {
            this.f.setStyle(Style.FILL);
            this.f.setAlpha(c0513o.m4536F());
            canvas.drawPath(path, this.f);
            this.f.setAlpha(255);
        }
        this.f.setStrokeWidth(c0513o.m4537G());
        this.f.setStyle(Style.STROKE);
        if (!c0513o.m4538H() || c0513o.m4536F() < 255) {
            canvas.drawPath(path, this.f);
        }
    }

    public void m4645a(Canvas canvas, C0538d[] c0538dArr) {
        float sliceAngle = this.f5879a.getSliceAngle();
        float factor = this.f5879a.getFactor();
        PointF centerOffsets = this.f5879a.getCenterOffsets();
        for (int i = 0; i < c0538dArr.length; i++) {
            C0513o c0513o = (C0513o) ((C0512n) this.f5879a.getData()).m4463a(c0538dArr[i].m4685a());
            if (c0513o != null) {
                this.g.setColor(c0513o.m4517g());
                C0505h b = c0513o.m4493b(c0538dArr[i].m4687b());
                PointF a = C0544j.m4707a(centerOffsets, (b.m4530c() - this.f5879a.getYChartMin()) * factor, (((float) c0513o.m4489a(b)) * sliceAngle) + this.f5879a.getRotationAngle());
                canvas.drawLines(new float[]{a.x, 0.0f, a.x, this.n.m4746m(), 0.0f, a.y, this.n.m4747n(), a.y}, this.g);
            }
        }
    }

    public void m4646b(Canvas canvas) {
        float sliceAngle = this.f5879a.getSliceAngle();
        float factor = this.f5879a.getFactor();
        PointF centerOffsets = this.f5879a.getCenterOffsets();
        float a = C0544j.m4703a(5.0f);
        for (int i = 0; i < ((C0512n) this.f5879a.getData()).m4471c(); i++) {
            C0513o c0513o = (C0513o) ((C0512n) this.f5879a.getData()).m4463a(i);
            if (c0513o.m4509s()) {
                m4592a((C0502g) c0513o);
                List j = c0513o.m4500j();
                for (int i2 = 0; i2 < j.size(); i2++) {
                    C0505h c0505h = (C0505h) j.get(i2);
                    PointF a2 = C0544j.m4707a(centerOffsets, (c0505h.m4530c() - this.f5879a.getYChartMin()) * factor, (((float) i2) * sliceAngle) + this.f5879a.getRotationAngle());
                    canvas.drawText(c0513o.m4513w().m4683a(c0505h.m4530c()), a2.x, a2.y - a, this.i);
                }
            }
        }
    }

    public void m4647c(Canvas canvas) {
        m4648d(canvas);
    }

    protected void m4648d(Canvas canvas) {
        int i;
        float sliceAngle = this.f5879a.getSliceAngle();
        float factor = this.f5879a.getFactor();
        float rotationAngle = this.f5879a.getRotationAngle();
        PointF centerOffsets = this.f5879a.getCenterOffsets();
        this.f5880b.setStrokeWidth(this.f5879a.getWebLineWidth());
        this.f5880b.setColor(this.f5879a.getWebColor());
        this.f5880b.setAlpha(this.f5879a.getWebAlpha());
        for (i = 0; i < ((C0512n) this.f5879a.getData()).m4481k(); i++) {
            PointF a = C0544j.m4707a(centerOffsets, this.f5879a.getYRange() * factor, (((float) i) * sliceAngle) + rotationAngle);
            canvas.drawLine(centerOffsets.x, centerOffsets.y, a.x, a.y, this.f5880b);
        }
        this.f5880b.setStrokeWidth(this.f5879a.getWebLineWidthInner());
        this.f5880b.setColor(this.f5879a.getWebColorInner());
        this.f5880b.setAlpha(this.f5879a.getWebAlpha());
        int i2 = this.f5879a.getYAxis().f5657n;
        for (int i3 = 0; i3 < i2; i3++) {
            for (i = 0; i < ((C0512n) this.f5879a.getData()).m4481k(); i++) {
                float yChartMin = (this.f5879a.getYAxis().f5656m[i3] - this.f5879a.getYChartMin()) * factor;
                PointF a2 = C0544j.m4707a(centerOffsets, yChartMin, (((float) i) * sliceAngle) + rotationAngle);
                a = C0544j.m4707a(centerOffsets, yChartMin, (((float) (i + 1)) * sliceAngle) + rotationAngle);
                canvas.drawLine(a2.x, a2.y, a.x, a.y, this.f5880b);
            }
        }
    }
}
