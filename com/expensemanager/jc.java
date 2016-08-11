package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class jc implements OnClickListener {
    final /* synthetic */ ExpenseActivitiesDefault f4829a;

    jc(ExpenseActivitiesDefault expenseActivitiesDefault) {
        this.f4829a = expenseActivitiesDefault;
    }

    public void onClick(View view) {
        this.f4829a.showDialog(0);
    }
}
