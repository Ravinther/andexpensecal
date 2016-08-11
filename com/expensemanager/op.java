package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class op implements OnItemSelectedListener {
    final /* synthetic */ ExpenseChartMonthly f5095a;

    op(ExpenseChartMonthly expenseChartMonthly) {
        this.f5095a = expenseChartMonthly;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != 3) {
            this.f5095a.m2999b();
        } else {
            this.f5095a.m3002d();
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
