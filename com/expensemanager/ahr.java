package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class ahr implements OnClickListener {
    final /* synthetic */ TipCalculator f4135a;

    ahr(TipCalculator tipCalculator) {
        this.f4135a = tipCalculator;
    }

    public void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4135a.getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(this.f4135a.f3656e.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f4135a.f3657f.getApplicationWindowToken(), 0);
        Integer valueOf = Integer.valueOf(this.f4135a.f3658g.getText().toString());
        if (valueOf != null) {
            int intValue = valueOf.intValue() - 1;
            if (intValue < 0) {
                intValue = 0;
            }
            this.f4135a.f3658g.setText("" + intValue);
        }
    }
}
