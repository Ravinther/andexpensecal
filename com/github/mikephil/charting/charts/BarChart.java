package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.p037c.C0486m;
import com.github.mikephil.charting.p038e.C0492a;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0501a;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0504b;
import com.github.mikephil.charting.p040d.C0506c;
import com.github.mikephil.charting.p041g.C0522b;
import com.github.mikephil.charting.p041g.C0529k;

public class BarChart extends C0491a<C0501a> implements C0492a {
    private boolean f5732T;
    private boolean f5733U;
    private boolean f5734V;
    private boolean f5735W;

    public BarChart(Context context) {
        super(context);
        this.f5732T = false;
        this.f5733U = true;
        this.f5734V = true;
        this.f5735W = false;
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5732T = false;
        this.f5733U = true;
        this.f5734V = true;
        this.f5735W = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5732T = false;
        this.f5733U = true;
        this.f5734V = true;
        this.f5735W = false;
    }

    protected C0538d m4413a(double d, double d2) {
        int a;
        int i = 0;
        int c = ((C0501a) this.v).m4471c();
        int k = ((C0501a) this.v).m4481k();
        int i2;
        if (((C0501a) this.v).m4485b()) {
            a = (int) (((float) d) / (((C0501a) this.v).m4484a() + ((float) c)));
            float a2 = ((C0501a) this.v).m4484a() * ((float) a);
            float f = ((float) d) - a2;
            if (this.u) {
                Log.i("MPAndroidChart", "base: " + d + ", steps: " + a + ", groupSpaceSum: " + a2 + ", baseNoSpace: " + f);
            }
            a = ((int) f) % c;
            i2 = ((int) f) / c;
            if (this.u) {
                Log.i("MPAndroidChart", "xIndex: " + i2 + ", dataSet: " + a);
            }
            if (i2 < 0) {
                i2 = 0;
                a = 0;
            } else if (i2 >= k) {
                i2 = k - 1;
                a = c - 1;
            }
            if (a < 0) {
                a = 0;
                i = i2;
            } else if (a >= c) {
                a = c - 1;
                i = i2;
            } else {
                i = i2;
            }
        } else {
            i2 = (int) Math.round(d);
            if (i2 < 0) {
                a = 0;
            } else if (i2 >= k) {
                a = 0;
                i = k - 1;
            } else {
                a = 0;
                i = i2;
            }
        }
        return !((C0504b) ((C0501a) this.v).m4463a(a)).m4522b() ? new C0538d(i, a) : m4415a(i, a, d2);
    }

    public C0538d m4414a(float f, float f2) {
        if (this.A || this.v == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        float[] fArr = new float[]{f, f2};
        this.q.m4699b(fArr);
        return (fArr[0] < this.D || fArr[0] > this.E) ? null : m4413a((double) fArr[0], (double) fArr[1]);
    }

    protected C0538d m4415a(int i, int i2, double d) {
        C0506c c0506c = (C0506c) ((C0504b) ((C0501a) this.v).m4463a(i2)).m4493b(i);
        return c0506c != null ? new C0538d(i, i2, c0506c.m4533a((float) d)) : null;
    }

    protected void m4416a() {
        super.m4387a();
        this.K = new C0522b(this, this.M, this.L);
        this.s = new C0529k(this.L, this.n, this.q, this);
        this.D = -0.5f;
    }

    protected void m4417b() {
        int i = 0;
        super.m4393b();
        this.C += 0.5f;
        this.C = ((float) ((C0501a) this.v).m4471c()) * this.C;
        int i2 = 0;
        while (i < ((C0501a) this.v).m4471c()) {
            C0502g a = ((C0501a) this.v).m4463a(i);
            if (i2 < a.m4499i()) {
                i2 = a.m4499i();
            }
            i++;
        }
        this.C = (((C0501a) this.v).m4484a() * ((float) i2)) + this.C;
        this.E = this.C - this.D;
    }

    public boolean m4418c() {
        return this.f5732T;
    }

    public boolean m4419d() {
        return this.f5733U;
    }

    public boolean m4420e() {
        return this.f5734V;
    }

    public boolean m4421f() {
        return this.f5735W;
    }

    public C0501a getBarData() {
        return (C0501a) this.v;
    }

    public int getHighestVisibleXIndex() {
        float c = (float) ((C0501a) this.v).m4471c();
        float a = c <= 1.0f ? 1.0f : ((C0501a) this.v).m4484a() + c;
        float[] fArr = new float[]{this.L.m4737g(), this.L.m4739h()};
        m4385a(C0486m.LEFT).m4699b(fArr);
        return (int) (fArr[0] >= getXChartMax() ? getXChartMax() / a : fArr[0] / a);
    }

    public int getLowestVisibleXIndex() {
        float c = (float) ((C0501a) this.v).m4471c();
        float a = c <= 1.0f ? 1.0f : ((C0501a) this.v).m4484a() + c;
        float[] fArr = new float[]{this.L.m4735f(), this.L.m4739h()};
        m4385a(C0486m.LEFT).m4699b(fArr);
        return (int) ((fArr[0] <= 0.0f ? 0.0f : fArr[0] / a) + 1.0f);
    }

    public void setDrawBarShadow(boolean z) {
        this.f5735W = z;
    }

    public void setDrawHighlightArrow(boolean z) {
        this.f5732T = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.f5733U = z;
    }

    public void setDrawValuesForWholeStack(boolean z) {
        this.f5734V = z;
    }
}
