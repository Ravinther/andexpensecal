package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class af extends EpicenterCallback {
    final /* synthetic */ Rect f112a;

    af(Rect rect) {
        this.f112a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.f112a;
    }
}
