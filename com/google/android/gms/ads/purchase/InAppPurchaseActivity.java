package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.ly;

public final class InAppPurchaseActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
    public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";
    private hk f6082a;

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (this.f6082a != null) {
                this.f6082a.m5646a(i, i2, intent);
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onActivityResult to in-app purchase manager:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6082a = hx.m5737a((Activity) this);
        if (this.f6082a == null) {
            ly.m6074e("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try {
            this.f6082a.m5645a();
        } catch (Throwable e) {
            ly.m6073d("Could not forward onCreate to in-app purchase manager:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.f6082a != null) {
                this.f6082a.m5647b();
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onDestroy to in-app purchase manager:", e);
        }
        super.onDestroy();
    }
}
