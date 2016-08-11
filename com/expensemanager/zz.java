package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class zz implements OnDateSetListener {
    final /* synthetic */ ExpenseRepeatingTransaction f5561a;

    zz(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f5561a = expenseRepeatingTransaction;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f5561a.f3429v = i;
        this.f5561a.f3430w = i2;
        this.f5561a.f3431x = i3;
        this.f5561a.m3383a();
    }
}
