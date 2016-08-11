package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class xj implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5446a;

    xj(ExpenseNewTransaction expenseNewTransaction) {
        this.f5446a = expenseNewTransaction;
    }

    public void onClick(View view) {
        this.f5446a.showDialog(1);
    }
}
