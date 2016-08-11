package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@id
public final class er<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final ek f6509a;

    public er(ek ekVar) {
        this.f6509a = ekVar;
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        ly.m6065a("Adapter called onClick.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5379a();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdClicked.", e);
                return;
            }
        }
        ly.m6074e("onClick must be called on the main UI thread.");
        lx.f7093a.post(new es(this));
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        ly.m6065a("Adapter called onDismissScreen.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5381b();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdClosed.", e);
                return;
            }
        }
        ly.m6074e("onDismissScreen must be called on the main UI thread.");
        lx.f7093a.post(new ex(this));
    }

    public void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        ly.m6065a("Adapter called onDismissScreen.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5381b();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdClosed.", e);
                return;
            }
        }
        ly.m6074e("onDismissScreen must be called on the main UI thread.");
        lx.f7093a.post(new fc(this));
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, ErrorCode errorCode) {
        ly.m6065a("Adapter called onFailedToReceiveAd with error. " + errorCode);
        if (lx.m6064b()) {
            try {
                this.f6509a.m5380a(fd.m5476a(errorCode));
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        ly.m6074e("onFailedToReceiveAd must be called on the main UI thread.");
        lx.f7093a.post(new ey(this, errorCode));
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, ErrorCode errorCode) {
        ly.m6065a("Adapter called onFailedToReceiveAd with error " + errorCode + ".");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5380a(fd.m5476a(errorCode));
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        ly.m6074e("onFailedToReceiveAd must be called on the main UI thread.");
        lx.f7093a.post(new et(this, errorCode));
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        ly.m6065a("Adapter called onLeaveApplication.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5382c();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        ly.m6074e("onLeaveApplication must be called on the main UI thread.");
        lx.f7093a.post(new ez(this));
    }

    public void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        ly.m6065a("Adapter called onLeaveApplication.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5382c();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        ly.m6074e("onLeaveApplication must be called on the main UI thread.");
        lx.f7093a.post(new eu(this));
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        ly.m6065a("Adapter called onPresentScreen.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5383d();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdOpened.", e);
                return;
            }
        }
        ly.m6074e("onPresentScreen must be called on the main UI thread.");
        lx.f7093a.post(new fa(this));
    }

    public void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        ly.m6065a("Adapter called onPresentScreen.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5383d();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdOpened.", e);
                return;
            }
        }
        ly.m6074e("onPresentScreen must be called on the main UI thread.");
        lx.f7093a.post(new ev(this));
    }

    public void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        ly.m6065a("Adapter called onReceivedAd.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5384e();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdLoaded.", e);
                return;
            }
        }
        ly.m6074e("onReceivedAd must be called on the main UI thread.");
        lx.f7093a.post(new fb(this));
    }

    public void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        ly.m6065a("Adapter called onReceivedAd.");
        if (lx.m6064b()) {
            try {
                this.f6509a.m5384e();
                return;
            } catch (Throwable e) {
                ly.m6073d("Could not call onAdLoaded.", e);
                return;
            }
        }
        ly.m6074e("onReceivedAd must be called on the main UI thread.");
        lx.f7093a.post(new ew(this));
    }
}
