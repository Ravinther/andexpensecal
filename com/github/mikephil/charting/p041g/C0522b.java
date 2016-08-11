package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.p035a.C0468a;
import com.github.mikephil.charting.p036b.C0470b;
import com.github.mikephil.charting.p038e.C0492a;
import com.github.mikephil.charting.p039h.C0536k;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0501a;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0504b;
import com.github.mikephil.charting.p040d.C0506c;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.b */
public class C0522b extends C0521c {
    protected C0492a f5855a;
    protected RectF f5856b;
    protected C0470b[] f5857c;
    protected Paint f5858d;

    public C0522b(C0492a c0492a, C0468a c0468a, C0545l c0545l) {
        super(c0468a, c0545l);
        this.f5856b = new RectF();
        this.f5855a = c0492a;
        this.g = new Paint(1);
        this.g.setStyle(Style.FILL);
        this.g.setColor(Color.rgb(0, 0, 0));
        this.g.setAlpha(120);
        this.f5858d = new Paint(1);
        this.f5858d.setStyle(Style.FILL);
    }

    public void m4595a() {
        C0501a barData = this.f5855a.getBarData();
        this.f5857c = new C0470b[barData.m4471c()];
        for (int i = 0; i < this.f5857c.length; i++) {
            C0504b c0504b = (C0504b) barData.m4463a(i);
            this.f5857c[i] = new C0470b((c0504b.m4504n() * 4) * c0504b.m4520a(), barData.m4484a(), barData.m4471c(), c0504b.m4522b());
        }
    }

    protected void m4596a(float f, float f2, float f3, float f4, C0542h c0542h) {
        float f5 = (f - 0.5f) + f3;
        float f6 = (0.5f + f) - f3;
        float f7 = f2 >= f4 ? f2 : f4;
        if (f2 > f4) {
            f2 = f4;
        }
        this.f5856b.set(f5, f7, f6, f2);
        c0542h.m4693a(this.f5856b, this.e.m4254a());
    }

    public void m4597a(Canvas canvas) {
        C0501a barData = this.f5855a.getBarData();
        for (int i = 0; i < barData.m4471c(); i++) {
            C0504b c0504b = (C0504b) barData.m4463a(i);
            if (c0504b.m4507q()) {
                m4598a(canvas, c0504b, i);
            }
        }
    }

