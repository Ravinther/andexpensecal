package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

@id
public class hz implements InAppPurchaseResult {
    private final hq f6732a;

    public hz(hq hqVar) {
        this.f6732a = hqVar;
    }

    public void finishPurchase() {
        try {
            this.f6732a.m5658e();
        } catch (Throwable e) {
            ly.m6073d("Could not forward finishPurchase to InAppPurchaseResult", e);
        }
    }

    public String getProductId() {
        try {
            return this.f6732a.m5655b();
        } catch (Throwable e) {
            ly.m6073d("Could not forward getProductId to InAppPurchaseResult", e);
            return null;
        }
    }

    public Intent getPurchaseData() {
        try {
            return this.f6732a.m5656c();
        } catch (Throwable e) {
            ly.m6073d("Could not forward getPurchaseData to InAppPurchaseResult", e);
            return null;
        }
    }

    public int getResultCode() {
        try {
            return this.f6732a.m5657d();
        } catch (Throwable e) {
            ly.m6073d("Could not forward getPurchaseData to InAppPurchaseResult", e);
            return 0;
        }
    }

    public boolean isVerified() {
        try {
            return this.f6732a.m5654a();
        } catch (Throwable e) {
            ly.m6073d("Could not forward isVerified to InAppPurchaseResult", e);
            return false;
        }
    }
}
