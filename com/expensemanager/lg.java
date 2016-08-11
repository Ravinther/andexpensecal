package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class lg implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4926a;

    lg(ExpenseBudgetList expenseBudgetList) {
        this.f4926a = expenseBudgetList;
    }

    public void onClick(View view) {
        this.f4926a.f2947u = this.f4926a.f2947u - 1;
        this.f4926a.m2852f();
    }
}
