package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;

class rq implements OnNavigationListener {
    final /* synthetic */ ArrayList f5227a;
    final /* synthetic */ ExpenseDetails f5228b;

    rq(ExpenseDetails expenseDetails, ArrayList arrayList) {
        this.f5228b = expenseDetails;
        this.f5227a = arrayList;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        if ("All".equalsIgnoreCase((String) this.f5227a.get(i))) {
            this.f5228b.f3205u = true;
        }
        this.f5228b.getIntent().putExtra("account", (String) this.f5227a.get(i));
        this.f5228b.f3183K = (String) this.f5227a.get(i);
        switch (this.f5228b.f3206v.getCurrentTab()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5228b.m3113b();
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5228b.m3119c();
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f5228b.m3128e();
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f5228b.m3135g();
                break;
        }
        return true;
    }
}
