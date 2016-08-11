package com.github.mikephil.charting.p037c;

import android.graphics.DashPathEffect;
import android.util.Log;
import com.github.mikephil.charting.p039h.C0544j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.c.a */
public abstract class C0475a extends C0474b {
    protected boolean f5583a;
    protected boolean f5584b;
    protected boolean f5585c;
    protected List<C0480g> f5586d;
    protected boolean f5587e;
    private int f5588l;
    private float f5589m;
    private int f5590n;
    private float f5591o;
    private DashPathEffect f5592p;

    public C0475a() {
        this.f5588l = -7829368;
        this.f5589m = 1.0f;
        this.f5590n = -7829368;
        this.f5591o = 1.0f;
        this.f5583a = true;
        this.f5584b = true;
        this.f5585c = true;
        this.f5592p = null;
        this.f5587e = false;
        this.j = C0544j.m4703a(10.0f);
        this.g = C0544j.m4703a(5.0f);
        this.h = C0544j.m4703a(5.0f);
        this.f5586d = new ArrayList();
    }

    public void m4281a(float f) {
        this.f5589m = C0544j.m4703a(f);
    }

    public void m4282a(C0480g c0480g) {
        this.f5586d.add(c0480g);
        if (this.f5586d.size() > 6) {
            Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
        }
    }

    public void m4283a(boolean z) {
        this.f5583a = z;
    }

    public boolean m4284a() {
        return this.f5583a;
    }

    public void m4285b(boolean z) {
        this.f5584b = z;
    }

    public boolean m4286b() {
        return this.f5584b;
    }

    public int m4287c() {
        return this.f5588l;
    }

    public float m4288d() {
        return this.f5591o;
    }

    public float m4289e() {
        return this.f5589m;
    }

    public int m4290f() {
        return this.f5590n;
    }

    public boolean m4291g() {
        return this.f5585c;
    }

    public void m4292h() {
        this.f5586d.clear();
    }

    public List<C0480g> m4293i() {
        return this.f5586d;
    }

    public boolean m4294j() {
        return this.f5587e;
    }

    public DashPathEffect m4295k() {
        return this.f5592p;
    }
}
