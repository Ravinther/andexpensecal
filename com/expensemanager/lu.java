package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class lu implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4941a;

    lu(ExpenseBudgetList expenseBudgetList) {
        this.f4941a = expenseBudgetList;
    }

    public void onClick(View view) {
        this.f4941a.f2946t = this.f4941a.f2946t + 1;
        this.f4941a.m2847d();
    }
}
