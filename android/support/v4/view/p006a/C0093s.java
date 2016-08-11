package android.support.v4.view.p006a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.s */
final class C0093s extends AccessibilityNodeProvider {
    final /* synthetic */ C0087t f413a;

    C0093s(C0087t c0087t) {
        this.f413a = c0087t;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.f413a.m702a(i);
    }

    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        return this.f413a.m703a(str, i);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f413a.m704a(i, i2, bundle);
    }
}
