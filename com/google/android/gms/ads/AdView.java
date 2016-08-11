package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.bo;

public final class AdView extends ViewGroup {
    private final bo f6052a;

    public AdView(Context context) {
        super(context);
        this.f6052a = new bo(this);
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6052a = new bo(this, attributeSet, false);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6052a = new bo(this, attributeSet, false);
    }

    public void destroy() {
        this.f6052a.m5176a();
    }

    public AdListener getAdListener() {
        return this.f6052a.m5184b();
    }

    public AdSize getAdSize() {
        return this.f6052a.m5186c();
    }

    public String getAdUnitId() {
        return this.f6052a.m5188e();
    }

    public InAppPurchaseListener getInAppPurchaseListener() {
        return this.f6052a.m5190g();
    }

    public String getMediationAdapterClassName() {
        return this.f6052a.m5194k();
    }

    public void loadAd(AdRequest adRequest) {
        this.f6052a.m5181a(adRequest.m4884a());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3 = 0;
        View childAt = getChildAt(0);
        AdSize adSize = getAdSize();
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        } else if (adSize != null) {
            Context context = getContext();
            measuredWidth = adSize.getWidthInPixels(context);
            i3 = adSize.getHeightInPixels(context);
        } else {
            measuredWidth = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        this.f6052a.m5191h();
    }

    public void resume() {
        this.f6052a.m5193j();
    }

    public void setAdListener(AdListener adListener) {
        this.f6052a.m5177a(adListener);
    }

    public void setAdSize(AdSize adSize) {
        this.f6052a.m5183a(adSize);
    }

    public void setAdUnitId(String str) {
        this.f6052a.m5182a(str);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener) {
        this.f6052a.m5179a(inAppPurchaseListener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String str) {
        this.f6052a.m5180a(playStorePurchaseListener, str);
    }
}
