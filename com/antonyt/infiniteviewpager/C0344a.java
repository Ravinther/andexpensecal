package com.antonyt.infiniteviewpager;

import android.os.Parcelable;
import android.support.v4.view.C0022y;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.antonyt.infiniteviewpager.a */
public class C0344a extends C0022y {
    private C0022y f2326a;

    public C0344a(C0022y c0022y) {
        this.f2326a = c0022y;
    }

    public Parcelable m2268a() {
        return this.f2326a.m128a();
    }

    public Object m2269a(ViewGroup viewGroup, int i) {
        return this.f2326a.m130a(viewGroup, i % m2276d());
    }

    public void m2270a(Parcelable parcelable, ClassLoader classLoader) {
        this.f2326a.m132a(parcelable, classLoader);
    }

    public void m2271a(ViewGroup viewGroup) {
        this.f2326a.m135a(viewGroup);
    }

    public void m2272a(ViewGroup viewGroup, int i, Object obj) {
        this.f2326a.m136a(viewGroup, i % m2276d(), obj);
    }

    public boolean m2273a(View view, Object obj) {
        return this.f2326a.m137a(view, obj);
    }

    public int m2274b() {
        return Integer.MAX_VALUE;
    }

    public void m2275b(ViewGroup viewGroup) {
        this.f2326a.m142b(viewGroup);
    }

    public int m2276d() {
        return this.f2326a.m138b();
    }
}
