package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class iv implements OnClickListener {
    final /* synthetic */ ExpenseAccountTransfer f4819a;

    iv(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4819a = expenseAccountTransfer;
    }

    public void onClick(View view) {
        this.f4819a.startActivityForResult(new Intent(this.f4819a.f2819e, ExpensePaymentMethodList.class), 2);
    }
}
