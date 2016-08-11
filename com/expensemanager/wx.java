package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class wx implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5427a;

    wx(ExpenseNewTransaction expenseNewTransaction) {
        this.f5427a = expenseNewTransaction;
    }

    public void onClick(View view) {
        this.f5427a.startActivityForResult(new Intent(this.f5427a.f3334a, ExpensePaymentMethodList.class), 5);
    }
}
