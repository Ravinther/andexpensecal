package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ly;

/* renamed from: com.google.android.gms.ads.mediation.customevent.a */
final class C0596a implements CustomEventBannerListener {
    private final CustomEventAdapter f6077a;
    private final MediationBannerListener f6078b;

    public C0596a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.f6077a = customEventAdapter;
        this.f6078b = mediationBannerListener;
    }

    public void onAdClicked() {
        ly.m6065a("Custom event adapter called onAdClicked.");
        this.f6078b.onAdClicked(this.f6077a);
    }

    public void onAdClosed() {
        ly.m6065a("Custom event adapter called onAdClosed.");
        this.f6078b.onAdClosed(this.f6077a);
    }

    public void onAdFailedToLoad(int i) {
        ly.m6065a("Custom event adapter called onAdFailedToLoad.");
        this.f6078b.onAdFailedToLoad(this.f6077a, i);
    }

    public void onAdLeftApplication() {
        ly.m6065a("Custom event adapter called onAdLeftApplication.");
        this.f6078b.onAdLeftApplication(this.f6077a);
    }

    public void onAdLoaded(View view) {
        ly.m6065a("Custom event adapter called onAdLoaded.");
        this.f6077a.m4897a(view);
        this.f6078b.onAdLoaded(this.f6077a);
    }

    public void onAdOpened() {
        ly.m6065a("Custom event adapter called onAdOpened.");
        this.f6078b.onAdOpened(this.f6077a);
    }
}
