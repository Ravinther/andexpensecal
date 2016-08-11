package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ly;

/* renamed from: com.google.ads.mediation.customevent.a */
final class C0558a implements CustomEventBannerListener {
    private final CustomEventAdapter f5985a;
    private final MediationBannerListener f5986b;

    public C0558a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.f5985a = customEventAdapter;
        this.f5986b = mediationBannerListener;
    }

    public void onClick() {
        ly.m6065a("Custom event adapter called onFailedToReceiveAd.");
        this.f5986b.onClick(this.f5985a);
    }

    public void onDismissScreen() {
        ly.m6065a("Custom event adapter called onFailedToReceiveAd.");
        this.f5986b.onDismissScreen(this.f5985a);
    }

    public void onFailedToReceiveAd() {
        ly.m6065a("Custom event adapter called onFailedToReceiveAd.");
        this.f5986b.onFailedToReceiveAd(this.f5985a, ErrorCode.NO_FILL);
    }

    public void onLeaveApplication() {
        ly.m6065a("Custom event adapter called onFailedToReceiveAd.");
        this.f5986b.onLeaveApplication(this.f5985a);
    }

    public void onPresentScreen() {
        ly.m6065a("Custom event adapter called onFailedToReceiveAd.");
        this.f5986b.onPresentScreen(this.f5985a);
    }

    public void onReceivedAd(View view) {
        ly.m6065a("Custom event adapter called onReceivedAd.");
        this.f5985a.m4816a(view);
        this.f5986b.onReceivedAd(this.f5985a);
    }
}
