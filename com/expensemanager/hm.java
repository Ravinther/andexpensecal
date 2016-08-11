package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class hm implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4748a;
    final /* synthetic */ ExpenseAccountSummary f4749b;

    hm(ExpenseAccountSummary expenseAccountSummary, boolean[] zArr) {
        this.f4749b = expenseAccountSummary;
        this.f4748a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4748a[i] = z;
    }
}
