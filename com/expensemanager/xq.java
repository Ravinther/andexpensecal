package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class xq implements OnDateSetListener {
    final /* synthetic */ ExpenseNewTransaction f5453a;

    xq(ExpenseNewTransaction expenseNewTransaction) {
        this.f5453a = expenseNewTransaction;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f5453a.f3352s = i;
        this.f5453a.f3353t = i2;
        this.f5453a.f3354u = i3;
        this.f5453a.m3312c();
    }
}
