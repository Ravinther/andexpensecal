package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class nk implements OnClickListener {
    final /* synthetic */ ExpenseChartCustom f5031a;

    nk(ExpenseChartCustom expenseChartCustom) {
        this.f5031a = expenseChartCustom;
    }

    public void onClick(View view) {
        this.f5031a.showDialog(0);
    }
}
