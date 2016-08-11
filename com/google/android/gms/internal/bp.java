package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.C0593b;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

public class bp {
    private final ed f6322a;
    private final Context f6323b;
    private final at f6324c;
    private AdListener f6325d;
    private bc f6326e;
    private String f6327f;
    private String f6328g;
    private AppEventListener f6329h;
    private PlayStorePurchaseListener f6330i;
    private InAppPurchaseListener f6331j;
    private PublisherInterstitialAd f6332k;
    private C0593b f6333l;

    public bp(Context context) {
        this(context, at.m5069a(), null);
    }

    public bp(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, at.m5069a(), publisherInterstitialAd);
    }

    public bp(Context context, at atVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.f6322a = new ed();
        this.f6323b = context;
        this.f6324c = atVar;
        this.f6332k = publisherInterstitialAd;
    }

    private void m5195b(String str) {
        if (this.f6327f == null) {
            m5196c(str);
        }
        this.f6326e = ar.m5062a(this.f6323b, new ay(), this.f6327f, this.f6322a);
        if (this.f6325d != null) {
            this.f6326e.m5099a(new aq(this.f6325d));
        }
        if (this.f6329h != null) {
            this.f6326e.m5100a(new aw(this.f6329h));
        }
        if (this.f6331j != null) {
            this.f6326e.m5102a(new hw(this.f6331j));
        }
        if (this.f6330i != null) {
            this.f6326e.m5103a(new ib(this.f6330i), this.f6328g);
        }
        if (this.f6333l != null) {
            this.f6326e.m5101a(new cc(this.f6333l));
        }
    }

    private void m5196c(String str) {
        if (this.f6326e == null) {
            throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + str + " is called.");
        }
    }

    public AdListener m5197a() {
        return this.f6325d;
    }

    public void m5198a(AdListener adListener) {
        try {
            this.f6325d = adListener;
            if (this.f6326e != null) {
                this.f6326e.m5099a(adListener != null ? new aq(adListener) : null);
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the AdListener.", e);
        }
    }

    public void m5199a(AppEventListener appEventListener) {
        try {
            this.f6329h = appEventListener;
            if (this.f6326e != null) {
                this.f6326e.m5100a(appEventListener != null ? new aw(appEventListener) : null);
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the AppEventListener.", e);
        }
    }

    public void m5200a(InAppPurchaseListener inAppPurchaseListener) {
        if (this.f6330i != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.f6331j = inAppPurchaseListener;
            if (this.f6326e != null) {
                this.f6326e.m5102a(inAppPurchaseListener != null ? new hw(inAppPurchaseListener) : null);
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void m5201a(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        try {
            this.f6330i = playStorePurchaseListener;
            if (this.f6326e != null) {
                this.f6326e.m5103a(playStorePurchaseListener != null ? new ib(playStorePurchaseListener) : null, str);
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the play store purchase parameter.", e);
        }
    }

    public void m5202a(bm bmVar) {
        try {
            if (this.f6326e == null) {
                m5195b("loadAd");
            }
            if (this.f6326e.m5104a(this.f6324c.m5070a(this.f6323b, bmVar))) {
                this.f6322a.m5422a(bmVar.m5148i());
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to load ad.", e);
        }
    }

    public void m5203a(String str) {
        if (this.f6327f != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f6327f = str;
    }

    public String m5204b() {
        return this.f6327f;
    }

    public AppEventListener m5205c() {
        return this.f6329h;
    }

    public InAppPurchaseListener m5206d() {
        return this.f6331j;
    }

    public boolean m5207e() {
        boolean z = false;
        try {
            if (this.f6326e != null) {
                z = this.f6326e.m5106c();
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to check if ad is ready.", e);
        }
        return z;
    }

    public String m5208f() {
        try {
            if (this.f6326e != null) {
                return this.f6326e.m5113j();
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public void m5209g() {
        try {
            m5196c("show");
            this.f6326e.m5109f();
        } catch (Throwable e) {
            ly.m6073d("Failed to show interstitial.", e);
        }
    }
}
