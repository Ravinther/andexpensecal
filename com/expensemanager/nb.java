package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class nb implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5013a;
    final /* synthetic */ na f5014b;

    nb(na naVar, boolean[] zArr) {
        this.f5014b = naVar;
        this.f5013a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5013a[i] = z;
    }
}
