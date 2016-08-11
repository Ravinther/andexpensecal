package com.github.mikephil.charting.p037c;

import android.graphics.Paint;
import com.github.mikephil.charting.p039h.C0536k;
import com.github.mikephil.charting.p039h.C0537b;
import com.github.mikephil.charting.p039h.C0544j;

/* renamed from: com.github.mikephil.charting.c.l */
public class C0485l extends C0475a {
    private boolean f5652A;
    private C0487n f5653B;
    private C0486m f5654C;
    protected C0536k f5655l;
    public float[] f5656m;
    public int f5657n;
    public int f5658o;
    protected boolean f5659p;
    protected boolean f5660q;
    protected boolean f5661r;
    protected float f5662s;
    protected float f5663t;
    protected float f5664u;
    protected float f5665v;
    public float f5666w;
    public float f5667x;
    public float f5668y;
    private int f5669z;

    public C0485l() {
        this.f5656m = new float[0];
        this.f5669z = 6;
        this.f5652A = true;
        this.f5659p = false;
        this.f5660q = false;
        this.f5661r = true;
        this.f5662s = Float.NaN;
        this.f5663t = Float.NaN;
        this.f5664u = 10.0f;
        this.f5665v = 10.0f;
        this.f5666w = 0.0f;
        this.f5667x = 0.0f;
        this.f5668y = 0.0f;
        this.f5653B = C0487n.OUTSIDE_CHART;
        this.f5654C = C0486m.LEFT;
    }

    public C0485l(C0486m c0486m) {
        this.f5656m = new float[0];
        this.f5669z = 6;
        this.f5652A = true;
        this.f5659p = false;
        this.f5660q = false;
        this.f5661r = true;
        this.f5662s = Float.NaN;
        this.f5663t = Float.NaN;
        this.f5664u = 10.0f;
        this.f5665v = 10.0f;
        this.f5666w = 0.0f;
        this.f5667x = 0.0f;
        this.f5668y = 0.0f;
        this.f5653B = C0487n.OUTSIDE_CHART;
        this.f5654C = c0486m;
    }

    public float m4345A() {
        return this.f5664u;
    }

    public float m4346B() {
        return this.f5665v;
    }

    public String m4347C() {
        String str = "";
        int i = 0;
        while (i < this.f5656m.length) {
            String c = m4355c(i);
            if (str.length() >= c.length()) {
                c = str;
            }
            i++;
            str = c;
        }
        return str;
    }

    public C0536k m4348D() {
        return this.f5655l;
    }

    public boolean m4349E() {
        return this.f5655l == null || (this.f5655l instanceof C0537b);
    }

    public boolean m4350F() {
        return m4280q() && m4291g() && m4358s() == C0487n.OUTSIDE_CHART;
    }

    public float m4351a(Paint paint) {
        paint.setTextSize(this.j);
        return ((float) C0544j.m4705a(paint, m4347C())) + (m4275l() * 2.0f);
    }

    public void m4352a(C0536k c0536k) {
        if (c0536k != null) {
            this.f5655l = c0536k;
        }
    }

    public float m4353b(Paint paint) {
        paint.setTextSize(this.j);
        return ((float) C0544j.m4716b(paint, m4347C())) + (m4276m() * 2.0f);
    }

    public void m4354b(int i) {
        int i2 = 25;
        int i3 = 2;
        if (i <= 25) {
            i2 = i;
        }
        if (i2 >= 2) {
            i3 = i2;
        }
        this.f5669z = i3;
    }

    public String m4355c(int i) {
        return (i < 0 || i >= this.f5656m.length) ? "" : m4348D().m4683a(this.f5656m[i]);
    }

    public void m4356d(boolean z) {
        this.f5661r = z;
    }

    public C0486m m4357r() {
        return this.f5654C;
    }

    public C0487n m4358s() {
        return this.f5653B;
    }

    public boolean m4359t() {
        return this.f5652A;
    }

    public int m4360u() {
        return this.f5669z;
    }

    public boolean m4361v() {
        return this.f5659p;
    }

    public boolean m4362w() {
        return this.f5660q;
    }

    public boolean m4363x() {
        return this.f5661r;
    }

    public float m4364y() {
        return this.f5662s;
    }

    public float m4365z() {
        return this.f5663t;
    }
}
