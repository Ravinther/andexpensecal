package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class hn implements OnDateSetListener {
    final /* synthetic */ ExpenseAccountSummary f4750a;

    hn(ExpenseAccountSummary expenseAccountSummary) {
        this.f4750a = expenseAccountSummary;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4750a.f2790s) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4750a.m2677a(i, i2, i3, this.f4750a.f2784E);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4750a.m2677a(i, i2, i3, this.f4750a.f2785F);
            default:
        }
    }
}
