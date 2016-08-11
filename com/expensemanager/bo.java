package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class bo implements OnClickListener {
    final /* synthetic */ String f4256a;
    final /* synthetic */ ChartNewSummary f4257b;

    bo(ChartNewSummary chartNewSummary, String str) {
        this.f4257b = chartNewSummary;
        this.f4256a = str;
    }

    public void onClick(View view) {
        this.f4257b.m2507a(this.f4256a.split(","), ChartNewSummary.f2576E);
    }
}
