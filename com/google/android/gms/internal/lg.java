package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;

final class lg implements Callable<T> {
    final /* synthetic */ Callable f7062a;

    lg(Callable callable) {
        this.f7062a = callable;
    }

    public T call() {
        try {
            Process.setThreadPriority(10);
            return this.f7062a.call();
        } catch (Throwable e) {
            kw.m5951a(e);
            return null;
        }
    }
}
