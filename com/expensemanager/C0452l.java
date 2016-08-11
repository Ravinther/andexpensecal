package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

/* renamed from: com.expensemanager.l */
class C0452l implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4918a;
    final /* synthetic */ C0451k f4919b;

    C0452l(C0451k c0451k, boolean[] zArr) {
        this.f4919b = c0451k;
        this.f4918a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4918a[i] = z;
    }
}
