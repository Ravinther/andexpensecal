package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class ai implements OnDateSetListener {
    final /* synthetic */ ChartNewDate f4142a;

    ai(ChartNewDate chartNewDate) {
        this.f4142a = chartNewDate;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4142a.f2502u) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4142a.m2417a(i, i2, i3, this.f4142a.f2493H);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4142a.m2417a(i, i2, i3, this.f4142a.f2494I);
            default:
        }
    }
}
