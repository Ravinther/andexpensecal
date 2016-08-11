package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class mj implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4974a;

    mj(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4974a = expenseBudgetOnetimeAdd;
    }

    public void onClick(View view) {
        this.f4974a.showDialog(0);
    }
}
