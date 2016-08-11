package android.support.v4.view.p006a;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.ad */
class ad {
    public static Object m605a() {
        return AccessibilityRecord.obtain();
    }

    public static void m606a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    public static void m607a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    public static void m608b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    public static void m609c(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
