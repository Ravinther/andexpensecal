package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0585d;

@id
public class cd extends ci implements cg {
    private final String f6365a;
    private final Drawable f6366b;
    private final String f6367c;
    private final Drawable f6368d;
    private final String f6369e;
    private final double f6370f;
    private final String f6371g;
    private final String f6372h;
    private final Object f6373i;
    private cf f6374j;

    public cd(String str, Drawable drawable, String str2, Drawable drawable2, String str3, double d, String str4, String str5) {
        this.f6373i = new Object();
        this.f6365a = str;
        this.f6366b = drawable;
        this.f6367c = str2;
        this.f6368d = drawable2;
        this.f6369e = str3;
        this.f6370f = d;
        this.f6371g = str4;
        this.f6372h = str5;
    }

    public String m5259a() {
        return this.f6365a;
    }

    public void m5260a(int i) {
        synchronized (this.f6373i) {
            if (this.f6374j == null) {
                ly.m6068b("Attempt to perform click before app install ad initialized.");
                return;
            }
            this.f6374j.m5288a("2", i);
        }
    }

    public void m5261a(cf cfVar) {
        synchronized (this.f6373i) {
            this.f6374j = cfVar;
        }
    }

    public C0582a m5262b() {
        return C0585d.m4878a(this.f6366b);
    }

    public String m5263c() {
        return this.f6367c;
    }

    public C0582a m5264d() {
        return C0585d.m4878a(this.f6368d);
    }

    public String m5265e() {
        return this.f6369e;
    }

    public double m5266f() {
        return this.f6370f;
    }

    public String m5267g() {
        return this.f6371g;
    }

    public String m5268h() {
        return this.f6372h;
    }

    public void m5269i() {
        synchronized (this.f6373i) {
            if (this.f6374j == null) {
                ly.m6068b("Attempt to record impression before app install ad initialized.");
                return;
            }
            this.f6374j.m5287a();
        }
    }
}
