package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class tu implements OnDismissListener {
    final /* synthetic */ ExpenseManager f5312a;

    tu(ExpenseManager expenseManager) {
        this.f5312a = expenseManager;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f5312a.m3206l();
        ExpenseManager.f3239G.m145c();
    }
}
