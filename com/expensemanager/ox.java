package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class ox implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5111a;
    final /* synthetic */ ExpenseChartPeriod f5112b;

    ox(ExpenseChartPeriod expenseChartPeriod, boolean[] zArr) {
        this.f5112b = expenseChartPeriod;
        this.f5111a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5111a[i] = z;
    }
}
