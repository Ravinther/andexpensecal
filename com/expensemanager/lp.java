package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class lp implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4936a;

    lp(ExpenseBudgetList expenseBudgetList) {
        this.f4936a = expenseBudgetList;
    }

    public void onClick(View view) {
        this.f4936a.showDialog(1);
    }
}
