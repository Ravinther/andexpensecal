package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class qb implements OnClickListener {
    final /* synthetic */ String f5166a;
    final /* synthetic */ ExpenseCustomActivities f5167b;

    qb(ExpenseCustomActivities expenseCustomActivities, String str) {
        this.f5167b = expenseCustomActivities;
        this.f5166a = str;
    }

    public void onClick(View view) {
        this.f5167b.m3064a(this.f5166a.split(","), this.f5167b.f3146g);
    }
}
