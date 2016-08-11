package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class lf implements Callable<Void> {
    final /* synthetic */ Runnable f7061a;

    lf(Runnable runnable) {
        this.f7061a = runnable;
    }

    public Void m5996a() {
        this.f7061a.run();
        return null;
    }

    public /* synthetic */ Object call() {
        return m5996a();
    }
}
