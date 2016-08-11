package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import com.github.mikephil.charting.charts.C0498f;
import com.github.mikephil.charting.p037c.C0480g;
import com.github.mikephil.charting.p037c.C0485l;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0512n;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.p */
public class C0534p extends C0532n {
    private C0498f f5885g;

    public C0534p(C0545l c0545l, C0485l c0485l, C0498f c0498f) {
        super(c0545l, c0485l, null);
        this.f5885g = c0498f;
    }

    public void m4678a(float f, float f2) {
        m4680b(f, f2);
    }

    public void m4679a(Canvas canvas) {
        if (this.f.m4280q() && this.f.m4291g()) {
            this.c.setTypeface(this.f.m4277n());
            this.c.setTextSize(this.f.m4278o());
            this.c.setColor(this.f.m4279p());
            PointF centerOffsets = this.f5885g.getCenterOffsets();
            float factor = this.f5885g.getFactor();
            int i = this.f.f5657n;
            int i2 = 0;
            while (i2 < i) {
                if (i2 != i - 1 || this.f.m4359t()) {
                    PointF a = C0544j.m4707a(centerOffsets, (this.f.f5656m[i2] - this.f.f5667x) * factor, this.f5885g.getRotationAngle());
                    canvas.drawText(this.f.m4355c(i2), a.x + 10.0f, a.y, this.c);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    protected void m4680b(float f, float f2) {
        int u = this.f.m4360u();
        double abs = (double) Math.abs(f2 - f);
        if (u == 0 || abs <= 0.0d) {
            this.f.f5656m = new float[0];
            this.f.f5657n = 0;
            return;
        }
        double a = (double) C0544j.m4702a(abs / ((double) u));
        abs = Math.pow(10.0d, (double) ((int) Math.log10(a)));
        if (((int) (a / abs)) > 5) {
            a = Math.floor(10.0d * abs);
        }
        if (this.f.m4361v()) {
            this.f.f5657n = 2;
            r3 = new float[2];
            this.f.f5656m = r3;
            this.f.f5656m[0] = f;
            this.f.f5656m[1] = f2;
        } else {
            double ceil = Math.ceil(((double) f) / a) * a;
            int i = 0;
            for (double d = ceil; d <= C0544j.m4712b(Math.floor(((double) f2) / a) * a); d += a) {
                i++;
            }
            if (Float.isNaN(this.f.m4365z())) {
                i++;
            }
            this.f.f5657n = i;
            if (this.f.f5656m.length < i) {
                this.f.f5656m = new float[i];
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.f.f5656m[i2] = (float) ceil;
                ceil += a;
            }
        }
        if (a < 1.0d) {
            this.f.f5658o = (int) Math.ceil(-Math.log10(a));
        } else {
            this.f.f5658o = 0;
        }
        this.f.f5666w = this.f.f5656m[this.f.f5657n - 1];
        this.f.f5668y = Math.abs(this.f.f5666w - this.f.f5667x);
    }

    public void m4681d(Canvas canvas) {
        List i = this.f.m4293i();
        if (i != null) {
            float sliceAngle = this.f5885g.getSliceAngle();
            float factor = this.f5885g.getFactor();
            PointF centerOffsets = this.f5885g.getCenterOffsets();
            for (int i2 = 0; i2 < i.size(); i2++) {
                C0480g c0480g = (C0480g) i.get(i2);
                this.e.setColor(c0480g.m4327c());
                this.e.setPathEffect(c0480g.m4328d());
                this.e.setStrokeWidth(c0480g.m4324b());
                float a = (c0480g.m4319a() - this.f5885g.getYChartMin()) * factor;
                Path path = new Path();
                for (int i3 = 0; i3 < ((C0512n) this.f5885g.getData()).m4481k(); i3++) {
                    PointF a2 = C0544j.m4707a(centerOffsets, a, (((float) i3) * sliceAngle) + this.f5885g.getRotationAngle());
                    if (i3 == 0) {
                        path.moveTo(a2.x, a2.y);
                    } else {
                        path.lineTo(a2.x, a2.y);
                    }
                }
                path.close();
                canvas.drawPath(path, this.e);
            }
        }
    }
}
