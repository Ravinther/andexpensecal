package com.google.ads.mediation.customevent;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ly;

/* renamed from: com.google.ads.mediation.customevent.b */
class C0559b implements CustomEventInterstitialListener {
    final /* synthetic */ CustomEventAdapter f5987a;
    private final CustomEventAdapter f5988b;
    private final MediationInterstitialListener f5989c;

    public C0559b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f5987a = customEventAdapter;
        this.f5988b = customEventAdapter2;
        this.f5989c = mediationInterstitialListener;
    }

    public void onDismissScreen() {
        ly.m6065a("Custom event adapter called onDismissScreen.");
        this.f5989c.onDismissScreen(this.f5988b);
    }

    public void onFailedToReceiveAd() {
        ly.m6065a("Custom event adapter called onFailedToReceiveAd.");
        this.f5989c.onFailedToReceiveAd(this.f5988b, ErrorCode.NO_FILL);
    }

    public void onLeaveApplication() {
        ly.m6065a("Custom event adapter called onLeaveApplication.");
        this.f5989c.onLeaveApplication(this.f5988b);
    }

    public void onPresentScreen() {
        ly.m6065a("Custom event adapter called onPresentScreen.");
        this.f5989c.onPresentScreen(this.f5988b);
    }

    public void onReceivedAd() {
        ly.m6065a("Custom event adapter called onReceivedAd.");
        this.f5989c.onReceivedAd(this.f5987a);
    }
}
