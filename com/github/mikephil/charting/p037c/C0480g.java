package com.github.mikephil.charting.p037c;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint.Style;
import com.github.mikephil.charting.p039h.C0544j;

/* renamed from: com.github.mikephil.charting.c.g */
public class C0480g {
    private float f5625a;
    private float f5626b;
    private int f5627c;
    private int f5628d;
    private float f5629e;
    private Style f5630f;
    private String f5631g;
    private DashPathEffect f5632h;
    private C0481h f5633i;

    public C0480g(float f, String str) {
        this.f5625a = 0.0f;
        this.f5626b = 2.0f;
        this.f5627c = Color.rgb(237, 91, 91);
        this.f5628d = -16777216;
        this.f5629e = 13.0f;
        this.f5630f = Style.FILL_AND_STROKE;
        this.f5631g = "";
        this.f5632h = null;
        this.f5633i = C0481h.POS_RIGHT;
        this.f5625a = f;
        this.f5631g = str;
    }

    public float m4319a() {
        return this.f5625a;
    }

    public void m4320a(float f) {
        float f2 = 12.0f;
        float f3 = 0.2f;
        if (f >= 0.2f) {
            f3 = f;
        }
        if (f3 <= 12.0f) {
            f2 = f3;
        }
        this.f5626b = C0544j.m4703a(f2);
    }

    public void m4321a(float f, float f2, float f3) {
        this.f5632h = new DashPathEffect(new float[]{f, f2}, f3);
    }

    public void m4322a(int i) {
        this.f5627c = i;
    }

    public void m4323a(C0481h c0481h) {
        this.f5633i = c0481h;
    }

    public float m4324b() {
        return this.f5626b;
    }

    public void m4325b(float f) {
        this.f5629e = C0544j.m4703a(f);
    }

    public void m4326b(int i) {
        this.f5628d = i;
    }

    public int m4327c() {
        return this.f5627c;
    }

    public DashPathEffect m4328d() {
        return this.f5632h;
    }

    public int m4329e() {
        return this.f5628d;
    }

    public Style m4330f() {
        return this.f5630f;
    }

    public C0481h m4331g() {
        return this.f5633i;
    }

    public String m4332h() {
        return this.f5631g;
    }

    public float m4333i() {
        return this.f5629e;
    }
}
