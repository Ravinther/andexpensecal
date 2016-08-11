package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

final class ai implements OnPreDrawListener {
    final /* synthetic */ View f121a;
    final /* synthetic */ Transition f122b;
    final /* synthetic */ View f123c;
    final /* synthetic */ ArrayList f124d;
    final /* synthetic */ Transition f125e;
    final /* synthetic */ ArrayList f126f;
    final /* synthetic */ Transition f127g;
    final /* synthetic */ ArrayList f128h;
    final /* synthetic */ Map f129i;
    final /* synthetic */ ArrayList f130j;
    final /* synthetic */ Transition f131k;

    ai(View view, Transition transition, View view2, ArrayList arrayList, Transition transition2, ArrayList arrayList2, Transition transition3, ArrayList arrayList3, Map map, ArrayList arrayList4, Transition transition4) {
        this.f121a = view;
        this.f122b = transition;
        this.f123c = view2;
        this.f124d = arrayList;
        this.f125e = transition2;
        this.f126f = arrayList2;
        this.f127g = transition3;
        this.f128h = arrayList3;
        this.f129i = map;
        this.f130j = arrayList4;
        this.f131k = transition4;
    }

    public boolean onPreDraw() {
        this.f121a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f122b != null) {
            this.f122b.removeTarget(this.f123c);
            ae.m177a(this.f122b, this.f124d);
        }
        if (this.f125e != null) {
            ae.m177a(this.f125e, this.f126f);
        }
        if (this.f127g != null) {
            ae.m177a(this.f127g, this.f128h);
        }
        for (Entry entry : this.f129i.entrySet()) {
            ((View) entry.getValue()).setTransitionName((String) entry.getKey());
        }
        int size = this.f130j.size();
        for (int i = 0; i < size; i++) {
            this.f131k.excludeTarget((View) this.f130j.get(i), false);
        }
        this.f131k.excludeTarget(this.f123c, false);
        return true;
    }
}
