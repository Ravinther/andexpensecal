package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.bp;

public final class PublisherInterstitialAd {
    private final bp f6058a;

    public PublisherInterstitialAd(Context context) {
        this.f6058a = new bp(context, this);
    }

    public AdListener getAdListener() {
        return this.f6058a.m5197a();
    }

    public String getAdUnitId() {
        return this.f6058a.m5204b();
    }

    public AppEventListener getAppEventListener() {
        return this.f6058a.m5205c();
    }

    public String getMediationAdapterClassName() {
        return this.f6058a.m5208f();
    }

    public boolean isLoaded() {
        return this.f6058a.m5207e();
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f6058a.m5202a(publisherAdRequest.m4887Y());
    }

    public void setAdListener(AdListener adListener) {
        this.f6058a.m5198a(adListener);
    }

    public void setAdUnitId(String str) {
        this.f6058a.m5203a(str);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f6058a.m5199a(appEventListener);
    }

    public void show() {
        this.f6058a.m5209g();
    }
}
