package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class su implements OnClickListener {
    final /* synthetic */ ExpenseExport f5271a;

    su(ExpenseExport expenseExport) {
        this.f5271a = expenseExport;
    }

    public void onClick(View view) {
        abd.m3811a(this.f5271a.f3212b, this.f5271a.f3218h, "expense_preference", "csv_delimiter", ";");
    }
}
