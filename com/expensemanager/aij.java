package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class aij implements OnCancelListener {
    final /* synthetic */ WidgetConfigureBudget f4164a;

    aij(WidgetConfigureBudget widgetConfigureBudget) {
        this.f4164a = widgetConfigureBudget;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f4164a.m3671b();
    }
}
