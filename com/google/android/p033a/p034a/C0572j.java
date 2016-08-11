package com.google.android.p033a.p034a;

import android.util.Log;

/* renamed from: com.google.android.a.a.j */
class C0572j extends C0566d {
    final /* synthetic */ C0571i f6010a;
    private final C0575n f6011b;
    private Runnable f6012c;

    public C0572j(C0571i c0571i, C0575n c0575n) {
        this.f6010a = c0571i;
        this.f6011b = c0575n;
        this.f6012c = new C0573k(this, c0571i);
        m4851a();
    }

    private void m4851a() {
        Log.i("LicenseChecker", "Start monitoring timeout.");
        this.f6010a.f6005f.postDelayed(this.f6012c, 10000);
    }

    private void m4852b() {
        Log.i("LicenseChecker", "Clearing timeout.");
        this.f6010a.f6005f.removeCallbacks(this.f6012c);
    }

    public void m4854a(int i, String str, String str2) {
        this.f6010a.f6005f.post(new C0574l(this, i, str, str2));
    }
}
