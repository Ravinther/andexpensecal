package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class sn implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5264a;

    sn(ExpenseDetails expenseDetails) {
        this.f5264a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5264a.showDialog(1);
    }
}
