package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class ba implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4234a;
    final /* synthetic */ az f4235b;

    ba(az azVar, boolean[] zArr) {
        this.f4235b = azVar;
        this.f4234a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4234a[i] = z;
    }
}
