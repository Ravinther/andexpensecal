package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class aav implements OnDateSetListener {
    final /* synthetic */ ExpenseReport f3822a;

    aav(ExpenseReport expenseReport) {
        this.f3822a = expenseReport;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f3822a.f3440a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f3822a.f3453n = i;
                this.f3822a.f3454o = i2;
                this.f3822a.f3455p = i3;
                break;
        }
        this.f3822a.m3418a();
    }
}
