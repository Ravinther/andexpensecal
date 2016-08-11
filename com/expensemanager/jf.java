package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class jf implements OnClickListener {
    final /* synthetic */ ExpenseActivitiesDefault f4836a;

    jf(ExpenseActivitiesDefault expenseActivitiesDefault) {
        this.f4836a = expenseActivitiesDefault;
    }

    public void onClick(View view) {
        this.f4836a.showDialog(1);
    }
}
