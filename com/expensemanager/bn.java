package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class bn implements OnDateSetListener {
    final /* synthetic */ ChartNewPeriod f4255a;

    bn(ChartNewPeriod chartNewPeriod) {
        this.f4255a = chartNewPeriod;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4255a.f2534a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4255a.f2552s = i;
                this.f4255a.f2553t = i2;
                this.f4255a.f2554u = i3;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4255a.f2555v = i;
                this.f4255a.f2556w = i2;
                this.f4255a.f2557x = i3;
                break;
        }
        this.f4255a.m2466a();
    }
}
