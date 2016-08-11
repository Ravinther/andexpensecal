package p018c.p019a.p020a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.List;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p022c.C0311c;
import p018c.p019a.p022c.C0312d;
import p018c.p019a.p022c.C0314f;

/* renamed from: c.a.a.l */
public class C0300l extends C0289n {
    private float f2105a;

    C0300l() {
        this.f2105a = 3.0f;
    }

    public C0300l(C0306d c0306d, C0312d c0312d) {
        super(c0306d, c0312d);
        this.f2105a = 3.0f;
        this.f2105a = c0312d.ac();
    }

    private void m2004a(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawLine(f - this.f2105a, f2 - this.f2105a, f + this.f2105a, f2 + this.f2105a, paint);
        canvas.drawLine(f + this.f2105a, f2 - this.f2105a, f - this.f2105a, f2 + this.f2105a, paint);
    }

    private void m2005a(Canvas canvas, Paint paint, float[] fArr, float f, float f2) {
        fArr[0] = f;
        fArr[1] = (f2 - this.f2105a) - (this.f2105a / 2.0f);
        fArr[2] = f - this.f2105a;
        fArr[3] = this.f2105a + f2;
        fArr[4] = this.f2105a + f;
        fArr[5] = fArr[3];
        m1936a(canvas, fArr, paint, true);
    }

    private void m2006b(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawCircle(f, f2, this.f2105a, paint);
    }

    private void m2007b(Canvas canvas, Paint paint, float[] fArr, float f, float f2) {
        fArr[0] = f;
        fArr[1] = f2 - this.f2105a;
        fArr[2] = f - this.f2105a;
        fArr[3] = f2;
        fArr[4] = f;
        fArr[5] = this.f2105a + f2;
        fArr[6] = this.f2105a + f;
        fArr[7] = f2;
        m1936a(canvas, fArr, paint, true);
    }

    private void m2008c(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawRect(f - this.f2105a, f2 - this.f2105a, f + this.f2105a, f2 + this.f2105a, paint);
    }

    public int m2009a(int i) {
        return 10;
    }

    public void m2010a(Canvas canvas, Paint paint, List<Float> list, C0311c c0311c, float f, int i, int i2) {
        C0314f c0314f = (C0314f) c0311c;
        paint.setColor(c0314f.m2110a());
        float strokeWidth = paint.getStrokeWidth();
        if (c0314f.m2198r()) {
            paint.setStyle(Style.FILL);
        } else {
            paint.setStrokeWidth(c0314f.m2200t());
            paint.setStyle(Style.STROKE);
        }
        int size = list.size();
        int i3;
        float[] fArr;
        int i4;
        switch (C0301m.f2106a[c0314f.m2199s().ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                paint.setStrokeWidth(c0314f.m2200t());
                for (i3 = 0; i3 < size; i3 += 2) {
                    m2004a(canvas, paint, ((Float) list.get(i3)).floatValue(), ((Float) list.get(i3 + 1)).floatValue());
                }
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                for (i3 = 0; i3 < size; i3 += 2) {
                    m2006b(canvas, paint, ((Float) list.get(i3)).floatValue(), ((Float) list.get(i3 + 1)).floatValue());
                }
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                fArr = new float[6];
                for (i4 = 0; i4 < size; i4 += 2) {
                    m2005a(canvas, paint, fArr, ((Float) list.get(i4)).floatValue(), ((Float) list.get(i4 + 1)).floatValue());
                }
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                for (i3 = 0; i3 < size; i3 += 2) {
                    m2008c(canvas, paint, ((Float) list.get(i3)).floatValue(), ((Float) list.get(i3 + 1)).floatValue());
                }
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                fArr = new float[8];
                for (i4 = 0; i4 < size; i4 += 2) {
                    m2007b(canvas, paint, fArr, ((Float) list.get(i4)).floatValue(), ((Float) list.get(i4 + 1)).floatValue());
                }
                break;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                for (i3 = 0; i3 < size; i3 += 2) {
                    canvas.drawPoint(((Float) list.get(i3)).floatValue(), ((Float) list.get(i3 + 1)).floatValue(), paint);
                }
                break;
        }
        paint.setStrokeWidth(strokeWidth);
    }

    public void m2011a(Canvas canvas, C0311c c0311c, float f, float f2, int i, Paint paint) {
        if (((C0314f) c0311c).m2198r()) {
            paint.setStyle(Style.FILL);
        } else {
            paint.setStyle(Style.STROKE);
        }
        switch (C0301m.f2106a[((C0314f) c0311c).m2199s().ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                m2004a(canvas, paint, f + 10.0f, f2);
            case C0607c.LoadingImageView_circleCrop /*2*/:
                m2006b(canvas, paint, f + 10.0f, f2);
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                m2005a(canvas, paint, new float[6], f + 10.0f, f2);
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                m2008c(canvas, paint, f + 10.0f, f2);
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                m2007b(canvas, paint, new float[8], f + 10.0f, f2);
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                canvas.drawPoint(f + 10.0f, f2, paint);
            default:
        }
    }

    protected C0292d[] m2012a(List<Float> list, List<Double> list2, float f, int i, int i2) {
        int size = list.size();
        C0292d[] c0292dArr = new C0292d[(size / 2)];
        for (int i3 = 0; i3 < size; i3 += 2) {
            int D = this.c.m2062D();
            c0292dArr[i3 / 2] = new C0292d(new RectF(((Float) list.get(i3)).floatValue() - ((float) D), ((Float) list.get(i3 + 1)).floatValue() - ((float) D), ((float) D) + ((Float) list.get(i3)).floatValue(), ((Float) list.get(i3 + 1)).floatValue() + ((float) D)), ((Double) list2.get(i3)).doubleValue(), ((Double) list2.get(i3 + 1)).doubleValue());
        }
        return c0292dArr;
    }
}
