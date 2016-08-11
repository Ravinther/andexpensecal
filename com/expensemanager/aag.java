package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class aag implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f3801a;

    aag(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f3801a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        this.f3801a.startActivityForResult(new Intent(this.f3801a.f3413f, ExpensePaymentMethodList.class), 2);
    }
}
