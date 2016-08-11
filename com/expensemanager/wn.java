package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class wn implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5407a;
    final /* synthetic */ ExpenseMileageSearch f5408b;

    wn(ExpenseMileageSearch expenseMileageSearch, boolean[] zArr) {
        this.f5408b = expenseMileageSearch;
        this.f5407a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5407a[i] = z;
    }
}
