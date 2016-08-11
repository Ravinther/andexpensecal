package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class yc implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5474a;

    yc(ExpenseNewTransaction expenseNewTransaction) {
        this.f5474a = expenseNewTransaction;
    }

    public void onClick(View view) {
        String stringExtra = this.f5474a.getIntent().getStringExtra("category");
        if (stringExtra == null || !stringExtra.startsWith("Income")) {
            this.f5474a.getIntent().putExtra("category", "Income");
        } else {
            this.f5474a.getIntent().removeExtra("category");
        }
        this.f5474a.onCreate(null);
    }
}
