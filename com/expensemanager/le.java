package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class le implements OnItemClickListener {
    final /* synthetic */ ExpenseBudgetItems f4924a;

    le(ExpenseBudgetItems expenseBudgetItems) {
        this.f4924a = expenseBudgetItems;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4924a.m2828a((Map) adapterView.getItemAtPosition(i));
    }
}
