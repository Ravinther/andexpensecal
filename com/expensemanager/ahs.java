package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class ahs implements TextWatcher {
    final /* synthetic */ TipCalculator f4136a;

    ahs(TipCalculator tipCalculator) {
        this.f4136a = tipCalculator;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4136a.m3626b();
    }
}
