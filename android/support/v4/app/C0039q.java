package android.support.v4.app;

import android.view.View;
import android.view.Window;

/* renamed from: android.support.v4.app.q */
class C0039q implements C0034s {
    final /* synthetic */ C0037o f273a;

    C0039q(C0037o c0037o) {
        this.f273a = c0037o;
    }

    public View m367a(int i) {
        return this.f273a.findViewById(i);
    }

    public boolean m368a() {
        Window window = this.f273a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
