package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class hq implements OnClickListener {
    final /* synthetic */ ExpenseAccountSummary f4757a;

    hq(ExpenseAccountSummary expenseAccountSummary) {
        this.f4757a = expenseAccountSummary;
    }

    public void onClick(View view) {
        this.f4757a.showDialog(0);
    }
}
