package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class mh implements OnClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4972a;

    mh(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd) {
        this.f4972a = expenseBudgetOnetimeAdd;
    }

    public void onClick(View view) {
        this.f4972a.m2874a(abd.m3786a(this.f4972a.f2956c, this.f4972a.f2968p, "PAYMENT_METHOD_KEY", aib.m3868b(this.f4972a.getResources().getString(2131100012).split(","), ",")).split(","), this.f4972a.f2960g, false);
    }
}
