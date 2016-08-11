package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class jl implements OnDateSetListener {
    final /* synthetic */ ExpenseActivitiesDefault f4843a;

    jl(ExpenseActivitiesDefault expenseActivitiesDefault) {
        this.f4843a = expenseActivitiesDefault;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f4843a.f2838a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4843a.f2852o = i;
                this.f4843a.f2853p = i2;
                this.f4843a.f2854q = i3;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4843a.f2855r = i;
                this.f4843a.f2856s = i2;
                this.f4843a.f2857t = i3;
                break;
        }
        this.f4843a.m2737a();
    }
}
