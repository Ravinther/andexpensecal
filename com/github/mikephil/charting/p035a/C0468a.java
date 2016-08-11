package com.github.mikephil.charting.p035a;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;

@SuppressLint({"NewApi"})
/* renamed from: com.github.mikephil.charting.a.a */
public class C0468a {
    protected float f5562a;
    protected float f5563b;
    private AnimatorUpdateListener f5564c;

    public C0468a() {
        this.f5562a = 1.0f;
        this.f5563b = 1.0f;
    }

    public C0468a(AnimatorUpdateListener animatorUpdateListener) {
        this.f5562a = 1.0f;
        this.f5563b = 1.0f;
        this.f5564c = animatorUpdateListener;
    }

    public float m4254a() {
        return this.f5562a;
    }

    public float m4255b() {
        return this.f5563b;
    }
}
