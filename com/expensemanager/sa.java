package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class sa implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5245a;

    sa(ExpenseDetails expenseDetails) {
        this.f5245a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5245a.f3181I = "CATEGORY_VIEW";
        this.f5245a.m3133f();
    }
}
