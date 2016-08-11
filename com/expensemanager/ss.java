package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ss implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5269a;

    ss(ExpenseDetails expenseDetails) {
        this.f5269a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5269a.f3177E = this.f5269a.f3177E - 1;
        this.f5269a.m3125d();
    }
}
