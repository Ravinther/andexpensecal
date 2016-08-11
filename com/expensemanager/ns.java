package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ns implements OnClickListener {
    final /* synthetic */ String f5045a;
    final /* synthetic */ ExpenseChartDate f5046b;

    ns(ExpenseChartDate expenseChartDate, String str) {
        this.f5046b = expenseChartDate;
        this.f5045a = str;
    }

    public void onClick(View view) {
        this.f5046b.m2969a(this.f5045a.split(","), ExpenseChartDate.f3055y);
    }
}
