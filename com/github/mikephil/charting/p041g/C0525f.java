package com.github.mikephil.charting.p041g;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import com.github.mikephil.charting.p035a.C0468a;
import com.github.mikephil.charting.p036b.C0471c;
import com.github.mikephil.charting.p036b.C0473e;
import com.github.mikephil.charting.p038e.C0493d;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p040d.C0507i;
import com.github.mikephil.charting.p040d.C0509j;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.f */
public class C0525f extends C0521c {
    protected C0493d f5865a;
    protected Paint f5866b;
    protected Bitmap f5867c;
    protected Canvas f5868d;
    protected Path f5869j;
    protected Path f5870k;
    protected C0473e[] f5871l;
    protected C0471c[] f5872m;

    public C0525f(C0493d c0493d, C0468a c0468a, C0545l c0545l) {
        super(c0468a, c0545l);
        this.f5869j = new Path();
        this.f5870k = new Path();
        this.f5865a = c0493d;
        this.f5866b = new Paint(1);
        this.f5866b.setStyle(Style.FILL);
        this.f5866b.setColor(-1);
    }

    private Path m4619a(List<C0505h> list, float f, int i, int i2) {
        float b = this.e.m4255b();
        float a = this.e.m4254a();
        Path path = new Path();
        path.moveTo((float) ((C0505h) list.get(i)).m4529b(), f);
        path.lineTo((float) ((C0505h) list.get(i)).m4529b(), ((C0505h) list.get(i)).m4530c() * a);
        int ceil = (int) Math.ceil((double) ((((float) (i2 - i)) * b) + ((float) i)));
        for (int i3 = i + 1; i3 < ceil; i3++) {
            C0505h c0505h = (C0505h) list.get(i3);
            path.lineTo((float) c0505h.m4529b(), c0505h.m4530c() * a);
        }
        path.lineTo((float) ((C0505h) list.get(Math.max(Math.min(((int) Math.ceil((double) ((((float) (i2 - i)) * b) + ((float) i)))) - 1, list.size() - 1), 0))).m4529b(), f);
        path.close();
        return path;
    }

    public void m4620a() {
        C0507i lineData = this.f5865a.getLineData();
        this.f5871l = new C0473e[lineData.m4471c()];
        this.f5872m = new C0471c[lineData.m4471c()];
        for (int i = 0; i < this.f5871l.length; i++) {
            C0509j c0509j = (C0509j) lineData.m4463a(i);
            this.f5871l[i] = new C0473e((c0509j.m4499i() * 4) - 4);
            this.f5872m[i] = new C0471c(c0509j.m4499i() * 2);
        }
    }

    public void m4621a(Canvas canvas) {
        int n = (int) this.n.m4747n();
        int m = (int) this.n.m4746m();
        if (!(this.f5867c != null && this.f5867c.getWidth() == n && this.f5867c.getHeight() == m)) {
            if (n > 0 && m > 0) {
                this.f5867c = Bitmap.createBitmap(n, m, Config.ARGB_4444);
                this.f5868d = new Canvas(this.f5867c);
            } else {
                return;
            }
        }
        this.f5867c.eraseColor(0);
        for (C0509j c0509j : this.f5865a.getLineData().m4480j()) {
            if (c0509j.m4507q()) {
                m4622a(canvas, c0509j);
            }
        }
        canvas.drawBitmap(this.f5867c, 0.0f, 0.0f, this.f);
    }

    protected void m4622a(Canvas canvas, C0509j c0509j) {
        List j = c0509j.m4500j();
        if (j.size() >= 1) {
            this.f.setStrokeWidth(c0509j.m4537G());
            this.f.setPathEffect(c0509j.m4547d());
            if (c0509j.m4550f()) {
                m4624a(canvas, c0509j, j);
            } else {
                m4628b(canvas, c0509j, j);
            }
            this.f.setPathEffect(null);
        }
    }

