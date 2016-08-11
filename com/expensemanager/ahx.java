package com.expensemanager;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class ahx extends SimpleOnGestureListener {
    final /* synthetic */ TouchListView f4141a;

    ahx(TouchListView touchListView) {
        this.f4141a = touchListView;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f4141a.f3663a == null) {
            return false;
        }
        if (f <= 1000.0f) {
            return true;
        }
        Rect b = this.f4141a.f3678p;
        this.f4141a.f3663a.getDrawingRect(b);
        if (motionEvent2.getX() <= ((float) ((b.right * 2) / 3))) {
            return true;
        }
        this.f4141a.m3636b();
        this.f4141a.f3672j.m3835a(this.f4141a.f3667e);
        this.f4141a.m3634a(true);
        return true;
    }
}
