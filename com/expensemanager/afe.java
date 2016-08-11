package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class afe implements TextWatcher {
    final /* synthetic */ SalesTaxCalculator f4042a;

    afe(SalesTaxCalculator salesTaxCalculator) {
        this.f4042a = salesTaxCalculator;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4042a.m3555b();
    }
}
