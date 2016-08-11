package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class lo implements OnDateSetListener {
    final /* synthetic */ ExpenseBudgetList f4935a;

    lo(ExpenseBudgetList expenseBudgetList) {
        this.f4935a = expenseBudgetList;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f4935a.f2941o = i;
        this.f4935a.f2942p = i2;
        this.f4935a.f2943q = i3;
        this.f4935a.m2841b();
    }
}
