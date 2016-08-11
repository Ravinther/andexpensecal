package com.google.android.p033a.p034a;

import android.util.Log;

/* renamed from: com.google.android.a.a.l */
class C0574l implements Runnable {
    final /* synthetic */ int f6015a;
    final /* synthetic */ String f6016b;
    final /* synthetic */ String f6017c;
    final /* synthetic */ C0572j f6018d;

    C0574l(C0572j c0572j, int i, String str, String str2) {
        this.f6018d = c0572j;
        this.f6015a = i;
        this.f6016b = str;
        this.f6017c = str2;
    }

    public void run() {
        Log.i("LicenseChecker", "Received response.");
        if (this.f6018d.f6010a.f6008i.contains(this.f6018d.f6011b)) {
            this.f6018d.m4852b();
            this.f6018d.f6011b.m4859a(this.f6018d.f6010a.f6002c, this.f6015a, this.f6016b, this.f6017c);
            this.f6018d.f6010a.m4842a(this.f6018d.f6011b);
        }
    }
}