    protected void m4623a(Canvas canvas, C0509j c0509j, Path path, C0542h c0542h, int i, int i2) {
        float a = this.f5865a.getFillFormatter().m4451a(c0509j, this.f5865a.getLineData(), this.f5865a.getYChartMax(), this.f5865a.getYChartMin());
        path.lineTo((float) (i2 - 1), a);
        path.lineTo((float) i, a);
        path.close();
        this.f.setStyle(Style.FILL);
        this.f.setColor(c0509j.m4535E());
        this.f.setAlpha(c0509j.m4536F());
        c0542h.m4692a(path);
        this.f5868d.drawPath(path, this.f);
        this.f.setAlpha(255);
    }

    protected void m4624a(Canvas canvas, C0509j c0509j, List<C0505h> list) {
        C0542h a = this.f5865a.m4382a(c0509j.m4508r());
        C0505h b = c0509j.m4493b(this.o);
        C0505h b2 = c0509j.m4493b(this.p);
        int max = Math.max(c0509j.m4489a(b), 0);
        int min = Math.min(c0509j.m4489a(b2) + 1, list.size());
        float b3 = this.e.m4255b();
        float a2 = this.e.m4254a();
        float a3 = c0509j.m4543a();
        this.f5869j.reset();
        int ceil = (int) Math.ceil((double) ((((float) (min - max)) * b3) + ((float) max)));
        if (ceil - max >= 2) {
            b2 = (C0505h) list.get(max);
            C0505h c0505h = (C0505h) list.get(max);
            C0505h c0505h2 = (C0505h) list.get(max);
            b2 = (C0505h) list.get(max + 1);
            this.f5869j.moveTo((float) c0505h2.m4529b(), c0505h2.m4530c() * a2);
            this.f5869j.cubicTo((((float) (c0505h2.m4529b() - c0505h.m4529b())) * a3) + ((float) c0505h.m4529b()), (c0505h.m4530c() + ((c0505h2.m4530c() - c0505h.m4530c()) * a3)) * a2, ((float) c0505h2.m4529b()) - (((float) (b2.m4529b() - c0505h2.m4529b())) * a3), (c0505h2.m4530c() - ((b2.m4530c() - c0505h2.m4530c()) * a3)) * a2, (float) c0505h2.m4529b(), c0505h2.m4530c() * a2);
            min = max + 1;
            int min2 = Math.min(ceil, list.size() - 1);
            max = min;
            while (max < min2) {
                b2 = (C0505h) list.get(max == 1 ? 0 : max - 2);
                c0505h = (C0505h) list.get(max - 1);
                c0505h2 = (C0505h) list.get(max);
                C0505h c0505h3 = (C0505h) list.get(max + 1);
                this.f5869j.cubicTo(((float) c0505h.m4529b()) + (((float) (c0505h2.m4529b() - b2.m4529b())) * a3), (c0505h.m4530c() + ((c0505h2.m4530c() - b2.m4530c()) * a3)) * a2, ((float) c0505h2.m4529b()) - (((float) (c0505h3.m4529b() - c0505h.m4529b())) * a3), (c0505h2.m4530c() - ((c0505h3.m4530c() - c0505h.m4530c()) * a3)) * a2, (float) c0505h2.m4529b(), c0505h2.m4530c() * a2);
                max++;
            }
            if (ceil > list.size() - 1) {
                b2 = (C0505h) list.get(list.size() >= 3 ? list.size() - 3 : list.size() - 2);
                c0505h = (C0505h) list.get(list.size() - 2);
                c0505h2 = (C0505h) list.get(list.size() - 1);
                this.f5869j.cubicTo((((float) (c0505h2.m4529b() - b2.m4529b())) * a3) + ((float) c0505h.m4529b()), (c0505h.m4530c() + ((c0505h2.m4530c() - b2.m4530c()) * a3)) * a2, ((float) c0505h2.m4529b()) - (((float) (c0505h2.m4529b() - c0505h.m4529b())) * a3), (c0505h2.m4530c() - ((c0505h2.m4530c() - c0505h.m4530c()) * a3)) * a2, (float) c0505h2.m4529b(), c0505h2.m4530c() * a2);
            }
        }
        if (c0509j.m4538H()) {
            this.f5870k.reset();
            this.f5870k.addPath(this.f5869j);
            m4623a(this.f5868d, c0509j, this.f5870k, a, b.m4529b(), b.m4529b() + ceil);
        }
        this.f.setColor(c0509j.m4511u());
        this.f.setStyle(Style.STROKE);
        a.m4692a(this.f5869j);
        this.f5868d.drawPath(this.f5869j, this.f);
        this.f.setPathEffect(null);
    }

