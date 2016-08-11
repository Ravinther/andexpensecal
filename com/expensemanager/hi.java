package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class hi implements OnClickListener {
    final /* synthetic */ String f4740a;
    final /* synthetic */ ExpenseAccountSummary f4741b;

    hi(ExpenseAccountSummary expenseAccountSummary, String str) {
        this.f4741b = expenseAccountSummary;
        this.f4740a = str;
    }

    public void onClick(View view) {
        this.f4741b.m2684a(this.f4740a.split(","), ExpenseAccountSummary.f2780y);
    }
}
