package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class wf implements OnDateSetListener {
    final /* synthetic */ ExpenseMileageSearch f5394a;

    wf(ExpenseMileageSearch expenseMileageSearch) {
        this.f5394a = expenseMileageSearch;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f5394a.f3290a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5394a.f3298i = i;
                this.f5394a.f3299j = i2;
                this.f5394a.f3300k = i3;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5394a.f3301l = i;
                this.f5394a.f3302m = i2;
                this.f5394a.f3303n = i3;
                break;
        }
        this.f5394a.m3261b();
    }
}
