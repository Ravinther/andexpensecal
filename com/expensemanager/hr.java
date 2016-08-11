package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class hr implements OnClickListener {
    final /* synthetic */ ExpenseAccountSummary f4758a;

    hr(ExpenseAccountSummary expenseAccountSummary) {
        this.f4758a = expenseAccountSummary;
    }

    public void onClick(View view) {
        this.f4758a.showDialog(1);
    }
}
