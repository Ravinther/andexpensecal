package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import com.github.mikephil.charting.p032f.C0514a;
import com.github.mikephil.charting.p032f.C0516d;
import com.github.mikephil.charting.p037c.C0479f;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p037c.C0484k;
import com.github.mikephil.charting.p037c.C0485l;
import com.github.mikephil.charting.p037c.C0486m;
import com.github.mikephil.charting.p038e.C0490b;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0541g;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p040d.C0500d;
import com.github.mikephil.charting.p040d.C0501a;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0503e;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p041g.C0528j;
import com.github.mikephil.charting.p041g.C0532n;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RtlHardcoded"})
/* renamed from: com.github.mikephil.charting.charts.a */
public abstract class C0491a<T extends C0500d<? extends C0503e<? extends C0505h>>> extends C0489c<T> implements C0490b {
    private boolean f5708T;
    private boolean f5709U;
    private boolean f5710V;
    private long f5711W;
    protected int f5712a;
    private long aa;
    private boolean ab;
    protected boolean f5713b;
    protected boolean f5714c;
    protected boolean f5715d;
    protected boolean f5716e;
    protected boolean f5717f;
    protected Paint f5718g;
    protected Paint f5719h;
    protected boolean f5720i;
    protected boolean f5721j;
    protected C0516d f5722k;
    protected C0485l f5723l;
    protected C0485l f5724m;
    protected C0483j f5725n;
    protected C0532n f5726o;
    protected C0532n f5727p;
    protected C0542h f5728q;
    protected C0542h f5729r;
    protected C0528j f5730s;
    protected OnTouchListener f5731t;

    public C0491a(Context context) {
        super(context);
        this.f5712a = 100;
        this.f5713b = false;
        this.f5714c = true;
        this.f5715d = true;
        this.f5716e = true;
        this.f5708T = true;
        this.f5709U = true;
        this.f5710V = true;
        this.f5717f = false;
        this.f5720i = true;
        this.f5721j = false;
        this.f5711W = 0;
        this.aa = 0;
        this.ab = false;
    }

