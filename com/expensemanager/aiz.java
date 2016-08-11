package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class aiz implements OnClickListener {
    final /* synthetic */ String f4184a;
    final /* synthetic */ WidgetConfigureSummary f4185b;

    aiz(WidgetConfigureSummary widgetConfigureSummary, String str) {
        this.f4185b = widgetConfigureSummary;
        this.f4184a = str;
    }

    public void onClick(View view) {
        this.f4185b.m3716a(this.f4184a.split(","), WidgetConfigureSummary.f3739e);
    }
}
