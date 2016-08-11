package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class li implements OnItemClickListener {
    final /* synthetic */ ExpenseBudgetList f4928a;

    li(ExpenseBudgetList expenseBudgetList) {
        this.f4928a = expenseBudgetList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4928a.m2837a((Map) adapterView.getItemAtPosition(i));
    }
}
