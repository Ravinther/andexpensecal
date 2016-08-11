package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class ib implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4785a;
    final /* synthetic */ ia f4786b;

    ib(ia iaVar, boolean[] zArr) {
        this.f4786b = iaVar;
        this.f4785a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4785a[i] = z;
    }
}
