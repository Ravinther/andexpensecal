package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aip implements OnClickListener {
    final /* synthetic */ WidgetConfigureSummary f4170a;

    aip(WidgetConfigureSummary widgetConfigureSummary) {
        this.f4170a = widgetConfigureSummary;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4170a.finish();
    }
}
