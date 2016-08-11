package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class in implements OnDateSetListener {
    final /* synthetic */ ExpenseAccountTransfer f4805a;

    in(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4805a = expenseAccountTransfer;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4805a.f2815a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4805a.f2832r = i;
                this.f4805a.f2833s = i2;
                this.f4805a.f2834t = i3;
                break;
        }
        this.f4805a.m2713a();
    }
}
