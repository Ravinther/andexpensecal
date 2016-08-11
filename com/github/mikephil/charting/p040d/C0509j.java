package com.github.mikephil.charting.p040d;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.github.mikephil.charting.p039h.C0544j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.d.j */
public class C0509j extends C0508k<C0505h> {
    private List<Integer> f5804i;
    private int f5805j;
    private float f5806k;
    private float f5807l;
    private DashPathEffect f5808m;
    private boolean f5809n;
    private boolean f5810o;
    private boolean f5811p;

    public C0509j(List<C0505h> list, String str) {
        super(list, str);
        this.f5804i = null;
        this.f5805j = -1;
        this.f5806k = 8.0f;
        this.f5807l = 0.2f;
        this.f5808m = null;
        this.f5809n = true;
        this.f5810o = false;
        this.f5811p = true;
        this.f5804i = new ArrayList();
        this.f5804i.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    public void m4540B() {
        this.f5804i = new ArrayList();
    }

    public int m4541C() {
        return this.f5805j;
    }

    public boolean m4542D() {
        return this.f5811p;
    }

    public float m4543a() {
        return this.f5807l;
    }

    public void m4544a(float f) {
        this.f5806k = C0544j.m4703a(f);
    }

    public float m4545b() {
        return this.f5806k;
    }

    public boolean m4546c() {
        return this.f5808m != null;
    }

    public DashPathEffect m4547d() {
        return this.f5808m;
    }

    public boolean m4548e() {
        return this.f5809n;
    }

    public int m4549f(int i) {
        return ((Integer) this.f5804i.get(i % this.f5804i.size())).intValue();
    }

    public boolean m4550f() {
        return this.f5810o;
    }

    public void m4551g(int i) {
        m4540B();
        this.f5804i.add(Integer.valueOf(i));
    }
}
