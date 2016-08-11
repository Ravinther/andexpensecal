package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class bf implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4245a;
    final /* synthetic */ ChartNewPeriod f4246b;

    bf(ChartNewPeriod chartNewPeriod, boolean[] zArr) {
        this.f4246b = chartNewPeriod;
        this.f4245a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4245a[i] = z;
    }
}
