package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class sh implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5255a;

    sh(ExpenseDetails expenseDetails) {
        this.f5255a = expenseDetails;
    }

    public void onClick(View view) {
        if (!this.f5255a.f3182J.equalsIgnoreCase("DATE_VIEW")) {
            this.f5255a.f3182J = "DATE_VIEW";
            this.f5255a.m3138h();
        }
    }
}
