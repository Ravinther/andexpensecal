package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class vu implements OnDateSetListener {
    final /* synthetic */ ExpenseMileageNewEdit f5382a;

    vu(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5382a = expenseMileageNewEdit;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f5382a.f3284q = i;
        this.f5382a.f3285r = i2;
        this.f5382a.f3286s = i3;
        this.f5382a.m3232a();
    }
}
