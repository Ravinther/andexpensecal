package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ry implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5239a;

    ry(ExpenseDetails expenseDetails) {
        this.f5239a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5239a.f3178F = this.f5239a.f3178F + 1;
        this.f5239a.m3133f();
    }
}
