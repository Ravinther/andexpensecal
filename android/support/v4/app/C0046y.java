package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: android.support.v4.app.y */
class C0046y implements AnimationListener {
    final /* synthetic */ C0032l f312a;
    final /* synthetic */ C0043v f313b;

    C0046y(C0043v c0043v, C0032l c0032l) {
        this.f313b = c0043v;
        this.f312a = c0032l;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f312a.f234l != null) {
            this.f312a.f234l = null;
            this.f313b.m395a(this.f312a, this.f312a.f235m, 0, 0, false);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
