package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import com.github.mikephil.charting.p037c.C0480g;
import com.github.mikephil.charting.p037c.C0481h;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p037c.C0484k;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.j */
public class C0528j extends C0520a {
    protected C0483j f5881f;

    public C0528j(C0545l c0545l, C0483j c0483j, C0542h c0542h) {
        super(c0545l, c0542h);
        this.f5881f = c0483j;
        this.c.setColor(-16777216);
        this.c.setTextAlign(Align.CENTER);
        this.c.setTextSize(C0544j.m4703a(10.0f));
    }

    public void m4649a(float f, List<String> list) {
        this.c.setTypeface(this.f5881f.m4277n());
        this.c.setTextSize(this.f5881f.m4278o());
        StringBuffer stringBuffer = new StringBuffer();
        int round = Math.round(((float) this.f5881f.m4341t()) + f);
        for (int i = 0; i < round; i++) {
            stringBuffer.append("h");
        }
        this.f5881f.f5638m = C0544j.m4705a(this.c, stringBuffer.toString());
        this.f5881f.f5639n = C0544j.m4716b(this.c, "Q");
        this.f5881f.m4337a((List) list);
    }

    public void m4650a(Canvas canvas) {
        if (this.f5881f.m4280q() && this.f5881f.m4291g()) {
            float a = C0544j.m4703a(4.0f);
            this.c.setTypeface(this.f5881f.m4277n());
            this.c.setTextSize(this.f5881f.m4278o());
            this.c.setColor(this.f5881f.m4279p());
            if (this.f5881f.m4339r() == C0484k.TOP) {
                m4651a(canvas, this.n.m4729c() - a);
            } else if (this.f5881f.m4339r() == C0484k.BOTTOM) {
                m4651a(canvas, (a * 1.5f) + (this.n.m4739h() + ((float) this.f5881f.f5639n)));
            } else if (this.f5881f.m4339r() == C0484k.BOTTOM_INSIDE) {
                m4651a(canvas, this.n.m4739h() - a);
            } else if (this.f5881f.m4339r() == C0484k.TOP_INSIDE) {
                m4651a(canvas, (a + this.n.m4729c()) + ((float) this.f5881f.f5639n));
            } else {
                m4651a(canvas, this.n.m4729c() - a);
                m4651a(canvas, (a * 1.6f) + (this.n.m4739h() + ((float) this.f5881f.f5639n)));
            }
        }
    }

    protected void m4651a(Canvas canvas, float f) {
        float[] fArr = new float[]{0.0f, 0.0f};
        int i = this.o;
        while (i <= this.p) {
            fArr[0] = (float) i;
            this.a.m4695a(fArr);
            if (this.n.m4727b(fArr[0])) {
                String str = (String) this.f5881f.m4343v().get(i);
                if (this.f5881f.m4342u()) {
                    if (i == this.f5881f.m4343v().size() - 1 && this.f5881f.m4343v().size() > 1) {
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
            i = this.f5881f.f5640o + i;
        }
    }

    public void m4652b(Canvas canvas) {
        if (this.f5881f.m4286b() && this.f5881f.m4280q()) {
            this.d.setColor(this.f5881f.m4290f());
            this.d.setStrokeWidth(this.f5881f.m4288d());
            if (this.f5881f.m4339r() == C0484k.TOP || this.f5881f.m4339r() == C0484k.TOP_INSIDE || this.f5881f.m4339r() == C0484k.BOTH_SIDED) {
                canvas.drawLine(this.n.m4735f(), this.n.m4733e(), this.n.m4737g(), this.n.m4733e(), this.d);
            }
            if (this.f5881f.m4339r() == C0484k.BOTTOM || this.f5881f.m4339r() == C0484k.BOTTOM_INSIDE || this.f5881f.m4339r() == C0484k.BOTH_SIDED) {
                canvas.drawLine(this.n.m4735f(), this.n.m4739h(), this.n.m4737g(), this.n.m4739h(), this.d);
            }
        }
    }

    public void m4653c(Canvas canvas) {
        if (this.f5881f.m4284a() && this.f5881f.m4280q()) {
            float[] fArr = new float[]{0.0f, 0.0f};
            this.b.setColor(this.f5881f.m4287c());
            this.b.setStrokeWidth(this.f5881f.m4289e());
            this.b.setPathEffect(this.f5881f.m4295k());
            int i = this.o;
            while (i <= this.p) {
                fArr[0] = (float) i;
                this.a.m4695a(fArr);
                if (fArr[0] >= this.n.m4719a() && fArr[0] <= this.n.m4747n()) {
                    canvas.drawLine(fArr[0], this.n.m4729c(), fArr[0], this.n.m4739h(), this.b);
                }
                i = this.f5881f.f5640o + i;
            }
        }
    }

    public void m4654d(Canvas canvas) {
        List i = this.f5881f.m4293i();
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
                this.e.setStrokeWidth(c0480g.m4324b());
                this.e.setPathEffect(c0480g.m4328d());
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
