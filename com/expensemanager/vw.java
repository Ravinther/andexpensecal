package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class vw implements TextWatcher {
    final /* synthetic */ ExpenseMileageNewEdit f5384a;

    vw(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5384a = expenseMileageNewEdit;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f5384a.m3241c();
    }
}
