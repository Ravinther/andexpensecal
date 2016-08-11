package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class ah extends EpicenterCallback {
    final /* synthetic */ aj f119a;
    private Rect f120b;

    ah(aj ajVar) {
        this.f119a = ajVar;
    }

    public Rect onGetEpicenter(Transition transition) {
        if (this.f120b == null && this.f119a.f132a != null) {
            this.f120b = ae.m183c(this.f119a.f132a);
        }
        return this.f120b;
    }
}
