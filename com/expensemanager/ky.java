package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ky implements OnClickListener {
    final /* synthetic */ ExpenseBudgetAdd f4916a;

    ky(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4916a = expenseBudgetAdd;
    }

    public void onClick(View view) {
        this.f4916a.m2804a(abd.m3786a(this.f4916a.f2893c, this.f4916a.f2906q, "EXPENSE_TAG", this.f4916a.getResources().getString(2131100111)).split(","), this.f4916a.f2898h, false, null);
    }
}
