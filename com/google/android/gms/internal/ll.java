package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@id
public class ll<T> implements Future<T> {
    private final Object f7070a;
    private T f7071b;
    private boolean f7072c;
    private boolean f7073d;

    public ll() {
        this.f7070a = new Object();
        this.f7071b = null;
        this.f7072c = false;
        this.f7073d = false;
    }

    public void m6035a(T t) {
        synchronized (this.f7070a) {
            if (this.f7072c) {
                throw new IllegalStateException("Provided CallbackFuture with multiple values.");
            }
            this.f7072c = true;
            this.f7071b = t;
            this.f7070a.notifyAll();
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f7070a) {
            if (this.f7072c) {
                return false;
            }
            this.f7073d = true;
            this.f7072c = true;
            this.f7070a.notifyAll();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.f7070a) {
            if (!this.f7072c) {
                try {
                    this.f7070a.wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.f7073d) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            t = this.f7071b;
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f7070a) {
            if (!this.f7072c) {
                try {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis != 0) {
                        this.f7070a.wait(toMillis);
                    }
                } catch (InterruptedException e) {
                }
            }
            if (!this.f7072c) {
                throw new TimeoutException("CallbackFuture timed out.");
            } else if (this.f7073d) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                t = this.f7071b;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f7070a) {
            z = this.f7073d;
        }
        return z;
    }

    public boolean isDone() {
        boolean z;
        synchronized (this.f7070a) {
            z = this.f7072c;
        }
        return z;
    }
}
