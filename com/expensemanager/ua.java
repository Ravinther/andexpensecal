package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ua implements OnClickListener {
    final /* synthetic */ ExpenseManager f5319a;

    ua(ExpenseManager expenseManager) {
        this.f5319a = expenseManager;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5319a.finish();
    }
}
