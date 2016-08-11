package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class qm implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5182a;

    qm(ExpenseCustomActivities expenseCustomActivities) {
        this.f5182a = expenseCustomActivities;
    }

    public void onClick(View view) {
        this.f5182a.showDialog(0);
    }
}
