package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class xx implements OnClickListener {
    final /* synthetic */ String[] f5462a;
    final /* synthetic */ ExpenseNewTransaction f5463b;

    xx(ExpenseNewTransaction expenseNewTransaction, String[] strArr) {
        this.f5463b = expenseNewTransaction;
        this.f5462a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5463b.f3357x = this.f5462a[i];
    }
}
