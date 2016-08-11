package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class ar {
    public static void m776a(View view, Object obj) {
        view.setAccessibilityDelegate((AccessibilityDelegate) obj);
    }

    public static boolean m777a(View view, int i) {
        return view.canScrollHorizontally(i);
    }
}
