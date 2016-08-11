package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class wp implements OnClickListener {
    final /* synthetic */ ExpenseNewAccount f5410a;

    wp(ExpenseNewAccount expenseNewAccount) {
        this.f5410a = expenseNewAccount;
    }

    public void onClick(View view) {
        if (((CheckBox) view).isChecked()) {
            this.f5410a.f3313h.setEnabled(true);
        } else {
            this.f5410a.f3313h.setEnabled(false);
        }
    }
}
