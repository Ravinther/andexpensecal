package com.github.mikephil.charting.p037c;

import android.graphics.Paint;
import com.github.mikephil.charting.p039h.C0544j;
import java.util.List;

/* renamed from: com.github.mikephil.charting.c.c */
public class C0476c extends C0474b {
    public float f5593a;
    public float f5594b;
    public float f5595c;
    public float f5596d;
    private int[] f5597e;
    private String[] f5598l;
    private C0479f f5599m;
    private C0477d f5600n;
    private C0478e f5601o;
    private float f5602p;
    private float f5603q;
    private float f5604r;
    private float f5605s;
    private float f5606t;

    public C0476c() {
        this.f5599m = C0479f.BELOW_CHART_LEFT;
        this.f5600n = C0477d.LEFT_TO_RIGHT;
        this.f5601o = C0478e.SQUARE;
        this.f5602p = 8.0f;
        this.f5603q = 6.0f;
        this.f5604r = 5.0f;
        this.f5605s = 5.0f;
        this.f5606t = 3.0f;
        this.f5593a = 0.0f;
        this.f5594b = 0.0f;
        this.f5595c = 0.0f;
        this.f5596d = 0.0f;
        this.f5602p = C0544j.m4703a(8.0f);
        this.f5603q = C0544j.m4703a(6.0f);
        this.f5604r = C0544j.m4703a(5.0f);
        this.f5605s = C0544j.m4703a(5.0f);
        this.j = C0544j.m4703a(10.0f);
        this.f5606t = C0544j.m4703a(3.0f);
        this.g = C0544j.m4703a(5.0f);
        this.h = C0544j.m4703a(6.0f);
    }

    public float m4296a(Paint paint) {
        float f = 0.0f;
        for (int i = 0; i < this.f5598l.length; i++) {
            if (this.f5598l[i] != null) {
                float a = (float) C0544j.m4705a(paint, this.f5598l[i]);
                if (a > f) {
                    f = a;
                }
            }
        }
        return (this.f5602p + f) + this.f5605s;
    }

    public void m4297a(float f) {
        this.f5602p = C0544j.m4703a(f);
    }

    public void m4298a(C0478e c0478e) {
        this.f5601o = c0478e;
    }

    public void m4299a(C0479f c0479f) {
        this.f5599m = c0479f;
    }

    public void m4300a(List<Integer> list) {
        this.f5597e = C0544j.m4711a((List) list);
    }

    public int[] m4301a() {
        return this.f5597e;
    }

    public float m4302b(Paint paint) {
        float f = 0.0f;
        for (int i = 0; i < this.f5598l.length; i++) {
            if (this.f5598l[i] != null) {
                float b = (float) C0544j.m4716b(paint, this.f5598l[i]);
                if (b > f) {
                    f = b;
                }
            }
        }
        return f;
    }

    public String m4303b(int i) {
        return this.f5598l[i];
    }

    public void m4304b(List<String> list) {
        this.f5598l = C0544j.m4717b((List) list);
    }

    public String[] m4305b() {
        return this.f5598l;
    }

    public float m4306c(Paint paint) {
        float f = 0.0f;
        for (int i = 0; i < this.f5598l.length; i++) {
            if (this.f5598l[i] != null) {
                if (this.f5597e[i] != -2) {
                    f += this.f5602p + this.f5605s;
                }
                f += (float) C0544j.m4705a(paint, this.f5598l[i]);
                if (i < this.f5598l.length - 1) {
                    f += this.f5603q;
                }
            } else {
                f += this.f5602p;
                if (i < this.f5598l.length - 1) {
                    f += this.f5606t;
                }
            }
        }
        return f;
    }

    public C0479f m4307c() {
        return this.f5599m;
    }

    public void m4308c(float f) {
        this.f5603q = C0544j.m4703a(f);
    }

    public float m4309d(Paint paint) {
        float f = 0.0f;
        for (int i = 0; i < this.f5598l.length; i++) {
            if (this.f5598l[i] != null) {
                f += (float) C0544j.m4716b(paint, this.f5598l[i]);
                if (i < this.f5598l.length - 1) {
                    f += this.f5604r;
                }
            }
        }
        return f;
    }

    public C0477d m4310d() {
        return this.f5600n;
    }

    public void m4311d(float f) {
        this.f5604r = C0544j.m4703a(f);
    }

    public C0478e m4312e() {
        return this.f5601o;
    }

    public void m4313e(Paint paint) {
        if (this.f5599m == C0479f.RIGHT_OF_CHART || this.f5599m == C0479f.RIGHT_OF_CHART_CENTER || this.f5599m == C0479f.LEFT_OF_CHART || this.f5599m == C0479f.LEFT_OF_CHART_CENTER || this.f5599m == C0479f.PIECHART_CENTER) {
            this.f5593a = m4296a(paint);
            this.f5594b = m4309d(paint);
            this.f5596d = this.f5593a;
            this.f5595c = m4302b(paint);
            return;
        }
        this.f5593a = m4306c(paint);
        this.f5594b = m4302b(paint);
        this.f5596d = m4296a(paint);
        this.f5595c = this.f5594b;
    }

    public float m4314f() {
        return this.f5602p;
    }

    public float m4315g() {
        return this.f5603q;
    }

    public float m4316h() {
        return this.f5604r;
    }

    public float m4317i() {
        return this.f5605s;
    }

    public float m4318j() {
        return this.f5606t;
    }
}
