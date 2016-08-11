package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class ey implements OnItemSelectedListener {
    final /* synthetic */ DisplaySettings f4614a;

    ey(DisplaySettings displaySettings) {
        this.f4614a = displaySettings;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 2130837511;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                i2 = 2130837512;
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                i2 = 2130837515;
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                i2 = 2130837518;
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                i2 = 2130837519;
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                i2 = 2130837523;
                break;
            default:
                i2 = -1;
                break;
        }
        this.f4614a.getActionBar().setBackgroundDrawable(this.f4614a.f2701p.getResources().getDrawable(i2));
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
