package com.google.ads.mediation.admob;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* renamed from: com.google.ads.mediation.admob.a */
final class C0556a extends AdListener {
    private final AdMobAdapter f5978a;
    private final MediationBannerListener f5979b;

    public C0556a(AdMobAdapter adMobAdapter, MediationBannerListener mediationBannerListener) {
        this.f5978a = adMobAdapter;
        this.f5979b = mediationBannerListener;
    }

    public void onAdClosed() {
        this.f5979b.onAdClosed(this.f5978a);
    }

    public void onAdFailedToLoad(int i) {
        this.f5979b.onAdFailedToLoad(this.f5978a, i);
    }

    public void onAdLeftApplication() {
        this.f5979b.onAdLeftApplication(this.f5978a);
    }

    public void onAdLoaded() {
        this.f5979b.onAdLoaded(this.f5978a);
    }

    public void onAdOpened() {
        this.f5979b.onAdClicked(this.f5978a);
        this.f5979b.onAdOpened(this.f5978a);
    }
}
