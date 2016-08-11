package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.bp;

public final class InterstitialAd {
    private final bp f6053a;

    public InterstitialAd(Context context) {
        this.f6053a = new bp(context);
    }

    public AdListener getAdListener() {
        return this.f6053a.m5197a();
    }

    public String getAdUnitId() {
        return this.f6053a.m5204b();
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.f6053a.m5206d();
    }

    public String getMediationAdapterClassName() {
        return this.f6053a.m5208f();
    }

    public boolean isLoaded() {
        return this.f6053a.m5207e();
    }

    public void loadAd(AdRequest adRequest) {
        this.f6053a.m5202a(adRequest.m4884a());
    }

    public void setAdListener(AdListener adListener) {
        this.f6053a.m5198a(adListener);
    }

    public void setAdUnitId(String str) {
        this.f6053a.m5203a(str);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        this.f6053a.m5200a(inAppPurchaseListener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        this.f6053a.m5201a(playStorePurchaseListener, str);
    }

    public void show() {
        this.f6053a.m5209g();
    }
}
