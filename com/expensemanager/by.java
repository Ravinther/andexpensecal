package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class by implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4275a;
    final /* synthetic */ ChartNewSummary f4276b;

    by(ChartNewSummary chartNewSummary, boolean[] zArr) {
        this.f4276b = chartNewSummary;
        this.f4275a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4275a[i] = z;
    }
}
