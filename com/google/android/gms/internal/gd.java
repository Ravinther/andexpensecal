package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

class gd implements Runnable {
    final /* synthetic */ gb f6647a;
    final /* synthetic */ gc f6648b;
    private final WeakReference<gb> f6649c;

    gd(gc gcVar, gb gbVar) {
        this.f6648b = gcVar;
        this.f6647a = gbVar;
        this.f6649c = new WeakReference(this.f6647a);
    }

    public void run() {
        gb gbVar = (gb) this.f6649c.get();
        if (!this.f6648b.f6646b && gbVar != null) {
            gbVar.m5586e();
            this.f6648b.m5589b();
        }
    }
}
