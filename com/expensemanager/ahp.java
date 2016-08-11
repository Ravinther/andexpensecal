package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class ahp implements OnClickListener {
    final /* synthetic */ TipCalculator f4133a;

    ahp(TipCalculator tipCalculator) {
        this.f4133a = tipCalculator;
    }

    public void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4133a.getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(this.f4133a.f3656e.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f4133a.f3657f.getApplicationWindowToken(), 0);
        String obj = this.f4133a.f3659h.getText().toString();
        if (obj == null || "".equals(obj)) {
            obj = "1";
        }
        Integer valueOf = Integer.valueOf(obj);
        if (valueOf != null) {
            int intValue = valueOf.intValue() - 1;
            if (intValue < 1) {
                intValue = 1;
            }
            this.f4133a.f3659h.setText("" + intValue);
        }
    }
}
