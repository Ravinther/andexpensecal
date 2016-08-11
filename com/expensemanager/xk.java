package com.expensemanager;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

class xk implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5447a;

    xk(ExpenseNewTransaction expenseNewTransaction) {
        this.f5447a = expenseNewTransaction;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener xlVar = new xl(this);
        aib.m3849a(this.f5447a.f3334a, null, this.f5447a.getResources().getString(2131099805), 17301543, this.f5447a.getResources().getString(2131099809), this.f5447a.getResources().getString(2131099983), new xm(this), this.f5447a.getResources().getString(2131099754), xlVar).show();
    }
}
