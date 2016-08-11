package com.google.android.gms.internal;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.j */
class C0639j implements Runnable {
    final /* synthetic */ JSONObject f6827a;
    final /* synthetic */ C0635h f6828b;

    C0639j(C0635h c0635h, JSONObject jSONObject) {
        this.f6828b = c0635h;
        this.f6827a = jSONObject;
    }

    public void run() {
        this.f6828b.m5683a(this.f6827a);
    }
}
