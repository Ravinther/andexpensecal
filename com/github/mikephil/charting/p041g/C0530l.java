package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.p037c.C0480g;
import com.github.mikephil.charting.p037c.C0481h;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p037c.C0484k;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0501a;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.l */
public class C0530l extends C0529k {
    public C0530l(C0545l c0545l, C0483j c0483j, C0542h c0542h, BarChart barChart) {
        super(c0545l, c0483j, c0542h, barChart);
    }

    public void m4657a(float f, List<String> list) {
        this.c.setTypeface(this.f.m4277n());
        this.c.setTextSize(this.f.m4278o());
        this.f.m4337a((List) list);
        String w = this.f.m4344w();
        this.f.f5638m = (int) (((float) C0544j.m4705a(this.c, w)) + (this.f.m4275l() * 3.5f));
        this.f.f5639n = C0544j.m4716b(this.c, w);
    }

    public void m4658a(Canvas canvas) {
        if (this.f.m4280q() && this.f.m4291g()) {
            float l = this.f.m4275l();
            this.c.setTypeface(this.f.m4277n());
            this.c.setTextSize(this.f.m4278o());
            this.c.setColor(this.f.m4279p());
            if (this.f.m4339r() == C0484k.TOP) {
                this.c.setTextAlign(Align.LEFT);
                m4659a(canvas, l + this.n.m4737g());
            } else if (this.f.m4339r() == C0484k.BOTTOM) {
                this.c.setTextAlign(Align.RIGHT);
                m4659a(canvas, this.n.m4735f() - l);
            } else if (this.f.m4339r() == C0484k.BOTTOM_INSIDE) {
                this.c.setTextAlign(Align.LEFT);
                m4659a(canvas, l + this.n.m4735f());
            } else if (this.f.m4339r() == C0484k.TOP_INSIDE) {
                this.c.setTextAlign(Align.RIGHT);
                m4659a(canvas, this.n.m4737g() - l);
            } else {
                m4659a(canvas, this.n.m4735f());
                m4659a(canvas, this.n.m4737g());
            }
        }
    }

    protected void m4659a(Canvas canvas, float f) {
        float[] fArr = new float[]{0.0f, 0.0f};
        C0501a c0501a = (C0501a) this.g.getData();
        int c = c0501a.m4471c();
        int i = this.o;
        while (i <= this.p) {
            fArr[1] = (((float) (i * c)) + (((float) i) * c0501a.m4484a())) + (c0501a.m4484a() / 2.0f);
            if (c > 1) {
                fArr[1] = fArr[1] + ((((float) c) - 1.0f) / 2.0f);
            }
            this.a.m4695a(fArr);
            if (this.n.m4730c(fArr[1])) {
                canvas.drawText((String) this.f.m4343v().get(i), f, fArr[1] + (((float) this.f.f5639n) / 2.0f), this.c);
            }
            i = this.f.f5640o + i;
        }
    }

    public void m4660b(Canvas canvas) {
        if (this.f.m4286b() && this.f.m4280q()) {
            this.d.setColor(this.f.m4290f());
            this.d.setStrokeWidth(this.f.m4288d());
            if (this.f.m4339r() == C0484k.TOP || this.f.m4339r() == C0484k.TOP_INSIDE || this.f.m4339r() == C0484k.BOTH_SIDED) {
                canvas.drawLine(this.n.m4737g(), this.n.m4733e(), this.n.m4737g(), this.n.m4739h(), this.d);
            }
            if (this.f.m4339r() == C0484k.BOTTOM || this.f.m4339r() == C0484k.BOTTOM_INSIDE || this.f.m4339r() == C0484k.BOTH_SIDED) {
                canvas.drawLine(this.n.m4735f(), this.n.m4733e(), this.n.m4735f(), this.n.m4739h(), this.d);
            }
        }
    }

    public void m4661c(Canvas canvas) {
        if (this.f.m4284a() && this.f.m4280q()) {
            float[] fArr = new float[]{0.0f, 0.0f};
            this.b.setColor(this.f.m4287c());
            this.b.setStrokeWidth(this.f.m4289e());
            C0501a c0501a = (C0501a) this.g.getData();
            int c = c0501a.m4471c();
            int i = this.o;
            while (i <= this.p) {
                fArr[1] = (((float) (i * c)) + (((float) i) * c0501a.m4484a())) - 0.5f;
                this.a.m4695a(fArr);
                if (this.n.m4730c(fArr[1])) {
                    canvas.drawLine(this.n.m4735f(), fArr[1], this.n.m4737g(), fArr[1], this.b);
                }
                i = this.f.f5640o + i;
            }
        }
    }

    public void m4662d(Canvas canvas) {
        List i = this.f.m4293i();
        if (i != null && i.size() > 0) {
            float[] fArr = new float[2];
            Path path = new Path();
            for (int i2 = 0; i2 < i.size(); i2++) {
                C0480g c0480g = (C0480g) i.get(i2);
                this.e.setStyle(Style.STROKE);
                this.e.setColor(c0480g.m4327c());
                this.e.setStrokeWidth(c0480g.m4324b());
                this.e.setPathEffect(c0480g.m4328d());
                fArr[1] = c0480g.m4319a();
                this.a.m4695a(fArr);
                path.moveTo(this.n.m4735f(), fArr[1]);
                path.lineTo(this.n.m4737g(), fArr[1]);
                canvas.drawPath(path, this.e);
                path.reset();
                String h = c0480g.m4332h();
                if (!(h == null || h.equals(""))) {
                    float a = C0544j.m4703a(4.0f);
                    float b = c0480g.m4324b() + (((float) C0544j.m4716b(this.e, h)) / 2.0f);
                    this.e.setStyle(c0480g.m4330f());
                    this.e.setPathEffect(null);
                    this.e.setColor(c0480g.m4329e());
                    this.e.setStrokeWidth(0.5f);
                    this.e.setTextSize(c0480g.m4333i());
                    if (c0480g.m4331g() == C0481h.POS_RIGHT) {
                        this.e.setTextAlign(Align.RIGHT);
                        canvas.drawText(h, this.n.m4737g() - a, fArr[1] - b, this.e);
                    } else {
                        this.e.setTextAlign(Align.LEFT);
                        canvas.drawText(h, this.n.m4719a() + a, fArr[1] - b, this.e);
                    }
                }
            }
        }
    }
}