    protected void m4625a(Canvas canvas, C0509j c0509j, List<C0505h> list, int i, int i2, C0542h c0542h) {
        this.f.setStyle(Style.FILL);
        this.f.setColor(c0509j.m4535E());
        this.f.setAlpha(c0509j.m4536F());
        Path a = m4619a(list, this.f5865a.getFillFormatter().m4451a(c0509j, this.f5865a.getLineData(), this.f5865a.getYChartMax(), this.f5865a.getYChartMin()), i, i2);
        c0542h.m4692a(a);
        canvas.drawPath(a, this.f);
        this.f.setAlpha(255);
    }

    public void m4626a(Canvas canvas, C0538d[] c0538dArr) {
        for (int i = 0; i < c0538dArr.length; i++) {
            C0509j c0509j = (C0509j) this.f5865a.getLineData().m4463a(c0538dArr[i].m4685a());
            if (c0509j != null) {
                this.g.setColor(c0509j.m4517g());
                int b = c0538dArr[i].m4687b();
                if (((float) b) <= this.f5865a.getXChartMax() * this.e.m4255b()) {
                    float a = c0509j.m4488a(b) * this.e.m4254a();
                    float[] fArr = new float[]{(float) b, this.f5865a.getYChartMax(), (float) b, this.f5865a.getYChartMin(), this.f5865a.getXChartMin(), a, this.f5865a.getXChartMax(), a};
                    this.f5865a.m4382a(c0509j.m4508r()).m4695a(fArr);
                    canvas.drawLines(fArr, this.g);
                }
            }
        }
    }

    public void m4627b(Canvas canvas) {
        if (((float) this.f5865a.getLineData().m4478h()) < ((float) this.f5865a.getMaxVisibleCount()) * this.n.m4749p()) {
            List j = this.f5865a.getLineData().m4480j();
            for (int i = 0; i < j.size(); i++) {
                C0509j c0509j = (C0509j) j.get(i);
                if (c0509j.m4509s()) {
                    m4592a((C0502g) c0509j);
                    C0542h a = this.f5865a.m4382a(c0509j.m4508r());
                    int b = (int) (c0509j.m4545b() * 1.75f);
                    int i2 = !c0509j.m4548e() ? b / 2 : b;
                    List j2 = c0509j.m4500j();
                    C0505h b2 = c0509j.m4493b(this.o);
                    C0505h b3 = c0509j.m4493b(this.p);
                    int max = Math.max(c0509j.m4489a(b2), 0);
                    float[] a2 = a.m4696a(j2, this.e.m4255b(), this.e.m4254a(), max, Math.min(c0509j.m4489a(b3) + 1, j2.size()));
                    for (int i3 = 0; i3 < a2.length; i3 += 2) {
                        float f = a2[i3];
                        float f2 = a2[i3 + 1];
                        if (!this.n.m4734e(f)) {
                            break;
                        }
                        if (this.n.m4732d(f) && this.n.m4730c(f2)) {
                            canvas.drawText(c0509j.m4513w().m4683a(((C0505h) j2.get((i3 / 2) + max)).m4530c()), f, f2 - ((float) i2), this.i);
                        }
                    }
                }
            }
        }
    }

