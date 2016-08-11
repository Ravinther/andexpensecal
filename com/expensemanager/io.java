package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class io implements TextWatcher {
    final /* synthetic */ ExpenseAccountTransfer f4806a;

    io(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4806a = expenseAccountTransfer;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            if (this.f4806a.f2828n.isFocused()) {
                Double valueOf = Double.valueOf(this.f4806a.f2824j.getText().toString());
                String obj = this.f4806a.f2828n.getText().toString();
                if ("".equals(obj)) {
                    obj = "1";
                }
                Double valueOf2 = Double.valueOf(obj);
                this.f4806a.f2829o.setText(CurrencyConverter.m2541a(valueOf2.doubleValue() * valueOf.doubleValue()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
