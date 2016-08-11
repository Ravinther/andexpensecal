package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class oi implements OnItemClickListener {
    final /* synthetic */ String[] f5082a;
    final /* synthetic */ ExpenseChartList f5083b;

    oi(ExpenseChartList expenseChartList, String[] strArr) {
        this.f5083b = expenseChartList;
        this.f5082a = strArr;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f5083b.m2990a(i, this.f5082a[i]);
    }
}
