package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class it implements OnClickListener {
    final /* synthetic */ ExpenseAccountTransfer f4817a;

    it(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4817a = expenseAccountTransfer;
    }

    public void onClick(View view) {
        this.f4817a.showDialog(0);
    }
}
