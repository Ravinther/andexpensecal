package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

class ty implements OnKeyListener {
    final /* synthetic */ ExpenseManager f5316a;

    ty(ExpenseManager expenseManager) {
        this.f5316a = expenseManager;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        this.f5316a.finish();
        return true;
    }
}
