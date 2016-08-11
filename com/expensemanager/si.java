package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class si implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5256a;

    si(ExpenseDetails expenseDetails) {
        this.f5256a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5256a.f3182J = "CATEGORY_VIEW";
        this.f5256a.m3138h();
    }
}
