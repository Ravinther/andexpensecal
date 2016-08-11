package com.google.android.gms.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.C0593b;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0585d;

public final class bo {
    private final ed f6310a;
    private final at f6311b;
    private AdListener f6312c;
    private bc f6313d;
    private AdSize[] f6314e;
    private String f6315f;
    private String f6316g;
    private ViewGroup f6317h;
    private AppEventListener f6318i;
    private InAppPurchaseListener f6319j;
    private PlayStorePurchaseListener f6320k;
    private C0593b f6321l;

    public bo(ViewGroup viewGroup) {
        this(viewGroup, null, false, at.m5069a());
    }

    public bo(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, at.m5069a());
    }

    bo(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, at atVar) {
        this(viewGroup, attributeSet, z, atVar, null);
    }

    bo(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, at atVar, bc bcVar) {
        this.f6310a = new ed();
        this.f6317h = viewGroup;
        this.f6311b = atVar;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                ax axVar = new ax(context, attributeSet);
                this.f6314e = axVar.m5079a(z);
                this.f6315f = axVar.m5078a();
                if (viewGroup.isInEditMode()) {
                    lx.m6060a(viewGroup, new ay(context, this.f6314e[0]), "Ads by Google");
                    return;
                }
            } catch (IllegalArgumentException e) {
                lx.m6062a(viewGroup, new ay(context, AdSize.BANNER), e.getMessage(), e.getMessage());
                return;
            }
        }
        this.f6313d = bcVar;
    }

    private void m5174l() {
        try {
            C0582a a = this.f6313d.m5097a();
            if (a != null) {
                this.f6317h.addView((View) C0585d.m4879a(a));
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to get an ad frame.", e);
        }
    }

    private void m5175m() {
        if ((this.f6314e == null || this.f6315f == null) && this.f6313d == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        Context context = this.f6317h.getContext();
        this.f6313d = ar.m5062a(context, new ay(context, this.f6314e), this.f6315f, this.f6310a);
        if (this.f6312c != null) {
            this.f6313d.m5099a(new aq(this.f6312c));
        }
        if (this.f6318i != null) {
            this.f6313d.m5100a(new aw(this.f6318i));
        }
        if (this.f6319j != null) {
            this.f6313d.m5102a(new hw(this.f6319j));
        }
        if (this.f6320k != null) {
            this.f6313d.m5103a(new ib(this.f6320k), this.f6316g);
        }
        if (this.f6321l != null) {
            this.f6313d.m5101a(new cc(this.f6321l));
        }
        m5174l();
    }

    public void m5176a() {
        try {
            if (this.f6313d != null) {
                this.f6313d.m5105b();
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to destroy AdView.", e);
        }
    }

    public void m5177a(AdListener adListener) {
        try {
            this.f6312c = adListener;
            if (this.f6313d != null) {
                this.f6313d.m5099a(adListener != null ? new aq(adListener) : null);
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the AdListener.", e);
        }
    }

    public void m5178a(AppEventListener appEventListener) {
        try {
            this.f6318i = appEventListener;
            if (this.f6313d != null) {
                this.f6313d.m5100a(appEventListener != null ? new aw(appEventListener) : null);
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the AppEventListener.", e);
        }
    }

    public void m5179a(InAppPurchaseListener inAppPurchaseListener) {
        if (this.f6320k != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.f6319j = inAppPurchaseListener;
            if (this.f6313d != null) {
                this.f6313d.m5102a(inAppPurchaseListener != null ? new hw(inAppPurchaseListener) : null);
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void m5180a(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        if (this.f6319j != null) {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        try {
            this.f6320k = playStorePurchaseListener;
            this.f6316g = str;
            if (this.f6313d != null) {
                this.f6313d.m5103a(playStorePurchaseListener != null ? new ib(playStorePurchaseListener) : null, str);
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the play store purchase parameter.", e);
        }
    }

    public void m5181a(bm bmVar) {
        try {
            if (this.f6313d == null) {
                m5175m();
            }
            if (this.f6313d.m5104a(this.f6311b.m5070a(this.f6317h.getContext(), bmVar))) {
                this.f6310a.m5422a(bmVar.m5148i());
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to load ad.", e);
        }
    }

    public void m5182a(String str) {
        if (this.f6315f != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f6315f = str;
    }

    public void m5183a(AdSize... adSizeArr) {
        if (this.f6314e != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m5185b(adSizeArr);
    }

    public AdListener m5184b() {
        return this.f6312c;
    }

    public void m5185b(AdSize... adSizeArr) {
        this.f6314e = adSizeArr;
        try {
            if (this.f6313d != null) {
                this.f6313d.m5098a(new ay(this.f6317h.getContext(), this.f6314e));
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to set the ad size.", e);
        }
        this.f6317h.requestLayout();
    }

    public AdSize m5186c() {
        try {
            if (this.f6313d != null) {
                return this.f6313d.m5112i().m5083a();
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to get the current AdSize.", e);
        }
        return this.f6314e != null ? this.f6314e[0] : null;
    }

    public AdSize[] m5187d() {
        return this.f6314e;
    }

    public String m5188e() {
        return this.f6315f;
    }

    public AppEventListener m5189f() {
        return this.f6318i;
    }

    public InAppPurchaseListener m5190g() {
        return this.f6319j;
    }

    public void m5191h() {
        try {
            if (this.f6313d != null) {
                this.f6313d.m5107d();
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to call pause.", e);
        }
    }

    public void m5192i() {
        try {
            if (this.f6313d != null) {
                this.f6313d.m5111h();
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to record impression.", e);
        }
    }

    public void m5193j() {
        try {
            if (this.f6313d != null) {
                this.f6313d.m5108e();
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to call resume.", e);
        }
    }

    public String m5194k() {
        try {
            if (this.f6313d != null) {
                return this.f6313d.m5113j();
            }
        } catch (Throwable e) {
            ly.m6073d("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }
}
