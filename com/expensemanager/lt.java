package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class lt implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4940a;

    lt(ExpenseBudgetList expenseBudgetList) {
        this.f4940a = expenseBudgetList;
    }

    public void onClick(View view) {
        this.f4940a.f2946t = this.f4940a.f2946t - 1;
        this.f4940a.m2847d();
    }
}
