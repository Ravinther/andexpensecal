package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class pk implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5132a;
    final /* synthetic */ ExpenseChartSummary f5133b;

    pk(ExpenseChartSummary expenseChartSummary, boolean[] zArr) {
        this.f5133b = expenseChartSummary;
        this.f5132a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5132a[i] = z;
    }
}
