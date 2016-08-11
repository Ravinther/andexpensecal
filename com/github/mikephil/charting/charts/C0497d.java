package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.github.mikephil.charting.charts.d */
class C0497d implements AnimatorUpdateListener {
    final /* synthetic */ C0489c f5753a;

    C0497d(C0489c c0489c) {
        this.f5753a = c0489c;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5753a.postInvalidate();
    }
}
