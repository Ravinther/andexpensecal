package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class lh implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4927a;

    lh(ExpenseBudgetList expenseBudgetList) {
        this.f4927a = expenseBudgetList;
    }

    public void onClick(View view) {
        this.f4927a.f2947u = this.f4927a.f2947u + 1;
        this.f4927a.m2852f();
    }
}
