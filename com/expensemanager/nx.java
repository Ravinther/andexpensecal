package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class nx implements OnDateSetListener {
    final /* synthetic */ ExpenseChartDate f5056a;

    nx(ExpenseChartDate expenseChartDate) {
        this.f5056a = expenseChartDate;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f5056a.f3066t) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5056a.m2963a(i, i2, i3, this.f5056a.f3057E);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5056a.m2963a(i, i2, i3, this.f5056a.f3058F);
            default:
        }
    }
}
