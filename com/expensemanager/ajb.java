package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class ajb implements OnClickListener {
    final /* synthetic */ LinearLayout f4189a;
    final /* synthetic */ WidgetConfigureSummary f4190b;

    ajb(WidgetConfigureSummary widgetConfigureSummary, LinearLayout linearLayout) {
        this.f4190b = widgetConfigureSummary;
        this.f4189a = linearLayout;
    }

    public void onClick(View view) {
        this.f4189a.setVisibility(0);
        this.f4190b.f3751m = 0;
    }
}
