package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class kz implements OnClickListener {
    final /* synthetic */ ExpenseBudgetAdd f4917a;

    kz(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4917a = expenseBudgetAdd;
    }

    public void onClick(View view) {
        this.f4917a.showDialog(0);
    }
}
