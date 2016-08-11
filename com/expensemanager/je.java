package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class je implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4834a;
    final /* synthetic */ ExpenseActivitiesDefault f4835b;

    je(ExpenseActivitiesDefault expenseActivitiesDefault, boolean[] zArr) {
        this.f4835b = expenseActivitiesDefault;
        this.f4834a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4834a[i] = z;
    }
}
