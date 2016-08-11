package com.google.android.gms.internal;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.t */
class C0647t implements Runnable {
    final /* synthetic */ Context f7336a;
    final /* synthetic */ gs f7337b;
    final /* synthetic */ ll f7338c;
    final /* synthetic */ String f7339d;
    final /* synthetic */ C0646s f7340e;

    C0647t(C0646s c0646s, Context context, gs gsVar, ll llVar, String str) {
        this.f7340e = c0646s;
        this.f7336a = context;
        this.f7337b = gsVar;
        this.f7338c = llVar;
        this.f7339d = str;
    }

    public void run() {
        this.f7340e.m6504a(this.f7336a, this.f7337b, this.f7338c).m6498a(this.f7339d);
    }
}
