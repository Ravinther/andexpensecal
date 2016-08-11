package p018c.p019a.p020a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import java.util.List;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p021b.C0307e;
import p018c.p019a.p022c.C0311c;
import p018c.p019a.p022c.C0312d;

/* renamed from: c.a.a.b */
public class C0290b extends C0289n {
    protected C0291c f2075a;

    C0290b() {
        this.f2075a = C0291c.DEFAULT;
    }

    public C0290b(C0306d c0306d, C0312d c0312d, C0291c c0291c) {
        super(c0306d, c0312d);
        this.f2075a = C0291c.DEFAULT;
        this.f2075a = c0291c;
    }

    private int m1964a(int i, int i2, float f) {
        return Color.argb(Math.round((((float) Color.alpha(i)) * f) + ((1.0f - f) * ((float) Color.alpha(i2)))), Math.round((((float) Color.red(i)) * f) + ((1.0f - f) * ((float) Color.red(i2)))), Math.round((((float) Color.green(i)) * f) + ((1.0f - f) * ((float) Color.green(i2)))), Math.round((((float) Color.blue(i)) * f) + ((1.0f - f) * ((float) Color.blue(i2)))));
    }

    private void m1965a(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Paint paint) {
        C0311c a = this.c.m2068a(i2);
        if (a.m2121h()) {
            int i3;
            int i4;
            float f5 = (float) m1958a(new double[]{0.0d, a.m2124k()}, i)[1];
            float f6 = (float) m1958a(new double[]{0.0d, a.m2122i()}, i)[1];
            float max = Math.max(f5, Math.min(f2, f4));
            float min = Math.min(f6, Math.max(f2, f4));
            int l = a.m2125l();
            int j = a.m2123j();
            if (f2 < f5) {
                paint.setColor(l);
                canvas.drawRect((float) Math.round(f), (float) Math.round(f2), (float) Math.round(f3), (float) Math.round(max), paint);
                i3 = l;
            } else {
                i3 = m1964a(l, j, (f6 - max) / (f6 - f5));
            }
            if (f4 > f6) {
                paint.setColor(j);
                canvas.drawRect((float) Math.round(f), (float) Math.round(min), (float) Math.round(f3), (float) Math.round(f4), paint);
                i4 = j;
            } else {
                i4 = m1964a(j, l, (min - f5) / (f6 - f5));
            }
            GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{i4, i3});
            gradientDrawable.setBounds(Math.round(f), Math.round(max), Math.round(f3), Math.round(min));
            gradientDrawable.draw(canvas);
            return;
        }
        if (Math.abs(f2 - f4) < 1.0f) {
            f4 = f2 < f4 ? f2 + 1.0f : f2 - 1.0f;
        }
        canvas.drawRect((float) Math.round(f), (float) Math.round(f2), (float) Math.round(f3), (float) Math.round(f4), paint);
    }

    protected float m1966a() {
        return 1.0f;
    }

    protected float m1967a(List<Float> list, int i, int i2) {
        float Q = this.c.m2138Q();
        if (Q > 0.0f) {
            return Q / 2.0f;
        }
        Q = (((Float) list.get(i - 2)).floatValue() - ((Float) list.get(0)).floatValue()) / ((float) (i > 2 ? i - 2 : i));
        if (Q == 0.0f) {
            Q = 10.0f;
        }
        if (this.f2075a != C0291c.STACKED) {
            Q /= (float) i2;
        }
        return (float) (((double) Q) / (((double) m1966a()) * (1.0d + this.c.m2143V())));
    }

    public int m1968a(int i) {
        return 12;
    }

    protected void m1969a(Canvas canvas, float f, float f2, float f3, float f4, float f5, int i, int i2, Paint paint) {
        int a = this.b.m2027a(i2).m2033a();
        if (this.f2075a == C0291c.STACKED) {
            m1965a(canvas, f - f5, f4, f3 + f5, f2, a, i2, paint);
            return;
        }
        float f6 = (f - (((float) i) * f5)) + (((float) (i2 * 2)) * f5);
        m1965a(canvas, f6, f4, f6 + (2.0f * f5), f2, a, i2, paint);
    }

    public void m1970a(Canvas canvas, Paint paint, List<Float> list, C0311c c0311c, float f, int i, int i2) {
        int a = this.b.m2026a();
        int size = list.size();
        paint.setColor(c0311c.m2110a());
        paint.setStyle(Style.FILL);
        float a2 = m1967a((List) list, size, a);
        for (int i3 = 0; i3 < size; i3 += 2) {
            float floatValue = ((Float) list.get(i3)).floatValue();
            m1969a(canvas, floatValue, f, floatValue, ((Float) list.get(i3 + 1)).floatValue(), a2, a, i, paint);
        }
        paint.setColor(c0311c.m2110a());
    }

    protected void m1971a(Canvas canvas, C0307e c0307e, C0311c c0311c, Paint paint, List<Float> list, int i, int i2) {
        int a = this.b.m2026a();
        int size = list.size();
        float a2 = m1967a((List) list, size, a);
        for (int i3 = 0; i3 < size; i3 += 2) {
            double b = c0307e.m2037b((i3 / 2) + i2);
            if (!m1938a(b)) {
                float floatValue = ((Float) list.get(i3)).floatValue();
                if (this.f2075a == C0291c.DEFAULT) {
                    floatValue += (((float) (i * 2)) * a2) - ((((float) a) - 1.5f) * a2);
                }
                if (b >= 0.0d) {
                    m1951a(canvas, m1930a(c0311c.m2129p(), b), floatValue, ((Float) list.get(i3 + 1)).floatValue() - c0311c.m2119f(), paint, 0.0f);
                } else {
                    m1951a(canvas, m1930a(c0311c.m2129p(), b), floatValue, ((((Float) list.get(i3 + 1)).floatValue() + c0311c.m2117d()) + c0311c.m2119f()) - 3.0f, paint, 0.0f);
                }
            }
        }
    }

    public void m1972a(Canvas canvas, C0311c c0311c, float f, float f2, int i, Paint paint) {
        canvas.drawRect(f, f2 - 6.0f, f + 12.0f, f2 + 6.0f, paint);
    }

    protected C0292d[] m1973a(List<Float> list, List<Double> list2, float f, int i, int i2) {
        int a = this.b.m2026a();
        int size = list.size();
        C0292d[] c0292dArr = new C0292d[(size / 2)];
        float a2 = m1967a((List) list, size, a);
        for (int i3 = 0; i3 < size; i3 += 2) {
            float floatValue = ((Float) list.get(i3)).floatValue();
            float floatValue2 = ((Float) list.get(i3 + 1)).floatValue();
            if (this.f2075a == C0291c.STACKED) {
                c0292dArr[i3 / 2] = new C0292d(new RectF(floatValue - a2, Math.min(floatValue2, f), floatValue + a2, Math.max(floatValue2, f)), ((Double) list2.get(i3)).doubleValue(), ((Double) list2.get(i3 + 1)).doubleValue());
            } else {
                floatValue = (floatValue - (((float) a) * a2)) + (((float) (i * 2)) * a2);
                c0292dArr[i3 / 2] = new C0292d(new RectF(floatValue, Math.min(floatValue2, f), (2.0f * a2) + floatValue, Math.max(floatValue2, f)), ((Double) list2.get(i3)).doubleValue(), ((Double) list2.get(i3 + 1)).doubleValue());
            }
        }
        return c0292dArr;
    }

    protected boolean m1974b() {
        return true;
    }
}
