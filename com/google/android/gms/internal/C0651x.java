package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.x */
class C0651x implements Runnable {
    final /* synthetic */ String f7348a;
    final /* synthetic */ C0649v f7349b;

    C0651x(C0649v c0649v, String str) {
        this.f7349b = c0649v;
        this.f7348a = str;
    }

    public void run() {
        this.f7349b.f7344a.loadUrl(this.f7348a);
    }
}
