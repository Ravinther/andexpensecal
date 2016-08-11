package com.expensemanager.caldroid;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

/* renamed from: com.expensemanager.caldroid.h */
class C0418h implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4378a;
    final /* synthetic */ CaldroidActivity f4379b;

    C0418h(CaldroidActivity caldroidActivity, boolean[] zArr) {
        this.f4379b = caldroidActivity;
        this.f4378a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4378a[i] = z;
    }
}
