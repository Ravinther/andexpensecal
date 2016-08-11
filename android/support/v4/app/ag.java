package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

final class ag implements OnPreDrawListener {
    final /* synthetic */ View f113a;
    final /* synthetic */ ak f114b;
    final /* synthetic */ Map f115c;
    final /* synthetic */ Map f116d;
    final /* synthetic */ Transition f117e;
    final /* synthetic */ ArrayList f118f;

    ag(View view, ak akVar, Map map, Map map2, Transition transition, ArrayList arrayList) {
        this.f113a = view;
        this.f114b = akVar;
        this.f115c = map;
        this.f116d = map2;
        this.f117e = transition;
        this.f118f = arrayList;
    }

    public boolean onPreDraw() {
        this.f113a.getViewTreeObserver().removeOnPreDrawListener(this);
        View a = this.f114b.m184a();
        if (a != null) {
            if (!this.f115c.isEmpty()) {
                ae.m179a(this.f116d, a);
                this.f116d.keySet().retainAll(this.f115c.values());
                for (Entry entry : this.f115c.entrySet()) {
                    View view = (View) this.f116d.get((String) entry.getValue());
                    if (view != null) {
                        view.setTransitionName((String) entry.getKey());
                    }
                }
            }
            if (this.f117e != null) {
                ae.m182b(this.f118f, a);
                this.f118f.removeAll(this.f116d.values());
                ae.m181b(this.f117e, this.f118f);
            }
        }
        return true;
    }
}
