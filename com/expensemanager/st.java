package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class st implements OnClickListener {
    final /* synthetic */ ExpenseExport f5270a;

    st(ExpenseExport expenseExport) {
        this.f5270a = expenseExport;
    }

    public void onClick(View view) {
        abd.m3811a(this.f5270a.f3212b, this.f5270a.f3218h, "expense_preference", "csv_delimiter", ",");
    }
}
