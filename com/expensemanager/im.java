package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class im implements OnClickListener {
    final /* synthetic */ ExpenseAccountTransfer f4804a;

    im(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4804a = expenseAccountTransfer;
    }

    public void onClick(View view) {
        this.f4804a.startActivityForResult(new Intent(this.f4804a.f2819e, ExpenseAccountList.class), 0);
    }
}
