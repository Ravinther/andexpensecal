package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class aht implements OnClickListener {
    final /* synthetic */ TipCalculator f4137a;

    aht(TipCalculator tipCalculator) {
        this.f4137a = tipCalculator;
    }

    public void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4137a.getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(this.f4137a.f3656e.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f4137a.f3657f.getApplicationWindowToken(), 0);
        this.f4137a.onCreate(null);
    }
}
