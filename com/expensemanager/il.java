package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class il implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4802a;
    final /* synthetic */ ExpenseAccountSummaryTime f4803b;

    il(ExpenseAccountSummaryTime expenseAccountSummaryTime, boolean[] zArr) {
        this.f4803b = expenseAccountSummaryTime;
        this.f4802a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4802a[i] = z;
    }
}
