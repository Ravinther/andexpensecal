package android.support.v4.app;

import android.view.View;

/* renamed from: android.support.v4.app.m */
class C0035m implements C0034s {
    final /* synthetic */ C0032l f258a;

    C0035m(C0032l c0032l) {
        this.f258a = c0032l;
    }

    public View m351a(int i) {
        if (this.f258a.f225S != null) {
            return this.f258a.f225S.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    public boolean m352a() {
        return this.f258a.f225S != null;
    }
}
