package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class nj implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5029a;
    final /* synthetic */ ExpenseChartCustom f5030b;

    nj(ExpenseChartCustom expenseChartCustom, boolean[] zArr) {
        this.f5030b = expenseChartCustom;
        this.f5029a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5029a[i] = z;
    }
}
