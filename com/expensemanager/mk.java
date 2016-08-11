package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class mk implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4975a;

    mk(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4975a = expenseBudgetOnetimeAdd;
    }

    public void onClick(View view) {
        this.f4975a.showDialog(1);
    }
}
