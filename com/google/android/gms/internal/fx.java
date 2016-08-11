package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

@id
final class fx extends RelativeLayout {
    private final ln f6632a;

    public fx(Context context, String str) {
        super(context);
        this.f6632a = new ln(context, str);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6632a.m6039a(motionEvent);
        return false;
    }
}
