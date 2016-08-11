package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class qo implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5187a;
    final /* synthetic */ ExpenseCustomActivities f5188b;

    qo(ExpenseCustomActivities expenseCustomActivities, boolean[] zArr) {
        this.f5188b = expenseCustomActivities;
        this.f5187a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5187a[i] = z;
    }
}
