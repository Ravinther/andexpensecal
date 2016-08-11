package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ly;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    private View f6073a;
    private CustomEventBanner f6074b;
    private CustomEventInterstitial f6075c;

    private static <T> T m4896a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            ly.m6074e("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    private void m4897a(View view) {
        this.f6073a = view;
    }

    public View getBannerView() {
        return this.f6073a;
    }

    public void onDestroy() {
        if (this.f6074b != null) {
            this.f6074b.onDestroy();
        }
        if (this.f6075c != null) {
            this.f6075c.onDestroy();
        }
    }

    public void onPause() {
        if (this.f6074b != null) {
            this.f6074b.onPause();
        }
        if (this.f6075c != null) {
            this.f6075c.onPause();
        }
    }

    public void onResume() {
        if (this.f6074b != null) {
            this.f6074b.onResume();
        }
        if (this.f6075c != null) {
            this.f6075c.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f6074b = (CustomEventBanner) m4896a(bundle.getString("class_name"));
        if (this.f6074b == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.f6074b.requestBannerAd(context, new C0596a(this, mediationBannerListener), bundle.getString("parameter"), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f6075c = (CustomEventInterstitial) m4896a(bundle.getString("class_name"));
        if (this.f6075c == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.f6075c.requestInterstitialAd(context, new C0597b(this, this, mediationInterstitialListener), bundle.getString("parameter"), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public void showInterstitial() {
        this.f6075c.showInterstitial();
    }
}
