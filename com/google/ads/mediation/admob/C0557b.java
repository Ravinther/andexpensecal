package com.google.ads.mediation.admob;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* renamed from: com.google.ads.mediation.admob.b */
final class C0557b extends AdListener {
    private final AdMobAdapter f5980a;
    private final MediationInterstitialListener f5981b;

    public C0557b(AdMobAdapter adMobAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f5980a = adMobAdapter;
        this.f5981b = mediationInterstitialListener;
    }

    public void onAdClosed() {
        this.f5981b.onAdClosed(this.f5980a);
    }

    public void onAdFailedToLoad(int i) {
        this.f5981b.onAdFailedToLoad(this.f5980a, i);
    }

    public void onAdLeftApplication() {
        this.f5981b.onAdLeftApplication(this.f5980a);
    }

    public void onAdLoaded() {
        this.f5981b.onAdLoaded(this.f5980a);
    }

    public void onAdOpened() {
        this.f5981b.onAdOpened(this.f5980a);
    }
}
