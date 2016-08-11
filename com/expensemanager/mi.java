package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class mi implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4973a;

    mi(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4973a = expenseBudgetOnetimeAdd;
    }

    public void onClick(View view) {
        this.f4973a.m2874a(abd.m3786a(this.f4973a.f2956c, this.f4973a.f2968p, "EXPENSE_TAG", this.f4973a.getResources().getString(2131100111)).split(","), this.f4973a.f2961h, false);
    }
}
