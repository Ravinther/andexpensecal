package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

final class pz implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5160a;

    pz(boolean[] zArr) {
        this.f5160a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5160a[i] = z;
    }
}
