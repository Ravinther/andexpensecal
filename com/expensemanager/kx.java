package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class kx implements OnClickListener {
    final /* synthetic */ ExpenseBudgetAdd f4915a;

    kx(ExpenseBudgetAdd expenseBudgetAdd) {
        this.f4915a = expenseBudgetAdd;
    }

    public void onClick(View view) {
        this.f4915a.m2804a(abd.m3786a(this.f4915a.f2893c, this.f4915a.f2906q, "PAYMENT_METHOD_KEY", aib.m3868b(this.f4915a.getResources().getString(2131100012).split(","), ",")).split(","), this.f4915a.f2897g, false, null);
    }
}
