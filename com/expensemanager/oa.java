package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class oa implements OnClickListener {
    final /* synthetic */ ExpenseChartDate f5063a;

    oa(ExpenseChartDate expenseChartDate) {
        this.f5063a = expenseChartDate;
    }

    public void onClick(View view) {
        this.f5063a.showDialog(1);
    }
}
