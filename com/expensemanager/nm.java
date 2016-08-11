package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class nm implements OnItemSelectedListener {
    final /* synthetic */ ExpenseChartCustom f5033a;

    nm(ExpenseChartCustom expenseChartCustom) {
        this.f5033a = expenseChartCustom;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 2 && this.f5033a.f3025j.isChecked()) {
            this.f5033a.f3031p.setVisibility(0);
            this.f5033a.f3032q.setVisibility(0);
            return;
        }
        this.f5033a.f3031p.setVisibility(8);
        this.f5033a.f3032q.setVisibility(8);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
