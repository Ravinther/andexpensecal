package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class sm implements OnDateSetListener {
    final /* synthetic */ ExpenseDetails f5263a;

    sm(ExpenseDetails expenseDetails) {
        this.f5263a = expenseDetails;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f5263a.f3210z = i;
        this.f5263a.f3173A = i2;
        this.f5263a.f3174B = i3;
        this.f5263a.m3113b();
    }
}
