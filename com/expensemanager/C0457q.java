package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

/* renamed from: com.expensemanager.q */
class C0457q implements OnDateSetListener {
    final /* synthetic */ ChartNewCustom f5161a;

    C0457q(ChartNewCustom chartNewCustom) {
        this.f5161a = chartNewCustom;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f5161a.f2438a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5161a.f2457t = i;
                this.f5161a.f2458u = i2;
                this.f5161a.f2459v = i3;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5161a.f2460w = i;
                this.f5161a.f2461x = i2;
                this.f5161a.f2462y = i3;
                break;
        }
        this.f5161a.m2387a();
    }
}
