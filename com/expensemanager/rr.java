package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class rr implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5229a;

    rr(ExpenseDetails expenseDetails) {
        this.f5229a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5229a.f3177E = this.f5229a.f3177E + 1;
        this.f5229a.m3125d();
    }
}
