package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class os implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5100a;
    final /* synthetic */ or f5101b;

    os(or orVar, boolean[] zArr) {
        this.f5101b = orVar;
        this.f5100a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5100a[i] = z;
    }
}
