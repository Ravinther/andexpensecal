package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ac implements OnClickListener {
    final /* synthetic */ String f3881a;
    final /* synthetic */ ChartNewDate f3882b;

    ac(ChartNewDate chartNewDate, String str) {
        this.f3882b = chartNewDate;
        this.f3881a = str;
    }

    public void onClick(View view) {
        this.f3882b.m2423a(this.f3881a.split(","), ChartNewDate.f2476B);
    }
}
