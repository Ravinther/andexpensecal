package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class aiq implements OnClickListener {
    final /* synthetic */ WidgetConfigureSummary f4171a;

    aiq(WidgetConfigureSummary widgetConfigureSummary) {
        this.f4171a = widgetConfigureSummary;
    }

    public void onClick(View view) {
        this.f4171a.showDialog(0);
    }
}
