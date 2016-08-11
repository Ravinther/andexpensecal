package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class vv implements TextWatcher {
    final /* synthetic */ ExpenseMileageNewEdit f5383a;

    vv(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5383a = expenseMileageNewEdit;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f5383a.m3237b();
    }
}
