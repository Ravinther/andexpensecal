package com.google.android.gms.internal;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;

@id
final class fy {
    public final int f6633a;
    public final LayoutParams f6634b;
    public final ViewGroup f6635c;

    public fy(ma maVar) {
        this.f6634b = maVar.getLayoutParams();
        ViewParent parent = maVar.getParent();
        if (parent instanceof ViewGroup) {
            this.f6635c = (ViewGroup) parent;
            this.f6633a = this.f6635c.indexOfChild(maVar);
            this.f6635c.removeView(maVar);
            maVar.m6090a(true);
            return;
        }
        throw new fw("Could not get the parent of the WebView for an overlay.");
    }
}
