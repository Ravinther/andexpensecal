package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class oq implements OnItemSelectedListener {
    final /* synthetic */ ExpenseChartMonthly f5096a;

    oq(ExpenseChartMonthly expenseChartMonthly) {
        this.f5096a = expenseChartMonthly;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f5096a.f3081k.getSelectedItemPosition() != 3) {
            this.f5096a.m2999b();
        } else {
            this.f5096a.m3002d();
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
