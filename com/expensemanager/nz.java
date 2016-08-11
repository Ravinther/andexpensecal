package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class nz implements OnClickListener {
    final /* synthetic */ ExpenseChartDate f5059a;

    nz(ExpenseChartDate expenseChartDate) {
        this.f5059a = expenseChartDate;
    }

    public void onClick(View view) {
        this.f5059a.showDialog(0);
    }
}
