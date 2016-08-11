package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class ie implements OnItemSelectedListener {
    final /* synthetic */ ExpenseAccountSummaryTime f4790a;

    ie(ExpenseAccountSummaryTime expenseAccountSummaryTime) {
        this.f4790a = expenseAccountSummaryTime;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4790a.m2697a();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
