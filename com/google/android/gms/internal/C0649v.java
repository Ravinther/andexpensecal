package com.google.android.gms.internal;

import android.content.Context;
import org.json.JSONObject;

@id
/* renamed from: com.google.android.gms.internal.v */
public class C0649v implements C0645q {
    private final ma f7344a;

    public C0649v(Context context, gs gsVar) {
        this.f7344a = ma.m6079a(context, new ay(), false, false, null, gsVar);
    }

    private void m6508a(Runnable runnable) {
        if (lx.m6064b()) {
            runnable.run();
        } else {
            lx.f7093a.post(runnable);
        }
    }

    public void m6509a() {
        li.m6012a(this.f7344a);
    }

    public void m6510a(pa paVar, ga gaVar, co coVar, gf gfVar, boolean z, da daVar) {
        this.f7344a.m6097f().m6112a(paVar, gaVar, coVar, gfVar, z, daVar, new pi(false));
    }

    public void m6511a(C0636r c0636r) {
        this.f7344a.m6097f().m6110a(new C0653z(this, c0636r));
    }

    public void m6512a(String str) {
        m6508a(new C0651x(this, str));
    }

    public void m6513a(String str, cz czVar) {
        this.f7344a.m6097f().m6113a(str, czVar);
    }

    public void m6514a(String str, JSONObject jSONObject) {
        m6508a(new C0650w(this, str, jSONObject));
    }

    public void m6515b() {
        li.m6023b(this.f7344a);
    }

    public void m6516b(String str) {
        this.f7344a.m6097f().m6113a(str, null);
    }

    public void m6517c() {
        this.f7344a.destroy();
    }
}
