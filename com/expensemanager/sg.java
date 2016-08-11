package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class sg implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5254a;

    sg(ExpenseDetails expenseDetails) {
        this.f5254a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5254a.f3179G = this.f5254a.f3179G + 1;
        this.f5254a.m3138h();
    }
}
