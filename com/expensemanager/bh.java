package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class bh implements OnClickListener {
    final /* synthetic */ ChartNewPeriod f4248a;

    bh(ChartNewPeriod chartNewPeriod) {
        this.f4248a = chartNewPeriod;
    }

    public void onClick(View view) {
        this.f4248a.showDialog(1);
    }
}
