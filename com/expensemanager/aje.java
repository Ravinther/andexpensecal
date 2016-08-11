package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class aje implements OnClickListener {
    final /* synthetic */ LinearLayout f4195a;
    final /* synthetic */ WidgetConfigureSummary f4196b;

    aje(WidgetConfigureSummary widgetConfigureSummary, LinearLayout linearLayout) {
        this.f4196b = widgetConfigureSummary;
        this.f4195a = linearLayout;
    }

    public void onClick(View view) {
        this.f4195a.setVisibility(8);
        this.f4196b.f3751m = 3;
    }
}
