package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class yd implements OnItemClickListener {
    final /* synthetic */ String f5475a;
    final /* synthetic */ ExpenseNewTransaction f5476b;

    yd(ExpenseNewTransaction expenseNewTransaction, String str) {
        this.f5476b = expenseNewTransaction;
        this.f5475a = str;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (!"Edit".equalsIgnoreCase(this.f5475a) && !"EditActivity".equalsIgnoreCase(this.f5475a)) {
            this.f5476b.m3302a(this.f5476b.f3343j.getText().toString(), true);
        }
    }
}
