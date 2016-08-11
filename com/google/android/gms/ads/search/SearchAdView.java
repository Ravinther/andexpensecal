package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.bo;

public final class SearchAdView extends ViewGroup {
    private final bo f6113a;

    public SearchAdView(Context context) {
        super(context);
        this.f6113a = new bo(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6113a = new bo(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6113a = new bo(this, attributeSet, false);
    }

    public void destroy() {
        this.f6113a.m5176a();
    }

    public AdListener getAdListener() {
        return this.f6113a.m5184b();
    }

    public AdSize getAdSize() {
        return this.f6113a.m5186c();
    }

    public String getAdUnitId() {
        return this.f6113a.m5188e();
    }

    public void loadAd(SearchAdRequest searchAdRequest) {
        this.f6113a.m5181a(searchAdRequest.m4914a());
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
        this.f6113a.m5191h();
    }

    public void resume() {
        this.f6113a.m5193j();
    }

    public void setAdListener(AdListener adListener) {
        this.f6113a.m5177a(adListener);
    }

    public void setAdSize(AdSize adSize) {
        this.f6113a.m5183a(adSize);
    }

    public void setAdUnitId(String str) {
        this.f6113a.m5182a(str);
    }
}
