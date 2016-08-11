package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class al implements OnClickListener {
    final /* synthetic */ ChartNewDate f4204a;

    al(ChartNewDate chartNewDate) {
        this.f4204a = chartNewDate;
    }

    public void onClick(View view) {
        this.f4204a.showDialog(1);
    }
}
