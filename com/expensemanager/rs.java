package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class rs implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5230a;

    rs(ExpenseDetails expenseDetails) {
        this.f5230a = expenseDetails;
    }

    public void onClick(View view) {
        if (!this.f5230a.f3180H.equalsIgnoreCase("DATE_VIEW")) {
            this.f5230a.f3180H = "DATE_VIEW";
            this.f5230a.m3125d();
        }
    }
}