    protected void m4628b(Canvas canvas, C0509j c0509j, List<C0505h> list) {
        int a = this.f5865a.getLineData().m4462a((C0502g) c0509j);
        C0542h a2 = this.f5865a.m4382a(c0509j.m4508r());
        float b = this.e.m4255b();
        float a3 = this.e.m4254a();
        this.f.setStyle(Style.STROKE);
        Canvas canvas2 = c0509j.m4546c() ? this.f5868d : canvas;
        C0505h b2 = c0509j.m4493b(this.o);
        C0505h b3 = c0509j.m4493b(this.p);
        int max = Math.max(c0509j.m4489a(b2), 0);
        int min = Math.min(c0509j.m4489a(b3) + 1, list.size());
        int i = ((min - max) * 4) - 4;
        C0473e c0473e = this.f5871l[a];
        c0473e.m4257a(b, a3);
        c0473e.m4258a(max);
        c0473e.m4260b(min);
        c0473e.m4269a(list);
        a2.m4695a(c0473e.b);
        if (c0509j.m4510t().size() > 1) {
            int i2 = 0;
            while (i2 < i && this.n.m4734e(c0473e.b[i2])) {
                if (this.n.m4732d(c0473e.b[i2 + 2]) && ((this.n.m4736f(c0473e.b[i2 + 1]) || this.n.m4738g(c0473e.b[i2 + 3])) && (this.n.m4736f(c0473e.b[i2 + 1]) || this.n.m4738g(c0473e.b[i2 + 3])))) {
                    this.f.setColor(c0509j.m4496d((i2 / 4) + max));
                    canvas2.drawLine(c0473e.b[i2], c0473e.b[i2 + 1], c0473e.b[i2 + 2], c0473e.b[i2 + 3], this.f);
                }
                i2 += 4;
            }
        } else {
            this.f.setColor(c0509j.m4511u());
            canvas2.drawLines(c0473e.b, 0, i, this.f);
        }
        this.f.setPathEffect(null);
        if (c0509j.m4538H() && list.size() > 0) {
            m4625a(canvas, c0509j, (List) list, max, min, a2);
        }
    }

    public void m4629c(Canvas canvas) {
        m4630d(canvas);
    }

    protected void m4630d(Canvas canvas) {
        this.f.setStyle(Style.FILL);
        float b = this.e.m4255b();
        float a = this.e.m4254a();
        List j = this.f5865a.getLineData().m4480j();
        for (int i = 0; i < j.size(); i++) {
            C0509j c0509j = (C0509j) j.get(i);
            if (c0509j.m4507q() && c0509j.m4548e()) {
                this.f5866b.setColor(c0509j.m4541C());
                C0542h a2 = this.f5865a.m4382a(c0509j.m4508r());
                List j2 = c0509j.m4500j();
                C0505h b2 = c0509j.m4493b(this.o < 0 ? 0 : this.o);
                C0505h b3 = c0509j.m4493b(this.p);
                int max = Math.max(c0509j.m4489a(b2), 0);
                int min = Math.min(c0509j.m4489a(b3) + 1, j2.size());
                C0471c c0471c = this.f5872m[i];
                c0471c.m4257a(b, a);
                c0471c.m4258a(max);
                c0471c.m4260b(min);
                c0471c.m4266a(j2);
                a2.m4695a(c0471c.b);
                float b4 = c0509j.m4545b() / 2.0f;
                int ceil = ((int) Math.ceil((double) ((((float) (min - max)) * b) + ((float) max)))) * 2;
                for (int i2 = 0; i2 < ceil; i2 += 2) {
                    float f = c0471c.b[i2];
                    float f2 = c0471c.b[i2 + 1];
                    if (!this.n.m4734e(f)) {
                        break;
                    }
                    if (this.n.m4732d(f) && this.n.m4730c(f2)) {
                        int f3 = c0509j.m4549f((i2 / 2) + max);
                        this.f.setColor(f3);
                        canvas.drawCircle(f, f2, c0509j.m4545b(), this.f);
                        if (c0509j.m4542D() && f3 != this.f5866b.getColor()) {
                            canvas.drawCircle(f, f2, b4, this.f5866b);
                        }
                    }
                }
            }
        }
    }
}
