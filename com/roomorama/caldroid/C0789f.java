package com.roomorama.caldroid;

import android.support.v4.view.bi;
import java.util.ArrayList;
import p000a.p001a.C0000a;
import p000a.p001a.C0001b;

/* renamed from: com.roomorama.caldroid.f */
public class C0789f implements bi {
    final /* synthetic */ C0421a f7764a;
    private int f7765b;
    private C0000a f7766c;
    private ArrayList<C0419g> f7767d;

    public C0789f(C0421a c0421a) {
        this.f7764a = c0421a;
        this.f7765b = 1000;
    }

    private int m7148e(int i) {
        return (i + 1) % 4;
    }

    private int m7149f(int i) {
        return (i + 3) % 4;
    }

    public int m7150a() {
        return this.f7765b;
    }

    public void m7151a(int i) {
        m7157d(i);
        this.f7764a.m4002a(this.f7766c);
        C0419g c0419g = (C0419g) this.f7767d.get(i % 4);
        this.f7764a.aC.clear();
        this.f7764a.aC.addAll(c0419g.m3977a());
    }

    public void m7152a(int i, float f, int i2) {
    }

    public void m7153a(C0000a c0000a) {
        this.f7766c = c0000a;
        this.f7764a.m4002a(this.f7766c);
    }

    public void m7154a(ArrayList<C0419g> arrayList) {
        this.f7767d = arrayList;
    }

    public void m7155b(int i) {
    }

    public int m7156c(int i) {
        return i % 4;
    }

    public void m7157d(int i) {
        C0419g c0419g = (C0419g) this.f7767d.get(m7156c(i));
        C0419g c0419g2 = (C0419g) this.f7767d.get(m7149f(i));
        C0419g c0419g3 = (C0419g) this.f7767d.get(m7148e(i));
        if (i == this.f7765b) {
            c0419g.m3979a(this.f7766c);
            c0419g.notifyDataSetChanged();
            c0419g2.m3979a(this.f7766c.m26b(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay));
            c0419g2.notifyDataSetChanged();
            c0419g3.m3979a(this.f7766c.m20a(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay));
            c0419g3.notifyDataSetChanged();
        } else if (i > this.f7765b) {
            this.f7766c = this.f7766c.m20a(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay);
            c0419g3.m3979a(this.f7766c.m20a(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay));
            c0419g3.notifyDataSetChanged();
        } else {
            this.f7766c = this.f7766c.m26b(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay);
            c0419g2.m3979a(this.f7766c.m26b(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay));
            c0419g2.notifyDataSetChanged();
        }
        this.f7765b = i;
    }
}
