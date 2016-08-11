package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ly;

/* renamed from: com.google.android.gms.ads.mediation.customevent.b */
class C0597b implements CustomEventInterstitialListener {
    final /* synthetic */ CustomEventAdapter f6079a;
    private final CustomEventAdapter f6080b;
    private final MediationInterstitialListener f6081c;

    public C0597b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f6079a = customEventAdapter;
        this.f6080b = customEventAdapter2;
        this.f6081c = mediationInterstitialListener;
    }

    public void onAdClicked() {
        ly.m6065a("Custom event adapter called onAdClicked.");
        this.f6081c.onAdClicked(this.f6080b);
    }

    public void onAdClosed() {
        ly.m6065a("Custom event adapter called onAdClosed.");
        this.f6081c.onAdClosed(this.f6080b);
    }

    public void onAdFailedToLoad(int i) {
        ly.m6065a("Custom event adapter called onFailedToReceiveAd.");
        this.f6081c.onAdFailedToLoad(this.f6080b, i);
    }

    public void onAdLeftApplication() {
        ly.m6065a("Custom event adapter called onAdLeftApplication.");
        this.f6081c.onAdLeftApplication(this.f6080b);
    }

    public void onAdLoaded() {
        ly.m6065a("Custom event adapter called onReceivedAd.");
        this.f6081c.onAdLoaded(this.f6079a);
    }

    public void onAdOpened() {
        ly.m6065a("Custom event adapter called onAdOpened.");
        this.f6081c.onAdOpened(this.f6080b);
    }
}
