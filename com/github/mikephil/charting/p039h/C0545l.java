package com.github.mikephil.charting.p039h;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;

/* renamed from: com.github.mikephil.charting.h.l */
public class C0545l {
    protected final Matrix f5908a;
    protected RectF f5909b;
    protected float f5910c;
    protected float f5911d;
    private float f5912e;
    private float f5913f;
    private float f5914g;
    private float f5915h;
    private float f5916i;
    private float f5917j;

    public C0545l() {
        this.f5908a = new Matrix();
        this.f5909b = new RectF();
        this.f5910c = 0.0f;
        this.f5911d = 0.0f;
        this.f5912e = 1.0f;
        this.f5913f = 1.0f;
        this.f5914g = 1.0f;
        this.f5915h = 1.0f;
        this.f5916i = 0.0f;
        this.f5917j = 0.0f;
    }

    public float m4719a() {
        return this.f5909b.left;
    }

    public Matrix m4720a(Matrix matrix, View view, boolean z) {
        this.f5908a.set(matrix);
        m4724a(this.f5908a, this.f5909b);
        if (z) {
            view.invalidate();
        }
        matrix.set(this.f5908a);
        return matrix;
    }

    public void m4721a(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.f5913f = f;
        m4724a(this.f5908a, this.f5909b);
    }

    public void m4722a(float f, float f2) {
        this.f5911d = f2;
        this.f5910c = f;
        if (this.f5909b.width() <= 0.0f || this.f5909b.height() <= 0.0f) {
            this.f5909b.set(0.0f, 0.0f, f, f2);
        }
    }

    public void m4723a(float f, float f2, float f3, float f4) {
        this.f5909b.set(f, f2, this.f5910c - f3, this.f5911d - f4);
    }

    public void m4724a(Matrix matrix, RectF rectF) {
        float f = 0.0f;
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f2 = fArr[2];
        float f3 = fArr[0];
        float f4 = fArr[5];
        float f5 = fArr[4];
        this.f5914g = Math.max(this.f5913f, f3);
        this.f5915h = Math.max(this.f5912e, f5);
        if (rectF != null) {
            f3 = rectF.width();
            f = rectF.height();
        } else {
            f3 = 0.0f;
        }
        f3 = Math.min(Math.max(f2, ((-f3) * (this.f5914g - 1.0f)) - this.f5916i), this.f5916i);
        f = Math.max(Math.min(f4, (f * (this.f5915h - 1.0f)) + this.f5917j), -this.f5917j);
        fArr[2] = f3;
        fArr[0] = this.f5914g;
        fArr[5] = f;
        fArr[4] = this.f5915h;
        matrix.setValues(fArr);
    }

    public float m4725b() {
        return this.f5910c - this.f5909b.right;
    }

    public Matrix m4726b(float f, float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        matrix.set(this.f5908a);
        matrix.postScale(f, f2, f3, f4);
        return matrix;
    }

    public boolean m4727b(float f) {
        return m4732d(f) && m4734e(f);
    }

    public boolean m4728b(float f, float f2) {
        return m4727b(f) && m4730c(f2);
    }

    public float m4729c() {
        return this.f5909b.top;
    }

    public boolean m4730c(float f) {
        return m4736f(f) && m4738g(f);
    }

    public float m4731d() {
        return this.f5911d - this.f5909b.bottom;
    }

    public boolean m4732d(float f) {
        return this.f5909b.left <= f;
    }

    public float m4733e() {
        return this.f5909b.top;
    }

    public boolean m4734e(float f) {
        return this.f5909b.right >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    public float m4735f() {
        return this.f5909b.left;
    }

    public boolean m4736f(float f) {
        return this.f5909b.top <= f;
    }

    public float m4737g() {
        return this.f5909b.right;
    }

    public boolean m4738g(float f) {
        return this.f5909b.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    public float m4739h() {
        return this.f5909b.bottom;
    }

    public void m4740h(float f) {
        this.f5916i = C0544j.m4703a(f);
    }

    public float m4741i() {
        return this.f5909b.width();
    }

    public void m4742i(float f) {
        this.f5917j = C0544j.m4703a(f);
    }

    public float m4743j() {
        return this.f5909b.height();
    }

    public RectF m4744k() {
        return this.f5909b;
    }

    public PointF m4745l() {
        return new PointF(this.f5909b.centerX(), this.f5909b.centerY());
    }

    public float m4746m() {
        return this.f5911d;
    }

    public float m4747n() {
        return this.f5910c;
    }

    public Matrix m4748o() {
        return this.f5908a;
    }

    public float m4749p() {
        return this.f5914g;
    }

    public float m4750q() {
        return this.f5915h;
    }

    public boolean m4751r() {
        return m4753t() && m4752s();
    }

    public boolean m4752s() {
        return this.f5915h <= this.f5912e && this.f5912e <= 1.0f;
    }

    public boolean m4753t() {
        return this.f5914g <= this.f5913f && this.f5913f <= 1.0f;
    }

    public boolean m4754u() {
        return this.f5916i <= 0.0f && this.f5917j <= 0.0f;
    }
}
