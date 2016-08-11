package com.google.android.gms.internal;

import android.content.Context;

final class lj implements Runnable {
    final /* synthetic */ Context f7069a;

    lj(Context context) {
        this.f7069a = context;
    }

    public void run() {
        synchronized (li.f7064a) {
            li.f7067d = li.m6034f(this.f7069a);
            li.f7064a.notifyAll();
        }
    }
}
