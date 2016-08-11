package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

@id
final class pg extends ViewSwitcher {
    private final ln f7300a;

    public pg(Context context) {
        super(context);
        this.f7300a = new ln(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f7300a.m6039a(motionEvent);
        return false;
    }
}
