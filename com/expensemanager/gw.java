package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class gw implements OnClickListener {
    final /* synthetic */ ExpenseAccountList f4711a;

    gw(ExpenseAccountList expenseAccountList) {
        this.f4711a = expenseAccountList;
    }

    public void onClick(View view) {
        this.f4711a.startActivityForResult(new Intent(this.f4711a.f2763i, ExpenseAccountEditList.class), 0);
    }
}
