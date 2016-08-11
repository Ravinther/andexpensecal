package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class cb implements OnClickListener {
    final /* synthetic */ ChartNewSummary f4401a;

    cb(ChartNewSummary chartNewSummary) {
        this.f4401a = chartNewSummary;
    }

    public void onClick(View view) {
        this.f4401a.showDialog(1);
    }
}
