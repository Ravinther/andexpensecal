package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: android.support.v4.app.g */
class C0028g implements OnPreDrawListener {
    final /* synthetic */ View f186a;
    final /* synthetic */ C0030i f187b;
    final /* synthetic */ int f188c;
    final /* synthetic */ Object f189d;
    final /* synthetic */ C0025d f190e;

    C0028g(C0025d c0025d, View view, C0030i c0030i, int i, Object obj) {
        this.f190e = c0025d;
        this.f186a = view;
        this.f187b = c0030i;
        this.f188c = i;
        this.f189d = obj;
    }

    public boolean onPreDraw() {
        this.f186a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f190e.m225a(this.f187b, this.f188c, this.f189d);
        return true;
    }
}
