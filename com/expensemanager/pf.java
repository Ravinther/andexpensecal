package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class pf implements OnDateSetListener {
    final /* synthetic */ ExpenseChartPeriod f5122a;

    pf(ExpenseChartPeriod expenseChartPeriod) {
        this.f5122a = expenseChartPeriod;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f5122a.f3086a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5122a.f3104s = i;
                this.f5122a.f3105t = i2;
                this.f5122a.f3106u = i3;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5122a.f3107v = i;
                this.f5122a.f3108w = i2;
                this.f5122a.f3109x = i3;
                break;
        }
        this.f5122a.m3008a();
    }
}
