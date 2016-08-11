package com.google.android.gms.internal;

import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

@id
public final class ep implements MediationBannerListener, MediationInterstitialListener {
    private final ek f6506a;

    public ep(ek ekVar) {
        this.f6506a = ekVar;
    }

    public void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        ob.m6318a("onAdClicked must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdClicked.");
        try {
            this.f6506a.m5379a();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdClicked.", e);
        }
    }

    public void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ob.m6318a("onAdClicked must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdClicked.");
        try {
            this.f6506a.m5379a();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdClicked.", e);
        }
    }

    public void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        ob.m6318a("onAdClosed must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdClosed.");
        try {
            this.f6506a.m5381b();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdClosed.", e);
        }
    }

    public void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ob.m6318a("onAdClosed must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdClosed.");
        try {
            this.f6506a.m5381b();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdClosed.", e);
        }
    }

    public void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        ob.m6318a("onAdFailedToLoad must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.f6506a.m5380a(i);
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        ob.m6318a("onAdFailedToLoad must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f6506a.m5380a(i);
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        ob.m6318a("onAdLeftApplication must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdLeftApplication.");
        try {
            this.f6506a.m5382c();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ob.m6318a("onAdLeftApplication must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdLeftApplication.");
        try {
            this.f6506a.m5382c();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdLeftApplication.", e);
        }
    }

    public void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        ob.m6318a("onAdLoaded must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdLoaded.");
        try {
            this.f6506a.m5384e();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdLoaded.", e);
        }
    }

    public void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ob.m6318a("onAdLoaded must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdLoaded.");
        try {
            this.f6506a.m5384e();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdLoaded.", e);
        }
    }

    public void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        ob.m6318a("onAdOpened must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdOpened.");
        try {
            this.f6506a.m5383d();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdOpened.", e);
        }
    }

    public void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        ob.m6318a("onAdOpened must be called on the main UI thread.");
        ly.m6065a("Adapter called onAdOpened.");
        try {
            this.f6506a.m5383d();
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdOpened.", e);
        }
    }
}
