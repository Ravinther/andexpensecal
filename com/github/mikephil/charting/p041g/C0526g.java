package com.github.mikephil.charting.p041g;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.p035a.C0468a;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p040d.C0510l;
import com.github.mikephil.charting.p040d.C0511m;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.g */
public class C0526g extends C0521c {
    protected PieChart f5873a;
    protected Paint f5874b;
    protected Paint f5875c;
    protected Bitmap f5876d;
    protected Canvas f5877j;
    private Paint f5878k;

    public C0526g(PieChart pieChart, C0468a c0468a, C0545l c0545l) {
        super(c0468a, c0545l);
        this.f5873a = pieChart;
        this.f5874b = new Paint(1);
        this.f5874b.setColor(-1);
        this.f5874b.setStyle(Style.FILL);
        this.f5875c = new Paint(1);
        this.f5875c.setColor(-1);
        this.f5875c.setStyle(Style.FILL);
        this.f5878k = new Paint(1);
        this.f5878k.setColor(-16777216);
        this.f5878k.setTextSize(C0544j.m4703a(12.0f));
        this.f5878k.setTextAlign(Align.CENTER);
        this.i.setTextSize(C0544j.m4703a(13.0f));
        this.i.setColor(-1);
        this.i.setTextAlign(Align.CENTER);
    }

    public void m4631a() {
    }

    public void m4632a(Canvas canvas) {
        int n = (int) this.n.m4747n();
        int m = (int) this.n.m4746m();
        if (!(this.f5876d != null && this.f5876d.getWidth() == n && this.f5876d.getHeight() == m)) {
            if (n > 0 && m > 0) {
                this.f5876d = Bitmap.createBitmap(n, m, Config.ARGB_4444);
                this.f5877j = new Canvas(this.f5876d);
            } else {
                return;
            }
        }
        this.f5876d.eraseColor(0);
        for (C0511m c0511m : ((C0510l) this.f5873a.getData()).m4480j()) {
            if (c0511m.m4507q()) {
                m4633a(canvas, c0511m);
            }
        }
    }

    protected void m4633a(Canvas canvas, C0511m c0511m) {
        float rotationAngle = this.f5873a.getRotationAngle();
        List j = c0511m.m4500j();
        float[] drawAngles = this.f5873a.getDrawAngles();
        int i = 0;
        int i2 = 0;
        float f = rotationAngle;
        while (i < j.size()) {
            float f2 = drawAngles[i2];
            float a = c0511m.m4556a();
            C0505h c0505h = (C0505h) j.get(i);
            if (((double) Math.abs(c0505h.m4530c())) > 1.0E-6d && !this.f5873a.m4443a(c0505h.m4529b(), ((C0510l) this.f5873a.getData()).m4462a((C0502g) c0511m))) {
                this.f.setColor(c0511m.m4496d(i));
                this.f5877j.drawArc(this.f5873a.getCircleBox(), ((a / 2.0f) + f) * this.e.m4254a(), (this.e.m4254a() * f2) - (a / 2.0f), true, this.f);
            }
            i++;
            i2++;
            f += this.e.m4255b() * f2;
        }
    }

    public void m4634a(Canvas canvas, C0538d[] c0538dArr) {
        float rotationAngle = this.f5873a.getRotationAngle();
        float[] drawAngles = this.f5873a.getDrawAngles();
        float[] absoluteAngles = this.f5873a.getAbsoluteAngles();
        for (int i = 0; i < c0538dArr.length; i++) {
            int b = c0538dArr[i].m4687b();
            if (b < drawAngles.length) {
                float a = (b == 0 ? rotationAngle : absoluteAngles[b - 1] + rotationAngle) * this.e.m4254a();
                float f = drawAngles[b];
                C0511m c = ((C0510l) this.f5873a.getData()).m4555c(c0538dArr[i].m4685a());
                if (c != null) {
                    float b2 = c.m4558b();
                    RectF circleBox = this.f5873a.getCircleBox();
                    RectF rectF = new RectF(circleBox.left - b2, circleBox.top - b2, circleBox.right + b2, b2 + circleBox.bottom);
                    this.f.setColor(c.m4496d(b));
                    this.f5877j.drawArc(rectF, (c.m4556a() / 2.0f) + a, (this.e.m4254a() * f) - (c.m4556a() / 2.0f), true, this.f);
                }
            }
        }
    }

    public Paint m4635b() {
        return this.f5874b;
    }

