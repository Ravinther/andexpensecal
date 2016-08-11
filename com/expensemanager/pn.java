package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class pn implements OnClickListener {
    final /* synthetic */ ExpenseChartSummary f5137a;

    pn(ExpenseChartSummary expenseChartSummary) {
        this.f5137a = expenseChartSummary;
    }

    public void onClick(View view) {
        this.f5137a.showDialog(0);
    }
}
