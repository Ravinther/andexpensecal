package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class qp implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5189a;

    qp(ExpenseCustomActivities expenseCustomActivities) {
        this.f5189a = expenseCustomActivities;
    }

    public void onClick(View view) {
        this.f5189a.showDialog(1);
    }
}
