package com.google.android.gms.internal;

import android.os.Handler;

/* renamed from: com.google.android.gms.internal.d */
public class C0630d {
    private final Handler f6397a;

    public C0630d(Handler handler) {
        this.f6397a = handler;
    }

    public void m5303a(Runnable runnable) {
        this.f6397a.removeCallbacks(runnable);
    }

    public boolean m5304a(Runnable runnable, long j) {
        return this.f6397a.postDelayed(runnable, j);
    }
}
