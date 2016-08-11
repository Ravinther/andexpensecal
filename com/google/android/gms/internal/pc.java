package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

class pc implements ComponentCallbacks {
    final /* synthetic */ pb f7293a;

    pc(pb pbVar) {
        this.f7293a = pbVar;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f7293a.f7288c != null && this.f7293a.f7288c.f7310j != null && this.f7293a.f7288c.f7310j.f6976b != null) {
            this.f7293a.f7288c.f7310j.f6976b.m6083a();
        }
    }

    public void onLowMemory() {
    }
}
