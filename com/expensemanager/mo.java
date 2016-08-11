package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class mo implements OnItemClickListener {
    final /* synthetic */ ExpenseBudgetOnetimeList f4979a;

    mo(ExpenseBudgetOnetimeList expenseBudgetOnetimeList) {
        this.f4979a = expenseBudgetOnetimeList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4979a.m2899a((Map) adapterView.getItemAtPosition(i));
    }
}
