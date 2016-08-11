package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0585d;

@id
public class ce extends ck implements cg {
    private final String f6375a;
    private final Drawable f6376b;
    private final String f6377c;
    private final Drawable f6378d;
    private final String f6379e;
    private final String f6380f;
    private final Object f6381g;
    private cf f6382h;

    public ce(String str, Drawable drawable, String str2, Drawable drawable2, String str3, String str4) {
        this.f6381g = new Object();
        this.f6375a = str;
        this.f6376b = drawable;
        this.f6377c = str2;
        this.f6378d = drawable2;
        this.f6379e = str3;
        this.f6380f = str4;
    }

    public String m5278a() {
        return this.f6375a;
    }

    public void m5279a(int i) {
        synchronized (this.f6381g) {
            if (this.f6382h == null) {
                ly.m6068b("Attempt to perform click before content ad initialized.");
                return;
            }
            this.f6382h.m5288a("1", i);
        }
    }

    public void m5280a(cf cfVar) {
        synchronized (this.f6381g) {
            this.f6382h = cfVar;
        }
    }

    public C0582a m5281b() {
        return C0585d.m4878a(this.f6376b);
    }

    public String m5282c() {
        return this.f6377c;
    }

    public C0582a m5283d() {
        return C0585d.m4878a(this.f6378d);
    }

    public String m5284e() {
        return this.f6379e;
    }

    public String m5285f() {
        return this.f6380f;
    }

    public void m5286g() {
        synchronized (this.f6381g) {
            if (this.f6382h == null) {
                ly.m6068b("Attempt to record impression before content ad initialized.");
                return;
            }
            this.f6382h.m5287a();
        }
    }
}
