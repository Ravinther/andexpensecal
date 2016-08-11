package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class tw implements OnClickListener {
    final /* synthetic */ ExpenseManager f5314a;

    tw(ExpenseManager expenseManager) {
        this.f5314a = expenseManager;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
