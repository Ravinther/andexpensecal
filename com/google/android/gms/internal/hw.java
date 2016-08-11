package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

@id
public final class hw extends hi {
    private final InAppPurchaseListener f6730a;

    public hw(InAppPurchaseListener inAppPurchaseListener) {
        this.f6730a = inAppPurchaseListener;
    }

    public void m5736a(he heVar) {
        this.f6730a.onInAppPurchaseRequested(new ia(heVar));
    }
}
