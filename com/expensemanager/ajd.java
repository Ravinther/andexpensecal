package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class ajd implements OnClickListener {
    final /* synthetic */ LinearLayout f4193a;
    final /* synthetic */ WidgetConfigureSummary f4194b;

    ajd(WidgetConfigureSummary widgetConfigureSummary, LinearLayout linearLayout) {
        this.f4194b = widgetConfigureSummary;
        this.f4193a = linearLayout;
    }

    public void onClick(View view) {
        this.f4193a.setVisibility(8);
        this.f4194b.f3751m = 2;
    }
}
