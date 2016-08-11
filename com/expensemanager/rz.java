package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class rz implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5240a;

    rz(ExpenseDetails expenseDetails) {
        this.f5240a = expenseDetails;
    }

    public void onClick(View view) {
        if (!this.f5240a.f3181I.equalsIgnoreCase("DATE_VIEW")) {
            this.f5240a.f3181I = "DATE_VIEW";
            this.f5240a.m3133f();
        }
    }
}
