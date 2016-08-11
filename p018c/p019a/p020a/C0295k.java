package p018c.p019a.p020a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import p018c.p019a.p021b.C0303a;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p022c.C0311c;

/* renamed from: c.a.a.k */
public abstract class C0295k extends C0288a {
    protected C0303a f2084a;
    protected C0310b f2085b;
    protected int f2086c;
    protected int f2087d;

    public C0295k(C0303a c0303a, C0310b c0310b) {
        this.f2086c = Integer.MAX_VALUE;
        this.f2087d = Integer.MAX_VALUE;
        this.f2084a = c0303a;
        this.f2085b = c0310b;
    }

    public int m1983a(int i) {
        return 10;
    }

    public C0310b m1984a() {
        return this.f2085b;
    }

    public void m1985a(Canvas canvas, int i, int i2, int i3, Paint paint) {
        if (this.f2085b.m2094k()) {
            paint.setColor(this.f2085b.m2090h());
            paint.setTextAlign(Align.CENTER);
            paint.setTextSize(this.f2085b.m2074b());
            m1933a(canvas, this.f2085b.m2069a(), (float) ((i3 / 2) + i), ((float) i2) + this.f2085b.m2074b(), paint);
        }
    }

    public void m1986a(Canvas canvas, C0311c c0311c, float f, float f2, int i, Paint paint) {
        canvas.drawRect(f, f2 - 5.0f, f + 10.0f, f2 + 5.0f, paint);
    }

    public int m1987b() {
        return this.f2086c;
    }

    public void m1988b(int i) {
        this.f2086c = i;
    }

    public int m1989c() {
        return this.f2087d;
    }

    public void m1990c(int i) {
        this.f2087d = i;
    }
}
