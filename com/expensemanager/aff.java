package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class aff implements OnClickListener {
    final /* synthetic */ SalesTaxCalculator f4043a;

    aff(SalesTaxCalculator salesTaxCalculator) {
        this.f4043a = salesTaxCalculator;
    }

    public void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4043a.getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(this.f4043a.f3585d.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f4043a.f3586e.getApplicationWindowToken(), 0);
        this.f4043a.onCreate(null);
    }
}
