package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class kn implements OnClickListener {
    final /* synthetic */ String f4888a;
    final /* synthetic */ String f4889b;
    final /* synthetic */ ExpenseBudgetAdd f4890c;

    kn(ExpenseBudgetAdd expenseBudgetAdd, String str, String str2) {
        this.f4890c = expenseBudgetAdd;
        this.f4888a = str;
        this.f4889b = str2;
    }

    public void onClick(View view) {
        this.f4890c.m2804a(this.f4888a.split(","), this.f4890c.f2894d, true, this.f4889b);
    }
}
