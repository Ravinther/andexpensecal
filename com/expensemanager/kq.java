package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class kq implements OnClickListener {
    final /* synthetic */ ExpenseBudgetAdd f4896a;

    kq(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4896a = expenseBudgetAdd;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.f4896a.f2908s.setText(null);
            this.f4896a.f2892b = -1;
        }
    }
}
