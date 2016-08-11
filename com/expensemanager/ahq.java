package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class ahq implements OnClickListener {
    final /* synthetic */ TipCalculator f4134a;

    ahq(TipCalculator tipCalculator) {
        this.f4134a = tipCalculator;
    }

    public void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4134a.getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(this.f4134a.f3656e.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f4134a.f3657f.getApplicationWindowToken(), 0);
        Integer valueOf = Integer.valueOf(this.f4134a.f3658g.getText().toString());
        if (valueOf != null) {
            this.f4134a.f3658g.setText("" + (valueOf.intValue() + 1));
        }
    }
}
