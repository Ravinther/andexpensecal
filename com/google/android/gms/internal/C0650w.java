package com.google.android.gms.internal;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.w */
class C0650w implements Runnable {
    final /* synthetic */ String f7345a;
    final /* synthetic */ JSONObject f7346b;
    final /* synthetic */ C0649v f7347c;

    C0650w(C0649v c0649v, String str, JSONObject jSONObject) {
        this.f7347c = c0649v;
        this.f7345a = str;
        this.f7346b = jSONObject;
    }

    public void run() {
        this.f7347c.f7344a.m6089a(this.f7345a, this.f7346b);
    }
}
