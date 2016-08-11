package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class lh implements ThreadFactory {
    private final AtomicInteger f7063a;

    lh() {
        this.f7063a = new AtomicInteger(1);
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker #" + this.f7063a.getAndIncrement());
    }
}