    public C0491a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5712a = 100;
        this.f5713b = false;
        this.f5714c = true;
        this.f5715d = true;
        this.f5716e = true;
        this.f5708T = true;
        this.f5709U = true;
        this.f5710V = true;
        this.f5717f = false;
        this.f5720i = true;
        this.f5721j = false;
        this.f5711W = 0;
        this.aa = 0;
        this.ab = false;
    }

    public C0491a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5712a = 100;
        this.f5713b = false;
        this.f5714c = true;
        this.f5715d = true;
        this.f5716e = true;
        this.f5708T = true;
        this.f5709U = true;
        this.f5710V = true;
        this.f5717f = false;
        this.f5720i = true;
        this.f5721j = false;
        this.f5711W = 0;
        this.aa = 0;
        this.ab = false;
    }

    public C0538d m4384a(float f, float f2) {
        float f3 = Float.MAX_VALUE;
        double d = 0.0d;
        if (this.A || this.v == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        float[] fArr = new float[2];
        fArr[0] = f;
        this.f5728q.m4699b(fArr);
        double d2 = (double) fArr[0];
        double floor = Math.floor(d2);
        double d3 = ((double) this.C) * 0.025d;
        if (d2 < (-d3) || d2 > d3 + ((double) this.C)) {
            return null;
        }
        if (floor >= 0.0d) {
            d = floor;
        }
        floor = d >= ((double) this.C) ? (double) (this.C - 1.0f) : d;
        int i = d2 - floor > 0.5d ? ((int) floor) + 1 : (int) floor;
        List a = m4386a(i);
        float b = C0544j.m4713b(a, f2, C0486m.LEFT);
        float b2 = C0544j.m4713b(a, f2, C0486m.RIGHT);
        if (((C0500d) this.v).m4483m() == null) {
            b2 = Float.MAX_VALUE;
        }
        if (((C0500d) this.v).m4482l() != null) {
            f3 = b;
        }
        int a2 = C0544j.m4706a(a, f2, f3 < b2 ? C0486m.LEFT : C0486m.RIGHT);
        return a2 == -1 ? null : new C0538d(i, a2);
    }

    public C0542h m4385a(C0486m c0486m) {
        return c0486m == C0486m.LEFT ? this.f5728q : this.f5729r;
    }

    public List<C0541g> m4386a(int i) {
        List<C0541g> arrayList = new ArrayList();
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < ((C0500d) this.v).m4471c(); i2++) {
            C0502g a = ((C0500d) this.v).m4463a(i2);
            fArr[1] = a.m4488a(i);
            m4385a(a.m4508r()).m4695a(fArr);
            if (!Float.isNaN(fArr[1])) {
                arrayList.add(new C0541g(fArr[1], i2, a));
            }
        }
        return arrayList;
    }

    protected void m4387a() {
        super.m4366a();
        this.f5723l = new C0485l(C0486m.LEFT);
        this.f5724m = new C0485l(C0486m.RIGHT);
        this.f5725n = new C0483j();
        this.f5728q = new C0542h(this.L);
        this.f5729r = new C0542h(this.L);
        this.f5726o = new C0532n(this.L, this.f5723l, this.f5728q);
        this.f5727p = new C0532n(this.L, this.f5724m, this.f5729r);
        this.f5730s = new C0528j(this.L, this.f5725n, this.f5728q);
        this.f5731t = new C0514a(this, this.L.m4748o());
        this.f5718g = new Paint();
        this.f5718g.setStyle(Style.FILL);
        this.f5718g.setColor(Color.rgb(240, 240, 240));
        this.f5719h = new Paint();
        this.f5719h.setStyle(Style.STROKE);
        this.f5719h.setColor(-16777216);
        this.f5719h.setStrokeWidth(C0544j.m4703a(1.0f));
    }

    public void m4388a(float f, float f2, float f3, float f4) {
        this.L.m4720a(this.L.m4726b(f, f2, f3, -f4), this, true);
    }

    protected void m4389a(Canvas canvas) {
        if (this.f5720i) {
            canvas.drawRect(this.L.m4744k(), this.f5718g);
        }
        if (this.f5721j) {
            canvas.drawRect(this.L.m4744k(), this.f5719h);
        }
    }

    protected float[] m4390a(C0505h c0505h, int i) {
        float c;
        float b = (float) c0505h.m4529b();
        if (this instanceof BarChart) {
            float a = ((C0501a) this.v).m4484a();
            float a2 = (float) ((C0503e) ((C0500d) this.v).m4463a(i)).m4489a(c0505h);
            c = ((((((float) (((C0500d) this.v).m4471c() - 1)) * a2) + ((float) i)) + (a2 * a)) + (a / 2.0f)) + b;
        } else {
            c = b;
        }
        float[] fArr = new float[]{c, c0505h.m4530c() * this.M.m4254a()};
        m4385a(((C0503e) ((C0500d) this.v).m4463a(i)).m4508r()).m4695a(fArr);
        return fArr;
    }

    public C0485l m4391b(C0486m c0486m) {
        return c0486m == C0486m.LEFT ? this.f5723l : this.f5724m;
    }

    public C0503e<? extends C0505h> m4392b(float f, float f2) {
        C0538d a = m4384a(f, f2);
        return a != null ? (C0503e) ((C0500d) this.v).m4463a(a.m4685a()) : null;
    }

    protected void m4393b() {
        float f;
        float f2;
        float a = ((C0500d) this.v).m4461a(C0486m.LEFT);
        float b = ((C0500d) this.v).m4468b(C0486m.LEFT);
        float a2 = ((C0500d) this.v).m4461a(C0486m.RIGHT);
        float b2 = ((C0500d) this.v).m4468b(C0486m.RIGHT);
        float abs = Math.abs(b - (this.f5723l.m4363x() ? 0.0f : a));
        float abs2 = Math.abs(b2 - (this.f5724m.m4363x() ? 0.0f : a2));
        if (abs == 0.0f) {
            f = b + 1.0f;
            if (this.f5723l.m4363x()) {
                b = f;
                f2 = a;
            } else {
                b = f;
                f2 = a - 1.0f;
            }
        } else {
            f2 = a;
        }
        if (abs2 == 0.0f) {
            f = b2 + 1.0f;
            if (this.f5724m.m4363x()) {
                a = f;
            } else {
                a2 -= 1.0f;
                a = f;
            }
        } else {
            a = b2;
        }
        b2 = this.f5723l.m4345A() * (abs / 100.0f);
        float A = this.f5724m.m4345A() * (abs2 / 100.0f);
        abs = this.f5723l.m4346B() * (abs / 100.0f);
        abs2 = this.f5724m.m4346B() * (abs2 / 100.0f);
        this.E = (float) (((C0500d) this.v).m4479i().size() - 1);
        this.C = Math.abs(this.E - this.D);
        this.f5723l.f5666w = !Float.isNaN(this.f5723l.m4365z()) ? this.f5723l.m4365z() : b + b2;
        this.f5724m.f5666w = !Float.isNaN(this.f5724m.m4365z()) ? this.f5724m.m4365z() : a + A;
        this.f5723l.f5667x = !Float.isNaN(this.f5723l.m4364y()) ? this.f5723l.m4364y() : f2 - abs;
        this.f5724m.f5667x = !Float.isNaN(this.f5724m.m4364y()) ? this.f5724m.m4364y() : a2 - abs2;
        if (this.f5723l.m4363x()) {
            this.f5723l.f5667x = 0.0f;
        }
        if (this.f5724m.m4363x()) {
            this.f5724m.f5667x = 0.0f;
        }
        this.f5723l.f5668y = Math.abs(this.f5723l.f5666w - this.f5723l.f5667x);
        this.f5724m.f5668y = Math.abs(this.f5724m.f5666w - this.f5724m.f5667x);
    }

    public boolean m4394c(C0486m c0486m) {
        return m4391b(c0486m).m4362w();
    }

    public void computeScroll() {
        if (this.f5731t instanceof C0514a) {
            ((C0514a) this.f5731t).m4572b();
        }
    }

    protected void m4395g() {
        if (this.u) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.D + ", xmax: " + this.E + ", xdelta: " + this.C);
        }
        this.f5729r.m4691a(this.D, this.C, this.f5724m.f5668y, this.f5724m.f5667x);
        this.f5728q.m4691a(this.D, this.C, this.f5723l.f5668y, this.f5723l.f5667x);
    }

    public C0485l getAxisLeft() {
        return this.f5723l;
    }

    public C0485l getAxisRight() {
        return this.f5724m;
    }

    public C0516d getDrawListener() {
        return this.f5722k;
    }

    public int getHighestVisibleXIndex() {
        float[] fArr = new float[]{this.L.m4737g(), this.L.m4739h()};
        m4385a(C0486m.LEFT).m4699b(fArr);
        return fArr[0] >= ((float) ((C0500d) this.v).m4481k()) ? ((C0500d) this.v).m4481k() - 1 : (int) fArr[0];
    }

    public int getLowestVisibleXIndex() {
        float[] fArr = new float[]{this.L.m4735f(), this.L.m4739h()};
        m4385a(C0486m.LEFT).m4699b(fArr);
        return fArr[0] <= 0.0f ? 0 : (int) (fArr[0] + 1.0f);
    }

    public int getMaxVisibleCount() {
        return this.f5712a;
    }

    public C0532n getRendererLeftYAxis() {
        return this.f5726o;
    }

    public C0532n getRendererRightYAxis() {
        return this.f5727p;
    }

    public C0528j getRendererXAxis() {
        return this.f5730s;
    }

    public float getScaleX() {
        return this.L == null ? 1.0f : this.L.m4749p();
    }

    public float getScaleY() {
        return this.L == null ? 1.0f : this.L.m4750q();
    }

    public C0483j getXAxis() {
        return this.f5725n;
    }

    public float getYChartMax() {
        return Math.max(this.f5723l.f5666w, this.f5724m.f5666w);
    }

    public float getYChartMin() {
        return Math.min(this.f5723l.f5667x, this.f5724m.f5667x);
    }

    protected void m4396h() {
        this.f5729r.m4694a(this.f5724m.m4362w());
        this.f5728q.m4694a(this.f5723l.m4362w());
    }

    public void m4397i() {
        if (!this.A) {
            if (this.u) {
                Log.i("MPAndroidChart", "Preparing...");
            }
            if (this.K != null) {
                this.K.m4589a();
            }
            m4393b();
            if (this.f5723l.m4349E()) {
                this.f5723l.m4352a(this.w);
            }
            if (this.f5724m.m4349E()) {
                this.f5724m.m4352a(this.w);
            }
            this.f5726o.m4665a(this.f5723l.f5667x, this.f5723l.f5666w);
            this.f5727p.m4665a(this.f5724m.f5667x, this.f5724m.f5666w);
            this.f5730s.m4649a(((C0500d) this.v).m4476f(), ((C0500d) this.v).m4479i());
            this.J.m4618a(this.v);
            m4398j();
        } else if (this.u) {
            Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
        }
    }

    protected void m4398j() {
        float f = 0.0f;
        if (!this.ab) {
            float l;
            float f2;
            float f3;
            float f4;
            if (this.H != null && this.H.m4280q()) {
                if (this.H.m4307c() == C0479f.RIGHT_OF_CHART || this.H.m4307c() == C0479f.RIGHT_OF_CHART_CENTER) {
                    l = (this.H.f5596d + (this.H.m4275l() * 2.0f)) + 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    if (this.f5723l.m4350F()) {
                        f2 += this.f5723l.m4351a(this.f5726o.m4588a());
                    }
                    if (this.f5724m.m4350F()) {
                        l += this.f5724m.m4351a(this.f5727p.m4588a());
                    }
                    f4 = ((float) this.f5725n.f5639n) * 2.0f;
                    if (this.f5725n.m4280q()) {
                        if (this.f5725n.m4339r() != C0484k.BOTTOM) {
                            f3 += f4;
                        } else if (this.f5725n.m4339r() != C0484k.TOP) {
                            f = 0.0f + f4;
                        } else if (this.f5725n.m4339r() == C0484k.BOTH_SIDED) {
                            f3 += f4;
                            f = 0.0f + f4;
                        }
                    }
                    f4 = C0544j.m4703a(10.0f);
                    this.L.m4723a(Math.max(f4, f2), Math.max(f4, f), Math.max(f4, l), Math.max(f4, f3));
                    if (this.u) {
                        Log.i("MPAndroidChart", "offsetLeft: " + f2 + ", offsetTop: " + f + ", offsetRight: " + l + ", offsetBottom: " + f3);
                        Log.i("MPAndroidChart", "Content: " + this.L.m4744k().toString());
                    }
                } else if (this.H.m4307c() == C0479f.LEFT_OF_CHART || this.H.m4307c() == C0479f.LEFT_OF_CHART_CENTER) {
                    l = 0.0f;
                    f2 = (this.H.f5596d + (this.H.m4275l() * 2.0f)) + 0.0f;
                    f3 = 0.0f;
                    if (this.f5723l.m4350F()) {
                        f2 += this.f5723l.m4351a(this.f5726o.m4588a());
                    }
                    if (this.f5724m.m4350F()) {
                        l += this.f5724m.m4351a(this.f5727p.m4588a());
                    }
                    f4 = ((float) this.f5725n.f5639n) * 2.0f;
                    if (this.f5725n.m4280q()) {
                        if (this.f5725n.m4339r() != C0484k.BOTTOM) {
                            f3 += f4;
                        } else if (this.f5725n.m4339r() != C0484k.TOP) {
                            f = 0.0f + f4;
                        } else if (this.f5725n.m4339r() == C0484k.BOTH_SIDED) {
                            f3 += f4;
                            f = 0.0f + f4;
                        }
                    }
                    f4 = C0544j.m4703a(10.0f);
                    this.L.m4723a(Math.max(f4, f2), Math.max(f4, f), Math.max(f4, l), Math.max(f4, f3));
                    if (this.u) {
                        Log.i("MPAndroidChart", "offsetLeft: " + f2 + ", offsetTop: " + f + ", offsetRight: " + l + ", offsetBottom: " + f3);
                        Log.i("MPAndroidChart", "Content: " + this.L.m4744k().toString());
                    }
                } else if (this.H.m4307c() == C0479f.BELOW_CHART_LEFT || this.H.m4307c() == C0479f.BELOW_CHART_RIGHT || this.H.m4307c() == C0479f.BELOW_CHART_CENTER) {
                    f3 = (this.H.f5595c * 3.0f) + 0.0f;
                    l = 0.0f;
                    f2 = 0.0f;
                    if (this.f5723l.m4350F()) {
                        f2 += this.f5723l.m4351a(this.f5726o.m4588a());
                    }
                    if (this.f5724m.m4350F()) {
                        l += this.f5724m.m4351a(this.f5727p.m4588a());
                    }
                    f4 = ((float) this.f5725n.f5639n) * 2.0f;
                    if (this.f5725n.m4280q()) {
                        if (this.f5725n.m4339r() != C0484k.BOTTOM) {
                            f3 += f4;
                        } else if (this.f5725n.m4339r() != C0484k.TOP) {
                            f = 0.0f + f4;
                        } else if (this.f5725n.m4339r() == C0484k.BOTH_SIDED) {
                            f3 += f4;
                            f = 0.0f + f4;
                        }
                    }
                    f4 = C0544j.m4703a(10.0f);
                    this.L.m4723a(Math.max(f4, f2), Math.max(f4, f), Math.max(f4, l), Math.max(f4, f3));
                    if (this.u) {
                        Log.i("MPAndroidChart", "offsetLeft: " + f2 + ", offsetTop: " + f + ", offsetRight: " + l + ", offsetBottom: " + f3);
                        Log.i("MPAndroidChart", "Content: " + this.L.m4744k().toString());
                    }
                }
            }
            f3 = 0.0f;
            l = 0.0f;
            f2 = 0.0f;
            if (this.f5723l.m4350F()) {
                f2 += this.f5723l.m4351a(this.f5726o.m4588a());
            }
            if (this.f5724m.m4350F()) {
                l += this.f5724m.m4351a(this.f5727p.m4588a());
            }
            f4 = ((float) this.f5725n.f5639n) * 2.0f;
            if (this.f5725n.m4280q()) {
                if (this.f5725n.m4339r() != C0484k.BOTTOM) {
                    f3 += f4;
                } else if (this.f5725n.m4339r() != C0484k.TOP) {
                    f = 0.0f + f4;
                } else if (this.f5725n.m4339r() == C0484k.BOTH_SIDED) {
                    f3 += f4;
                    f = 0.0f + f4;
                }
            }
            f4 = C0544j.m4703a(10.0f);
            this.L.m4723a(Math.max(f4, f2), Math.max(f4, f), Math.max(f4, l), Math.max(f4, f3));
            if (this.u) {
                Log.i("MPAndroidChart", "offsetLeft: " + f2 + ", offsetTop: " + f + ", offsetRight: " + l + ", offsetBottom: " + f3);
                Log.i("MPAndroidChart", "Content: " + this.L.m4744k().toString());
            }
        }
        m4396h();
        m4395g();
    }

    protected void m4399k() {
        if (this.f5725n != null && this.f5725n.m4280q()) {
            if (!this.f5725n.m4340s()) {
                float[] fArr = new float[9];
                this.L.m4748o().getValues(fArr);
                this.f5725n.f5640o = (int) Math.ceil((double) (((float) (((C0500d) this.v).m4481k() * this.f5725n.f5638m)) / (fArr[0] * this.L.m4741i())));
            }
            if (this.u) {
                Log.i("MPAndroidChart", "X-Axis modulus: " + this.f5725n.f5640o + ", x-axis label width: " + this.f5725n.f5638m + ", content width: " + this.L.m4741i());
            }
            if (this.f5725n.f5640o < 1) {
                this.f5725n.f5640o = 1;
            }
        }
    }

    public boolean m4400l() {
        return this.f5715d;
    }

    public boolean m4401m() {
        return this.f5708T;
    }

    public boolean m4402n() {
        return this.f5709U;
    }

    public boolean m4403o() {
        return this.f5710V;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A) {
            long currentTimeMillis = System.currentTimeMillis();
            m4399k();
            this.f5730s.m4587a(this, this.f5725n.f5640o);
            this.K.m4587a(this, this.f5725n.f5640o);
            m4389a(canvas);
            if (this.f5723l.m4280q()) {
                this.f5726o.m4665a(this.f5723l.f5667x, this.f5723l.f5666w);
            }
            if (this.f5724m.m4280q()) {
                this.f5727p.m4665a(this.f5724m.f5667x, this.f5724m.f5666w);
            }
            this.f5730s.m4652b(canvas);
            this.f5726o.m4669b(canvas);
            this.f5727p.m4669b(canvas);
            int save = canvas.save();
            canvas.clipRect(this.L.m4744k());
            this.f5730s.m4653c(canvas);
            this.f5726o.m4670c(canvas);
            this.f5727p.m4670c(canvas);
            if (this.f5725n.m4294j()) {
                this.f5730s.m4654d(canvas);
            }
            if (this.f5723l.m4294j()) {
                this.f5726o.m4671d(canvas);
            }
            if (this.f5724m.m4294j()) {
                this.f5727p.m4671d(canvas);
            }
            this.K.m4590a(canvas);
            if (!this.f5725n.m4294j()) {
                this.f5730s.m4654d(canvas);
            }
            if (!this.f5723l.m4294j()) {
                this.f5726o.m4671d(canvas);
            }
            if (!this.f5724m.m4294j()) {
                this.f5727p.m4671d(canvas);
            }
            if (this.G && this.f5716e && m4377u()) {
                this.K.m4591a(canvas, this.P);
            }
            canvas.restoreToCount(save);
            this.K.m4594c(canvas);
            this.f5730s.m4650a(canvas);
            this.f5726o.m4666a(canvas);
            this.f5727p.m4666a(canvas);
            this.K.m4593b(canvas);
            this.J.m4615a(canvas);
            m4374c(canvas);
            m4372b(canvas);
            if (this.u) {
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                this.f5711W += currentTimeMillis;
                this.aa++;
                Log.i("MPAndroidChart", "Drawtime: " + currentTimeMillis + " ms, average: " + (this.f5711W / this.aa) + " ms, cycles: " + this.aa);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return (this.f5731t == null || this.A || !this.F) ? false : this.f5731t.onTouch(this, motionEvent);
    }

    public boolean m4404p() {
        return this.f5714c;
    }

    public boolean m4405q() {
        return this.L.m4751r();
    }

    public boolean m4406r() {
        return this.f5713b;
    }

    public boolean m4407s() {
        return this.L.m4754u();
    }

    public void setBorderColor(int i) {
        this.f5719h.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.f5719h.setStrokeWidth(C0544j.m4703a(f));
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.f5714c = z;
    }

    public void setDragEnabled(boolean z) {
        this.f5708T = z;
    }

    public void setDragOffsetX(float f) {
        this.L.m4740h(f);
    }

    public void setDragOffsetY(float f) {
        this.L.m4742i(f);
    }

    public void setDrawBorders(boolean z) {
        this.f5721j = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.f5720i = z;
    }

    public void setGridBackgroundColor(int i) {
        this.f5718g.setColor(i);
    }

    public void setHighlightIndicatorEnabled(boolean z) {
        this.f5716e = z;
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.f5715d = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.f5712a = i;
    }

    public void setOnDrawListener(C0516d c0516d) {
        this.f5722k = c0516d;
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f5731t = onTouchListener;
    }

    public void setPinchZoom(boolean z) {
        this.f5713b = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f5709U = z;
        this.f5710V = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.f5709U = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.f5710V = z;
    }

    public void setVisibleXRange(float f) {
        this.L.m4721a(this.C / f);
    }

    public boolean m4408t() {
        return this.f5723l.m4362w() || this.f5724m.m4362w();
    }
}
