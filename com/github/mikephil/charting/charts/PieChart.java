package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p040d.C0510l;
import com.github.mikephil.charting.p040d.C0511m;
import com.github.mikephil.charting.p041g.C0526g;
import java.util.List;

public class PieChart extends C0494e<C0510l> {
    private RectF f5742c;
    private boolean f5743d;
    private float[] f5744e;
    private float[] f5745f;
    private boolean f5746g;
    private boolean f5747h;
    private String f5748i;
    private float f5749j;
    private float f5750k;
    private boolean f5751l;

    public PieChart(Context context) {
        super(context);
        this.f5742c = new RectF();
        this.f5743d = true;
        this.f5746g = true;
        this.f5747h = false;
        this.f5748i = "";
        this.f5749j = 50.0f;
        this.f5750k = 55.0f;
        this.f5751l = true;
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5742c = new RectF();
        this.f5743d = true;
        this.f5746g = true;
        this.f5747h = false;
        this.f5748i = "";
        this.f5749j = 50.0f;
        this.f5750k = 55.0f;
        this.f5751l = true;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5742c = new RectF();
        this.f5743d = true;
        this.f5746g = true;
        this.f5747h = false;
        this.f5748i = "";
        this.f5749j = 50.0f;
        this.f5750k = 55.0f;
        this.f5751l = true;
    }

    private float m4439b(float f) {
        return (f / ((C0510l) this.v).m4477g()) * 360.0f;
    }

    private void m4440h() {
        this.f5744e = new float[((C0510l) this.v).m4478h()];
        this.f5745f = new float[((C0510l) this.v).m4478h()];
        List j = ((C0510l) this.v).m4480j();
        int i = 0;
        for (int i2 = 0; i2 < ((C0510l) this.v).m4471c(); i2++) {
            List j2 = ((C0511m) j.get(i2)).m4500j();
            for (int i3 = 0; i3 < j2.size(); i3++) {
                this.f5744e[i] = m4439b(Math.abs(((C0505h) j2.get(i3)).m4530c()));
                if (i == 0) {
                    this.f5745f[i] = this.f5744e[i];
                } else {
                    this.f5745f[i] = this.f5745f[i - 1] + this.f5744e[i];
                }
                i++;
            }
        }
    }

    public int m4441a(float f) {
        float c = C0544j.m4718c(f - getRotationAngle());
        for (int i = 0; i < this.f5745f.length; i++) {
            if (this.f5745f[i] > c) {
                return i;
            }
        }
        return -1;
    }

    protected void m4442a() {
        super.m4433a();
        this.K = new C0526g(this, this.M, this.L);
    }

    public boolean m4443a(int i, int i2) {
        if (!m4377u() || i2 < 0) {
            return false;
        }
        int i3 = 0;
        while (i3 < this.P.length) {
            if (this.P[i3].m4687b() == i && this.P[i3].m4685a() == i2) {
                return true;
            }
            i3++;
        }
        return false;
    }

    protected float[] m4444a(C0505h c0505h, int i) {
        return new float[0];
    }

    protected void m4445b() {
        super.m4435b();
        m4440h();
    }

    public boolean m4446c() {
        return this.f5746g;
    }

    public boolean m4447d() {
        return this.f5751l;
    }

    public boolean m4448e() {
        return this.f5743d;
    }

    public boolean m4449f() {
        return this.f5747h;
    }

    public float[] getAbsoluteAngles() {
        return this.f5745f;
    }

    public PointF getCenterCircleBox() {
        return new PointF(this.f5742c.centerX(), this.f5742c.centerY());
    }

    public String getCenterText() {
        return this.f5748i;
    }

    public RectF getCircleBox() {
        return this.f5742c;
    }

    public float[] getDrawAngles() {
        return this.f5744e;
    }

    public float getHoleRadius() {
        return this.f5749j;
    }

    public float getRadius() {
        return this.f5742c == null ? 0.0f : Math.min(this.f5742c.width() / 2.0f, this.f5742c.height() / 2.0f);
    }

    protected float getRequiredBaseOffset() {
        return 0.0f;
    }

    protected float getRequiredBottomOffset() {
        return this.J.m4614a().getTextSize() * 4.0f;
    }

    public float getTransparentCircleRadius() {
        return this.f5750k;
    }

    protected void m4450j() {
        super.m4438j();
        if (!this.A) {
            float diameter = getDiameter() / 2.0f;
            PointF centerOffsets = getCenterOffsets();
            this.f5742c.set(centerOffsets.x - diameter, centerOffsets.y - diameter, centerOffsets.x + diameter, diameter + centerOffsets.y);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A) {
            this.K.m4590a(canvas);
            if (this.G && m4377u()) {
                this.K.m4591a(canvas, this.P);
            }
            this.K.m4594c(canvas);
            this.K.m4593b(canvas);
            this.J.m4615a(canvas);
            m4372b(canvas);
        }
    }

    public void setCenterText(String str) {
        this.f5748i = str;
    }

    public void setCenterTextColor(int i) {
        ((C0526g) this.K).m4639d().setColor(i);
    }

    public void setCenterTextSize(float f) {
        ((C0526g) this.K).m4639d().setTextSize(C0544j.m4703a(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((C0526g) this.K).m4639d().setTextSize(f);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((C0526g) this.K).m4639d().setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z) {
        this.f5751l = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.f5746g = z;
    }

    public void setDrawSliceText(boolean z) {
        this.f5743d = z;
    }

    public void setHoleColor(int i) {
        ((C0526g) this.K).m4635b().setXfermode(null);
        ((C0526g) this.K).m4635b().setColor(i);
    }

    public void setHoleColorTransparent(boolean z) {
        if (z) {
            ((C0526g) this.K).m4635b().setColor(-1);
            ((C0526g) this.K).m4635b().setXfermode(new PorterDuffXfermode(Mode.CLEAR));
            return;
        }
        ((C0526g) this.K).m4635b().setXfermode(null);
    }

    public void setHoleRadius(float f) {
        this.f5749j = f;
    }

    public void setTransparentCircleColor(int i) {
        ((C0526g) this.K).m4637c().setColor(i);
    }

    public void setTransparentCircleRadius(float f) {
        this.f5750k = f;
    }

    public void setUsePercentValues(boolean z) {
        this.f5747h = z;
    }
}
