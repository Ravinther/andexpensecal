package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

/* renamed from: android.support.v4.view.t */
public class C0116t {
    static final C0117w f445a;

    static {
        if (VERSION.SDK_INT >= 5) {
            f445a = new C0119v();
        } else {
            f445a = new C0118u();
        }
    }

    public static int m894a(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int m895a(MotionEvent motionEvent, int i) {
        return f445a.m899a(motionEvent, i);
    }

    public static int m896b(MotionEvent motionEvent, int i) {
        return f445a.m900b(motionEvent, i);
    }

    public static float m897c(MotionEvent motionEvent, int i) {
        return f445a.m901c(motionEvent, i);
    }

    public static float m898d(MotionEvent motionEvent, int i) {
        return f445a.m902d(motionEvent, i);
    }
}
