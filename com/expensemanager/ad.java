package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class ad implements OnClickListener {
    final /* synthetic */ Button f3941a;
    final /* synthetic */ ChartNewDate f3942b;

    ad(ChartNewDate chartNewDate, Button button) {
        this.f3942b = chartNewDate;
        this.f3941a = button;
    }

    public void onClick(View view) {
        if ("LINE".equals(ChartNewDate.f2489v)) {
            ChartNewDate.f2489v = "BAR";
            this.f3942b.f2497O = 2131099945;
        } else {
            ChartNewDate.f2489v = "LINE";
            this.f3942b.f2497O = 2131099739;
        }
        this.f3941a.setText(this.f3942b.f2497O);
        this.f3942b.f2500p.m145c();
    }
}
