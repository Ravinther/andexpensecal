package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class is implements OnClickListener {
    final /* synthetic */ ExpenseAccountTransfer f4816a;

    is(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4816a = expenseAccountTransfer;
    }

    public void onClick(View view) {
        this.f4816a.startActivityForResult(new Intent(this.f4816a.f2819e, ExpenseAccountList.class), 1);
    }
}
