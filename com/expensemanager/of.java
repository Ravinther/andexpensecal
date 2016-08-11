package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class of implements OnItemSelectedListener {
    final /* synthetic */ ExpenseChartDate f5076a;

    of(ExpenseChartDate expenseChartDate) {
        this.f5076a = expenseChartDate;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (ExpenseChartDate.f3045D.getSelectedItemPosition() == 0) {
            ExpenseChartDate.f3046I = "Exclude account transfer";
        } else if (ExpenseChartDate.f3045D.getSelectedItemPosition() == 1) {
            ExpenseChartDate.f3046I = "Include account transfer";
        }
        this.f5076a.f3064p.m145c();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
