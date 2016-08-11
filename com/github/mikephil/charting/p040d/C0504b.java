package com.github.mikephil.charting.p040d;

import android.graphics.Color;
import java.util.List;

/* renamed from: com.github.mikephil.charting.d.b */
public class C0504b extends C0503e<C0506c> {
    private float f5790i;
    private int f5791j;
    private int f5792k;
    private int f5793l;
    private int f5794m;
    private String[] f5795n;

    public C0504b(List<C0506c> list, String str) {
        super(list, str);
        this.f5790i = 0.15f;
        this.f5791j = 1;
        this.f5792k = Color.rgb(215, 215, 215);
        this.f5793l = 120;
        this.f5794m = 0;
        this.f5795n = new String[]{"Stack"};
        this.a = Color.rgb(0, 0, 0);
        m4519c(list);
        m4518b(list);
    }

    private void m4518b(List<C0506c> list) {
        this.f5794m = 0;
        for (int i = 0; i < list.size(); i++) {
            float[] a = ((C0506c) list.get(i)).m4534a();
            if (a == null) {
                this.f5794m++;
            } else {
                this.f5794m = a.length + this.f5794m;
            }
        }
    }

    private void m4519c(List<C0506c> list) {
        for (int i = 0; i < list.size(); i++) {
            float[] a = ((C0506c) list.get(i)).m4534a();
            if (a != null && a.length > this.f5791j) {
                this.f5791j = a.length;
            }
        }
    }

    public int m4520a() {
        return this.f5791j;
    }

    public void m4521a(float f) {
        this.f5790i = f / 100.0f;
    }

    public boolean m4522b() {
        return this.f5791j > 1;
    }

    public float m4523c() {
        return this.f5790i;
    }

    public int m4524d() {
        return this.f5792k;
    }

    public int m4525e() {
        return this.f5793l;
    }

    public String[] m4526f() {
        return this.f5795n;
    }
}
