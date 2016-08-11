package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class lj implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4929a;

    lj(ExpenseBudgetList expenseBudgetList) {
        this.f4929a = expenseBudgetList;
    }

    public void onClick(View view) {
        this.f4929a.f2948v = this.f4929a.f2948v - 1;
        this.f4929a.m2856h();
    }
}
