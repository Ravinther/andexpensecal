package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class oo implements TextWatcher {
    final /* synthetic */ ExpenseChartMonthly f5094a;

    oo(ExpenseChartMonthly expenseChartMonthly) {
        this.f5094a = expenseChartMonthly;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f5094a.m2999b();
    }
}
