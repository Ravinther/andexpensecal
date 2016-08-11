package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

@id
public final class aq extends ba {
    private final AdListener f6234a;

    public aq(AdListener adListener) {
        this.f6234a = adListener;
    }

    public void m5057a() {
        this.f6234a.onAdClosed();
    }

    public void m5058a(int i) {
        this.f6234a.onAdFailedToLoad(i);
    }

    public void m5059b() {
        this.f6234a.onAdLeftApplication();
    }

    public void m5060c() {
        this.f6234a.onAdLoaded();
    }

    public void m5061d() {
        this.f6234a.onAdOpened();
    }
}
