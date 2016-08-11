package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class aix implements OnCancelListener {
    final /* synthetic */ WidgetConfigureSummary f4182a;

    aix(WidgetConfigureSummary widgetConfigureSummary) {
        this.f4182a = widgetConfigureSummary;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f4182a.m3722d();
    }
}
