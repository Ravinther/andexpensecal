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

/* renamed from: com.github.mikephil.charting.g.n */
public class C0532n extends C0520a {
    protected C0485l f5884f;

    public C0532n(C0545l c0545l, C0485l c0485l, C0542h c0542h) {
        super(c0545l, c0542h);
        this.f5884f = c0485l;
        this.c.setColor(-16777216);
        this.c.setTextSize(C0544j.m4703a(10.0f));
    }

    public void m4665a(float f, float f2) {
        if (this.n.m4741i() > 10.0f && !this.n.m4752s()) {
            C0540f a = this.a.m4690a(this.n.m4735f(), this.n.m4733e());
            C0540f a2 = this.a.m4690a(this.n.m4735f(), this.n.m4739h());
            if (this.f5884f.m4362w()) {
                f = (float) a.f5897b;
                f2 = (float) a2.f5897b;
            } else {
                f = (float) a2.f5897b;
                f2 = (float) a.f5897b;
            }
        }
        m4668b(f, f2);
    }

    public void m4666a(Canvas canvas) {
        if (this.f5884f.m4280q() && this.f5884f.m4291g()) {
            float[] fArr = new float[(this.f5884f.f5657n * 2)];
            for (int i = 0; i < fArr.length; i += 2) {
                fArr[i + 1] = this.f5884f.f5656m[i / 2];
            }
            this.a.m4695a(fArr);
            this.c.setTypeface(this.f5884f.m4277n());
            this.c.setTextSize(this.f5884f.m4278o());
            this.c.setColor(this.f5884f.m4279p());
            float l = this.f5884f.m4275l();
            float b = ((float) C0544j.m4716b(this.c, "A")) / 2.5f;
            C0486m r = this.f5884f.m4357r();
            C0487n s = this.f5884f.m4358s();
            if (r == C0486m.LEFT) {
                if (s == C0487n.OUTSIDE_CHART) {
                    this.c.setTextAlign(Align.RIGHT);
                    l = this.n.m4719a() - l;
                } else {
                    this.c.setTextAlign(Align.LEFT);
                    l += this.n.m4719a();
                }
            } else if (s == C0487n.OUTSIDE_CHART) {
                this.c.setTextAlign(Align.LEFT);
                l += this.n.m4737g();
            } else {
                this.c.setTextAlign(Align.RIGHT);
                l = this.n.m4737g() - l;
            }
            m4667a(canvas, l, fArr, b);
        }
    }

    protected void m4667a(Canvas canvas, float f, float[] fArr, float f2) {
        int i = 0;
        while (i < this.f5884f.f5657n) {
            String c = this.f5884f.m4355c(i);
            if (this.f5884f.m4359t() || i < this.f5884f.f5657n - 1) {
                canvas.drawText(c, f, fArr[(i * 2) + 1] + f2, this.c);
                i++;
            } else {
                return;
            }
        }
    }

    protected void m4668b(float f, float f2) {
        int u = this.f5884f.m4360u();
        double abs = (double) Math.abs(f2 - f);
        if (u == 0 || abs <= 0.0d) {
            this.f5884f.f5656m = new float[0];
            this.f5884f.f5657n = 0;
            return;
        }
        double a = (double) C0544j.m4702a(abs / ((double) u));
        abs = Math.pow(10.0d, (double) ((int) Math.log10(a)));
        if (((int) (a / abs)) > 5) {
            a = Math.floor(10.0d * abs);
        }
        if (this.f5884f.m4361v()) {
            this.f5884f.f5657n = 2;
            r4 = new float[2];
            this.f5884f.f5656m = r4;
            this.f5884f.f5656m[0] = f;
            this.f5884f.f5656m[1] = f2;
        } else {
            abs = Math.ceil(((double) f) / a) * a;
            int i = 0;
            double d = abs;
            while (d <= C0544j.m4712b(Math.floor(((double) f2) / a) * a)) {
                d += a;
                i++;
            }
            this.f5884f.f5657n = i;
            if (this.f5884f.f5656m.length < i) {
                this.f5884f.f5656m = new float[i];
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.f5884f.f5656m[i2] = (float) abs;
                abs += a;
            }
        }
        if (a < 1.0d) {
            this.f5884f.f5658o = (int) Math.ceil(-Math.log10(a));
            return;
        }
        this.f5884f.f5658o = 0;
    }

    public void m4669b(Canvas canvas) {
        if (this.f5884f.m4280q() && this.f5884f.m4286b()) {
            this.d.setColor(this.f5884f.m4290f());
            this.d.setStrokeWidth(this.f5884f.m4288d());
            if (this.f5884f.m4357r() == C0486m.LEFT) {
                canvas.drawLine(this.n.m4735f(), this.n.m4733e(), this.n.m4735f(), this.n.m4739h(), this.d);
                return;
            }
            canvas.drawLine(this.n.m4737g(), this.n.m4733e(), this.n.m4737g(), this.n.m4739h(), this.d);
        }
    }

    public void m4670c(Canvas canvas) {
        if (this.f5884f.m4284a() && this.f5884f.m4280q()) {
            float[] fArr = new float[2];
            this.b.setColor(this.f5884f.m4287c());
            this.b.setStrokeWidth(this.f5884f.m4289e());
            this.b.setPathEffect(this.f5884f.m4295k());
            Path path = new Path();
            for (int i = 0; i < this.f5884f.f5657n; i++) {
                fArr[1] = this.f5884f.f5656m[i];
                this.a.m4695a(fArr);
                path.moveTo(this.n.m4719a(), fArr[1]);
                path.lineTo(this.n.m4737g(), fArr[1]);
                canvas.drawPath(path, this.b);
                path.reset();
            }
        }
    }

    public void m4671d(Canvas canvas) {
        List i = this.f5884f.m4293i();
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
