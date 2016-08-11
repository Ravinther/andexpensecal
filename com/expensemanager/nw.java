package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class nw implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5054a;
    final /* synthetic */ ExpenseChartDate f5055b;

    nw(ExpenseChartDate expenseChartDate, boolean[] zArr) {
        this.f5055b = expenseChartDate;
        this.f5054a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5054a[i] = z;
    }
}
