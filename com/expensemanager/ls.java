package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class ls implements OnItemClickListener {
    final /* synthetic */ ExpenseBudgetList f4939a;

    ls(ExpenseBudgetList expenseBudgetList) {
        this.f4939a = expenseBudgetList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4939a.m2837a((Map) adapterView.getItemAtPosition(i));
    }
}
