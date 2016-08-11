package com.expensemanager;

import android.widget.TabHost.OnTabChangeListener;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class lf implements OnTabChangeListener {
    final /* synthetic */ ExpenseBudgetList f4925a;

    lf(ExpenseBudgetList expenseBudgetList) {
        this.f4925a = expenseBudgetList;
    }

    public void onTabChanged(String str) {
        switch (this.f4925a.f2938l.getCurrentTab()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4925a.m2841b();
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4925a.m2845c();
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f4925a.m2849e();
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f4925a.m2854g();
            default:
        }
    }
}
