package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.c */
class C0629c implements Runnable {
    final /* synthetic */ pb f6360a;
    final /* synthetic */ C0628b f6361b;
    private final WeakReference<pb> f6362c;

    C0629c(C0628b c0628b, pb pbVar) {
        this.f6361b = c0628b;
        this.f6360a = pbVar;
        this.f6362c = new WeakReference(this.f6360a);
    }

    public void run() {
        this.f6361b.f6264d = false;
        pb pbVar = (pb) this.f6362c.get();
        if (pbVar != null) {
            pbVar.m6453b(this.f6361b.f6263c);
        }
    }
}
