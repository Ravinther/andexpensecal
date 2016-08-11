package android.support.v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.x */
class C0120x {
    public static int m911a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    public static int m912b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    public static float m913c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static float m914d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }
}
