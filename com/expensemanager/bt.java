package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class bt implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4266a;
    final /* synthetic */ ChartNewSummary f4267b;

    bt(ChartNewSummary chartNewSummary, boolean[] zArr) {
        this.f4267b = chartNewSummary;
        this.f4266a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4266a[i] = z;
    }
}
