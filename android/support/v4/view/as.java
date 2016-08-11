package android.support.v4.view;

import android.view.View;

class as {
    public static void m778a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void m779a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void m780a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static int m781b(View view) {
        return view.getImportantForAccessibility();
    }
}
