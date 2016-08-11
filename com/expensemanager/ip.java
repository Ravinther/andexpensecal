package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class ip implements TextWatcher {
    final /* synthetic */ ExpenseAccountTransfer f4807a;

    ip(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4807a = expenseAccountTransfer;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            if (this.f4807a.f2829o.isFocused()) {
                this.f4807a.f2828n.setText(CurrencyConverter.m2541a(Double.valueOf(this.f4807a.f2829o.getText().toString()).doubleValue() / Double.valueOf(this.f4807a.f2824j.getText().toString()).doubleValue()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
