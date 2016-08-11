package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class xh implements OnClickListener {
    final /* synthetic */ String f5443a;
    final /* synthetic */ ExpenseNewTransaction f5444b;

    xh(ExpenseNewTransaction expenseNewTransaction, String str) {
        this.f5444b = expenseNewTransaction;
        this.f5443a = str;
    }

    public void onClick(View view) {
        this.f5444b.m3301a(this.f5443a);
    }
}
