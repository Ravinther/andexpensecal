package android.support.v4.app;

import android.support.v4.p004c.C0054a;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.f */
class C0027f implements OnPreDrawListener {
    final /* synthetic */ View f178a;
    final /* synthetic */ Object f179b;
    final /* synthetic */ ArrayList f180c;
    final /* synthetic */ C0030i f181d;
    final /* synthetic */ boolean f182e;
    final /* synthetic */ C0032l f183f;
    final /* synthetic */ C0032l f184g;
    final /* synthetic */ C0025d f185h;

    C0027f(C0025d c0025d, View view, Object obj, ArrayList arrayList, C0030i c0030i, boolean z, C0032l c0032l, C0032l c0032l2) {
        this.f185h = c0025d;
        this.f178a = view;
        this.f179b = obj;
        this.f180c = arrayList;
        this.f181d = c0030i;
        this.f182e = z;
        this.f183f = c0032l;
        this.f184g = c0032l2;
    }

    public boolean onPreDraw() {
        this.f178a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f179b != null) {
            ae.m177a(this.f179b, this.f180c);
            this.f180c.clear();
            C0054a a = this.f185h.m216a(this.f181d, this.f182e, this.f183f);
            if (a.isEmpty()) {
                this.f180c.add(this.f181d.f203d);
            } else {
                this.f180c.addAll(a.values());
            }
            ae.m181b(this.f179b, this.f180c);
            this.f185h.m230a(a, this.f181d);
            this.f185h.m226a(this.f181d, this.f183f, this.f184g, this.f182e, a);
        }
        return true;
    }
}
