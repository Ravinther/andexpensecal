package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class la implements OnClickListener {
    final /* synthetic */ ExpenseBudgetAdd f4920a;

    la(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4920a = expenseBudgetAdd;
    }

    public void onClick(View view) {
        this.f4920a.showDialog(1);
    }
}
