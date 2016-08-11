package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class ll implements OnItemClickListener {
    final /* synthetic */ ExpenseBudgetList f4931a;

    ll(ExpenseBudgetList expenseBudgetList) {
        this.f4931a = expenseBudgetList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4931a.m2837a((Map) adapterView.getItemAtPosition(i));
    }
}
