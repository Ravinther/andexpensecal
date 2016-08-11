package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class ajc implements OnClickListener {
    final /* synthetic */ LinearLayout f4191a;
    final /* synthetic */ WidgetConfigureSummary f4192b;

    ajc(WidgetConfigureSummary widgetConfigureSummary, LinearLayout linearLayout) {
        this.f4192b = widgetConfigureSummary;
        this.f4191a = linearLayout;
    }

    public void onClick(View view) {
        this.f4191a.setVisibility(8);
        this.f4192b.f3751m = 1;
    }
}
