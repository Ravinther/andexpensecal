package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class sf implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5253a;

    sf(ExpenseDetails expenseDetails) {
        this.f5253a = expenseDetails;
    }

    public void onClick(View view) {
        this.f5253a.f3179G = this.f5253a.f3179G - 1;
        this.f5253a.m3138h();
    }
}
