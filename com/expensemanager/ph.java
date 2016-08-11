package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class ph implements OnClickListener {
    final /* synthetic */ Button f5125a;
    final /* synthetic */ ExpenseChartSummary f5126b;

    ph(ExpenseChartSummary expenseChartSummary, Button button) {
        this.f5126b = expenseChartSummary;
        this.f5125a = button;
    }

    public void onClick(View view) {
        if ("PIE".equals(ExpenseChartSummary.f3119u)) {
            ExpenseChartSummary.f3119u = "BAR";
            this.f5126b.f3130K = 2131100025;
        } else {
            ExpenseChartSummary.f3119u = "PIE";
            this.f5126b.f3130K = 2131099739;
        }
        this.f5125a.setText(this.f5126b.f3130K);
        this.f5126b.f3133p.m145c();
    }
}
