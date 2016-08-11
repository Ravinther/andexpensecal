package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.p037c.C0479f;
import com.github.mikephil.charting.p037c.C0484k;
import com.github.mikephil.charting.p037c.C0486m;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0543i;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p040d.C0501a;
import com.github.mikephil.charting.p041g.C0523d;
import com.github.mikephil.charting.p041g.C0530l;
import com.github.mikephil.charting.p041g.C0533o;

public class HorizontalBarChart extends BarChart {
    public HorizontalBarChart(Context context) {
        super(context);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C0538d m4422a(float f, float f2) {
        if (this.A || this.v == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        float[] fArr = new float[]{f, f2};
        this.q.m4699b(fArr);
        return (fArr[1] < this.D || fArr[1] > this.E) ? null : m4413a((double) fArr[1], (double) fArr[0]);
    }

    protected void m4423a() {
        super.m4416a();
        this.q = new C0543i(this.L);
        this.r = new C0543i(this.L);
        this.K = new C0523d(this, this.M, this.L);
        this.o = new C0533o(this.L, this.l, this.q);
        this.p = new C0533o(this.L, this.m, this.r);
        this.s = new C0530l(this.L, this.n, this.q, this);
    }

    protected void m4424g() {
        this.r.m4691a(this.m.f5667x, this.m.f5668y, this.C, this.D);
        this.q.m4691a(this.l.f5667x, this.l.f5668y, this.C, this.D);
    }

    public int getHighestVisibleXIndex() {
        float c = (float) ((C0501a) this.v).m4471c();
        float a = c <= 1.0f ? 1.0f : ((C0501a) this.v).m4484a() + c;
        float[] fArr = new float[]{this.L.m4735f(), this.L.m4733e()};
        m4385a(C0486m.LEFT).m4699b(fArr);
        return (int) (fArr[1] >= getXChartMax() ? getXChartMax() / a : fArr[1] / a);
    }

    public int getLowestVisibleXIndex() {
        float c = (float) ((C0501a) this.v).m4471c();
        float a = c <= 1.0f ? 1.0f : ((C0501a) this.v).m4484a() + c;
        float[] fArr = new float[]{this.L.m4735f(), this.L.m4739h()};
        m4385a(C0486m.LEFT).m4699b(fArr);
        return (int) ((fArr[1] <= 0.0f ? 0.0f : fArr[1] / a) + 1.0f);
    }

    protected void m4425j() {
        float l;
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (this.H != null && this.H.m4280q()) {
            if (this.H.m4307c() == C0479f.RIGHT_OF_CHART || this.H.m4307c() == C0479f.RIGHT_OF_CHART_CENTER) {
                l = (this.H.f5596d + (this.H.m4275l() * 2.0f)) + 0.0f;
                f = 0.0f;
                f2 = 0.0f;
                if (this.l.m4350F()) {
                    f4 = 0.0f + this.l.m4353b(this.o.m4588a());
                }
                if (this.m.m4350F()) {
                    f2 += this.m.m4353b(this.p.m4588a());
                }
                f3 = (float) this.n.f5638m;
                if (this.n.m4280q()) {
                    if (this.n.m4339r() != C0484k.BOTTOM) {
                        f += f3;
                    } else if (this.n.m4339r() != C0484k.TOP) {
                        l += f3;
                    } else if (this.n.m4339r() == C0484k.BOTH_SIDED) {
                        f += f3;
                        l += f3;
                    }
                }
                f3 = C0544j.m4703a(10.0f);
                this.L.m4723a(Math.max(f3, f), Math.max(f3, f4), Math.max(f3, l), Math.max(f3, f2));
                if (this.u) {
                    Log.i("MPAndroidChart", "offsetLeft: " + f + ", offsetTop: " + f4 + ", offsetRight: " + l + ", offsetBottom: " + f2);
                    Log.i("MPAndroidChart", "Content: " + this.L.m4744k().toString());
                }
                m4396h();
                m4424g();
            } else if (this.H.m4307c() == C0479f.LEFT_OF_CHART || this.H.m4307c() == C0479f.LEFT_OF_CHART_CENTER) {
                l = 0.0f;
                f = (this.H.f5596d + (this.H.m4275l() * 2.0f)) + 0.0f;
                f2 = 0.0f;
                if (this.l.m4350F()) {
                    f4 = 0.0f + this.l.m4353b(this.o.m4588a());
                }
                if (this.m.m4350F()) {
                    f2 += this.m.m4353b(this.p.m4588a());
                }
                f3 = (float) this.n.f5638m;
                if (this.n.m4280q()) {
                    if (this.n.m4339r() != C0484k.BOTTOM) {
                        f += f3;
                    } else if (this.n.m4339r() != C0484k.TOP) {
                        l += f3;
                    } else if (this.n.m4339r() == C0484k.BOTH_SIDED) {
                        f += f3;
                        l += f3;
                    }
                }
                f3 = C0544j.m4703a(10.0f);
                this.L.m4723a(Math.max(f3, f), Math.max(f3, f4), Math.max(f3, l), Math.max(f3, f2));
                if (this.u) {
                    Log.i("MPAndroidChart", "offsetLeft: " + f + ", offsetTop: " + f4 + ", offsetRight: " + l + ", offsetBottom: " + f2);
                    Log.i("MPAndroidChart", "Content: " + this.L.m4744k().toString());
                }
                m4396h();
                m4424g();
            } else if (this.H.m4307c() == C0479f.BELOW_CHART_LEFT || this.H.m4307c() == C0479f.BELOW_CHART_RIGHT || this.H.m4307c() == C0479f.BELOW_CHART_CENTER) {
                f2 = (this.H.f5595c * 3.0f) + 0.0f;
                l = 0.0f;
                f = 0.0f;
                if (this.l.m4350F()) {
                    f4 = 0.0f + this.l.m4353b(this.o.m4588a());
                }
                if (this.m.m4350F()) {
                    f2 += this.m.m4353b(this.p.m4588a());
                }
                f3 = (float) this.n.f5638m;
                if (this.n.m4280q()) {
                    if (this.n.m4339r() != C0484k.BOTTOM) {
                        f += f3;
                    } else if (this.n.m4339r() != C0484k.TOP) {
                        l += f3;
                    } else if (this.n.m4339r() == C0484k.BOTH_SIDED) {
                        f += f3;
                        l += f3;
                    }
                }
                f3 = C0544j.m4703a(10.0f);
                this.L.m4723a(Math.max(f3, f), Math.max(f3, f4), Math.max(f3, l), Math.max(f3, f2));
                if (this.u) {
                    Log.i("MPAndroidChart", "offsetLeft: " + f + ", offsetTop: " + f4 + ", offsetRight: " + l + ", offsetBottom: " + f2);
                    Log.i("MPAndroidChart", "Content: " + this.L.m4744k().toString());
                }
                m4396h();
                m4424g();
            }
        }
        f2 = 0.0f;
        l = 0.0f;
        f = 0.0f;
        if (this.l.m4350F()) {
            f4 = 0.0f + this.l.m4353b(this.o.m4588a());
        }
        if (this.m.m4350F()) {
            f2 += this.m.m4353b(this.p.m4588a());
        }
        f3 = (float) this.n.f5638m;
        if (this.n.m4280q()) {
            if (this.n.m4339r() != C0484k.BOTTOM) {
                f += f3;
            } else if (this.n.m4339r() != C0484k.TOP) {
                l += f3;
            } else if (this.n.m4339r() == C0484k.BOTH_SIDED) {
                f += f3;
                l += f3;
            }
        }
        f3 = C0544j.m4703a(10.0f);
        this.L.m4723a(Math.max(f3, f), Math.max(f3, f4), Math.max(f3, l), Math.max(f3, f2));
        if (this.u) {
            Log.i("MPAndroidChart", "offsetLeft: " + f + ", offsetTop: " + f4 + ", offsetRight: " + l + ", offsetBottom: " + f2);
            Log.i("MPAndroidChart", "Content: " + this.L.m4744k().toString());
        }
        m4396h();
        m4424g();
    }

    protected void m4426k() {
        float[] fArr = new float[9];
        this.L.m4748o().getValues(fArr);
        this.n.f5640o = (int) Math.ceil((double) (((float) (((C0501a) this.v).m4481k() * this.n.f5639n)) / (fArr[4] * this.L.m4743j())));
        if (this.n.f5640o < 1) {
            this.n.f5640o = 1;
        }
    }
}
