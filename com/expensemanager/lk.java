package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class lk implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4930a;

    lk(ExpenseBudgetList expenseBudgetList) {
        this.f4930a = expenseBudgetList;
    }

    public void onClick(View view) {
        this.f4930a.f2948v = this.f4930a.f2948v + 1;
        this.f4930a.m2856h();
    }
}
