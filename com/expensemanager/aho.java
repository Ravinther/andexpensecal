package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class aho implements OnClickListener {
    final /* synthetic */ TipCalculator f4132a;

    aho(TipCalculator tipCalculator) {
        this.f4132a = tipCalculator;
    }

    public void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4132a.getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(this.f4132a.f3656e.getApplicationWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(this.f4132a.f3657f.getApplicationWindowToken(), 0);
        String obj = this.f4132a.f3659h.getText().toString();
        if (obj == null || "".equals(obj)) {
            obj = "1";
        }
        Integer valueOf = Integer.valueOf(obj);
        if (valueOf != null) {
            this.f4132a.f3659h.setText("" + (valueOf.intValue() + 1));
        }
    }
}
