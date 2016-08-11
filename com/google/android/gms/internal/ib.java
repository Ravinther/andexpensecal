package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

@id
public final class ib extends hu {
    private final PlayStorePurchaseListener f6736a;

    public ib(PlayStorePurchaseListener playStorePurchaseListener) {
        this.f6736a = playStorePurchaseListener;
    }

    public void m5744a(hq hqVar) {
        this.f6736a.onInAppPurchaseFinished(new hz(hqVar));
    }

    public boolean m5745a(String str) {
        return this.f6736a.isValidPurchase(str);
    }
}
