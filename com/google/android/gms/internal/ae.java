package com.google.android.gms.internal;

import android.view.View;

class ae implements Runnable {
    final /* synthetic */ View f6212a;
    final /* synthetic */ ad f6213b;

    ae(ad adVar, View view) {
        this.f6213b = adVar;
        this.f6212a = view;
    }

    public void run() {
        this.f6213b.m5026b(this.f6212a);
    }
}
