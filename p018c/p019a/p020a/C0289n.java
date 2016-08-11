package p018c.p019a.p020a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p018c.p019a.p021b.C0304b;
import p018c.p019a.p021b.C0305c;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p021b.C0307e;
import p018c.p019a.p022c.C0309a;
import p018c.p019a.p022c.C0311c;
import p018c.p019a.p022c.C0312d;
import p018c.p019a.p022c.C0313e;
import p018c.p019a.p024e.C0327b;

/* renamed from: c.a.a.n */
public abstract class C0289n extends C0288a {
    private float f2067a;
    protected C0306d f2068b;
    protected C0312d f2069c;
    private float f2070d;
    private C0304b f2071e;
    private Rect f2072f;
    private final Map<Integer, double[]> f2073g;
    private Map<Integer, List<C0292d>> f2074h;

    protected C0289n() {
        this.f2073g = new HashMap();
        this.f2074h = new HashMap();
    }

    public C0289n(C0306d c0306d, C0312d c0312d) {
        this.f2073g = new HashMap();
        this.f2074h = new HashMap();
        this.f2068b = c0306d;
        this.f2069c = c0312d;
    }

    private int m1941a(Align align) {
        return align == Align.LEFT ? -4 : 4;
    }

    private List<Double> m1942a(List<Double> list) {
        List<Double> arrayList = new ArrayList(list);
        for (Double d : list) {
            if (d.isNaN()) {
                arrayList.remove(d);
            }
        }
        return arrayList;
    }

    private void m1943a(Canvas canvas, float f, boolean z) {
        if (z) {
            canvas.scale(1.0f / this.f2067a, this.f2067a);
            canvas.translate(this.f2070d, -this.f2070d);
            canvas.rotate(-f, this.f2071e.m2024a(), this.f2071e.m2025b());
            return;
        }
        canvas.rotate(f, this.f2071e.m2024a(), this.f2071e.m2025b());
        canvas.translate(-this.f2070d, this.f2070d);
        canvas.scale(this.f2067a, 1.0f / this.f2067a);
    }

