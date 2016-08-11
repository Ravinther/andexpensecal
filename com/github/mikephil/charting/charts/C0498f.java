package com.github.mikephil.charting.charts;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p037c.C0485l;
import com.github.mikephil.charting.p037c.C0486m;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p040d.C0512n;
import com.github.mikephil.charting.p041g.C0527h;
import com.github.mikephil.charting.p041g.C0531m;
import com.github.mikephil.charting.p041g.C0534p;

/* renamed from: com.github.mikephil.charting.charts.f */
public class C0498f extends C0494e<C0512n> {
    protected C0534p f5754c;
    protected C0531m f5755d;
    private float f5756e;
    private float f5757f;
    private int f5758g;
    private int f5759h;
    private int f5760i;
    private boolean f5761j;
    private C0485l f5762k;
    private C0483j f5763l;

    public int m4453a(float f) {
        float c = C0544j.m4718c(f - getRotationAngle());
        float sliceAngle = getSliceAngle();
        for (int i = 0; i < ((C0512n) this.v).m4481k(); i++) {
            if ((((float) (i + 1)) * sliceAngle) - (sliceAngle / 2.0f) > c) {
                return i;
            }
        }
        return 0;
    }

    protected void m4454a() {
        super.m4433a();
        this.f5762k = new C0485l(C0486m.LEFT);
        this.f5763l = new C0483j();
        this.f5763l.m4338b(0);
        this.f5756e = C0544j.m4703a(1.5f);
        this.f5757f = C0544j.m4703a(0.75f);
        this.K = new C0527h(this, this.M, this.L);
        this.f5754c = new C0534p(this.L, this.f5762k, this);
        this.f5755d = new C0531m(this.L, this.f5763l, this);
    }

    protected float[] m4455a(C0505h c0505h, int i) {
        float sliceAngle = (getSliceAngle() * ((float) c0505h.m4529b())) + getRotationAngle();
        float c = c0505h.m4530c() * getFactor();
        PointF centerOffsets = getCenterOffsets();
        PointF pointF = new PointF((float) (((double) centerOffsets.x) + (((double) c) * Math.cos(Math.toRadians((double) sliceAngle)))), (float) ((Math.sin(Math.toRadians((double) sliceAngle)) * ((double) c)) + ((double) centerOffsets.y)));
        return new float[]{pointF.x, pointF.y};
    }

    protected void m4456b() {
        super.m4435b();
        float a = ((C0512n) this.v).m4461a(C0486m.LEFT);
        float b = ((C0512n) this.v).m4468b(C0486m.LEFT);
        this.E = (float) (((C0512n) this.v).m4479i().size() - 1);
        this.C = Math.abs(this.E - this.D);
        float abs = Math.abs(b - (this.f5762k.m4363x() ? 0.0f : a));
        float A = (abs / 100.0f) * this.f5762k.m4345A();
        float B = this.f5762k.m4346B() * (abs / 100.0f);
        this.E = (float) (((C0512n) this.v).m4479i().size() - 1);
        this.C = Math.abs(this.E - this.D);
        this.f5762k.f5666w = !Float.isNaN(this.f5762k.m4365z()) ? this.f5762k.m4365z() : b + A;
        this.f5762k.f5667x = !Float.isNaN(this.f5762k.m4364y()) ? this.f5762k.m4364y() : a - B;
        if (this.f5762k.m4363x()) {
            this.f5762k.f5667x = 0.0f;
        }
        this.f5762k.f5668y = Math.abs(this.f5762k.f5666w - this.f5762k.f5667x);
    }

    public float getFactor() {
        RectF k = this.L.m4744k();
        return Math.min(k.width() / 2.0f, k.height() / 2.0f) / this.f5762k.f5668y;
    }

    public float getRadius() {
        RectF k = this.L.m4744k();
        return Math.min(k.width() / 2.0f, k.height() / 2.0f);
    }

    protected float getRequiredBaseOffset() {
        return (float) this.f5763l.f5638m;
    }

    protected float getRequiredBottomOffset() {
        return this.J.m4614a().getTextSize() * 6.5f;
    }

    public float getSliceAngle() {
        return 360.0f / ((float) ((C0512n) this.v).m4481k());
    }

    public int getWebAlpha() {
        return this.f5760i;
    }

    public int getWebColor() {
        return this.f5758g;
    }

    public int getWebColorInner() {
        return this.f5759h;
    }

    public float getWebLineWidth() {
        return this.f5756e;
    }

    public float getWebLineWidthInner() {
        return this.f5757f;
    }

    public C0483j getXAxis() {
        return this.f5763l;
    }

    public C0485l getYAxis() {
        return this.f5762k;
    }

    public float getYChartMax() {
        return this.f5762k.f5666w;
    }

    public float getYChartMin() {
        return this.f5762k.f5667x;
    }

    public float getYRange() {
        return this.f5762k.f5668y;
    }

    public void m4457i() {
        if (!this.A) {
            m4456b();
            if (this.f5762k.m4349E()) {
                this.f5762k.m4352a(this.w);
            }
            this.f5754c.m4678a(this.f5762k.f5667x, this.f5762k.f5666w);
            this.f5755d.m4649a(((C0512n) this.v).m4476f(), ((C0512n) this.v).m4479i());
            this.J.m4618a(this.v);
            m4438j();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A) {
            this.f5755d.m4663a(canvas);
            if (this.f5761j) {
                this.K.m4594c(canvas);
            }
            this.f5754c.m4681d(canvas);
            this.K.m4590a(canvas);
            if (this.G && m4377u()) {
                this.K.m4591a(canvas, this.P);
            }
            this.f5754c.m4679a(canvas);
            this.K.m4593b(canvas);
            this.J.m4615a(canvas);
            m4372b(canvas);
            m4374c(canvas);
        }
    }

    public void setDrawWeb(boolean z) {
        this.f5761j = z;
    }

    public void setWebAlpha(int i) {
        this.f5760i = i;
    }

    public void setWebColor(int i) {
        this.f5758g = i;
    }

    public void setWebColorInner(int i) {
        this.f5759h = i;
    }

    public void setWebLineWidth(float f) {
        this.f5756e = C0544j.m4703a(f);
    }

    public void setWebLineWidthInner(float f) {
        this.f5757f = C0544j.m4703a(f);
    }
}
