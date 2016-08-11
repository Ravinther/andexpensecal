package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class qj implements OnDateSetListener {
    final /* synthetic */ ExpenseCustomActivities f5175a;

    qj(ExpenseCustomActivities expenseCustomActivities) {
        this.f5175a = expenseCustomActivities;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f5175a.f3140a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5175a.f3160u = i;
                this.f5175a.f3161v = i2;
                this.f5175a.f3162w = i3;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5175a.f3163x = i;
                this.f5175a.f3164y = i2;
                this.f5175a.f3165z = i3;
                break;
        }
        this.f5175a.m3068b();
    }
}
