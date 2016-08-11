package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class oy implements OnClickListener {
    final /* synthetic */ ExpenseChartPeriod f5113a;

    oy(ExpenseChartPeriod expenseChartPeriod) {
        this.f5113a = expenseChartPeriod;
    }

    public void onClick(View view) {
        this.f5113a.showDialog(0);
    }
}
