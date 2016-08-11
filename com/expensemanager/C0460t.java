package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

/* renamed from: com.expensemanager.t */
class C0460t implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f5280a;
    final /* synthetic */ ChartNewCustom f5281b;

    C0460t(ChartNewCustom chartNewCustom, boolean[] zArr) {
        this.f5281b = chartNewCustom;
        this.f5280a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f5280a[i] = z;
    }
}