    private void m1944a(Cap cap, Join join, float f, Style style, PathEffect pathEffect, Paint paint) {
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f);
        paint.setPathEffect(pathEffect);
        paint.setStyle(style);
    }

    public C0305c m1945a(C0304b c0304b) {
        if (this.f2074h != null) {
            for (int size = this.f2074h.size() - 1; size >= 0; size--) {
                int i = 0;
                if (this.f2074h.get(Integer.valueOf(size)) != null) {
                    for (C0292d c0292d : (List) this.f2074h.get(Integer.valueOf(size))) {
                        if (c0292d != null) {
                            RectF a = c0292d.m1975a();
                            if (a != null && a.contains(c0304b.m2024a(), c0304b.m2025b())) {
                                return new C0305c(size, i, c0292d.m1976b(), c0292d.m1977c());
                            }
                        }
                        i++;
                    }
                    continue;
                }
            }
        }
        return super.m1929a(c0304b);
    }

    protected List<Double> m1946a(double d, double d2, int i) {
        return C0327b.m2226a(d, d2, i);
    }

    protected Map<Integer, List<Double>> m1947a(double[] dArr, double[] dArr2, int i) {
        Map<Integer, List<Double>> hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            hashMap.put(Integer.valueOf(i2), m1942a(C0327b.m2226a(dArr[i2], dArr2[i2], this.f2069c.m2137P())));
        }
        return hashMap;
    }

    public void m1948a(Canvas canvas, int i, int i2, int i3, int i4, Paint paint) {
        int i5;
        int i6;
        int i7;
        paint.setAntiAlias(this.f2069c.m2104u());
        int a = m1928a(this.f2069c, i4 / 5, this.f2069c.m2134M());
        int[] F = this.f2069c.m2064F();
        int i8 = i + F[1];
        int i9 = i2 + F[0];
        int i10 = (i + i3) - F[3];
        int a2 = this.f2068b.m2026a();
        String[] strArr = new String[a2];
        for (i5 = 0; i5 < a2; i5++) {
            strArr[i5] = this.f2068b.m2027a(i5).m2038b();
        }
        int a3 = (this.f2069c.m2099p() && this.f2069c.m2098o()) ? m1927a(canvas, this.f2069c, strArr, i8, i10, i2, i3, i4, a, paint, true) : a;
        i5 = ((i2 + i4) - F[2]) - a3;
        if (this.f2072f == null) {
            this.f2072f = new Rect();
        }
        this.f2072f.set(i8, i9, i10, i5);
        m1937a(this.f2069c, canvas, i, i2, i3, i4, paint, false, 0);
        if (paint.getTypeface() == null || !((this.f2069c.m2102s() == null || !paint.getTypeface().equals(this.f2069c.m2102s())) && paint.getTypeface().toString().equals(this.f2069c.m2100q()) && paint.getTypeface().getStyle() == this.f2069c.m2101r())) {
            if (this.f2069c.m2102s() != null) {
                paint.setTypeface(this.f2069c.m2102s());
            } else {
                paint.setTypeface(Typeface.create(this.f2069c.m2100q(), this.f2069c.m2101r()));
            }
        }
        C0313e J = this.f2069c.m2131J();
        if (J == C0313e.VERTICAL) {
            i6 = i5 + (a3 - 20);
            i7 = i10 - a3;
        } else {
            i6 = i5;
            i7 = i10;
        }
        int a4 = J.m2194a();
        Object obj = a4 == 90 ? 1 : null;
        this.f2067a = ((float) i4) / ((float) i3);
        this.f2070d = (float) (Math.abs(i3 - i4) / 2);
        if (this.f2067a < 1.0f) {
            this.f2070d *= -1.0f;
        }
        this.f2071e = new C0304b((float) ((i + i3) / 2), (float) ((i2 + i4) / 2));
        if (obj != null) {
            m1943a(canvas, (float) a4, false);
        }
        int i11 = -2147483647;
        for (i5 = 0; i5 < a2; i5++) {
            i11 = Math.max(i11, this.f2068b.m2027a(i5).m2033a());
        }
        int i12 = i11 + 1;
        if (i12 >= 0) {
            List arrayList;
            double[] dArr = new double[i12];
            double[] dArr2 = new double[i12];
            double[] dArr3 = new double[i12];
            double[] dArr4 = new double[i12];
            boolean[] zArr = new boolean[i12];
            boolean[] zArr2 = new boolean[i12];
            boolean[] zArr3 = new boolean[i12];
            boolean[] zArr4 = new boolean[i12];
            for (i5 = 0; i5 < i12; i5++) {
                dArr[i5] = this.f2069c.m2173g(i5);
                dArr2[i5] = this.f2069c.m2176i(i5);
                dArr3[i5] = this.f2069c.m2179k(i5);
                dArr4[i5] = this.f2069c.m2181m(i5);
                zArr[i5] = this.f2069c.m2175h(i5);
                zArr2[i5] = this.f2069c.m2178j(i5);
                zArr3[i5] = this.f2069c.m2180l(i5);
                zArr4[i5] = this.f2069c.m2182n(i5);
                if (this.f2073g.get(Integer.valueOf(i5)) == null) {
                    this.f2073g.put(Integer.valueOf(i5), new double[4]);
                }
            }
            double[] dArr5 = new double[i12];
            double[] dArr6 = new double[i12];
            for (i11 = 0; i11 < a2; i11++) {
                C0307e a5 = this.f2068b.m2027a(i11);
                a = a5.m2033a();
                if (a5.m2043e() != 0) {
                    if (!zArr[a]) {
                        dArr[a] = Math.min(dArr[a], a5.m2045f());
                        ((double[]) this.f2073g.get(Integer.valueOf(a)))[0] = dArr[a];
                    }
                    if (!zArr2[a]) {
                        dArr2[a] = Math.max(dArr2[a], a5.m2047h());
                        ((double[]) this.f2073g.get(Integer.valueOf(a)))[1] = dArr2[a];
                    }
                    if (!zArr3[a]) {
                        dArr3[a] = Math.min(dArr3[a], (double) ((float) a5.m2046g()));
                        ((double[]) this.f2073g.get(Integer.valueOf(a)))[2] = dArr3[a];
                    }
                    if (!zArr4[a]) {
                        dArr4[a] = Math.max(dArr4[a], (double) ((float) a5.m2048i()));
                        ((double[]) this.f2073g.get(Integer.valueOf(a)))[3] = dArr4[a];
                    }
                }
            }
            for (i5 = 0; i5 < i12; i5++) {
                if (dArr2[i5] - dArr[i5] != 0.0d) {
                    dArr5[i5] = ((double) (i7 - i8)) / (dArr2[i5] - dArr[i5]);
                }
                if (dArr4[i5] - dArr3[i5] != 0.0d) {
                    dArr6[i5] = (double) ((float) (((double) (i6 - i9)) / (dArr4[i5] - dArr3[i5])));
                }
            }
            Object obj2 = null;
            this.f2074h = new HashMap();
            for (int i13 = 0; i13 < a2; i13++) {
                C0307e a6 = this.f2068b.m2027a(i13);
                int a7 = a6.m2033a();
                if (a6.m2043e() != 0) {
                    C0311c a8 = this.f2069c.m2068a(i13);
                    arrayList = new ArrayList();
                    List arrayList2 = new ArrayList();
                    float min = Math.min((float) i6, (float) (((double) i6) + (dArr6[a7] * dArr3[a7])));
                    LinkedList linkedList = new LinkedList();
                    this.f2074h.put(Integer.valueOf(i13), linkedList);
                    synchronized (a6) {
                        int i14 = -1;
                        for (Entry entry : a6.m2035a(dArr[a7], dArr2[a7], a8.m2128o()).entrySet()) {
                            double doubleValue = ((Double) entry.getKey()).doubleValue();
                            double doubleValue2 = ((Double) entry.getValue()).doubleValue();
                            if (i14 < 0 && (!m1938a(doubleValue2) || m1960b())) {
                                i14 = a6.m2034a(doubleValue);
                            }
                            arrayList2.add(entry.getKey());
                            arrayList2.add(entry.getValue());
                            if (!m1938a(doubleValue2)) {
                                arrayList.add(Float.valueOf((float) (((double) i8) + ((doubleValue - dArr[a7]) * dArr5[a7]))));
                                arrayList.add(Float.valueOf((float) (((double) i6) - (dArr6[a7] * (doubleValue2 - dArr3[a7])))));
                            } else if (m1960b()) {
                                arrayList.add(Float.valueOf((float) (((double) i8) + ((doubleValue - dArr[a7]) * dArr5[a7]))));
                                arrayList.add(Float.valueOf((float) (((double) i6) - (dArr6[a7] * (-dArr3[a7])))));
                            } else {
                                if (arrayList.size() > 0) {
                                    m1952a(a6, canvas, paint, arrayList, a8, min, i13, J, i14);
                                    linkedList.addAll(Arrays.asList(m1959a(arrayList, arrayList2, min, i13, i14)));
                                    arrayList.clear();
                                    arrayList2.clear();
                                    i14 = -1;
                                }
                                linkedList.add(null);
                            }
                        }
                        i11 = a6.m2042d();
                        if (i11 > 0) {
                            paint.setColor(this.f2069c.m2090h());
                            Rect rect = new Rect();
                            for (i5 = 0; i5 < i11; i5++) {
                                float c = (float) (((double) i8) + (dArr5[a7] * (a6.m2040c(i5) - dArr[a7])));
                                float d = (float) (((double) i6) - (dArr6[a7] * (a6.m2041d(i5) - dArr3[a7])));
                                paint.getTextBounds(a6.m2044e(i5), 0, a6.m2044e(i5).length(), rect);
                                if (c < ((float) rect.width()) + c && d < ((float) canvas.getHeight())) {
                                    m1933a(canvas, a6.m2044e(i5), c, d, paint);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            m1952a(a6, canvas, paint, arrayList, a8, min, i13, J, i14);
                            linkedList.addAll(Arrays.asList(m1959a(arrayList, arrayList2, min, i13, i14)));
                        }
                    }
                    i5 = 1;
                }
            }
            m1937a(this.f2069c, canvas, i, i6, i3, i4 - i6, paint, true, this.f2069c.m2144W());
            m1937a(this.f2069c, canvas, i, i2, i3, F[0], paint, true, this.f2069c.m2144W());
            if (J == C0313e.HORIZONTAL) {
                m1937a(this.f2069c, canvas, i, i2, i8 - i, i4 - i2, paint, true, this.f2069c.m2144W());
                m1937a(this.f2069c, canvas, i7, i2, F[3], i4 - i2, paint, true, this.f2069c.m2144W());
            } else if (J == C0313e.VERTICAL) {
                m1937a(this.f2069c, canvas, i7, i2, i3 - i7, i4 - i2, paint, true, this.f2069c.m2144W());
                m1937a(this.f2069c, canvas, i, i2, i8 - i, i4 - i2, paint, true, this.f2069c.m2144W());
            }
            obj2 = (!this.f2069c.m2094k() || obj2 == null) ? null : 1;
            boolean l = this.f2069c.m2095l();
            boolean n = this.f2069c.m2097n();
            if (obj2 != null || l) {
                arrayList = m1942a(m1946a(dArr[0], dArr2[0], this.f2069c.m2135N()));
                Map a9 = m1947a(dArr3, dArr4, i12);
                if (obj2 != null) {
                    paint.setColor(this.f2069c.ae());
                    paint.setTextSize(this.f2069c.m2092i());
                    paint.setTextAlign(this.f2069c.af());
                }
                m1953a(arrayList, this.f2069c.m2136O(), canvas, paint, i8, i9, i6, dArr5[0], dArr[0], dArr2[0]);
                m1954a(a9, canvas, paint, i12, i8, i7, i6, dArr6, dArr3);
                if (obj2 != null) {
                    paint.setColor(this.f2069c.m2090h());
                    int i15 = 0;
                    while (i15 < i12) {
                        Align x = this.f2069c.m2192x(i15);
                        for (Double d2 : this.f2069c.m2184p(i15)) {
                            if (dArr3[i15] <= d2.doubleValue() && d2.doubleValue() <= dArr4[i15]) {
                                float doubleValue3 = (float) (((double) i6) - (dArr6[i15] * (d2.doubleValue() - dArr3[i15])));
                                String a10 = this.f2069c.m2149a(d2, i15);
                                paint.setColor(this.f2069c.m2189u(i15));
                                paint.setTextAlign(this.f2069c.m2191w(i15));
                                if (J == C0313e.HORIZONTAL) {
                                    if (x == Align.LEFT) {
                                        canvas.drawLine((float) (m1941a(x) + i8), doubleValue3, (float) i8, doubleValue3, paint);
                                        m1951a(canvas, a10, (float) i8, doubleValue3 - this.f2069c.ai(), paint, this.f2069c.ab());
                                    } else {
                                        canvas.drawLine((float) i7, doubleValue3, (float) (m1941a(x) + i7), doubleValue3, paint);
                                        m1951a(canvas, a10, (float) i7, doubleValue3 - this.f2069c.ai(), paint, this.f2069c.ab());
                                    }
                                    if (n) {
                                        paint.setColor(this.f2069c.m2145X());
                                        canvas.drawLine((float) i8, doubleValue3, (float) i7, doubleValue3, paint);
                                    }
                                } else {
                                    canvas.drawLine((float) (i7 - m1941a(x)), doubleValue3, (float) i7, doubleValue3, paint);
                                    m1951a(canvas, a10, (float) (i7 + 10), doubleValue3 - this.f2069c.ai(), paint, this.f2069c.ab());
                                    if (n) {
                                        paint.setColor(this.f2069c.m2145X());
                                        canvas.drawLine((float) i7, doubleValue3, (float) i8, doubleValue3, paint);
                                    }
                                }
                            }
                        }
                        i15++;
                    }
                }
                if (obj2 != null) {
                    paint.setColor(this.f2069c.m2090h());
                    float M = this.f2069c.m2134M();
                    paint.setTextSize(M);
                    paint.setTextAlign(Align.CENTER);
                    if (J == C0313e.HORIZONTAL) {
                        m1951a(canvas, this.f2069c.m2132K(), (float) ((i3 / 2) + i), ((((float) i6) + ((this.f2069c.m2092i() * 4.0f) / 3.0f)) + this.f2069c.ag()) + M, paint, 0.0f);
                        for (i5 = 0; i5 < i12; i5++) {
                            if (this.f2069c.m2192x(i5) == Align.LEFT) {
                                m1951a(canvas, this.f2069c.m2171f(i5), ((float) i) + M, (float) ((i4 / 2) + i2), paint, -90.0f);
                            } else {
                                m1951a(canvas, this.f2069c.m2171f(i5), (float) (i + i3), (float) ((i4 / 2) + i2), paint, -90.0f);
                            }
                        }
                        paint.setTextSize(this.f2069c.m2074b());
                        m1951a(canvas, this.f2069c.m2069a(), (float) ((i3 / 2) + i), ((float) i2) + this.f2069c.m2074b(), paint, 0.0f);
                    } else if (J == C0313e.VERTICAL) {
                        m1951a(canvas, this.f2069c.m2132K(), (float) ((i3 / 2) + i), (((float) (i2 + i4)) - M) + this.f2069c.ag(), paint, -90.0f);
                        m1951a(canvas, this.f2069c.m2133L(), (float) (i7 + 20), (float) ((i4 / 2) + i2), paint, 0.0f);
                        paint.setTextSize(this.f2069c.m2074b());
                        m1951a(canvas, this.f2069c.m2069a(), ((float) i) + M, (float) ((i4 / 2) + i9), paint, 0.0f);
                    }
                }
            }
            if (J == C0313e.HORIZONTAL) {
                m1927a(canvas, this.f2069c, strArr, i8, i7, i2 + ((int) this.f2069c.ag()), i3, i4, a3, paint, false);
            } else if (J == C0313e.VERTICAL) {
                m1943a(canvas, (float) a4, true);
                m1927a(canvas, this.f2069c, strArr, i8, i7, i2 + ((int) this.f2069c.ag()), i3, i4, a3, paint, false);
                m1943a(canvas, (float) a4, false);
            }
            if (this.f2069c.m2093j()) {
                paint.setColor(this.f2069c.m2088g());
                canvas.drawLine((float) i8, (float) i6, (float) i7, (float) i6, paint);
                Object obj3 = null;
                i11 = 0;
                while (i11 < i12 && obj3 == null) {
                    obj2 = this.f2069c.m2192x(i11) == Align.RIGHT ? 1 : null;
                    i11++;
                    obj3 = obj2;
                }
                if (J == C0313e.HORIZONTAL) {
                    canvas.drawLine((float) i8, (float) i9, (float) i8, (float) i6, paint);
                    if (obj3 != null) {
                        canvas.drawLine((float) i7, (float) i9, (float) i7, (float) i6, paint);
                    }
                } else if (J == C0313e.VERTICAL) {
                    canvas.drawLine((float) i7, (float) i9, (float) i7, (float) i6, paint);
                }
            }
            if (obj != null) {
                m1943a(canvas, (float) a4, true);
            }
        }
    }

    public abstract void m1949a(Canvas canvas, Paint paint, List<Float> list, C0311c c0311c, float f, int i, int i2);

    protected void m1950a(Canvas canvas, C0307e c0307e, C0311c c0311c, Paint paint, List<Float> list, int i, int i2) {
        int i3;
        if (list.size() > 1) {
            float floatValue = ((Float) list.get(0)).floatValue();
            float floatValue2 = ((Float) list.get(1)).floatValue();
            i3 = 0;
            while (i3 < list.size()) {
                if (i3 == 2) {
                    if (Math.abs(((Float) list.get(2)).floatValue() - ((Float) list.get(0)).floatValue()) > ((float) c0311c.m2116c()) || Math.abs(((Float) list.get(3)).floatValue() - ((Float) list.get(1)).floatValue()) > ((float) c0311c.m2116c())) {
                        m1951a(canvas, m1930a(c0311c.m2129p(), c0307e.m2037b(i2)), ((Float) list.get(0)).floatValue(), ((Float) list.get(1)).floatValue() - c0311c.m2119f(), paint, 0.0f);
                        m1951a(canvas, m1930a(c0311c.m2129p(), c0307e.m2037b(i2 + 1)), ((Float) list.get(2)).floatValue(), ((Float) list.get(3)).floatValue() - c0311c.m2119f(), paint, 0.0f);
                        floatValue = ((Float) list.get(2)).floatValue();
                        floatValue2 = ((Float) list.get(3)).floatValue();
                    }
                } else if (i3 > 2 && (Math.abs(((Float) list.get(i3)).floatValue() - r2) > ((float) c0311c.m2116c()) || Math.abs(((Float) list.get(i3 + 1)).floatValue() - r1) > ((float) c0311c.m2116c()))) {
                    m1951a(canvas, m1930a(c0311c.m2129p(), c0307e.m2037b((i3 / 2) + i2)), ((Float) list.get(i3)).floatValue(), ((Float) list.get(i3 + 1)).floatValue() - c0311c.m2119f(), paint, 0.0f);
                    floatValue = ((Float) list.get(i3)).floatValue();
                    floatValue2 = ((Float) list.get(i3 + 1)).floatValue();
                }
                i3 += 2;
            }
            return;
        }
        for (i3 = 0; i3 < list.size(); i3 += 2) {
            m1951a(canvas, m1930a(c0311c.m2129p(), c0307e.m2037b((i3 / 2) + i2)), ((Float) list.get(i3)).floatValue(), ((Float) list.get(i3 + 1)).floatValue() - c0311c.m2119f(), paint, 0.0f);
        }
    }

    protected void m1951a(Canvas canvas, String str, float f, float f2, Paint paint, float f3) {
        float f4 = ((float) (-this.f2069c.m2131J().m2194a())) + f3;
        if (f4 != 0.0f) {
            canvas.rotate(f4, f, f2);
        }
        m1933a(canvas, str, f, f2, paint);
        if (f4 != 0.0f) {
            canvas.rotate(-f4, f, f2);
        }
    }

    protected void m1952a(C0307e c0307e, Canvas canvas, Paint paint, List<Float> list, C0311c c0311c, float f, int i, C0313e c0313e, int i2) {
        C0309a g = c0311c.m2120g();
        Cap strokeCap = paint.getStrokeCap();
        Join strokeJoin = paint.getStrokeJoin();
        float strokeMiter = paint.getStrokeMiter();
        PathEffect pathEffect = paint.getPathEffect();
        Style style = paint.getStyle();
        if (g != null) {
            PathEffect pathEffect2 = null;
            if (g.m2057d() != null) {
                pathEffect2 = new DashPathEffect(g.m2057d(), g.m2058e());
            }
            m1944a(g.m2054a(), g.m2055b(), g.m2056c(), Style.FILL_AND_STROKE, pathEffect2, paint);
        }
        m1949a(canvas, paint, (List) list, c0311c, f, i, i2);
        if (m1956a(c0311c)) {
            C0300l h_ = h_();
            if (h_ != null) {
                h_.m2010a(canvas, paint, list, c0311c, f, i, i2);
            }
        }
        paint.setTextSize(c0311c.m2117d());
        if (c0313e == C0313e.HORIZONTAL) {
            paint.setTextAlign(Align.CENTER);
        } else {
            paint.setTextAlign(Align.LEFT);
        }
        if (c0311c.m2115b()) {
            paint.setTextAlign(c0311c.m2118e());
            m1950a(canvas, c0307e, c0311c, paint, (List) list, i, i2);
        }
        if (g != null) {
            m1944a(strokeCap, strokeJoin, strokeMiter, style, pathEffect, paint);
        }
    }

    protected void m1953a(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i, int i2, int i3, double d, double d2, double d3) {
        int size = list.size();
        boolean k = this.f2069c.m2094k();
        boolean m = this.f2069c.m2096m();
        for (int i4 = 0; i4 < size; i4++) {
            double doubleValue = ((Double) list.get(i4)).doubleValue();
            float f = (float) (((double) i) + ((doubleValue - d2) * d));
            if (k) {
                paint.setColor(this.f2069c.ae());
                canvas.drawLine(f, (float) i3, f, ((float) i3) + (this.f2069c.m2092i() / 3.0f), paint);
                m1951a(canvas, m1930a(this.f2069c.aj(), doubleValue), f, (((float) i3) + ((this.f2069c.m2092i() * 4.0f) / 3.0f)) + this.f2069c.ag(), paint, this.f2069c.aa());
            }
            if (m) {
                paint.setColor(this.f2069c.m2145X());
                canvas.drawLine(f, (float) i3, f, (float) i2, paint);
            }
        }
        m1955a(dArr, canvas, paint, k, i, i2, i3, d, d2, d3);
    }

    protected void m1954a(Map<Integer, List<Double>> map, Canvas canvas, Paint paint, int i, int i2, int i3, int i4, double[] dArr, double[] dArr2) {
        C0313e J = this.f2069c.m2131J();
        boolean l = this.f2069c.m2095l();
        boolean k = this.f2069c.m2094k();
        for (int i5 = 0; i5 < i; i5++) {
            paint.setTextAlign(this.f2069c.m2191w(i5));
            List list = (List) map.get(Integer.valueOf(i5));
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                double doubleValue = ((Double) list.get(i6)).doubleValue();
                Align x = this.f2069c.m2192x(i5);
                Object obj = this.f2069c.m2149a(Double.valueOf(doubleValue), i5) != null ? 1 : null;
                float f = (float) (((double) i4) - (dArr[i5] * (doubleValue - dArr2[i5])));
                if (J == C0313e.HORIZONTAL) {
                    if (k && obj == null) {
                        paint.setColor(this.f2069c.m2189u(i5));
                        if (x == Align.LEFT) {
                            canvas.drawLine((float) (m1941a(x) + i2), f, (float) i2, f, paint);
                            m1951a(canvas, m1930a(this.f2069c.aj(), doubleValue), ((float) i2) - this.f2069c.ah(), f - this.f2069c.ai(), paint, this.f2069c.ab());
                        } else {
                            canvas.drawLine((float) i3, f, (float) (m1941a(x) + i3), f, paint);
                            m1951a(canvas, m1930a(this.f2069c.aj(), doubleValue), ((float) i3) + this.f2069c.ah(), f - this.f2069c.ai(), paint, this.f2069c.ab());
                        }
                    }
                    if (l) {
                        paint.setColor(this.f2069c.m2145X());
                        canvas.drawLine((float) i2, f, (float) i3, f, paint);
                    }
                } else if (J == C0313e.VERTICAL) {
                    if (k && obj == null) {
                        paint.setColor(this.f2069c.m2189u(i5));
                        canvas.drawLine((float) (i3 - m1941a(x)), f, (float) i3, f, paint);
                        m1951a(canvas, m1930a(this.f2069c.aj(), doubleValue), ((float) (i3 + 10)) + this.f2069c.ah(), f - this.f2069c.ai(), paint, this.f2069c.ab());
                    }
                    if (l) {
                        paint.setColor(this.f2069c.m2145X());
                        canvas.drawLine((float) i3, f, (float) i2, f, paint);
                    }
                }
            }
        }
    }

    protected void m1955a(Double[] dArr, Canvas canvas, Paint paint, boolean z, int i, int i2, int i3, double d, double d2, double d3) {
        boolean n = this.f2069c.m2097n();
        if (z) {
            paint.setColor(this.f2069c.ae());
            for (Double d4 : dArr) {
                if (d2 <= d4.doubleValue() && d4.doubleValue() <= d3) {
                    float doubleValue = (float) (((double) i) + ((d4.doubleValue() - d2) * d));
                    paint.setColor(this.f2069c.ae());
                    canvas.drawLine(doubleValue, (float) i3, doubleValue, ((float) i3) + (this.f2069c.m2092i() / 3.0f), paint);
                    m1951a(canvas, this.f2069c.m2148a(d4), doubleValue, ((float) i3) + ((this.f2069c.m2092i() * 4.0f) / 3.0f), paint, this.f2069c.aa());
                    if (n) {
                        paint.setColor(this.f2069c.m2145X());
                        canvas.drawLine(doubleValue, (float) i3, doubleValue, (float) i2, paint);
                    }
                }
            }
        }
    }

    public boolean m1956a(C0311c c0311c) {
        return false;
    }

    public double[] m1957a(float f, float f2, int i) {
        double g = this.f2069c.m2173g(i);
        double i2 = this.f2069c.m2176i(i);
        double k = this.f2069c.m2179k(i);
        double m = this.f2069c.m2181m(i);
        if (this.f2072f != null) {
            r0 = new double[2];
            r0[0] = g + (((i2 - g) * ((double) (f - ((float) this.f2072f.left)))) / ((double) this.f2072f.width()));
            r0[1] = ((((double) (((float) (this.f2072f.top + this.f2072f.height())) - f2)) * (m - k)) / ((double) this.f2072f.height())) + k;
            return r0;
        }
        return new double[]{(double) f, (double) f2};
    }

    public double[] m1958a(double[] dArr, int i) {
        double g = this.f2069c.m2173g(i);
        double i2 = this.f2069c.m2176i(i);
        double k = this.f2069c.m2179k(i);
        double m = this.f2069c.m2181m(i);
        if (!(this.f2069c.m2175h(i) && this.f2069c.m2178j(i) && this.f2069c.m2175h(i) && this.f2069c.m2182n(i))) {
            double[] b = m1961b(i);
            g = b[0];
            i2 = b[1];
            k = b[2];
            m = b[3];
        }
        if (this.f2072f == null) {
            return dArr;
        }
        return new double[]{(((dArr[0] - g) * ((double) this.f2072f.width())) / (i2 - g)) + ((double) this.f2072f.left), (((m - dArr[1]) * ((double) this.f2072f.height())) / (m - k)) + ((double) this.f2072f.top)};
    }

    protected abstract C0292d[] m1959a(List<Float> list, List<Double> list2, float f, int i, int i2);

    protected boolean m1960b() {
        return false;
    }

    public double[] m1961b(int i) {
        return (double[]) this.f2073g.get(Integer.valueOf(i));
    }

    public C0312d m1962c() {
        return this.f2069c;
    }

    public C0306d m1963d() {
        return this.f2068b;
    }

    public C0300l h_() {
        return null;
    }
}
