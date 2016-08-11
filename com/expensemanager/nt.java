package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class nt implements OnClickListener {
    final /* synthetic */ Button f5047a;
    final /* synthetic */ ExpenseChartDate f5048b;

    nt(ExpenseChartDate expenseChartDate, Button button) {
        this.f5048b = expenseChartDate;
        this.f5047a = button;
    }

    public void onClick(View view) {
        if ("LINE".equals(ExpenseChartDate.f3052u)) {
            ExpenseChartDate.f3052u = "BAR";
            this.f5048b.f3061K = 2131099945;
        } else {
            ExpenseChartDate.f3052u = "LINE";
            this.f5048b.f3061K = 2131099739;
        }
        this.f5047a.setText(this.f5048b.f3061K);
        this.f5048b.f3064p.m145c();
    }
}
