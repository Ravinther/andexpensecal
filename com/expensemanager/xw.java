package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class xw implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5461a;

    xw(ExpenseNewTransaction expenseNewTransaction) {
        this.f5461a = expenseNewTransaction;
    }

    public void onClick(View view) {
        this.f5461a.onCreateDialog(2).show();
    }
}
