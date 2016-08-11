package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class dd implements TextWatcher {
    final /* synthetic */ CurrencyConverter f4472a;

    dd(CurrencyConverter currencyConverter) {
        this.f4472a = currencyConverter;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4472a.m2550c();
    }
}
