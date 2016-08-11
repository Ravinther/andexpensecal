package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class gk implements OnItemClickListener {
    final /* synthetic */ ExpenseAccountGroupEditList f4695a;

    gk(ExpenseAccountGroupEditList expenseAccountGroupEditList) {
        this.f4695a = expenseAccountGroupEditList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4695a.m2651a(i);
    }
}
