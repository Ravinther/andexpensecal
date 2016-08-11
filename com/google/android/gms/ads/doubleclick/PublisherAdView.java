package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.bo;

public final class PublisherAdView extends ViewGroup {
    private final bo f6057a;

    public PublisherAdView(Context context) {
        super(context);
        this.f6057a = new bo(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6057a = new bo(this, attributeSet, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6057a = new bo(this, attributeSet, true);
    }

    public void destroy() {
        this.f6057a.m5176a();
    }

    public AdListener getAdListener() {
        return this.f6057a.m5184b();
    }

    public AdSize getAdSize() {
        return this.f6057a.m5186c();
    }

    public AdSize[] getAdSizes() {
        return this.f6057a.m5187d();
    }

    public String getAdUnitId() {
        return this.f6057a.m5188e();
    }

    public AppEventListener getAppEventListener() {
        return this.f6057a.m5189f();
    }

    public String getMediationAdapterClassName() {
        return this.f6057a.m5194k();
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f6057a.m5181a(publisherAdRequest.m4887Y());
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
        this.f6057a.m5191h();
    }

    public void recordManualImpression() {
        this.f6057a.m5192i();
    }

    public void resume() {
        this.f6057a.m5193j();
    }

    public void setAdListener(AdListener adListener) {
        this.f6057a.m5177a(adListener);
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length < 1) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f6057a.m5185b(adSizeArr);
    }

    public void setAdUnitId(String str) {
        this.f6057a.m5182a(str);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f6057a.m5178a(appEventListener);
    }
}
