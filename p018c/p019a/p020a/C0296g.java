package p018c.p019a.p020a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import java.util.ArrayList;
import java.util.List;
import p018c.p019a.p021b.C0303a;
import p018c.p019a.p021b.C0304b;
import p018c.p019a.p021b.C0305c;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p022c.C0311c;

/* renamed from: c.a.a.g */
public class C0296g extends C0295k {
    private C0297h f2088e;

    public C0296g(C0303a c0303a, C0310b c0310b) {
        super(c0303a, c0310b);
        this.f2088e = new C0297h();
    }

    public C0305c m1991a(C0304b c0304b) {
        return this.f2088e.m1999c(c0304b);
    }

    public void m1992a(Canvas canvas, int i, int i2, int i3, int i4, Paint paint) {
        paint.setAntiAlias(this.b.m2104u());
        paint.setStyle(Style.FILL);
        paint.setTextSize(this.b.m2092i());
        int a = m1928a(this.b, i4 / 5, 0.0f);
        int i5 = i + i3;
        int a2 = this.a.m2019a();
        String[] strArr = new String[a2];
        int i6 = 0;
        double d = 0.0d;
        while (i6 < a2) {
            double a3 = this.a.m2018a(i6) + d;
            strArr[i6] = this.a.m2023b(i6);
            i6++;
            d = a3;
        }
        int a4 = this.b.m2099p() ? m1927a(canvas, this.b, strArr, i, i5, i2, i3, i4, a, paint, true) : a;
        i6 = (i2 + i4) - a4;
        m1937a(this.b, canvas, i, i2, i3, i4, paint, false, 0);
        float H = this.b.m2066H();
        int min = (int) ((((double) Math.min(Math.abs(i5 - i), Math.abs(i6 - i2))) * 0.35d) * ((double) this.b.m2105v()));
        if (this.c == Integer.MAX_VALUE) {
            this.c = (i + i5) / 2;
        }
        if (this.d == Integer.MAX_VALUE) {
            this.d = (i6 + i2) / 2;
        }
        this.f2088e.m1996a(min, this.c, this.d);
        Object obj = !this.f2088e.m1997a(a2) ? 1 : null;
        if (obj != null) {
            this.f2088e.m1994a();
        }
        float f = ((float) min) * 0.9f;
        float f2 = ((float) min) * 1.1f;
        RectF rectF = new RectF((float) (this.c - min), (float) (this.d - min), (float) (this.c + min), (float) (this.d + min));
        List arrayList = new ArrayList();
        for (i6 = 0; i6 < a2; i6++) {
            C0311c a5 = this.b.m2068a(i6);
            if (a5.m2121h()) {
                paint.setShader(new RadialGradient((float) this.c, (float) this.d, f2, a5.m2123j(), a5.m2125l(), TileMode.MIRROR));
            } else {
                paint.setColor(a5.m2110a());
            }
            float a6 = (float) this.a.m2018a(i6);
            float f3 = (float) ((((double) a6) / d) * 360.0d);
            if (a5.m2127n()) {
                double toRadians = Math.toRadians((double) (90.0f - ((f3 / 2.0f) + H)));
                float sin = (float) ((((double) min) * 0.1d) * Math.sin(toRadians));
                float cos = (float) (Math.cos(toRadians) * (((double) min) * 0.1d));
                rectF.offset(sin, cos);
                canvas.drawArc(rectF, H, f3, true, paint);
                rectF.offset(-sin, -cos);
            } else {
                canvas.drawArc(rectF, H, f3, true, paint);
            }
            paint.setColor(a5.m2110a());
            paint.setShader(null);
            m1934a(canvas, this.a.m2023b(i6), this.b, arrayList, this.c, this.d, f, f2, H, f3, i, i5, this.b.m2090h(), paint, true, false);
            if (this.b.m2067I()) {
                m1934a(canvas, m1930a(this.b.m2068a(i6).m2129p(), this.a.m2018a(i6)), this.b, arrayList, this.c, this.d, f / 2.0f, f2 / 2.0f, H, f3, i, i5, this.b.m2090h(), paint, false, true);
            }
            if (obj != null) {
                this.f2088e.m1995a(i6, a6, H, f3);
            }
            H += f3;
        }
        arrayList.clear();
        m1927a(canvas, this.b, strArr, i, i5, i2, i3, i4, a4, paint, false);
        m1985a(canvas, i, i2, i3, paint);
    }
}
