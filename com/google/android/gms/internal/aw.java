package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@id
public final class aw extends bk {
    private final AppEventListener f6250a;

    public aw(AppEventListener appEventListener) {
        this.f6250a = appEventListener;
    }

    public void m5076a(String str, String str2) {
        this.f6250a.onAppEvent(str, str2);
    }
}
