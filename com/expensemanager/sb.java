package com.expensemanager;

import android.widget.TabHost.OnTabChangeListener;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class sb implements OnTabChangeListener {
    final /* synthetic */ ExpenseDetails f5246a;

    sb(ExpenseDetails expenseDetails) {
        this.f5246a = expenseDetails;
    }

    public void onTabChanged(String str) {
        switch (this.f5246a.f3206v.getCurrentTab()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5246a.m3113b();
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5246a.m3119c();
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f5246a.m3128e();
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f5246a.m3135g();
            default:
        }
    }
}
