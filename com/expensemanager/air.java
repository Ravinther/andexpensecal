package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class air implements OnClickListener {
    final /* synthetic */ WidgetConfigureSummary f4172a;

    air(WidgetConfigureSummary widgetConfigureSummary) {
        this.f4172a = widgetConfigureSummary;
    }

    public void onClick(View view) {
        this.f4172a.showDialog(1);
    }
}
