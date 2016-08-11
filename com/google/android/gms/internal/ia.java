package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchase;

@id
public class ia implements InAppPurchase {
    private final he f6735a;

    public ia(he heVar) {
        this.f6735a = heVar;
    }

    public String getProductId() {
        try {
            return this.f6735a.m5635a();
        } catch (Throwable e) {
            ly.m6073d("Could not forward getProductId to InAppPurchase", e);
            return null;
        }
    }

    public void recordPlayBillingResolution(int i) {
        try {
            this.f6735a.m5637c(i);
        } catch (Throwable e) {
            ly.m6073d("Could not forward recordPlayBillingResolution to InAppPurchase", e);
        }
    }

    public void recordResolution(int i) {
        try {
            this.f6735a.m5636b(i);
        } catch (Throwable e) {
            ly.m6073d("Could not forward recordResolution to InAppPurchase", e);
        }
    }
}
