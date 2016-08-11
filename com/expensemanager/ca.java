package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ca implements OnClickListener {
    final /* synthetic */ ChartNewSummary f4280a;

    ca(ChartNewSummary chartNewSummary) {
        this.f4280a = chartNewSummary;
    }

    public void onClick(View view) {
        this.f4280a.showDialog(0);
    }
}
