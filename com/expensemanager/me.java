package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class me implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4966a;
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4967b;

    me(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd, boolean[] zArr) {
        this.f4967b = expenseBudgetOnetimeAdd;
        this.f4966a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4966a[i] = z;
    }
}
