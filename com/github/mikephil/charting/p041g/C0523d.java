package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import com.github.mikephil.charting.p035a.C0468a;
import com.github.mikephil.charting.p036b.C0470b;
import com.github.mikephil.charting.p036b.C0472d;
import com.github.mikephil.charting.p038e.C0492a;
import com.github.mikephil.charting.p039h.C0536k;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0501a;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0504b;
import com.github.mikephil.charting.p040d.C0506c;
import java.util.List;

/* renamed from: com.github.mikephil.charting.g.d */
public class C0523d extends C0522b {
    private float f5859j;

    public C0523d(C0492a c0492a, C0468a c0468a, C0545l c0545l) {
        super(c0492a, c0468a, c0545l);
        this.f5859j = 0.0f;
        this.i.setTextAlign(Align.LEFT);
    }

    public void m4605a() {
        C0501a barData = this.a.getBarData();
        this.c = new C0472d[barData.m4471c()];
        for (int i = 0; i < this.c.length; i++) {
            C0504b c0504b = (C0504b) barData.m4463a(i);
            this.c[i] = new C0472d((c0504b.m4504n() * 4) * c0504b.m4520a(), barData.m4484a(), barData.m4471c(), c0504b.m4522b());
        }
    }

    protected void m4606a(float f, float f2, float f3, float f4, C0542h c0542h) {
        float f5 = (f - 0.5f) + f3;
        float f6 = (f + 0.5f) - f3;
        float f7 = f2 >= f4 ? f2 : f4;
        if (f2 > f4) {
            f2 = f4;
        }
        this.b.set(f7, f5, f2, f6);
        c0542h.m4698b(this.b, this.e.m4254a());
    }

    protected void m4607a(Canvas canvas, C0504b c0504b, int i) {
        C0542h a = this.a.m4382a(c0504b.m4508r());
        this.d.setColor(c0504b.m4524d());
        float b = this.e.m4255b();
        float a2 = this.e.m4254a();
        List j = c0504b.m4500j();
        C0470b c0470b = this.c[i];
        c0470b.m4257a(b, a2);
        c0470b.m4261a(c0504b.m4523c());
        c0470b.m4265c(i);
        c0470b.m4264a(this.a.m4383c(c0504b.m4508r()));
        c0470b.m4263a(j);
        a.m4695a(c0470b.b);
        int i2 = 0;
        while (i2 < c0470b.m4259b() && this.n.m4736f(c0470b.b[i2 + 3])) {
            if (this.n.m4738g(c0470b.b[i2 + 1])) {
                if (this.a.m4412f()) {
                    canvas.drawRect(this.n.m4735f(), c0470b.b[i2 + 1], this.n.m4737g(), c0470b.b[i2 + 3], this.d);
                }
                this.f.setColor(c0504b.m4496d(i2 / 4));
                canvas.drawRect(c0470b.b[i2], c0470b.b[i2 + 1], c0470b.b[i2 + 2], c0470b.b[i2 + 3], this.f);
            }
            i2 += 4;
        }
    }

    protected void m4608a(Canvas canvas, String str, float f, float f2) {
        super.m4599a(canvas, str, f, this.f5859j + f2);
    }

    public float[] m4609a(C0542h c0542h, List<C0506c> list, int i) {
        return c0542h.m4700b(list, i, this.a.getBarData(), this.e.m4254a());
    }

