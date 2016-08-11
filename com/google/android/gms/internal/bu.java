package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0585d;

@id
public final class bu extends bx {
    private final pl f6355a;
    private final String f6356b;
    private final String f6357c;

    public bu(pl plVar, String str, String str2) {
        this.f6355a = plVar;
        this.f6356b = str;
        this.f6357c = str2;
    }

    public String m5234a() {
        return this.f6356b;
    }

    public void m5235a(C0582a c0582a) {
        if (c0582a != null) {
            this.f6355a.m6414a((View) C0585d.m4879a(c0582a));
        }
    }

    public String m5236b() {
        return this.f6357c;
    }

    public void m5237c() {
        this.f6355a.m6415u();
    }

    public void m5238d() {
        this.f6355a.m6416v();
    }
}
