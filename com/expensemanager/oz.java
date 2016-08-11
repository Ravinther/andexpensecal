package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class oz implements OnClickListener {
    final /* synthetic */ ExpenseChartPeriod f5114a;

    oz(ExpenseChartPeriod expenseChartPeriod) {
        this.f5114a = expenseChartPeriod;
    }

    public void onClick(View view) {
        this.f5114a.showDialog(1);
    }
}
