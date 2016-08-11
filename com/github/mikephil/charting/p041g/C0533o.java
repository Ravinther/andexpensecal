package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import com.github.mikephil.charting.p037c.C0480g;
import com.github.mikephil.charting.p037c.C0481h;
import com.github.mikephil.charting.p037c.C0485l;
import com.github.mikephil.charting.p037c.C0486m;
import com.github.mikephil.charting.p037c.C0487n;
import com.github.mikephil.charting.p039h.C0540f;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.o */
public class C0533o extends C0532n {
    public C0533o(C0545l c0545l, C0485l c0485l, C0542h c0542h) {
        super(c0545l, c0485l, c0542h);
        this.e.setTextAlign(Align.LEFT);
    }

    public void m4672a(float f, float f2) {
        if (this.n.m4743j() > 10.0f && !this.n.m4753t()) {
            C0540f a = this.a.m4690a(this.n.m4735f(), this.n.m4733e());
            C0540f a2 = this.a.m4690a(this.n.m4737g(), this.n.m4733e());
            if (this.f.m4362w()) {
                f = (float) a2.f5896a;
                f2 = (float) a.f5896a;
            } else {
                f = (float) a.f5896a;
                f2 = (float) a2.f5896a;
            }
        }
        m4668b(f, f2);
    }

    public void m4673a(Canvas canvas) {
        if (this.f.m4280q() && this.f.m4291g()) {
            float a;
            float[] fArr = new float[(this.f.f5657n * 2)];
            for (int i = 0; i < fArr.length; i += 2) {
                fArr[i] = this.f.f5656m[i / 2];
            }
            this.a.m4695a(fArr);
            this.c.setTypeface(this.f.m4277n());
            this.c.setTextSize(this.f.m4278o());
            this.c.setColor(this.f.m4279p());
            this.c.setTextAlign(Align.CENTER);
            float b = ((float) C0544j.m4716b(this.c, "A")) + this.f.m4276m();
            C0486m r = this.f.m4357r();
            C0487n s = this.f.m4358s();
            if (r == C0486m.LEFT) {
                if (s == C0487n.OUTSIDE_CHART) {
                    a = C0544j.m4703a(3.0f);
                    b = this.n.m4733e();
                } else {
                    a = b * -1.0f;
                    b = this.n.m4733e();
                }
            } else if (s == C0487n.OUTSIDE_CHART) {
                a = b * -1.0f;
                b = this.n.m4739h();
            } else {
                a = C0544j.m4703a(4.0f);
                b = this.n.m4739h();
            }
            m4674a(canvas, b, fArr, a);
        }
    }

    protected void m4674a(Canvas canvas, float f, float[] fArr, float f2) {
        this.c.setTypeface(this.f.m4277n());
        this.c.setTextSize(this.f.m4278o());
        this.c.setColor(this.f.m4279p());
        int i = 0;
        while (i < this.f.f5657n) {
            String c = this.f.m4355c(i);
            if (this.f.m4359t() || i < this.f.f5657n - 1) {
                canvas.drawText(c, fArr[i * 2], f - f2, this.c);
                i++;
            } else {
                return;
            }
        }
    }

    public void m4675b(Canvas canvas) {
        if (this.f.m4280q() && this.f.m4286b()) {
            this.d.setColor(this.f.m4290f());
            this.d.setStrokeWidth(this.f.m4288d());
            if (this.f.m4357r() == C0486m.LEFT) {
                canvas.drawLine(this.n.m4735f(), this.n.m4733e(), this.n.m4737g(), this.n.m4733e(), this.d);
                return;
            }
            canvas.drawLine(this.n.m4735f(), this.n.m4739h(), this.n.m4737g(), this.n.m4739h(), this.d);
        }
    }

    public void m4676c(Canvas canvas) {
        if (this.f.m4284a() && this.f.m4280q()) {
            float[] fArr = new float[2];
            this.b.setColor(this.f.m4287c());
            this.b.setStrokeWidth(this.f.m4289e());
            for (int i = 0; i < this.f.f5657n; i++) {
                fArr[0] = this.f.f5656m[i];
                this.a.m4695a(fArr);
                canvas.drawLine(fArr[0], this.n.m4733e(), fArr[0], this.n.m4739h(), this.b);
            }
        }
    }

    public void m4677d(Canvas canvas) {
        List i = this.f.m4293i();
        if (i != null && i.size() > 0) {
            float[] fArr = new float[4];
            Path path = new Path();
            for (int i2 = 0; i2 < i.size(); i2++) {
                C0480g c0480g = (C0480g) i.get(i2);
                fArr[0] = c0480g.m4319a();
                fArr[2] = c0480g.m4319a();
                this.a.m4695a(fArr);
                fArr[1] = this.n.m4733e();
                fArr[3] = this.n.m4739h();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                this.e.setStyle(Style.STROKE);
                this.e.setColor(c0480g.m4327c());
                this.e.setPathEffect(c0480g.m4328d());
                this.e.setStrokeWidth(c0480g.m4324b());
                canvas.drawPath(path, this.e);
                path.reset();
                String h = c0480g.m4332h();
                if (!(h == null || h.equals(""))) {
                    float b = c0480g.m4324b();
                    float a = C0544j.m4703a(4.0f);
                    this.e.setStyle(c0480g.m4330f());
                    this.e.setPathEffect(null);
                    this.e.setColor(c0480g.m4329e());
                    this.e.setStrokeWidth(0.5f);
                    this.e.setTextSize(c0480g.m4333i());
                    float b2 = ((float) C0544j.m4716b(this.e, h)) + (a / 2.0f);
                    if (c0480g.m4331g() == C0481h.POS_RIGHT) {
                        canvas.drawText(h, fArr[0] + b, this.n.m4739h() - a, this.e);
                    } else {
                        canvas.drawText(h, fArr[0] + b, this.n.m4733e() + b2, this.e);
                    }
                }
            }
        }
    }
}
