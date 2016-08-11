package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class lv implements OnItemClickListener {
    final /* synthetic */ ExpenseBudgetList f4942a;

    lv(ExpenseBudgetList expenseBudgetList) {
        this.f4942a = expenseBudgetList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4942a.m2837a((Map) adapterView.getItemAtPosition(i));
    }
}
