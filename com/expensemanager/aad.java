package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class aad implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f3798a;

    aad(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f3798a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        this.f3798a.showDialog(1);
    }
}
