package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class tt implements OnCancelListener {
    final /* synthetic */ ExpenseManager f5311a;

    tt(ExpenseManager expenseManager) {
        this.f5311a = expenseManager;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5311a.f3251C = null;
        this.f5311a.m3208n();
    }
}
