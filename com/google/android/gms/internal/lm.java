package com.google.android.gms.internal;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@id
public class lm<T> implements Future<T> {
    private final T f7074a;

    public lm(T t) {
        this.f7074a = t;
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public T get() {
        return this.f7074a;
    }

    public T get(long j, TimeUnit timeUnit) {
        return this.f7074a;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
