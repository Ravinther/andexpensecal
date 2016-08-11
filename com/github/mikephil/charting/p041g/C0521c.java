package com.github.mikephil.charting.p041g;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import com.github.mikephil.charting.p035a.C0468a;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0502g;

/* renamed from: com.github.mikephil.charting.g.c */
public abstract class C0521c extends C0519i {
    protected C0468a f5850e;
    protected Paint f5851f;
    protected Paint f5852g;
    protected Paint f5853h;
    protected Paint f5854i;

    public C0521c(C0468a c0468a, C0545l c0545l) {
        super(c0545l);
        this.f5850e = c0468a;
        this.f5851f = new Paint(1);
        this.f5851f.setStyle(Style.FILL);
        this.f5853h = new Paint(4);
        this.f5854i = new Paint(1);
        this.f5854i.setColor(Color.rgb(63, 63, 63));
        this.f5854i.setTextAlign(Align.CENTER);
        this.f5854i.setTextSize(C0544j.m4703a(9.0f));
        this.f5852g = new Paint(1);
        this.f5852g.setStyle(Style.STROKE);
        this.f5852g.setStrokeWidth(2.0f);
        this.f5852g.setColor(Color.rgb(255, 187, 115));
    }

    public abstract void m4589a();

    public abstract void m4590a(Canvas canvas);

    public abstract void m4591a(Canvas canvas, C0538d[] c0538dArr);

    protected void m4592a(C0502g<?> c0502g) {
        this.f5854i.setColor(c0502g.m4515y());
        this.f5854i.setTypeface(c0502g.m4516z());
        this.f5854i.setTextSize(c0502g.m4487A());
    }

    public abstract void m4593b(Canvas canvas);

    public abstract void m4594c(Canvas canvas);
}
