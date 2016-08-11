package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class bp implements OnClickListener {
    final /* synthetic */ Button f4258a;
    final /* synthetic */ ChartNewSummary f4259b;

    bp(ChartNewSummary chartNewSummary, Button button) {
        this.f4259b = chartNewSummary;
        this.f4258a = button;
    }

    public void onClick(View view) {
        if ("PIE".equals(ChartNewSummary.f2584u)) {
            ChartNewSummary.f2584u = "BAR";
            this.f4259b.f2598R = 2131100025;
        } else {
            ChartNewSummary.f2584u = "PIE";
            this.f4259b.f2598R = 2131099739;
        }
        this.f4258a.setText(this.f4259b.f2598R);
        this.f4259b.f2601p.m145c();
    }
}
