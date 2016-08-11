package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class pg implements OnClickListener {
    final /* synthetic */ String f5123a;
    final /* synthetic */ ExpenseChartSummary f5124b;

    pg(ExpenseChartSummary expenseChartSummary, String str) {
        this.f5124b = expenseChartSummary;
        this.f5123a = str;
    }

    public void onClick(View view) {
        this.f5124b.m3041a(this.f5123a.split(","), ExpenseChartSummary.f3122y);
    }
}
