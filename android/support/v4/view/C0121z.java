package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

/* renamed from: android.support.v4.view.z */
public class C0121z {
    static final ac f446a;

    static {
        if (VERSION.SDK_INT >= 11) {
            f446a = new ab();
        } else {
            f446a = new aa();
        }
    }

    public static float m915a(VelocityTracker velocityTracker, int i) {
        return f446a.m734a(velocityTracker, i);
    }
}
