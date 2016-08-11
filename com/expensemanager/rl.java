package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class rl implements OnClickListener {
    final /* synthetic */ ExpenseDataBackup f5221a;

    rl(ExpenseDataBackup expenseDataBackup) {
        this.f5221a = expenseDataBackup;
    }

    public void onClick(View view) {
        abd.m3811a(this.f5221a.f3168b, this.f5221a.f3171f, "expense_preference", "csv_delimiter", ",");
    }
}
