package com.expensemanager;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class et implements OnItemSelectedListener {
    final /* synthetic */ Window f4606a;
    final /* synthetic */ DisplaySettings f4607b;

    et(DisplaySettings displaySettings, Window window) {
        this.f4607b = displaySettings;
        this.f4606a = window;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2130837511;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (VERSION.SDK_INT >= 21) {
                    this.f4606a.setStatusBarColor(-16777216);
                    break;
                }
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                i2 = 2130837512;
                if (VERSION.SDK_INT >= 21) {
                    this.f4606a.setStatusBarColor(-15502654);
                    break;
                }
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                i2 = 2130837515;
                if (VERSION.SDK_INT >= 21) {
                    this.f4606a.setStatusBarColor(-11300033);
                    break;
                }
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                i2 = 2130837518;
                if (VERSION.SDK_INT >= 21) {
                    this.f4606a.setStatusBarColor(-11900261);
                    break;
                }
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                i2 = 2130837519;
                if (VERSION.SDK_INT >= 21) {
                    this.f4606a.setStatusBarColor(-5039075);
                    break;
                }
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                i2 = 2130837523;
                if (VERSION.SDK_INT >= 21) {
                    this.f4606a.setStatusBarColor(-1607422);
                    break;
                }
                break;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                break;
            default:
                i2 = -1;
                break;
        }
        this.f4607b.getActionBar().setBackgroundDrawable(this.f4607b.f2701p.getResources().getDrawable(i2));
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
