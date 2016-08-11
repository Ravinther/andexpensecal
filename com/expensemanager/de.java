package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class de implements OnClickListener {
    final /* synthetic */ CurrencyConverter f4473a;

    de(CurrencyConverter currencyConverter) {
        this.f4473a = currencyConverter;
    }

    public void onClick(View view) {
        ((InputMethodManager) this.f4473a.getSystemService("input_method")).hideSoftInputFromWindow(this.f4473a.f2630d.getApplicationWindowToken(), 0);
        abd.m3811a(this.f4473a.f2638l, this.f4473a.f2639m, "expense_preference", "FROM_CURRENCY", "" + this.f4473a.f2628b.getSelectedItemPosition());
        abd.m3811a(this.f4473a.f2638l, this.f4473a.f2639m, "expense_preference", "TO_CURRENCY", "" + this.f4473a.f2627a.getSelectedItemPosition());
        this.f4473a.f2635i = this.f4473a.f2630d.getText().toString();
        this.f4473a.onCreate(null);
    }
}
