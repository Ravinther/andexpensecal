package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class ku implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4908a;
    final /* synthetic */ ExpenseBudgetAdd f4909b;

    ku(ExpenseBudgetAdd expenseBudgetAdd, boolean[] zArr) {
        this.f4909b = expenseBudgetAdd;
        this.f4908a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4908a[i] = z;
    }
}
