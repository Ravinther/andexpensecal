package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import com.expensemanager.adv;
import com.github.mikephil.charting.p037c.C0476c;
import com.github.mikephil.charting.p037c.C0477d;
import com.github.mikephil.charting.p037c.C0478e;
import com.github.mikephil.charting.p037c.C0479f;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0499f;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0504b;
import com.github.mikephil.charting.p040d.C0511m;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.e */
public class C0524e extends C0519i {
    private static /* synthetic */ int[] f5860d;
    private static /* synthetic */ int[] f5861e;
    protected Paint f5862a;
    protected Paint f5863b;
    protected C0476c f5864c;

    public C0524e(C0545l c0545l, C0476c c0476c) {
        super(c0545l);
        this.f5864c = c0476c;
        this.f5862a = new Paint(1);
        this.f5862a.setTextSize(C0544j.m4703a(9.0f));
        this.f5862a.setTextAlign(Align.LEFT);
        this.f5863b = new Paint(1);
        this.f5863b.setStyle(Style.FILL);
        this.f5863b.setStrokeWidth(3.0f);
    }

    static /* synthetic */ int[] m4612b() {
        int[] iArr = f5860d;
        if (iArr == null) {
            iArr = new int[C0479f.values().length];
            try {
                iArr[C0479f.BELOW_CHART_CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[C0479f.BELOW_CHART_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[C0479f.BELOW_CHART_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[C0479f.LEFT_OF_CHART.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[C0479f.LEFT_OF_CHART_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[C0479f.LEFT_OF_CHART_INSIDE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[C0479f.PIECHART_CENTER.ordinal()] = 10;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[C0479f.RIGHT_OF_CHART.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[C0479f.RIGHT_OF_CHART_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[C0479f.RIGHT_OF_CHART_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            f5860d = iArr;
        }
        return iArr;
    }

    static /* synthetic */ int[] m4613c() {
        int[] iArr = f5861e;
        if (iArr == null) {
            iArr = new int[C0478e.values().length];
            try {
                iArr[C0478e.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[C0478e.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[C0478e.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            f5861e = iArr;
        }
        return iArr;
    }

    public Paint m4614a() {
        return this.f5862a;
    }

    public void m4615a(Canvas canvas) {
        if (this.f5864c.m4280q()) {
            Typeface n = this.f5864c.m4277n();
            if (n != null) {
                this.f5862a.setTypeface(n);
            }
            this.f5862a.setTextSize(this.f5864c.m4278o());
            this.f5862a.setColor(this.f5864c.m4279p());
            String[] b = this.f5864c.m4305b();
            int[] a = this.f5864c.m4301a();
            float i = this.f5864c.m4317i();
            float g = this.f5864c.m4315g();
            C0477d d = this.f5864c.m4310d();
            float f = this.f5864c.m4314f();
            float j = this.f5864c.m4318j();
            float b2 = (((float) C0544j.m4716b(this.f5862a, "AQJ")) + f) / 2.0f;
            float m = this.f5864c.m4276m();
            float l = this.f5864c.m4275l();
            int i2;
            Object obj;
            float f2;
            float f3;
            float f4;
            int length;
            float g2;
            switch (C0524e.m4612b()[this.f5864c.m4307c().ordinal()]) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                case C0607c.LoadingImageView_circleCrop /*2*/:
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    Object obj2 = (this.f5864c.m4307c() == C0479f.RIGHT_OF_CHART || this.f5864c.m4307c() == C0479f.RIGHT_OF_CHART_CENTER || this.f5864c.m4307c() == C0479f.RIGHT_OF_CHART_INSIDE) ? 1 : null;
                    if (obj2 != null) {
                        l = this.n.m4747n() - l;
                        if (d == C0477d.LEFT_TO_RIGHT) {
                            g = l - this.f5864c.f5596d;
                        }
                        g = l;
                    } else {
                        if (d == C0477d.RIGHT_TO_LEFT) {
                            g = l + this.f5864c.f5596d;
                        }
                        g = l;
                    }
                    l = (this.f5864c.m4307c() == C0479f.RIGHT_OF_CHART || this.f5864c.m4307c() == C0479f.LEFT_OF_CHART) ? this.n.m4733e() + m : (this.f5864c.m4307c() == C0479f.RIGHT_OF_CHART_CENTER || this.f5864c.m4307c() == C0479f.LEFT_OF_CHART_CENTER) ? (this.n.m4746m() / 2.0f) - (this.f5864c.f5594b / 2.0f) : this.n.m4733e() + m;
                    i2 = 0;
                    obj = null;
                    f2 = 0.0f;
                    f3 = l;
                    while (i2 < b.length) {
                        Object obj3;
                        Boolean valueOf = Boolean.valueOf(a[i2] != -2);
                        if (valueOf.booleanValue()) {
                            f4 = d == C0477d.LEFT_TO_RIGHT ? g + f2 : g - (f - f2);
                            m4616a(canvas, f4, f3, i2, this.f5864c);
                            if (d == C0477d.LEFT_TO_RIGHT) {
                                f4 += f;
                            }
                        } else {
                            f4 = g;
                        }
                        if (b[i2] != null) {
                            if (valueOf.booleanValue() && obj == null) {
                                f4 += d == C0477d.LEFT_TO_RIGHT ? i : -i;
                            } else if (obj != null) {
                                f4 = g;
                            }
                            if (d == C0477d.RIGHT_TO_LEFT) {
                                f4 -= (float) C0544j.m4705a(this.f5862a, b[i2]);
                            }
                            if (obj == null) {
                                m4617a(canvas, f4, (this.f5864c.f5595c / 2.0f) + f3, this.f5864c.m4303b(i2));
                                l = f3 + b2;
                            } else {
                                l = (this.f5864c.f5595c * 3.0f) + f3;
                                m4617a(canvas, f4, l - this.f5864c.f5595c, this.f5864c.m4303b(i2));
                            }
                            f3 = l + this.f5864c.m4316h();
                            f4 = 0.0f;
                            obj3 = obj;
                        } else {
                            f4 = f2 + (f + j);
                            obj3 = 1;
                        }
                        i2++;
                        obj = obj3;
                        f2 = f4;
                    }
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    l += this.n.m4735f();
                    f2 = this.n.m4746m() - m;
                    if (d == C0477d.RIGHT_TO_LEFT) {
                        l += this.f5864c.f5593a;
                    }
                    i2 = 0;
                    length = b.length;
                    f4 = l;
                    while (i2 < length) {
                        obj = a[i2] != -2 ? 1 : null;
                        if (obj != null) {
                            if (d == C0477d.RIGHT_TO_LEFT) {
                                f4 -= f;
                            }
                            m4616a(canvas, f4, f2 - (this.f5864c.f5595c / 2.0f), i2, this.f5864c);
                            if (d == C0477d.LEFT_TO_RIGHT) {
                                f4 += f;
                            }
                        }
                        if (b[i2] != null) {
                            if (obj != null) {
                                f4 += d == C0477d.RIGHT_TO_LEFT ? -i : i;
                            }
                            if (d == C0477d.RIGHT_TO_LEFT) {
                                f4 -= (float) C0544j.m4705a(this.f5862a, b[i2]);
                            }
                            m4617a(canvas, f4, f2, b[i2]);
                            if (d == C0477d.LEFT_TO_RIGHT) {
                                f4 += (float) C0544j.m4705a(this.f5862a, b[i2]);
                            }
                            l = (d == C0477d.RIGHT_TO_LEFT ? -g : g) + f4;
                        } else {
                            l = (d == C0477d.RIGHT_TO_LEFT ? -j : j) + f4;
                        }
                        i2++;
                        f4 = l;
                    }
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    g2 = this.n.m4737g() - l;
                    f2 = this.n.m4746m() - m;
                    length = b.length;
                    for (i2 = 0; i2 < length; i2++) {
                        obj = a[i2] != -2 ? 1 : null;
                        if (d != C0477d.RIGHT_TO_LEFT || obj == null) {
                            l = g2;
                        } else {
                            f4 = g2 - f;
                            m4616a(canvas, f4, f2 - (this.f5864c.f5595c / 2.0f), i2, this.f5864c);
                            l = f4 - i;
                        }
                        if (b[i2] != null) {
                            l -= (float) C0544j.m4705a(this.f5862a, b[i2]);
                            m4617a(canvas, l, f2, b[i2]);
                        }
                        if (d == C0477d.LEFT_TO_RIGHT && obj != null) {
                            f4 = l - (i + f);
                            m4616a(canvas, f4, f2 - (this.f5864c.f5595c / 2.0f), i2, this.f5864c);
                            l = f4;
                        }
                        g2 = l - (b[i2] != null ? g : j);
                    }
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    l = (d == C0477d.LEFT_TO_RIGHT ? (-this.f5864c.f5593a) / 2.0f : this.f5864c.f5593a / 2.0f) + (this.n.m4747n() / 2.0f);
                    f2 = this.n.m4746m() - m;
                    for (i2 = 0; i2 < b.length; i2++) {
                        obj = a[i2] != -2 ? 1 : null;
                        if (obj != null) {
                            f4 = d == C0477d.RIGHT_TO_LEFT ? l - f : l;
                            m4616a(canvas, f4, f2 - (this.f5864c.f5595c / 2.0f), i2, this.f5864c);
                            if (d == C0477d.LEFT_TO_RIGHT) {
                                f4 += f;
                            }
                        } else {
                            f4 = l;
                        }
                        if (b[i2] != null) {
                            if (obj != null) {
                                f4 += d == C0477d.RIGHT_TO_LEFT ? -i : i;
                            }
                            if (d == C0477d.RIGHT_TO_LEFT) {
                                f4 -= (float) C0544j.m4705a(this.f5862a, b[i2]);
                            }
                            m4617a(canvas, f4, f2, b[i2]);
                            if (d == C0477d.LEFT_TO_RIGHT) {
                                f4 += (float) C0544j.m4705a(this.f5862a, b[i2]);
                            }
                            l = (d == C0477d.RIGHT_TO_LEFT ? -g : g) + f4;
                        } else {
                            l = (d == C0477d.RIGHT_TO_LEFT ? -j : j) + f4;
                        }
                    }
                case adv.TitlePageIndicator_footerPadding /*10*/:
                    f2 = (this.n.m4747n() / 2.0f) + (d == C0477d.LEFT_TO_RIGHT ? (-this.f5864c.f5596d) / 2.0f : this.f5864c.f5596d / 2.0f);
                    f3 = this.f5864c.m4276m() + ((this.n.m4746m() / 2.0f) - (this.f5864c.f5594b / 2.0f));
                    i2 = 0;
                    Object obj4 = null;
                    float f5 = 0.0f;
                    while (i2 < b.length) {
                        Object obj5;
                        Object obj6 = a[i2] != -2 ? 1 : null;
                        if (obj6 != null) {
                            f4 = d == C0477d.LEFT_TO_RIGHT ? f2 + f5 : f2 - (f - f5);
                            m4616a(canvas, f4, f3, i2, this.f5864c);
                            if (d == C0477d.LEFT_TO_RIGHT) {
                                f4 += f;
                            }
                        } else {
                            f4 = f2;
                        }
                        if (b[i2] != null) {
                            if (obj6 != null && obj4 == null) {
                                f4 += d == C0477d.LEFT_TO_RIGHT ? i : -i;
                            } else if (obj4 != null) {
                                f4 = f2;
                            }
                            if (d == C0477d.RIGHT_TO_LEFT) {
                                f4 -= (float) C0544j.m4705a(this.f5862a, b[i2]);
                            }
                            if (obj4 == null) {
                                m4617a(canvas, f4, (this.f5864c.f5595c / 2.0f) + f3, this.f5864c.m4303b(i2));
                                l = f3 + b2;
                            } else {
                                l = (this.f5864c.f5595c * 3.0f) + f3;
                                m4617a(canvas, f4, l - this.f5864c.f5595c, this.f5864c.m4303b(i2));
                            }
                            f3 = l + this.f5864c.m4316h();
                            g2 = 0.0f;
                            obj5 = obj4;
                        } else {
                            g2 = f5 + (f + j);
                            obj5 = 1;
                        }
                        i2++;
                        obj4 = obj5;
                        f5 = g2;
                    }
                default:
            }
        }
    }

    protected void m4616a(Canvas canvas, float f, float f2, int i, C0476c c0476c) {
        if (c0476c.m4301a()[i] != -2) {
            this.f5863b.setColor(c0476c.m4301a()[i]);
            float f3 = c0476c.m4314f();
            float f4 = f3 / 2.0f;
            switch (C0524e.m4613c()[c0476c.m4312e().ordinal()]) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    canvas.drawRect(f, f2 - f4, f + f3, f2 + f4, this.f5863b);
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    canvas.drawCircle(f + f4, f2, f4, this.f5863b);
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    canvas.drawLine(f, f2, f + f3, f2, this.f5863b);
                default:
            }
        }
    }

    protected void m4617a(Canvas canvas, float f, float f2, String str) {
        canvas.drawText(str, f, f2, this.f5862a);
    }

    public void m4618a(C0499f<?> c0499f) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (int i = 0; i < c0499f.m4471c(); i++) {
            C0502g a = c0499f.m4463a(i);
            List t = a.m4510t();
            int i2 = a.m4499i();
            int i3;
            if ((a instanceof C0504b) && ((C0504b) a).m4522b()) {
                C0504b c0504b = (C0504b) a;
                String[] f = c0504b.m4526f();
                i3 = 0;
                while (i3 < t.size() && i3 < c0504b.m4520a()) {
                    arrayList.add(f[i3 % f.length]);
                    arrayList2.add((Integer) t.get(i3));
                    i3++;
                }
                arrayList2.add(Integer.valueOf(-2));
                arrayList.add(c0504b.m4506p());
            } else if (a instanceof C0511m) {
                List i4 = c0499f.m4479i();
                C0511m c0511m = (C0511m) a;
                i3 = 0;
                while (i3 < t.size() && i3 < i2 && i3 < i4.size()) {
                    arrayList.add((String) i4.get(i3));
                    arrayList2.add((Integer) t.get(i3));
                    i3++;
                }
                arrayList2.add(Integer.valueOf(-2));
                arrayList.add(c0511m.m4506p());
            } else {
                int i5 = 0;
                while (i5 < t.size() && i5 < i2) {
                    if (i5 >= t.size() - 1 || i5 >= i2 - 1) {
                        arrayList.add(c0499f.m4463a(i).m4506p());
                    } else {
                        arrayList.add(null);
                    }
                    arrayList2.add((Integer) t.get(i5));
                    i5++;
                }
            }
        }
        this.f5864c.m4300a(arrayList2);
        this.f5864c.m4304b(arrayList);
        Typeface n = this.f5864c.m4277n();
        if (n != null) {
            this.f5862a.setTypeface(n);
        }
        this.f5862a.setTextSize(this.f5864c.m4278o());
        this.f5862a.setColor(this.f5864c.m4279p());
        this.f5864c.m4313e(this.f5862a);
    }
}
