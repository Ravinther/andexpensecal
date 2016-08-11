package android.support.v4.view;

import android.support.v4.view.p006a.C0071a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.c */
class C0102c implements C0101j {
    final /* synthetic */ C0097a f438a;
    final /* synthetic */ C0100b f439b;

    C0102c(C0100b c0100b, C0097a c0097a) {
        this.f439b = c0100b;
        this.f438a = c0097a;
    }

    public void m840a(View view, int i) {
        this.f438a.m726a(view, i);
    }

    public void m841a(View view, Object obj) {
        this.f438a.m727a(view, new C0071a(obj));
    }

    public boolean m842a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f438a.m731b(view, accessibilityEvent);
    }

    public boolean m843a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f438a.m730a(viewGroup, view, accessibilityEvent);
    }

    public void m844b(View view, AccessibilityEvent accessibilityEvent) {
        this.f438a.m733d(view, accessibilityEvent);
    }

    public void m845c(View view, AccessibilityEvent accessibilityEvent) {
        this.f438a.m732c(view, accessibilityEvent);
    }

    public void m846d(View view, AccessibilityEvent accessibilityEvent) {
        this.f438a.m728a(view, accessibilityEvent);
    }
}
