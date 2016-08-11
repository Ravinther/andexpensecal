package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class ah implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4109a;
    final /* synthetic */ ChartNewDate f4110b;

    ah(ChartNewDate chartNewDate, boolean[] zArr) {
        this.f4110b = chartNewDate;
        this.f4109a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4109a[i] = z;
    }
}
