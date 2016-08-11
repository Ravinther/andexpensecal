package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class po implements OnClickListener {
    final /* synthetic */ ExpenseChartSummary f5138a;

    po(ExpenseChartSummary expenseChartSummary) {
        this.f5138a = expenseChartSummary;
    }

    public void onClick(View view) {
        this.f5138a.showDialog(1);
    }
}
