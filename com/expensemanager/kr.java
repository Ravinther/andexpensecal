package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class kr implements OnDateSetListener {
    final /* synthetic */ ExpenseBudgetAdd f4897a;

    kr(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4897a = expenseBudgetAdd;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4897a.f2892b) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4897a.f2910u = i;
                this.f4897a.f2911v = i2;
                this.f4897a.f2912w = i3;
                this.f4897a.m2802a();
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4897a.f2913x = i;
                this.f4897a.f2914y = i2;
                this.f4897a.f2915z = i3;
                this.f4897a.m2802a();
            default:
        }
    }
}
