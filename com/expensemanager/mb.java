package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class mb implements OnDateSetListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4957a;

    mb(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4957a = expenseBudgetOnetimeAdd;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4957a.f2955b) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4957a.f2971s = i;
                this.f4957a.f2972t = i2;
                this.f4957a.f2973u = i3;
                this.f4957a.m2872a();
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4957a.f2974v = i;
                this.f4957a.f2975w = i2;
                this.f4957a.f2976x = i3;
                this.f4957a.m2872a();
            default:
        }
    }
}
