package p018c.p019a.p020a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p022c.C0311c;
import p018c.p019a.p022c.C0312d;
import p018c.p019a.p022c.C0314f;
import p018c.p019a.p022c.C0315g;
import p018c.p019a.p022c.C0316h;

/* renamed from: c.a.a.e */
public class C0293e extends C0289n {
    private C0300l f2082a;

    C0293e() {
    }

    public C0293e(C0306d c0306d, C0312d c0312d) {
        super(c0306d, c0312d);
        this.f2082a = new C0300l(c0306d, c0312d);
    }

    public int m1978a(int i) {
        return 30;
    }

    public void m1979a(Canvas canvas, Paint paint, List<Float> list, C0311c c0311c, float f, int i, int i2) {
        C0314f c0314f = (C0314f) c0311c;
        float strokeWidth = paint.getStrokeWidth();
        paint.setStrokeWidth(c0314f.m2201u());
        for (C0315g c0315g : c0314f.m2197q()) {
            if (c0315g.m2203b() != C0316h.NONE) {
                float f2;
                int i3;
                paint.setColor(c0315g.m2202a());
                List arrayList = new ArrayList();
                int[] c = c0315g.m2204c();
                if (c == null) {
                    arrayList.addAll(list);
                } else {
                    arrayList.addAll(list.subList(c[0] * 2, c[1] * 2));
                }
                switch (C0294f.f2083a[c0315g.m2203b().ordinal()]) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        f2 = f;
                        break;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        f2 = f;
                        break;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        f2 = f;
                        break;
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        f2 = (float) canvas.getHeight();
                        break;
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        f2 = 0.0f;
                        break;
                    default:
                        throw new RuntimeException("You have added a new type of filling but have not implemented.");
                }
                if (c0315g.m2203b() == C0316h.BOUNDS_ABOVE || c0315g.m2203b() == C0316h.BOUNDS_BELOW) {
                    Object obj;
                    Collection arrayList2 = new ArrayList();
                    if ((c0315g.m2203b() != C0316h.BOUNDS_ABOVE || ((Float) arrayList.get(1)).floatValue() >= f2) && (c0315g.m2203b() != C0316h.BOUNDS_BELOW || ((Float) arrayList.get(1)).floatValue() <= f2)) {
                        obj = null;
                    } else {
                        arrayList2.add(arrayList.get(0));
                        arrayList2.add(arrayList.get(1));
                        obj = 1;
                    }
                    i3 = 3;
                    Object obj2 = obj;
                    while (i3 < arrayList.size()) {
                        int i4;
                        Object obj3;
                        float floatValue = ((Float) arrayList.get(i3 - 2)).floatValue();
                        float floatValue2 = ((Float) arrayList.get(i3)).floatValue();
                        if ((floatValue >= f2 || floatValue2 <= f2) && (floatValue <= f2 || floatValue2 >= f2)) {
                            if (obj2 != null || ((c0315g.m2203b() == C0316h.BOUNDS_ABOVE && floatValue2 < f2) || (c0315g.m2203b() == C0316h.BOUNDS_BELOW && floatValue2 > f2))) {
                                arrayList2.add(arrayList.get(i3 - 1));
                                arrayList2.add(Float.valueOf(floatValue2));
                            }
                            i4 = i3;
                            obj3 = obj2;
                        } else {
                            float floatValue3 = ((Float) arrayList.get(i3 - 3)).floatValue();
                            float floatValue4 = ((Float) arrayList.get(i3 - 1)).floatValue();
                            arrayList2.add(Float.valueOf(floatValue3 + (((floatValue4 - floatValue3) * (f2 - floatValue)) / (floatValue2 - floatValue))));
                            arrayList2.add(Float.valueOf(f2));
                            if ((c0315g.m2203b() != C0316h.BOUNDS_ABOVE || floatValue2 <= f2) && (c0315g.m2203b() != C0316h.BOUNDS_BELOW || floatValue2 >= f2)) {
                                arrayList2.add(Float.valueOf(floatValue4));
                                arrayList2.add(Float.valueOf(floatValue2));
                                obj = 1;
                            } else {
                                i3 += 2;
                                obj = null;
                            }
                            int i5 = i3;
                            obj3 = obj;
                            i4 = i5;
                        }
                        obj2 = obj3;
                        i3 = i4 + 2;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList2);
                }
                i3 = arrayList.size();
                arrayList.set(0, Float.valueOf(((Float) arrayList.get(0)).floatValue() + 1.0f));
                arrayList.add(arrayList.get(i3 - 2));
                arrayList.add(Float.valueOf(f2));
                arrayList.add(arrayList.get(0));
                arrayList.add(arrayList.get(i3 + 1));
                for (int i6 = 0; i6 < i3 + 4; i6 += 2) {
                    if (((Float) arrayList.get(i6 + 1)).floatValue() < 0.0f) {
                        arrayList.set(i6 + 1, Float.valueOf(0.0f));
                    }
                }
                paint.setStyle(Style.FILL);
                m1935a(canvas, arrayList, paint, true);
            }
        }
        paint.setColor(c0311c.m2110a());
        paint.setStyle(Style.STROKE);
        m1935a(canvas, (List) list, paint, false);
        paint.setStrokeWidth(strokeWidth);
    }

    public void m1980a(Canvas canvas, C0311c c0311c, float f, float f2, int i, Paint paint) {
        canvas.drawLine(f, f2, f + 30.0f, f2, paint);
        if (m1981a(c0311c)) {
            this.f2082a.m2011a(canvas, c0311c, f + 5.0f, f2, i, paint);
        }
    }

    public boolean m1981a(C0311c c0311c) {
        return ((C0314f) c0311c).m2199s() != C0299j.POINT;
    }

    protected C0292d[] m1982a(List<Float> list, List<Double> list2, float f, int i, int i2) {
        int size = list.size();
        C0292d[] c0292dArr = new C0292d[(size / 2)];
        for (int i3 = 0; i3 < size; i3 += 2) {
            int D = this.c.m2062D();
            c0292dArr[i3 / 2] = new C0292d(new RectF(((Float) list.get(i3)).floatValue() - ((float) D), ((Float) list.get(i3 + 1)).floatValue() - ((float) D), ((float) D) + ((Float) list.get(i3)).floatValue(), ((Float) list.get(i3 + 1)).floatValue() + ((float) D)), ((Double) list2.get(i3)).doubleValue(), ((Double) list2.get(i3 + 1)).doubleValue());
        }
        return c0292dArr;
    }

    public C0300l h_() {
        return this.f2082a;
    }
}
