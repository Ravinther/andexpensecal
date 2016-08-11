package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.google.android.gms.C0607c;

class ng implements OnDateSetListener {
    final /* synthetic */ ExpenseChartCustom f5022a;

    ng(ExpenseChartCustom expenseChartCustom) {
        this.f5022a = expenseChartCustom;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.f5022a.f3016a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f5022a.f3035t = i;
                this.f5022a.f3036u = i2;
                this.f5022a.f3037v = i3;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5022a.f3038w = i;
                this.f5022a.f3039x = i2;
                this.f5022a.f3040y = i3;
                break;
        }
        this.f5022a.m2934a();
    }
}
