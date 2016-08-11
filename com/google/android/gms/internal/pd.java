package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class pd implements OnTouchListener {
    final /* synthetic */ pi f7294a;
    final /* synthetic */ pb f7295b;

    pd(pb pbVar, pi piVar) {
        this.f7295b = pbVar;
        this.f7294a = piVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f7294a.m6477a();
        return false;
    }
}
