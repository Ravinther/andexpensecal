package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class bu implements OnDateSetListener {
    final /* synthetic */ ChartNewSummary f4268a;

    bu(ChartNewSummary chartNewSummary) {
        this.f4268a = chartNewSummary;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4268a.f2603t) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4268a.m2499a(i, i2, i3, this.f4268a.f2594K);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4268a.m2499a(i, i2, i3, this.f4268a.f2595L);
            default:
        }
    }
}
