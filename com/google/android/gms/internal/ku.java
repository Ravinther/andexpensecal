package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

@id
final class ku {
    private long f7018a;
    private long f7019b;

    public ku() {
        this.f7018a = -1;
        this.f7019b = -1;
    }

    public long m5938a() {
        return this.f7019b;
    }

    public void m5939b() {
        this.f7019b = SystemClock.elapsedRealtime();
    }

    public void m5940c() {
        this.f7018a = SystemClock.elapsedRealtime();
    }

    public Bundle m5941d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f7018a);
        bundle.putLong("tclose", this.f7019b);
        return bundle;
    }
}
