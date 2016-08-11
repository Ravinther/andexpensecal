package android.support.v4.view.p006a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.v */
final class C0095v extends AccessibilityNodeProvider {
    final /* synthetic */ C0090w f414a;

    C0095v(C0090w c0090w) {
        this.f414a = c0090w;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.f414a.m709a(i);
    }

    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        return this.f414a.m710a(str, i);
    }

    public AccessibilityNodeInfo findFocus(int i) {
        return (AccessibilityNodeInfo) this.f414a.m712b(i);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f414a.m711a(i, i2, bundle);
    }
}
