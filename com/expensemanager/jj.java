package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class jj implements OnClickListener {
    final /* synthetic */ ExpenseActivitiesDefault f4840a;

    jj(ExpenseActivitiesDefault expenseActivitiesDefault) {
        this.f4840a = expenseActivitiesDefault;
    }

    public void onClick(View view) {
        this.f4840a.setResult(0, new Intent());
        this.f4840a.finish();
    }
}