    protected void m4598a(Canvas canvas, C0504b c0504b, int i) {
        C0542h a = this.f5855a.m4382a(c0504b.m4508r());
        this.f5858d.setColor(c0504b.m4524d());
        float b = this.e.m4255b();
        float a2 = this.e.m4254a();
        List j = c0504b.m4500j();
        C0470b c0470b = this.f5857c[i];
        c0470b.m4257a(b, a2);
        c0470b.m4261a(c0504b.m4523c());
        c0470b.m4265c(i);
        c0470b.m4264a(this.f5855a.m4383c(c0504b.m4508r()));
        c0470b.m4263a(j);
        a.m4695a(c0470b.b);
        int i2;
        if (c0504b.m4510t().size() > 1) {
            for (i2 = 0; i2 < c0470b.m4259b(); i2 += 4) {
                if (this.n.m4732d(c0470b.b[i2 + 2])) {
                    if (this.n.m4734e(c0470b.b[i2])) {
                        if (this.f5855a.m4412f()) {
                            canvas.drawRect(c0470b.b[i2], this.n.m4733e(), c0470b.b[i2 + 2], this.n.m4739h(), this.f5858d);
                        }
                        this.f.setColor(c0504b.m4496d(i2 / 4));
                        canvas.drawRect(c0470b.b[i2], c0470b.b[i2 + 1], c0470b.b[i2 + 2], c0470b.b[i2 + 3], this.f);
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        this.f.setColor(c0504b.m4511u());
        for (i2 = 0; i2 < c0470b.m4259b(); i2 += 4) {
            if (this.n.m4732d(c0470b.b[i2 + 2])) {
                if (this.n.m4734e(c0470b.b[i2])) {
                    if (this.f5855a.m4412f()) {
                        canvas.drawRect(c0470b.b[i2], this.n.m4733e(), c0470b.b[i2 + 2], this.n.m4739h(), this.f5858d);
                    }
                    canvas.drawRect(c0470b.b[i2], c0470b.b[i2 + 1], c0470b.b[i2 + 2], c0470b.b[i2 + 3], this.f);
                } else {
                    return;
                }
            }
        }
    }

    protected void m4599a(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.i);
    }

    public void m4600a(Canvas canvas, C0538d[] c0538dArr) {
        int c = this.f5855a.getBarData().m4471c();
        for (C0538d c0538d : c0538dArr) {
            int b = c0538d.m4687b();
            int a = c0538d.m4685a();
            C0504b c0504b = (C0504b) this.f5855a.getBarData().m4463a(a);
            if (c0504b != null) {
                float c2 = c0504b.m4523c() / 2.0f;
                C0542h a2 = this.f5855a.m4382a(c0504b.m4508r());
                this.g.setColor(c0504b.m4517g());
                this.g.setAlpha(c0504b.m4525e());
                if (b < this.f5855a.getBarData().m4478h() && b >= 0 && ((float) b) < (this.f5855a.getXChartMax() * this.e.m4255b()) / ((float) c)) {
                    C0506c c0506c = (C0506c) ((C0504b) this.f5855a.getBarData().m4463a(a)).m4493b(b);
                    if (c0506c != null) {
                        Object obj;
                        float a3 = this.f5855a.getBarData().m4484a();
                        if (c0538d.m4688c() < 0) {
                            obj = null;
                        } else {
                            int i = 1;
                        }
                        float f = (((float) ((b * c) + a)) + (a3 / 2.0f)) + (((float) b) * a3);
                        float a4 = obj != null ? c0506c.m4534a()[c0538d.m4688c()] + c0506c.m4532a(c0538d.m4688c()) : c0506c.m4530c();
                        m4596a(f, a4, c2, obj != null ? c0506c.m4532a(c0538d.m4688c()) : 0.0f, a2);
                        canvas.drawRect(this.f5856b, this.g);
                        if (this.f5855a.m4409c()) {
                            this.g.setAlpha(255);
                            float a5 = this.e.m4254a() * 0.07f;
                            Path path = new Path();
                            path.moveTo(0.5f + f, (0.3f * a5) + a4);
                            path.lineTo(0.2f + f, a4 + a5);
                            path.lineTo(f + 0.8f, a5 + a4);
                            a2.m4692a(path);
                            canvas.drawPath(path, this.g);
                        }
                    }
                }
            }
        }
    }

    public float[] m4601a(C0542h c0542h, List<C0506c> list, int i) {
        return c0542h.m4697a((List) list, i, this.f5855a.getBarData(), this.e.m4254a());
    }

    public void m4602b(Canvas canvas) {
        if (m4603b()) {
            List j = this.f5855a.getBarData().m4480j();
            float a = C0544j.m4703a(5.0f);
            boolean d = this.f5855a.m4410d();
            for (int i = 0; i < this.f5855a.getBarData().m4471c(); i++) {
                C0504b c0504b = (C0504b) j.get(i);
                if (c0504b.m4509s()) {
                    boolean c = this.f5855a.m4383c(c0504b.m4508r());
                    float b = (float) C0544j.m4716b(this.i, "8");
                    float f = d ? -a : b + a;
                    float f2 = d ? b + a : -a;
                    if (c) {
                        f = (-f) - b;
                        f2 = (-f2) - b;
                    }
                    m4592a((C0502g) c0504b);
                    C0536k w = c0504b.m4513w();
                    C0542h a2 = this.f5855a.m4382a(c0504b.m4508r());
                    List j2 = c0504b.m4500j();
                    float[] a3 = m4601a(a2, j2, i);
                    int i2;
                    if (this.f5855a.m4411e()) {
                        i2 = 0;
                        while (((float) i2) < ((float) (a3.length - 1)) * this.e.m4255b()) {
                            C0506c c0506c = (C0506c) j2.get(i2 / 2);
                            float[] a4 = c0506c.m4534a();
                            if (a4 == null) {
                                if (!this.n.m4734e(a3[i2])) {
                                    break;
                                } else if (this.n.m4730c(a3[i2 + 1]) && this.n.m4732d(a3[i2])) {
                                    m4599a(canvas, w.m4683a(c0506c.m4530c()), a3[i2], (c0506c.m4530c() >= 0.0f ? f : f2) + a3[i2 + 1]);
                                }
                            } else {
                                float[] fArr = new float[(a4.length * 2)];
                                int i3 = 0;
                                b = c0506c.m4530c();
                                int i4 = 0;
                                while (true) {
                                    int length = fArr.length;
                                    if (i4 >= r0) {
                                        break;
                                    }
                                    b -= a4[i3];
                                    fArr[i4 + 1] = (a4[i3] + b) * this.e.m4254a();
                                    i3++;
                                    i4 += 2;
                                }
                                a2.m4695a(fArr);
                                for (i4 = 0; i4 < fArr.length; i4 += 2) {
                                    float f3 = a3[i2];
                                    b = (a4[i4 / 2] >= 0.0f ? f : f2) + fArr[i4 + 1];
                                    if (!this.n.m4734e(f3)) {
                                        break;
                                    }
                                    if (this.n.m4730c(b)) {
                                        if (this.n.m4732d(f3)) {
                                            m4599a(canvas, w.m4683a(a4[i4 / 2]), f3, b);
                                        }
                                    }
                                }
                            }
                            i2 += 2;
                        }
                    } else {
                        i2 = 0;
                        while (((float) i2) < ((float) a3.length) * this.e.m4255b() && this.n.m4734e(a3[i2])) {
                            if (this.n.m4730c(a3[i2 + 1]) && this.n.m4732d(a3[i2])) {
                                float c2 = ((C0506c) j2.get(i2 / 2)).m4530c();
                                m4599a(canvas, w.m4683a(c2), a3[i2], (c2 >= 0.0f ? f : f2) + a3[i2 + 1]);
                            }
                            i2 += 2;
                        }
                    }
                }
            }
        }
    }

    protected boolean m4603b() {
        return ((float) this.f5855a.getBarData().m4478h()) < ((float) this.f5855a.getMaxVisibleCount()) * this.n.m4749p();
    }

    public void m4604c(Canvas canvas) {
    }
}
