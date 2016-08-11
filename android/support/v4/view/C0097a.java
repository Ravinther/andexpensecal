package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p006a.C0071a;
import android.support.v4.view.p006a.C0083k;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a */
public class C0097a {
    private static final C0098d f417b;
    private static final Object f418c;
    final Object f419a;

    static {
        if (VERSION.SDK_INT >= 16) {
            f417b = new C0103e();
        } else if (VERSION.SDK_INT >= 14) {
            f417b = new C0100b();
        } else {
            f417b = new C0099g();
        }
        f418c = f417b.m788a();
    }

    public C0097a() {
        this.f419a = f417b.m789a(this);
    }

    public C0083k m724a(View view) {
        return f417b.m787a(f418c, view);
    }

    Object m725a() {
        return this.f419a;
    }

    public void m726a(View view, int i) {
        f417b.m790a(f418c, view, i);
    }

    public void m727a(View view, C0071a c0071a) {
        f417b.m791a(f418c, view, c0071a);
    }

    public void m728a(View view, AccessibilityEvent accessibilityEvent) {
        f417b.m797d(f418c, view, accessibilityEvent);
    }

    public boolean m729a(View view, int i, Bundle bundle) {
        return f417b.m792a(f418c, view, i, bundle);
    }

    public boolean m730a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f417b.m794a(f418c, viewGroup, view, accessibilityEvent);
    }

    public boolean m731b(View view, AccessibilityEvent accessibilityEvent) {
        return f417b.m793a(f418c, view, accessibilityEvent);
    }

    public void m732c(View view, AccessibilityEvent accessibilityEvent) {
        f417b.m796c(f418c, view, accessibilityEvent);
    }

    public void m733d(View view, AccessibilityEvent accessibilityEvent) {
        f417b.m795b(f418c, view, accessibilityEvent);
    }
}
