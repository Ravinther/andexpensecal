package com.expensemanager.dropbox;

import com.dropbox.client2.C0386j;

/* renamed from: com.expensemanager.dropbox.o */
class C0439o extends C0386j {
    final /* synthetic */ C0438n f4547a;

    C0439o(C0438n c0438n) {
        this.f4547a = c0438n;
    }

    public long m4086a() {
        return 500;
    }

    public void m4087a(long j, long j2) {
        this.f4547a.publishProgress(new Long[]{Long.valueOf(j2)});
    }
}
