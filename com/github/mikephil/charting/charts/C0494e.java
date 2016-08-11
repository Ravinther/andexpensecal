package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import com.github.mikephil.charting.p032f.C0517e;
import com.github.mikephil.charting.p037c.C0479f;
import com.github.mikephil.charting.p039h.C0541g;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p040d.C0499f;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0505h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.charts.e */
public abstract class C0494e<T extends C0499f<? extends C0502g<? extends C0505h>>> extends C0489c<T> {
    protected boolean f5738a;
    protected OnTouchListener f5739b;
    private float f5740c;
    private float f5741d;

    public C0494e(Context context) {
        super(context);
        this.f5740c = 270.0f;
        this.f5741d = 270.0f;
        this.f5738a = true;
    }

    public C0494e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5740c = 270.0f;
        this.f5741d = 270.0f;
        this.f5738a = true;
    }

    public C0494e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5740c = 270.0f;
        this.f5741d = 270.0f;
        this.f5738a = true;
    }

    private float getFullLegendWidth() {
        return (this.H.f5596d + this.H.m4314f()) + this.H.m4317i();
    }

    public float m4429a(float f, float f2) {
        PointF centerOffsets = getCenterOffsets();
        double d = (double) (f - centerOffsets.x);
        double d2 = (double) (f2 - centerOffsets.y);
        float toDegrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > centerOffsets.x) {
            toDegrees = 360.0f - toDegrees;
        }
        toDegrees += 90.0f;
        return toDegrees > 360.0f ? toDegrees - 360.0f : toDegrees;
    }

    public abstract int m4430a(float f);

    protected PointF m4431a(PointF pointF, float f, float f2) {
        return new PointF((float) (((double) pointF.x) + (((double) f) * Math.cos(Math.toRadians((double) f2)))), (float) (((double) pointF.y) + (((double) f) * Math.sin(Math.toRadians((double) f2)))));
    }

    public List<C0541g> m4432a(int i) {
        List<C0541g> arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.v.m4471c(); i2++) {
            C0502g a = this.v.m4463a(i2);
            float a2 = a.m4488a(i);
            if (!Float.isNaN(a2)) {
                arrayList.add(new C0541g(a2, i2, a));
            }
        }
        return arrayList;
    }

    protected void m4433a() {
        super.m4366a();
        this.f5739b = new C0517e(this);
    }

    public float m4434b(float f, float f2) {
        PointF centerOffsets = getCenterOffsets();
        return (float) Math.sqrt(Math.pow((double) (f2 > centerOffsets.y ? f2 - centerOffsets.y : centerOffsets.y - f2), 2.0d) + Math.pow((double) (f > centerOffsets.x ? f - centerOffsets.x : centerOffsets.x - f), 2.0d));
    }

    protected void m4435b() {
        this.C = (float) (this.v.m4479i().size() - 1);
    }

    public void computeScroll() {
        if (this.f5739b instanceof C0517e) {
            ((C0517e) this.f5739b).m4585b();
        }
    }

    public boolean m4436g() {
        return this.f5738a;
    }

    public float getDiameter() {
        RectF k = this.L.m4744k();
        return Math.min(k.width(), k.height());
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.f5741d;
    }

    protected abstract float getRequiredBaseOffset();

    protected abstract float getRequiredBottomOffset();

    public float getRotationAngle() {
        return this.f5740c;
    }

    public float getYChartMax() {
        return 0.0f;
    }

    public float getYChartMin() {
        return 0.0f;
    }

    public void m4437i() {
        if (!this.A) {
            m4435b();
            this.J.m4618a(this.v);
            m4438j();
        }
    }

    protected void m4438j() {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (this.H == null || !this.H.m4280q()) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            if (this.H.m4307c() == C0479f.RIGHT_OF_CHART_CENTER) {
                f2 = C0544j.m4703a(13.0f) + getFullLegendWidth();
                f3 = 0.0f;
                f = 0.0f;
            } else if (this.H.m4307c() == C0479f.RIGHT_OF_CHART) {
                f2 = getFullLegendWidth() + C0544j.m4703a(8.0f);
                f = this.H.f5594b + this.H.f5595c;
                r3 = getCenter();
                r4 = new PointF((((float) getWidth()) - f2) + 15.0f, f + 15.0f);
                f = m4434b(r4.x, r4.y);
                r5 = m4431a(r3, getRadius(), m4429a(r4.x, r4.y));
                r5 = m4434b(r5.x, r5.y);
                f = f < r5 ? (r5 - f) + C0544j.m4703a(5.0f) : 0.0f;
                if (r4.y < r3.y || ((float) getHeight()) - f2 <= ((float) getWidth())) {
                    f2 = f;
                    f3 = 0.0f;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    f3 = 0.0f;
                }
            } else if (this.H.m4307c() == C0479f.LEFT_OF_CHART_CENTER) {
                f2 = 0.0f;
                f3 = C0544j.m4703a(13.0f) + getFullLegendWidth();
                f = 0.0f;
            } else if (this.H.m4307c() == C0479f.LEFT_OF_CHART) {
                f2 = getFullLegendWidth() + C0544j.m4703a(8.0f);
                f = this.H.f5594b + this.H.f5595c;
                r3 = getCenter();
                r4 = new PointF(f2 - 15.0f, f + 15.0f);
                f = m4434b(r4.x, r4.y);
                r5 = m4431a(r3, getRadius(), m4429a(r4.x, r4.y));
                r5 = m4434b(r5.x, r5.y);
                f = f < r5 ? (r5 - f) + C0544j.m4703a(5.0f) : 0.0f;
                if (r4.y < r3.y || ((float) getHeight()) - f2 <= ((float) getWidth())) {
                    f2 = 0.0f;
                    f3 = f;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    f3 = f2;
                    f2 = 0.0f;
                }
            } else if (this.H.m4307c() == C0479f.BELOW_CHART_LEFT || this.H.m4307c() == C0479f.BELOW_CHART_RIGHT || this.H.m4307c() == C0479f.BELOW_CHART_CENTER) {
                f = getRequiredBottomOffset();
                f2 = 0.0f;
                f3 = 0.0f;
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
            }
            f3 += getRequiredBaseOffset();
            f2 += getRequiredBaseOffset();
            f4 = 0.0f + getRequiredBaseOffset();
        }
        float a = C0544j.m4703a(10.0f);
        f3 = Math.max(a, f3);
        f4 = Math.max(a, f4);
        f2 = Math.max(a, f2);
        f = Math.max(a, Math.max(getRequiredBaseOffset(), f));
        this.L.m4723a(f3, f4, f2, f);
        if (this.u) {
            Log.i("MPAndroidChart", "offsetLeft: " + f3 + ", offsetTop: " + f4 + ", offsetRight: " + f2 + ", offsetBottom: " + f);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (!this.F || this.f5739b == null) ? super.onTouchEvent(motionEvent) : this.f5739b.onTouch(this, motionEvent);
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f5739b = onTouchListener;
    }

    public void setRotationAngle(float f) {
        this.f5741d = f;
        this.f5740c = C0544j.m4718c(this.f5741d);
    }

    public void setRotationEnabled(boolean z) {
        this.f5738a = z;
    }
}
