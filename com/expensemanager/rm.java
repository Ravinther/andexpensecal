package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class rm implements OnClickListener {
    final /* synthetic */ ExpenseDataBackup f5222a;

    rm(ExpenseDataBackup expenseDataBackup) {
        this.f5222a = expenseDataBackup;
    }

    public void onClick(View view) {
        abd.m3811a(this.f5222a.f3168b, this.f5222a.f3171f, "expense_preference", "csv_delimiter", ";");
    }
}
