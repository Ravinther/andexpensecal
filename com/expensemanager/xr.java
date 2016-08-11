package com.expensemanager;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;

class xr implements OnTimeSetListener {
    final /* synthetic */ ExpenseNewTransaction f5454a;

    xr(ExpenseNewTransaction expenseNewTransaction) {
        this.f5454a = expenseNewTransaction;
    }

    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.f5454a.f3355v = i;
        this.f5454a.f3356w = i2;
        this.f5454a.f3336c.setText(new StringBuilder().append(ExpenseNewTransaction.m3306b(this.f5454a.f3355v)).append(":").append(ExpenseNewTransaction.m3306b(this.f5454a.f3356w)));
    }
}
