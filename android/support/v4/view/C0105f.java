package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p006a.C0071a;
import android.support.v4.view.p006a.C0083k;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.f */
class C0105f implements C0104m {
    final /* synthetic */ C0097a f440a;
    final /* synthetic */ C0103e f441b;

    C0105f(C0103e c0103e, C0097a c0097a) {
        this.f441b = c0103e;
        this.f440a = c0097a;
    }

    public Object m859a(View view) {
        C0083k a = this.f440a.m724a(view);
        return a != null ? a.m695a() : null;
    }

    public void m860a(View view, int i) {
        this.f440a.m726a(view, i);
    }

    public void m861a(View view, Object obj) {
        this.f440a.m727a(view, new C0071a(obj));
    }

    public boolean m862a(View view, int i, Bundle bundle) {
        return this.f440a.m729a(view, i, bundle);
    }

    public boolean m863a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f440a.m731b(view, accessibilityEvent);
    }

    public boolean m864a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f440a.m730a(viewGroup, view, accessibilityEvent);
    }

    public void m865b(View view, AccessibilityEvent accessibilityEvent) {
        this.f440a.m733d(view, accessibilityEvent);
    }

    public void m866c(View view, AccessibilityEvent accessibilityEvent) {
        this.f440a.m732c(view, accessibilityEvent);
    }

    public void m867d(View view, AccessibilityEvent accessibilityEvent) {
        this.f440a.m728a(view, accessibilityEvent);
    }
}
