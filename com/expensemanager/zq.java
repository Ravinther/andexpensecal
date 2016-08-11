package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class zq implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f5550a;

    zq(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f5550a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        this.f5550a.startActivityForResult(new Intent(this.f5550a.f3413f, ExpenseAccountList.class), 6);
    }
}
