package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class rt implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5231a;

    rt(ExpenseDetails expenseDetails) {
        this.f5231a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5231a.f3180H = "CATEGORY_VIEW";
        this.f5231a.m3125d();
    }
}