    public void m4610b(Canvas canvas) {
        if (m4611b()) {
            List j = this.a.getBarData().m4480j();
            float a = C0544j.m4703a(5.0f);
            boolean d = this.a.m4410d();
            if (d) {
                this.i.setTextAlign(Align.LEFT);
            } else {
                this.i.setTextAlign(Align.RIGHT);
            }
            for (int i = 0; i < this.a.getBarData().m4471c(); i++) {
                C0504b c0504b = (C0504b) j.get(i);
                if (c0504b.m4509s()) {
                    boolean c = this.a.m4383c(c0504b.m4508r());
                    m4592a((C0502g) c0504b);
                    this.f5859j = ((float) C0544j.m4716b(this.i, "10")) / 2.0f;
                    C0536k w = c0504b.m4513w();
                    C0542h a2 = this.a.m4382a(c0504b.m4508r());
                    List j2 = c0504b.m4500j();
                    float[] a3 = m4609a(a2, j2, i);
                    int i2;
                    float c2;
                    float f;
                    if (this.a.m4411e()) {
                        for (i2 = 0; ((float) i2) < ((float) (a3.length - 1)) * this.e.m4255b(); i2 += 2) {
                            C0506c c0506c = (C0506c) j2.get(i2 / 2);
                            float[] a4 = c0506c.m4534a();
                            if (a4 != null) {
                                float[] fArr = new float[(a4.length * 2)];
                                int i3 = 0;
                                c2 = c0506c.m4530c();
                                int i4 = 0;
                                while (true) {
                                    int length = fArr.length;
                                    if (i4 >= r0) {
                                        break;
                                    }
                                    c2 -= a4[i3];
                                    fArr[i4] = (a4[i3] + c2) * this.e.m4254a();
                                    i3++;
                                    i4 += 2;
                                }
                                a2.m4695a(fArr);
                                for (i4 = 0; i4 < fArr.length; i4 += 2) {
                                    float f2 = a4[i4 / 2];
                                    String a5 = w.m4683a(f2);
                                    float a6 = (float) C0544j.m4705a(this.i, a5);
                                    f = d ? a : -(a6 + a);
                                    c2 = d ? -(a6 + a) : a;
                                    if (c) {
                                        f = (-f) - a6;
                                        c2 = (-c2) - a6;
                                    }
                                    a6 = fArr[i4];
                                    if (f2 < 0.0f) {
                                        f = c2;
                                    }
                                    c2 = a6 + f;
                                    f = a3[i2 + 1];
                                    if (this.n.m4727b(c2)) {
                                        if (!this.n.m4736f(f)) {
                                            break;
                                        }
                                        if (this.n.m4738g(f)) {
                                            m4608a(canvas, a5, c2, f);
                                        }
                                    }
                                }
                            } else if (this.n.m4727b(a3[i2])) {
                                if (!this.n.m4736f(a3[i2 + 1])) {
                                    break;
                                } else if (this.n.m4738g(a3[i2 + 1])) {
                                    String a7 = w.m4683a(c0506c.m4530c());
                                    float a8 = (float) C0544j.m4705a(this.i, a7);
                                    f = d ? a : -(a8 + a);
                                    c2 = d ? -(a8 + a) : a;
                                    if (c) {
                                        f = (-f) - a8;
                                        c2 = (-c2) - a8;
                                    }
                                    a8 = a3[i2];
                                    if (c0506c.m4530c() < 0.0f) {
                                        f = c2;
                                    }
                                    m4608a(canvas, a7, a8 + f, a3[i2 + 1]);
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        for (i2 = 0; ((float) i2) < ((float) a3.length) * this.e.m4255b(); i2 += 2) {
                            if (this.n.m4727b(a3[i2])) {
                                if (!this.n.m4736f(a3[i2 + 1])) {
                                    break;
                                } else if (this.n.m4738g(a3[i2 + 1])) {
                                    f = ((C0506c) j2.get(i2 / 2)).m4530c();
                                    String a9 = w.m4683a(f);
                                    float a10 = (float) C0544j.m4705a(this.i, a9);
                                    c2 = d ? a : -(a10 + a);
                                    float f3 = d ? -(a10 + a) : a;
                                    if (c) {
                                        c2 = (-c2) - a10;
                                        f3 = (-f3) - a10;
                                    }
                                    a10 = a3[i2];
                                    if (f < 0.0f) {
                                        c2 = f3;
                                    }
                                    m4608a(canvas, a9, a10 + c2, a3[i2 + 1]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    protected boolean m4611b() {
        return ((float) this.a.getBarData().m4478h()) < ((float) this.a.getMaxVisibleCount()) * this.n.m4750q();
    }
}
