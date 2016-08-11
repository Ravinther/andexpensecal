package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

@id
public final class le {
    private static final ThreadFactory f7059a;
    private static final ExecutorService f7060b;

    static {
        f7059a = new lh();
        f7060b = Executors.newFixedThreadPool(10, f7059a);
    }

    public static Future<Void> m5994a(Runnable runnable) {
        return m5995a(new lf(runnable));
    }

    public static <T> Future<T> m5995a(Callable<T> callable) {
        try {
            return f7060b.submit(new lg(callable));
        } catch (Throwable e) {
            ly.m6073d("Thread execution is rejected.", e);
            return new lm(null);
        }
    }
}
