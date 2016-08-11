package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class pl implements OnDateSetListener {
    final /* synthetic */ ExpenseChartSummary f5134a;

    pl(ExpenseChartSummary expenseChartSummary) {
        this.f5134a = expenseChartSummary;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f5134a.f3135t) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5134a.m3035a(i, i2, i3, this.f5134a.f3126E);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5134a.m3035a(i, i2, i3, this.f5134a.f3127F);
            default:
        }
    }
}
