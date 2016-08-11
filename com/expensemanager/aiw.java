package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class aiw implements OnMultiChoiceClickListener {
    final /* synthetic */ boolean[] f4180a;
    final /* synthetic */ WidgetConfigureSummary f4181b;

    aiw(WidgetConfigureSummary widgetConfigureSummary, boolean[] zArr) {
        this.f4181b = widgetConfigureSummary;
        this.f4180a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f4180a[i] = z;
    }
}
