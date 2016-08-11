package com.google.android.p033a.p034a;

import android.util.Log;

/* renamed from: com.google.android.a.a.k */
class C0573k implements Runnable {
    final /* synthetic */ C0571i f6013a;
    final /* synthetic */ C0572j f6014b;

    C0573k(C0572j c0572j, C0571i c0571i) {
        this.f6014b = c0572j;
        this.f6013a = c0571i;
    }

    public void run() {
        Log.i("LicenseChecker", "Check timed out.");
        this.f6014b.f6010a.m4846b(this.f6014b.f6011b);
        this.f6014b.f6010a.m4842a(this.f6014b.f6011b);
    }
}
