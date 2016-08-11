package android.support.v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.u */
class C0118u implements C0117w {
    C0118u() {
    }

    public int m903a(MotionEvent motionEvent, int i) {
        return i == 0 ? 0 : -1;
    }

    public int m904b(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    public float m905c(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getX();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    public float m906d(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getY();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
}
