package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class ais implements OnDateSetListener {
    final /* synthetic */ WidgetConfigureSummary f4173a;

    ais(WidgetConfigureSummary widgetConfigureSummary) {
        this.f4173a = widgetConfigureSummary;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4173a.f3742a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4173a.m3711a(i, i2, i3, this.f4173a.f3749k);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4173a.m3711a(i, i2, i3, this.f4173a.f3750l);
            default:
        }
    }
}
