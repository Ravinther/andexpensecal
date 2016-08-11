package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class lx implements OnClickListener {
    final /* synthetic */ String f4949a;
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4950b;

    lx(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd, String str) {
        this.f4950b = expenseBudgetOnetimeAdd;
        this.f4949a = str;
    }

    public void onClick(View view) {
        this.f4950b.m2874a(this.f4949a.split(","), this.f4950b.f2957d, false);
    }
}
