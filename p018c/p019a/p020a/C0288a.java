package p018c.p019a.p020a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;
import p018c.p019a.p021b.C0304b;
import p018c.p019a.p021b.C0305c;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p022c.C0311c;
import p018c.p019a.p022c.C0312d;
import p018c.p019a.p022c.C0313e;

/* renamed from: c.a.a.a */
public abstract class C0288a implements Serializable {
    private String m1924a(String str, float f, Paint paint) {
        int length = str.length();
        int i = 0;
        String str2 = str;
        while (paint.measureText(str2) > f && i < length) {
            i++;
            str2 = str.substring(0, length - i) + "...";
        }
        return i == length ? "..." : str2;
    }

    private static float[] m1925a(float f, float f2, float f3, float f4, int i, int i2) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        if (f2 > ((float) i)) {
            f5 = (f4 - f2) / (f3 - f);
            f6 = ((((float) i) - f2) + (f5 * f)) / f5;
            f7 = (float) i;
            if (f6 < 0.0f) {
                f7 = f2 - (f5 * f);
                f6 = 0.0f;
            } else if (f6 > ((float) i2)) {
                f6 = (float) i2;
                f7 = ((((float) i2) * f5) + f2) - (f5 * f);
            }
            f5 = f7;
            f8 = f6;
        } else if (f2 < 0.0f) {
            f5 = (f4 - f2) / (f3 - f);
            f7 = ((-f2) + (f5 * f)) / f5;
            if (f7 < 0.0f) {
                f7 = f2 - (f5 * f);
                f6 = 0.0f;
            } else if (f7 > ((float) i2)) {
                f6 = (float) i2;
                f7 = ((((float) i2) * f5) + f2) - (f5 * f);
            } else {
                f6 = f7;
                f7 = 0.0f;
            }
            f5 = f7;
            f8 = f6;
        } else {
            f5 = f2;
            f8 = f;
        }
        if (f4 > ((float) i)) {
            float f10 = (f4 - f2) / (f3 - f);
            f6 = ((((float) i) - f2) + (f10 * f)) / f10;
            f7 = (float) i;
            if (f6 < 0.0f) {
                f7 = f2 - (f10 * f);
            } else if (f6 > ((float) i2)) {
                f9 = (float) i2;
                f7 = ((((float) i2) * f10) + f2) - (f10 * f);
            } else {
                f9 = f6;
            }
        } else if (f4 < 0.0f) {
            f6 = (f4 - f2) / (f3 - f);
            f7 = ((-f2) + (f6 * f)) / f6;
            if (f7 < 0.0f) {
                f7 = 0.0f;
                f9 = f2 - (f6 * f);
            } else if (f7 > ((float) i2)) {
                f7 = (float) i2;
                f9 = ((((float) i2) * f6) + f2) - (f6 * f);
            }
            float f11 = f9;
            f9 = f7;
            f7 = f11;
        } else {
            f7 = f4;
            f9 = f3;
        }
        return new float[]{f8, f5, f9, f7};
    }

    public abstract int m1926a(int i);

    protected int m1927a(Canvas canvas, C0310b c0310b, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, Paint paint, boolean z) {
        float f = 32.0f;
        if (c0310b.m2098o()) {
            float f2 = (float) i;
            float f3 = ((float) ((i3 + i5) - i6)) + 32.0f;
            paint.setTextAlign(Align.LEFT);
            paint.setTextSize(c0310b.m2103t());
            int min = Math.min(strArr.length, c0310b.m2078c());
            int i7 = 0;
            while (i7 < min) {
                float f4;
                C0311c a = c0310b.m2068a(i7);
                float a2 = (float) m1926a(i7);
                if (a.m2126m()) {
                    String str = strArr[i7];
                    if (strArr.length == c0310b.m2078c()) {
                        paint.setColor(a.m2110a());
                    } else {
                        paint.setColor(-3355444);
                    }
                    float[] fArr = new float[str.length()];
                    paint.getTextWidths(str, fArr);
                    float f5 = 0.0f;
                    for (float f6 : fArr) {
                        f5 += f6;
                    }
                    float f7 = (10.0f + a2) + f5;
                    float f8 = f2 + f7;
                    if (i7 <= 0 || !m1939a(f8, c0310b, i2, i4)) {
                        f4 = f;
                    } else {
                        f2 = (float) i;
                        f3 += c0310b.m2103t();
                        f8 = f2 + f7;
                        f4 = f + c0310b.m2103t();
                    }
                    if (m1939a(f8, c0310b, i2, i4)) {
                        f8 = ((((float) i2) - f2) - a2) - 10.0f;
                        if (m1940a(c0310b)) {
                            f8 = ((((float) i4) - f2) - a2) - 10.0f;
                        }
                        str = str.substring(0, paint.breakText(str, true, f8, fArr)) + "...";
                    }
                    if (!z) {
                        m1932a(canvas, a, f2, f3, i7, paint);
                        m1933a(canvas, str, (f2 + a2) + 5.0f, f3 + 5.0f, paint);
                    }
                    f2 += f7;
                } else {
                    f4 = f;
                }
                i7++;
                f = f4;
            }
        }
        return Math.round(c0310b.m2103t() + f);
    }

    protected int m1928a(C0310b c0310b, int i, float f) {
        int E = c0310b.m2063E();
        if (!(c0310b.m2098o() && E == 0)) {
            i = E;
        }
        return (c0310b.m2098o() || !c0310b.m2094k()) ? i : (int) (((c0310b.m2092i() * 4.0f) / 3.0f) + f);
    }

    public C0305c m1929a(C0304b c0304b) {
        return null;
    }

    protected String m1930a(NumberFormat numberFormat, double d) {
        String str = "";
        return numberFormat != null ? numberFormat.format(d) : d == ((double) Math.round(d)) ? Math.round(d) + "" : d + "";
    }

    public abstract void m1931a(Canvas canvas, int i, int i2, int i3, int i4, Paint paint);

    public abstract void m1932a(Canvas canvas, C0311c c0311c, float f, float f2, int i, Paint paint);

    protected void m1933a(Canvas canvas, String str, float f, float f2, Paint paint) {
        if (str != null) {
            String[] split = str.split("\n");
            Rect rect = new Rect();
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                canvas.drawText(split[i2], f, ((float) i) + f2, paint);
                paint.getTextBounds(split[i2], 0, split[i2].length(), rect);
                i = (i + rect.height()) + 5;
            }
        }
    }

    protected void m1934a(Canvas canvas, String str, C0310b c0310b, List<RectF> list, int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, int i5, Paint paint, boolean z, boolean z2) {
        if (c0310b.m2094k() || z2) {
            int size;
            paint.setColor(i5);
            double toRadians = Math.toRadians((double) (90.0f - ((f4 / 2.0f) + f3)));
            double sin = Math.sin(toRadians);
            toRadians = Math.cos(toRadians);
            int round = Math.round(((float) i) + ((float) (((double) f) * sin)));
            int round2 = Math.round(((float) i2) + ((float) (((double) f) * toRadians)));
            int round3 = Math.round(((float) (sin * ((double) f2))) + ((float) i));
            int round4 = Math.round(((float) (toRadians * ((double) f2))) + ((float) i2));
            float i6 = c0310b.m2092i();
            float max = Math.max(i6 / 2.0f, 10.0f);
            paint.setTextAlign(Align.LEFT);
            if (round > round3) {
                max = -max;
                paint.setTextAlign(Align.RIGHT);
            }
            float f5 = max;
            float f6 = ((float) round3) + f5;
            float f7 = (float) round4;
            max = ((float) i4) - f6;
            if (round > round3) {
                max = f6 - ((float) i3);
            }
            String a = m1924a(str, max, paint);
            float measureText = paint.measureText(a);
            Object obj = null;
            while (obj == null && z) {
                Object obj2 = null;
                size = list.size();
                int i7 = 0;
                float f8 = f7;
                while (i7 < size && obj2 == null) {
                    float max2;
                    RectF rectF = (RectF) list.get(i7);
                    if (rectF.intersects(f6, f8, f6 + measureText, f8 + i6)) {
                        max2 = Math.max(f8, rectF.bottom);
                        obj = 1;
                    } else {
                        obj = obj2;
                        max2 = f8;
                    }
                    i7++;
                    f8 = max2;
                    obj2 = obj;
                }
                obj = obj2 == null ? 1 : null;
                f7 = f8;
            }
            if (z) {
                size = (int) (f7 - (i6 / 2.0f));
                canvas.drawLine((float) round, (float) round2, (float) round3, (float) size, paint);
                canvas.drawLine((float) round3, (float) size, ((float) round3) + f5, (float) size, paint);
            } else {
                paint.setTextAlign(Align.CENTER);
            }
            canvas.drawText(a, f6, f7, paint);
            if (z) {
                list.add(new RectF(f6, f7, f6 + measureText, f7 + i6));
            }
        }
    }

    protected void m1935a(Canvas canvas, List<Float> list, Paint paint, boolean z) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (list.size() >= 4) {
            float[] a = C0288a.m1925a(((Float) list.get(0)).floatValue(), ((Float) list.get(1)).floatValue(), ((Float) list.get(2)).floatValue(), ((Float) list.get(3)).floatValue(), height, width);
            path.moveTo(a[0], a[1]);
            path.lineTo(a[2], a[3]);
            int size = list.size();
            int i = 4;
            while (i < size) {
                if ((((Float) list.get(i - 1)).floatValue() >= 0.0f || ((Float) list.get(i + 1)).floatValue() >= 0.0f) && (((Float) list.get(i - 1)).floatValue() <= ((float) height) || ((Float) list.get(i + 1)).floatValue() <= ((float) height))) {
                    a = C0288a.m1925a(((Float) list.get(i - 2)).floatValue(), ((Float) list.get(i - 1)).floatValue(), ((Float) list.get(i)).floatValue(), ((Float) list.get(i + 1)).floatValue(), height, width);
                    if (!z) {
                        path.moveTo(a[0], a[1]);
                    }
                    path.lineTo(a[2], a[3]);
                }
                i += 2;
            }
            if (z) {
                path.lineTo(((Float) list.get(0)).floatValue(), ((Float) list.get(1)).floatValue());
            }
            canvas.drawPath(path, paint);
        }
    }

    protected void m1936a(Canvas canvas, float[] fArr, Paint paint, boolean z) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (fArr.length >= 4) {
            float[] a = C0288a.m1925a(fArr[0], fArr[1], fArr[2], fArr[3], height, width);
            path.moveTo(a[0], a[1]);
            path.lineTo(a[2], a[3]);
            int length = fArr.length;
            int i = 4;
            while (i < length) {
                if ((fArr[i - 1] >= 0.0f || fArr[i + 1] >= 0.0f) && (fArr[i - 1] <= ((float) height) || fArr[i + 1] <= ((float) height))) {
                    a = C0288a.m1925a(fArr[i - 2], fArr[i - 1], fArr[i], fArr[i + 1], height, width);
                    if (!z) {
                        path.moveTo(a[0], a[1]);
                    }
                    path.lineTo(a[2], a[3]);
                }
                i += 2;
            }
            if (z) {
                path.lineTo(fArr[0], fArr[1]);
            }
            canvas.drawPath(path, paint);
        }
    }

    protected void m1937a(C0310b c0310b, Canvas canvas, int i, int i2, int i3, int i4, Paint paint, boolean z, int i5) {
        if (c0310b.m2087f() || z) {
            if (z) {
                paint.setColor(i5);
            } else {
                paint.setColor(c0310b.m2084e());
            }
            paint.setStyle(Style.FILL);
            Canvas canvas2 = canvas;
            canvas2.drawRect((float) i, (float) i2, (float) (i + i3), (float) (i2 + i4), paint);
        }
    }

    public boolean m1938a(double d) {
        return Double.isNaN(d) || Double.isInfinite(d) || d == Double.MAX_VALUE;
    }

    protected boolean m1939a(float f, C0310b c0310b, int i, int i2) {
        return m1940a(c0310b) ? f > ((float) i2) : f > ((float) i);
    }

    public boolean m1940a(C0310b c0310b) {
        return (c0310b instanceof C0312d) && ((C0312d) c0310b).m2131J() == C0313e.VERTICAL;
    }
}