    public void m4636b(Canvas canvas) {
        PointF centerCircleBox = this.f5873a.getCenterCircleBox();
        float radius = this.f5873a.getRadius();
        float rotationAngle = this.f5873a.getRotationAngle();
        float[] drawAngles = this.f5873a.getDrawAngles();
        float[] absoluteAngles = this.f5873a.getAbsoluteAngles();
        float f = (radius / 10.0f) * 3.6f;
        if (this.f5873a.m4446c()) {
            f = (radius - ((radius / 100.0f) * this.f5873a.getHoleRadius())) / 2.0f;
        }
        float f2 = radius - f;
        C0510l c0510l = (C0510l) this.f5873a.getData();
        List j = c0510l.m4480j();
        boolean e = this.f5873a.m4448e();
        int i = 0;
        for (int i2 = 0; i2 < j.size(); i2++) {
            C0511m c0511m = (C0511m) j.get(i2);
            if (c0511m.m4509s() || e) {
                m4592a((C0502g) c0511m);
                List j2 = c0511m.m4500j();
                double ceil = Math.ceil((double) (((float) j2.size()) * this.e.m4255b()));
                int min = Math.min((int) r18, j2.size());
                int i3 = i;
                for (int i4 = 0; i4 < min; i4++) {
                    float f3 = drawAngles[i3] / 2.0f;
                    double d = (double) f2;
                    double a = (double) (((absoluteAngles[i3] + rotationAngle) - f3) * this.e.m4254a());
                    float cos = (float) ((ceil * Math.cos(Math.toRadians(ceil))) + ((double) centerCircleBox.x));
                    a = (double) centerCircleBox.y;
                    float sin = (float) ((((double) f2) * Math.sin(Math.toRadians((double) (((absoluteAngles[i3] + rotationAngle) - f3) * this.e.m4254a())))) + ceil);
                    if (this.f5873a.m4449f()) {
                        f3 = (((C0505h) j2.get(i4)).m4530c() / this.f5873a.getYValueSum()) * 100.0f;
                    } else {
                        f3 = ((C0505h) j2.get(i4)).m4530c();
                    }
                    String a2 = c0511m.m4513w().m4683a(f3);
                    float b = ((float) C0544j.m4716b(this.i, a2)) + C0544j.m4703a(4.0f);
                    boolean s = c0511m.m4509s();
                    if (e && s) {
                        canvas.drawText(a2, cos, sin, this.i);
                        if (i4 < c0510l.m4481k()) {
                            canvas.drawText((String) c0510l.m4479i().get(i4), cos, sin + b, this.i);
                        }
                    } else if (!e || s) {
                        if (!e && s) {
                            canvas.drawText(a2, cos, sin + (b / 2.0f), this.i);
                        }
                    } else if (i4 < c0510l.m4481k()) {
                        canvas.drawText((String) c0510l.m4479i().get(i4), cos, sin + (b / 2.0f), this.i);
                    }
                    i3++;
                }
                i = i3;
            }
        }
    }

    public Paint m4637c() {
        return this.f5875c;
    }

    public void m4638c(Canvas canvas) {
        m4640d(canvas);
        canvas.drawBitmap(this.f5876d, 0.0f, 0.0f, this.f);
        m4641e(canvas);
    }

    public Paint m4639d() {
        return this.f5878k;
    }

    protected void m4640d(Canvas canvas) {
        if (this.f5873a.m4446c()) {
            float transparentCircleRadius = this.f5873a.getTransparentCircleRadius();
            float holeRadius = this.f5873a.getHoleRadius();
            float radius = this.f5873a.getRadius();
            PointF centerCircleBox = this.f5873a.getCenterCircleBox();
            if (transparentCircleRadius > holeRadius && this.e.m4255b() >= 1.0f && this.e.m4254a() >= 1.0f) {
                int color = this.f5875c.getColor();
                this.f5875c.setColor(1627389951 & color);
                this.f5877j.drawCircle(centerCircleBox.x, centerCircleBox.y, transparentCircleRadius * (radius / 100.0f), this.f5875c);
                this.f5875c.setColor(color);
            }
            this.f5877j.drawCircle(centerCircleBox.x, centerCircleBox.y, holeRadius * (radius / 100.0f), this.f5874b);
        }
    }

    protected void m4641e(Canvas canvas) {
        String centerText = this.f5873a.getCenterText();
        if (this.f5873a.m4447d() && centerText != null) {
            PointF centerCircleBox = this.f5873a.getCenterCircleBox();
            String[] split = centerText.split("\n");
            float f = 0.0f;
            int length = split.length;
            int i = 0;
            while (i < length) {
                float b = (float) C0544j.m4716b(this.f5878k, split[i]);
                if (b <= f) {
                    b = f;
                }
                i++;
                f = b;
            }
            float f2 = f * 0.25f;
            float length2 = (((float) split.length) * f) - (((float) (split.length - 1)) * f2);
            i = split.length;
            float f3 = centerCircleBox.y;
            for (int i2 = 0; i2 < split.length; i2++) {
                canvas.drawText(split[(split.length - i2) - 1], centerCircleBox.x, ((((float) i) * f) + f3) - (length2 / 2.0f), this.f5878k);
                i--;
                f3 -= f2;
            }
        }
    }
}
