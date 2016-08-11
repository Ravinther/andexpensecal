package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class bg implements OnClickListener {
    final /* synthetic */ ChartNewPeriod f4247a;

    bg(ChartNewPeriod chartNewPeriod) {
        this.f4247a = chartNewPeriod;
    }

    public void onClick(View view) {
        this.f4247a.showDialog(0);
    }
}
