package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class iz implements OnClickListener {
    final /* synthetic */ String f4824a;
    final /* synthetic */ ExpenseAccountTransfer f4825b;

    iz(ExpenseAccountTransfer expenseAccountTransfer, String str) {
        this.f4825b = expenseAccountTransfer;
        this.f4824a = str;
    }

    public void onClick(View view) {
        this.f4825b.m2714a(this.f4825b.f2816b, this.f4824a, this.f4825b.f2821g.getText().toString(), this.f4825b.f2822h.getText().toString());
    }
}
