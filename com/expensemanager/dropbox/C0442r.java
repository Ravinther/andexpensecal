package com.expensemanager.dropbox;

import com.dropbox.client2.C0386j;

/* renamed from: com.expensemanager.dropbox.r */
class C0442r extends C0386j {
    final /* synthetic */ C0441q f4558a;

    C0442r(C0441q c0441q) {
        this.f4558a = c0441q;
    }

    public long m4095a() {
        return 500;
    }

    public void m4096a(long j, long j2) {
        this.f4558a.publishProgress(new Long[]{Long.valueOf(j2)});
    }
}
